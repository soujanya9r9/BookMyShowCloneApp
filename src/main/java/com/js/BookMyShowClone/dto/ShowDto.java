package com.js.BookMyShowClone.dto;

import java.time.LocalDateTime;

import com.js.BookMyShowClone.enums.ShowStatus;

public class ShowDto {
	
	private long showId;
	private LocalDateTime showStartTime;
	private LocalDateTime shoeEndTime;
	// showStatus
	private ShowStatus showStatus;
	private String showLocation;

	private long movieId;
	private String movieName;
	private String genre;
	private LocalDateTime movieDuration;
	private String moviesDescription;
	private String movielanguage;

	private long screenId;
	private String screenName;
	private double classicSeatPrice;
	private double goldSeatPrice;
	private double premiumSeatPrice;
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalDateTime getShoeEndTime() {
		return shoeEndTime;
	}
	public void setShoeEndTime(LocalDateTime shoeEndTime) {
		this.shoeEndTime = shoeEndTime;
	}
	public ShowStatus getShowStatus() {
		return showStatus;
	}
	public void setShowStatus(ShowStatus showStatus) {
		this.showStatus = showStatus;
	}
	public String getShowLocation() {
		return showLocation;
	}
	public void setShowLocation(String showLocation) {
		this.showLocation = showLocation;
	}
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDateTime getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(LocalDateTime movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getMoviesDescription() {
		return moviesDescription;
	}
	public void setMoviesDescription(String moviesDescription) {
		this.moviesDescription = moviesDescription;
	}
	public String getMovielanguage() {
		return movielanguage;
	}
	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}
	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public double getClassicSeatPrice() {
		return classicSeatPrice;
	}
	public void setClassicSeatPrice(double classicSeatPrice) {
		this.classicSeatPrice = classicSeatPrice;
	}
	public double getGoldSeatPrice() {
		return goldSeatPrice;
	}
	public void setGoldSeatPrice(double goldSeatPrice) {
		this.goldSeatPrice = goldSeatPrice;
	}
	public double getPremiumSeatPrice() {
		return premiumSeatPrice;
	}
	public void setPremiumSeatPrice(double premiumSeatPrice) {
		this.premiumSeatPrice = premiumSeatPrice;
	}

}
