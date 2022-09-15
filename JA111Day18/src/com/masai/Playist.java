package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Playist {
	public List<Song> songs = new ArrayList<>();
	
public static void main(String[] args) {
	
}

public void addSong(Song song) {
	if(this.songs.contains(song)) {
		System.out.println("Song already added to the playlist");
	}
	else {
		this.songs.add(song);
		System.out.println("Song added to the playlist successfully");
		
	}

	
};

}
