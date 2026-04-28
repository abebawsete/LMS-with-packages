package category;
import parent.Book;
public class EBook extends Book
{
	private double fileSize;
	public EBook(int id, String title, String author, int publishedYear, double fileSize)
	{
		// Call parent constructor using super()
		super(id, title, author,publishedYear);
		this.fileSize = fileSize;
	}
	public double getfileSize()
	{
		return fileSize;
	}
	public void setfileSize(double fileSize)
	{
		if(fileSize>0)
		{
		   this.fileSize = fileSize;
		}
		else
		{
			System.out.println("Invalid fileSize!");
		}
	}
	@Override
	public void displayInfo()
	{
		
		//super.displayInfo();
		System.out.print("ID: EB" + getID() + ", Title: " + getTitle() + " , Author: " + getAuthor() + ", Published Year: " + getpublishedYear());
		System.out.println(", File Size: "+fileSize+"MB" +"\n");
	}	
}