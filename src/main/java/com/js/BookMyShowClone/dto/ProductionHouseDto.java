package com.js.BookMyShowClone.dto;

import java.time.LocalDate;

public class ProductionHouseDto {

	private long productionId;
	private String productionName;
	private LocalDate establishment;
	public long getProductionId() {
		return productionId;
	}
	public void setProductionId(long productionId) {
		this.productionId = productionId;
	}
	public String getProductionName() {
		return productionName;
	}
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	public LocalDate getEstablishment() {
		return establishment;
	}
	public void setEstablishment(LocalDate establishment) {
		this.establishment = establishment;
	}
}
