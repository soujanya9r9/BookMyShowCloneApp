package com.js.BookMyShowClone.dto;

import com.js.BookMyShowClone.enums.ScreenAvailability;
import com.js.BookMyShowClone.enums.ScreenStatus;
import com.js.BookMyShowClone.enums.ScreenType;

public class ScreenDto {
	
	private long screenId;
	private String screenName;

	// Screentype
	private ScreenType screenType;
	// screenavailability
	private ScreenAvailability screenAvailability;
	// screenStatus
	private ScreenStatus screenStatus;
	private int noOfClassicSeat;
	private int noOfPremiumSeat;
	private int noOfGoldSeat;
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
	

}
