package main;
import java.util.Scanner;
import service.Library;
import category.PrintedBook;
import category.EBook;
public class MiniProject
{
	public static void main(String args[])
	{
		// Create Scanner object to take user input
		Scanner scanner = new Scanner(System.in);
		// Create Library object with size 5
		Library lib = new Library(5);
		int choice;
		do
		{
			// Display menu options
			System.out.println("\n ==== MENU ==== ");
			System.out.println("1. Add Printed Book");
			System.out.println("2. Add EBook");
			System.out.println("3. Show Books");
			System.out.println("4. Search Book");
			System.out.println("5. Update Book");
			System.out.println("6. Delete Book");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			//Reads an integer number from the user
			choice = scanner.nextInt();
			scanner.nextLine();//clear buffer
			switch(choice)
			{
				// Input details for PrintedBook
				case 1:
					System.out.println("Enter ID:");
					int id = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter Title:");
					String title = scanner.nextLine();

					System.out.println("Enter Author:");
					String author = scanner.nextLine();

					
					System.out.println("Enter published year:");
					int year = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter pages:");
					int pages = scanner.nextInt();
					scanner.nextLine();

					// Create PrintedBook object
					PrintedBook printed = new PrintedBook(id,title, author,year,pages);

					// Add Printed book to library
					lib.addBook(printed);
					System.out.println("Printed Book Added!");
					break;
					// Input details for e-Book
				case 2:
					System.out.println("Enter ID:");
					int E_id = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter Title:");
					String E_title = scanner.nextLine();

					System.out.println("Enter Author:");
					String E_author = scanner.nextLine();

					System.out.println("Enter published year...");
					int E_year = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter FileSize!");
					double fileSize = scanner.nextDouble();
					scanner.nextLine();

					// Create EBook object
					EBook ebook = new EBook(E_id, E_title,E_author,E_year,fileSize);

					// Add Ebook to library
					lib.addBook(ebook);
					break;
				case 3:
					// Display all books added
					System.out.println("\n --- Library Books --- ");
					lib.showBooks();
					break;
					// Search book
				case 4:
					System.out.print("Enter Id to search!:");
					int search = scanner.nextInt();
					scanner.nextLine();
					lib.searchBook(search);
					break;
				case 5:
					System.out.print("Enter the ID to be Update!");
					int idUpdate = scanner.nextInt();
					scanner.nextLine();

					lib.updateBook(idUpdate,scanner);
					break;
				case 6:
					System.out.print("Enter the Id to Delete!");
					int idDelete = scanner.nextInt();
					scanner.nextLine();
					lib.deleteBooK(idDelete);
				case 0:
					// Exit message
					System.out.println("Exiting program...");
					break;
			    default:
				System.out.println("Invalid Choice try again...!");
			}
		}while(choice!= 0);
		scanner.close();
	}
}