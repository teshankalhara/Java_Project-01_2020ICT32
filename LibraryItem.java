abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean check;
	
	public LibraryItem(String title, String itemID){
		this.title = title;
		this.itemID = itemID;
		this.check = false;
	}
	
	public boolean getCheck(){
		return check;
	}
	
	public void setCheck(boolean check) {
        this.check = check;
    }
	
	public String displayItemDetails() {
       return "\nTitle: " + title + "\nItem ID: " + itemID;
    }
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getItemId(){
		return itemID;
	}
	
	public void setItemId(String itemID){
		this.itemID = itemID;
	}
}