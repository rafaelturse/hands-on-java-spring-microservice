package com.turse.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Double daulyIncome;
	private Integer days;

	public Payment() {

	}

	public Payment(String name, Double daulyIncome, Integer days) {
		super();
		this.name = name;
		this.daulyIncome = daulyIncome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDaulyIncome() {
		return daulyIncome;
	}

	public void setDaulyIncome(Double daulyIncome) {
		this.daulyIncome = daulyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public double getTotal() {
		return days * daulyIncome;
	}
}
