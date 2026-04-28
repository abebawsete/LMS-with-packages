package parent;
import java.util.Scanner;
public class Book
{
	private  int  id;
	private  String title;
	private  String author;
	private int publishedYear;
	public Book(int id, String title, String author,int publishedYear)
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}
	//Define getter method to access private data
	public int getID()
	{
		return id;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getpublishedYear()
	{
		return publishedYear;
	}
	//Define setter method to modify private data
	public void setId(int id)
	{
		if(id>0)
		{
			this.id = id;
		}
		else
		{
			System.out.println("Invalid Id!");
		}
		
	}
	public void setTitle(String title)
	{
		if (title != null && !title.isEmpty())
		{
			this.title = title;
		}
		else
		{
			System.out.println("Invalid Author Name!");
		}
		
	}
	public void setAuthor(String author)
	{
		if (author != null && !author.isEmpty())
		{
			this.author = author;	
		}
		else
		{
		   System.out.println("Invalid!");
		}
	}
	public void setpublishedYear(int publishedYear)
	{
		if(publishedYear < 2000 || publishedYear > 2026)
		{
			System.out.println("Invalid year!");
		}
		else
		{
		   this.publishedYear = publishedYear;
		}
	}
	// Method to display book details
	public void displayInfo()
	{
		System.out.print("ID: "+id+", Title: "+title+" , Author: "+author+", Published Year:"+publishedYear);
	}
}