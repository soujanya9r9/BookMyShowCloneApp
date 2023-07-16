package com.js.BookMyShowClone.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.js.BookMyShowClone.enums.Genre;
import com.js.BookMyShowClone.enums.ShowStatus;

@Entity
public class MovieShow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long showId;
	private LocalDateTime showStartTime;
	private LocalDateTime shoeEndTime;
	// ShowStatus
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

	@ManyToOne
	private Theatre theatre;

	public ShowStatus getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(ShowStatus showStatus) {
		this.showStatus = showStatus;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

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

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
