package com.masai;

public class Main {
	public static void main(String[] args) {
		Song s1 = new Song("kesariya","brahmastra");
		Song s2 = new Song("attention","CharliePuth");
		Song s3 = new Song("devadoothar","nna than case kodu");
		Song s4 = new Song("Perfect","Ed Sheeren");
		Song s5 = new Song("attention","CharliePuth");

		System.out.println("==========================");
		
		Playist myPlayist = new Playist();
		
		myPlayist.addSong(s1);
		myPlayist.addSong(s2);
		myPlayist.addSong(s3);
		myPlayist.addSong(s4);
		myPlayist.addSong(s5);
		
		System.out.println("==========================");

		
		for(Song s : myPlayist.songs) {
			s.play();
		}
		
		System.out.println("==========================");

	}

}
