package com.javaex.oop.song.v1;
// v1.필드,getter/setter,일반 메서드
public class Song {
	
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
//getters/setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
			return year;
		}
	public void setYear(int year) {
		this.year =year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public void showInfo() {
		System.out.printf("song,artist,(album,year,track,composer"+"작곡)%n" );
	}
}
