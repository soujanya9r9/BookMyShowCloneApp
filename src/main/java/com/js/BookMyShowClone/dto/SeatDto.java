package com.js.BookMyShowClone.dto;

import com.js.BookMyShowClone.enums.SeatType;

public class SeatDto {
	
	private long seatId;
	// SeatType
	private SeatType seatType;
	public long getSeatId() {
		return seatId;
	}
	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

}
