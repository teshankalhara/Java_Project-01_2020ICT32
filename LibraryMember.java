class LibraryMember{
	private String memberID;
	private String name;
	
	LibraryMember(String memberID, String name){
		this.memberID = memberID;
		this.name = name;
	}
	
    public String displayMemberDetails() {
       return "\nMember ID: " + memberID + "\nName: " + name;
    }
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getMemberId(){
		return memberID;
	}
	
	public void setMemberId(String memberID){
		this.memberID = memberID;
	}
}