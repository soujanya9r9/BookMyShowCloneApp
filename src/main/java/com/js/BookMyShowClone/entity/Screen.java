package com.js.BookMyShowClone.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.js.BookMyShowClone.enums.ScreenAvailability;
import com.js.BookMyShowClone.enums.ScreenStatus;
import com.js.BookMyShowClone.enums.ScreenType;

@Entity
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long screenId;
	private String screenName;

	// Screentype
	private ScreenType screenType;
	// screenavailability
	private ScreenAvailability screenAvailability;
	// screenStatus
	private ScreenStatus screenStatus;
	
	@OneToMany
	private List<Seat> seats;
	private int noOfClassicSeat;
	private int noOfPremiumSeat;
	private int noOfGoldSeat;

	@ManyToOne
	private Theatre theatre;

	public ScreenType getScreenType() {
		return screenType;
	}

	public void setScreenType(ScreenType screenType) {
		this.screenType = screenType;
	}

	public ScreenAvailability getScreenAvailability() {
		return screenAvailability;
	}

	public void setScreenAvailability(ScreenAvailability screenAvailability) {
		this.screenAvailability = screenAvailability;
	}

	public ScreenStatus getScreenStatus() {
		return screenStatus;
	}

	public void setScreenStatus(ScreenStatus screenStatus) {
		this.screenStatus = screenStatus;
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

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public int getNoOfClassicSeat() {
		return noOfClassicSeat;
	}

	public void setNoOfClassicSeat(int noOfClassicSeat) {
		this.noOfClassicSeat = noOfClassicSeat;
	}

	public int getNoOfPremiumSeat() {
		return noOfPremiumSeat;
	}

	public void setNoOfPremiumSeat(int noOfPremiumSeat) {
		this.noOfPremiumSeat = noOfPremiumSeat;
	}

	public int getNoOfGoldSeat() {
		return noOfGoldSeat;
	}

	public void setNoOfGoldSeat(int noOfGoldSeat) {
		this.noOfGoldSeat = noOfGoldSeat;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
