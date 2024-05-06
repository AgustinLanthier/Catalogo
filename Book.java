/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowed;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = 0;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public void borrow()
    {
        borrowed += 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    public String toString(){
        return author + ", " + title + ", " + pages + ". "; 
    }
}
