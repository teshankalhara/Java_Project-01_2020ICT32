class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	public Magazine(String title, String itemID, String issueDate, String publisher){
		super(title, itemID);
		this.issueDate = issueDate;
		this.publisher = publisher;
	}
	
	public String displayItemDetails() {
        return super.displayItemDetails() + "\nIssue Date: " + issueDate + "\nPublisher: " + publisher;
    }
	
	public String getIssueDate(){
		return issueDate;
	}
	
	public void setIssueDate(){
		this.issueDate = issueDate;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
}