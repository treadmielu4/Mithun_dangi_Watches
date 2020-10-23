package com.watches.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="watches")
public class watches {
	@Id
	private int watchesId;
	private String watchesName;
	private double price;
	private double volume;
	private Date date;



	public watches() {
		super();
	}
	public watches(int watchesId, String watchesName, double price, double volume, Date date) {
		super();
		this.watchesId = watchesId;
		this.watchesName = watchesName;
		this.price = price;
		this.volume = volume;
		this.date = date;
	}
	public int getwatchesId() {
		return watchesId;
	}
	public void setwatchesId(int watchesId) {
		this.watchesId = watchesId;
	}
	public String getwatchesName() {
		return watchesName;
	}
	public void setwatchesName(String watchesName) {
		this.watchesName = watchesName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


}
