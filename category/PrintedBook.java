package category;
import parent.Book;
public class PrintedBook extends Book
{
	//Additional attribute
	private int numberOfPages;
	public PrintedBook(int id, String title, String author, int publishedYear, int numberOfPages)
	{
		// Call parent constructor using super()
		super(id, title, author,publishedYear);
		this.numberOfPages = numberOfPages;
	}
	//Define getter method to access private data
	public int getnumberOfPages()
	{
		return numberOfPages;
	}
	//Define setter method to modify private data
	public void setNumberOfPages(int numberOfPages)
	{
		if(numberOfPages>0)
		{
			this.numberOfPages = numberOfPages;
		}
		else
		{
			System.out.println("Invalid Pages!");
		}
	}
	@Override
	public void displayInfo()
	{
		//super.displayInfo();
		System.out.print("ID: PB" + getID() + ", Title: " + getTitle() + " , Author: " + getAuthor() + ", Published Year: " + getpublishedYear());
		System.out.println(", Pages:  "+numberOfPages+" \n");
	}
}