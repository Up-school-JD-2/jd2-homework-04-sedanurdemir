package ödev4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MusicSystem {

	private List<Singer> singers;
	private List<User> users;
	private List<Album> albums;
	private  List<Song> songs;
	private List<kullanıcıSepeti>kullanıcıSepetis;
	
	public MusicSystem() {
		singers=new ArrayList<>();
		users=new ArrayList<>();
		albums=new ArrayList<>();
		songs=new ArrayList<>();
		kullanıcıSepetis=new ArrayList<>();
		}
	
	public void addSinger(Singer singer) {
		this.singers.add(singer);
		
	}
	public void removeSinger(Singer singer) {
		this.singers.remove(singer);
	}
	
	public void addUser(User user) {
		this.users.add(user);
		
	}
	
	public void removeUser(User user) {
		this.users.remove(user);
	}
	
	public void addAlbum(Album album) {
		this.albums.add(album);
		
	}
	public void removeAlbum(Album album) {
		this.albums.remove(album);
	}
	
	public void addKullanıcıSepeti(kullanıcıSepeti kullanıcıSepeti) {
		this.kullanıcıSepetis.add(kullanıcıSepeti);
	}

	public void removeKullanıcıSepeti(kullanıcıSepeti kullanıcıSepeti) {
		this.kullanıcıSepetis.remove(kullanıcıSepeti);
	}
	
	public void removeSong(Song song) {
		this.songs.remove(song);
	}

	public void addSongs(Song song) {
		this.songs.add(song);
	}
	public void listSongs() {
		System.out.println("--------Şarkılar-------");
		for(Song song: this.songs) {
			song.printSongInfo();;
		}
	}
	
	public void listAlbums() {
		System.out.println("******Albüm Bilgileri*******");
		for(Album album: this.albums) {
			album.printAllSongsInAlbum();;
		}
	}
	public void listUsers() {
		System.out.println("******Kullanıcılar*******");
		for(User user :this.users) {
			user.printUserInfo();
		}
	}
	
	public void searchedSong(Song song) {
	
		System.out.println("aranan şarkı " + (songs.contains(song)? " Bulundu" : " Bulunamadı"));
		}
		
	
	public void listSepet() {
		System.out.println("******sepetteki şarkılar*******");
		for(kullanıcıSepeti kullanıcıSepeti: this.kullanıcıSepetis) {
			kullanıcıSepeti.printSepeTInfo();
		}
	}
	public void odemeYap() {
		boolean odemeDurumu=false;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ödeme yapmak için 9'a basınız");
		int k=sc.nextInt();
		
		if(k==9) {
			System.out.println("ödeme başarılı");
		}
	
		else {
			System.out.println("ödeme yapılamadı");
		}
	}
	
	}


	
	
	
	
