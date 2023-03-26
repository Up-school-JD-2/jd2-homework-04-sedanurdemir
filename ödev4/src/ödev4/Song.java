package ödev4;

public class Song {
	
	private String songName;
	private String singer;
	private String albumName;
	private String time;
	private double price;
	
	
	
	public Song(String songName, String singer, String albumName, String time, double price) {
		
		this.songName = songName;
		this.singer = singer;
		this.albumName = albumName;
		this.time = time;
		this.price=price;
		
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void printSongInfo() {
		System.out.println("Şarkı Adı : " +songName);
		System.out.println("Sanatçı Adı: "+ singer);
		System.out.println("Albüm adı : "+ albumName);
		System.out.println("Yayın tarihi: " +time);
		System.out.println("Şarkının Fiyatı: " +price);
		
	}
	
	
}