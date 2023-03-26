package ödev4;

public class Singer {

	private String name;
	private String nationality;
	
	public Singer(String name,String nationality) {
		
		this.name=name;
		this.nationality=nationality;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality=nationality;
	}
	
	public void printSingerInfo() {
		System.out.println("------------------------");
		System.out.println("Sanatçı Adı : "+ name);
		System.out.println("Sanatçının milliyeti : "+ nationality);
		System.out.println();
	}
}
