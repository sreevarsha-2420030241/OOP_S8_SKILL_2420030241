package skill_4;
class Book
{
	private String title;
	private String author;
	private double price;
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public String toString()
	{
		return "Book Details:\n" +
		        "Title:"+title+"\n"+
		        "Author:"+author+"\n"+
		        "Price:₹"+price;
	}
}
public class Bookclass
{
	public static void main(String[] args)
	{
		Book book=new Book();
		book.setTitle("The inheritance of loss");
		book.setAuthor("Kiran Desai");
		book.setPrice(699.99);
		System.out.println(book);
	}
}
