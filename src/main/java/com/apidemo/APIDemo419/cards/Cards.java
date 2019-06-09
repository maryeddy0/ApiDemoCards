package com.apidemo.APIDemo419.cards;

import java.awt.Image;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Cards {
	
	private String image;
	private String value;
	private String suit;
	
	
public Cards(String image, String value, String suit) {
	super();
	this.image = image;
	this.value = value;
	this.suit = suit;
}
public Cards() {
	super();
	// TODO Auto-generated constructor stub
}


	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Cards [image=" + image + ", value=" + value + ", suit=" + suit + "]";
	}

}
