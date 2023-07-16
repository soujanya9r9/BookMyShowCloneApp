package com.js.BookMyShowClone.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.js.BookMyShowClone.enums.BookingStatus;
import com.js.BookMyShowClone.enums.SeatType;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	private LocalDateTime bookingFromTime;
	private LocalDateTime bookingTillTime;
	private long seatId;
	// SeatType
	private SeatType seatType;
	
	// bookingstatus
	private BookingStatus bookingStatus;
	private double seatPrice;

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getBookingFromTime() {
		return bookingFromTime;
	}

	public void setBookingFromTime(LocalDateTime bookingFromTime) {
		this.bookingFromTime = bookingFromTime;
	}

	public LocalDateTime getBookingTillTime() {
		return bookingTillTime;
	}

	public void setBookingTillTime(LocalDateTime bookingTillTime) {
		this.bookingTillTime = bookingTillTime;
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}

}
