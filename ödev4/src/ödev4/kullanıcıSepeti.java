package ödev4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class kullanıcıSepeti {
	
	
	private List<Song>kullanıcıSarkiları;
	
	
	public kullanıcıSepeti() {
		kullanıcıSarkiları=new ArrayList<>();
	}
	public void addSepet(Song song) {
		this.kullanıcıSarkiları.add(song);
		
	}
	
	
	
	public void printSepeTInfo() {
		System.out.println("******SEPETTEKİ ŞARKILAR*******");
		for(Song song :this.kullanıcıSarkiları) {
			song.printSongInfo();
		}
		 System.out.println();
		 
}
}