package ödev4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.Inflater;

import javax.imageio.metadata.IIOMetadataFormat;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int userAccount=0;
		int priceNumber=0;
		Singer singer=new Singer("melike şahin", "türk");
		Singer singer2 =new Singer("nova norda", "turk");
		
		Song song=new Song("bedelini ödedim", "melike şahin","merhem","01.01.2021", 60);
		Song song2 =new Song("pelin","nova norda", "paralel evrende dünya Tarihi", "05.03.2020",70);
		Song song3=new Song("nasır", "melike Şahin", "merhem", "01.02.2021",80);
		
		Album album=new Album("merhem", singer, new String [] {"bedelini ödedim" ,"nasır"});
		Album album2=new Album("paralel evrende dünya tarihi", singer2, new String [] {"pelin"});
		
		kullanıcıSepeti kullanıcıSepeti=new kullanıcıSepeti();
		
		
		MusicSystem musicSystem=new MusicSystem();
		musicSystem.addAlbum(album);
		musicSystem.addAlbum(album2);
		musicSystem.addSinger(singer);
		musicSystem.addSinger(singer2);
		musicSystem.addSongs(song);
		musicSystem.addSongs(song2);
		musicSystem.addSongs(song3);
//		musicSystem.removeSong(song3);
//		musicSystem.listSongs();
//		musicSystem.listAlbums();
	
		
		String kullanıcıAdı = null;
		String kullanıcıMaili=null;
		boolean quit=false;
		
		
		do {
		System.out.println();
		System.out.println("1. yeni kullanıcı oluştur: ");
		System.out.println("2. Şarkı seçimi yap : ");
		System.out.println("3. sepetini görüntüle :  ");
		System.out.println("4. ödeme yap : ");
		System.out.println("5.Çıkış");
		System.out.println();
		System.out.println("seçiminiz (1-5) : ");
		System.out.println();
		int secim=sc.nextInt();
		
		switch (secim) {
		case 1 ->{
			System.out.println("Adınızı giriniz : ");
			kullanıcıAdı=sc.next();
			
			System.out.println("emailinizi girin  :");
			kullanıcıMaili =sc.next();
			User user =new User(kullanıcıAdı, kullanıcıMaili);
			musicSystem.addUser(user);
			userAccount++;
		
		}
		
		case 2-> {
			
			System.out.println("Hangi şarkıyı aramak istiyorsunuz? ");
			System.out.println("bedelini ödedim için 1");	
			System.out.println("pelin için 2");
			System.out.println("nasır için 3");
			System.out.println("seçiminiz (1-3)");
			
			int sarki=sc.nextInt();
			switch (sarki) {
			case 1->{
				musicSystem.searchedSong(song);
				kullanıcıSepeti.addSepet(song);
				priceNumber=1;

			}
			
			case 2->{
				musicSystem.searchedSong(song2);
				kullanıcıSepeti.addSepet(song2);
				priceNumber=2;

		
			}
			case 3 ->{
				musicSystem.searchedSong(song3);
				kullanıcıSepeti.addSepet(song3);
				priceNumber=3;
			}		
		}
			
			
		}
		
		case 3->{
			kullanıcıSepeti.printSepeTInfo();
			
			
		}
		case 4 ->{
			
			switch(priceNumber) {
			case 1 ->{
				System.out.println("Ödemeniz gereken tutar : " + song.getPrice());
			}
			case 2->{
				System.out.println("Ödemeniz gereken tutar : " + song2.getPrice());
			}
			case 3->{
				System.out.println("Ödemeniz gereken tutar : " + song3.getPrice());
			}
			}
			
			musicSystem.odemeYap();
			
		}
		case 5-> {
			quit=true;
		}
		
		}
		
	}while(!quit);
	}
	
	
	
		
	 
}
