package ödev4;

public class User {
	
	private String name;
	private String email;
	
	
	
	public User(String ad, String email) {
		this.name=ad;
		this.email=email;
		
	}
	 public String getAd() {
		 return name;
	 }

	 public void setAd(String ad) {
		 this.name=ad;
	 }
	 
	 public String getEmail() {
		 return email;
	 }
	 
	 public void setEmail(String email) {
		 this.email=email;
	 }
	 
	
	 

	 public void printUserInfo() {
		
		 System.out.println("Kullanıcı Adı : "+ name);
		 System.out.println("Kullanıcı Maili : "+ email);
		
		 System.out.println();
	 }
}


