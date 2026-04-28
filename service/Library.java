package service;
import java.util.Scanner;
import parent.Book;
import category.PrintedBook;
import category.EBook;
import main.MiniProject;
// Library class using array to store Book objects
public class Library
{
	// Array to store Book objects
	private Book[] books;
	//counter to check number of books
	private int count = 0;
	public Library(int size)
	{
		this.books = new Book[size];
	}
	public void addBook(Book book)
	{

		if(count < books.length)
		{
			books[count] = book;
			count++;
		}
		else
		{
			System.out.println("Library has been fulled!");
		}

	}
	public void showBooks()
	{
		if(count == 0)
		{
			System.out.println("No books availabl!");
		}
		for(int i = 0; i < count; i++)
		{
			books[i].displayInfo(); //Polymerphism
			System.out.println("---------------------------");
		}
	}
	public void searchBook(int searchID)
	{
		for(int i = 0; i < count;i++)
		{
			if(books[i].getID()== searchID)
			{
				System.out.println("Search Book with ID "+searchID+ " found!");
				books[i].displayInfo();
				System.out.println("--------------------------");
				return;
			}
		}
		// Only runs if no book found
        System.out.println("The ID : " + searchID + " is not found!");
	}
	public void updateBook(int searchID, Scanner scanner)
	{
		for(int i = 0; i < count; i++)
		{
			if(books[i].getID() == searchID)
			{
				System.out.print("The ID: "+searchID+" found!");

				System.out.print("Enter New Title:");
				String newTitle = scanner.nextLine();
				books[i].setTitle(newTitle);

				System.out.print("Enter New Author:");
				String newAuthor = scanner.nextLine();
				books[i].setAuthor(newAuthor);

				System.out.print("Enter New Year:");
				int newYear = scanner.nextInt();
				books[i].setpublishedYear(newYear);

				if(books[i] instanceof PrintedBook)
				{
					System.out.print("Enter New Pages!: ");
					int newPages = scanner.nextInt();
					scanner.nextLine();
					((PrintedBook)books[i]).setNumberOfPages(newPages);
				}
				if(books[i] instanceof EBook)
				{
					System.out.print("Enter New FileSize!: ");
					double fileSize = scanner.nextDouble();
					scanner.nextLine();
					((EBook)books[i]).setfileSize(fileSize);
				}

			}
		}
	}
	public void deleteBooK(int searchID)
	{
		for(int i = 0; i < count; i++)
		{
			if(books[i].getID() == searchID)
			{
				for(int j = i; j < count-1; j++)
				{
					books[i] = books[j+1];
				}
				books[count-1] = null;
				count--;
				System.out.println("Book with ID " + searchID + " deleted successfully!");
	            return;
			}
			
		}
	}
}