class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }
	
	public String displayItemDetails() {
        return super.displayItemDetails() + "\nAuthor: " + author + "\nNumber of Pages: " + numPages;
    }
	
	public int getNumPages(){
		return numPages;
	}
	
	public void setNumPages(int numPages){
		this.numPages = numPages;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
}