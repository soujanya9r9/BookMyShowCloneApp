package com.js.BookMyShowClone.dto;

import java.time.LocalDateTime;

import com.js.BookMyShowClone.enums.Genre;

public class MovieDto {

	private long movieId;
	private String movieName;
	// genresss
	private Genre genre1;
	private Genre genre2;
	private Genre genre3;
	
	private LocalDateTime movieDuration;
	private String movieDescription;
	private String language;
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Genre getGenre1() {
		return genre1;
	}
	public void setGenre1(Genre genre1) {
		this.genre1 = genre1;
	}
	public Genre getGenre2() {
		return genre2;
	}
	public void setGenre2(Genre genre2) {
		this.genre2 = genre2;
	}
	public Genre getGenre3() {
		return genre3;
	}
	public void setGenre3(Genre genre3) {
		this.genre3 = genre3;
	}
	public LocalDateTime getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(LocalDateTime movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
