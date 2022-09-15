package com.masai;

import java.util.Objects;

public class Song {
	private String movieName,songName;
	
	public Song() {
		
	}
	public Song(String song,String movie) {
		this.songName = song;
		this.movieName = movie;
	}
	public void play() {
		System.out.println(songName+" of "+movieName+" is playing...!");
	}
	
	@Override
	public boolean equals(Object obj) {
	
		Song s1= this;
		Song s2= (Song)obj;

		return s1.getMovieName().equals(s2.getMovieName()) && s1.getSongName().equals(s2.getSongName());
				
	}
	
	@Override
	public int hashCode() {
	
		return Objects.hash(songName,movieName);
	
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public String getSongName() {
		return songName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}

}
