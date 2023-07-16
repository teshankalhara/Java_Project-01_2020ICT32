import java.util.*;

class Main{
	public static void main(String[] args){
		Book[] books = {
			new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240),
			new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281),
			new Book("1984", "B003", "George Orwell", 328),
			new Book("Pride and Prejudice", "B004", "Jane Austen", 432),
			new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320)
		};
		
		Magazine[] megazines = {
			new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society"),
			new Magazine("Time", "M002", "September 2023", "Time USA, LLC"),
			new Magazine("Forbes", "M003", "June 2023", "Forbes Media"),
			new Magazine("Vogue", "M004", "July 2023", "Condé Nast"),
			new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition")
		};
		
		LibraryMember[] libraryMembers = {
			new LibraryMember("L001", "John Doe"),
			new LibraryMember("L002", "Jane Smith"),
			new LibraryMember("L003", "David Johnson"),
			new LibraryMember("L004", "Sarah Williams"),
			new LibraryMember("L005", "Michael Brown")
		};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nBooks:");
		for(Book book:books){
			System.out.print("Checking Book Name : " + book.getTitle() + " (true or false) : ");
			String input = s.next();
			if(input.equalsIgnoreCase("true")){
				book.setCheck(true);
				System.out.println("\nChecked!" + book.displayItemDetails());
			}else if(input.equalsIgnoreCase("false")){
				book.setCheck(false);
				System.out.println("Not Checked!" + book.displayItemDetails());
			}else{
				System.out.println("You Entered Mistake Plz Enter True or False");
			}
			System.out.println();
		}
		
		System.out.println("\n\nMagazines:");
		for(Magazine megazine:megazines){
			System.out.print("Checking Magazine Name : " + megazine.getTitle() + " (true or false) : ");
			String input = s.next();
			if(input.equalsIgnoreCase("true")){
				megazine.setCheck(true);
				System.out.println("\nChecked!" + megazine.displayItemDetails());
			}else if(input.equalsIgnoreCase("false")){
				megazine.setCheck(true);
				System.out.println("Not Checked!" + megazine.displayItemDetails());
			}else{
				System.out.println("You Entered Mistake Plz Enter True or False");
			}
			System.out.println();
		}
		
		System.out.println("\nLibrary Members:");
		for(LibraryMember libraryMember:libraryMembers){
			System.out.print("Checking Library Member Name : " + libraryMember.getName() + " (true or false) : ");
			String input = s.next();
			if(input.equalsIgnoreCase("true")){
				System.out.println("Checked!" + libraryMember.displayMemberDetails());
			}else if(input.equalsIgnoreCase("false")){
				System.out.println("Not Checked!" + libraryMember.displayMemberDetails());
			}else{
				System.out.println("You Entered Mistake Plz Enter True or False");
			}
			System.out.println();
		}
	}
}