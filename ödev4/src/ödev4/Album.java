package ödev4;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Album {
	
	private String albumName;
	private Singer singer;
	
	private String [] songStrings;

	
	


	public Album(String albumName, Singer singer, String[] songStrings) {
		super();
		this.albumName = albumName;
		this.singer = singer;
		this.songStrings = songStrings;
	}



	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}






	public Singer getSinger() {
		return singer;
	}






	public void setSinger(Singer singer) {
		this.singer = singer;
	}






	public String[] getSongStrings() {
		return songStrings;
	}






	public void setSongStrings(String[] songStrings) {
		this.songStrings = songStrings;
	}






	public void printAllSongsInAlbum(){
		
		System.out.println();
		
			System.out.println("album adı : " + albumName );
			System.out.println("Sanatçı Adı : " +singer.getName());
			System.out.println("Şarkılar : " +Arrays.toString(songStrings));	}
}


