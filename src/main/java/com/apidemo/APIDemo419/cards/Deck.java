package com.apidemo.APIDemo419.cards;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Deck {

	private boolean success;
	private String deck_id;
	private boolean shuffled;
	private String remaining;
	
	
	public Deck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deck(boolean success, String deck_id, boolean shuffled, String remaining) {
		super();
		this.success = success;
		this.deck_id = deck_id;
		this.shuffled = shuffled;
		this.remaining = remaining;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getDeck_id() {
		return deck_id;
	}
	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}
	public boolean isShuffled() {
		return shuffled;
	}
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}
	public String getRemaining() {
		return remaining;
	}
	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}
	@Override
	public String toString() {
		return "Deck [success=" + success + ", deck_id=" + deck_id + ", shuffled=" + shuffled + ", remaining="
				+ remaining + "]";
	}

	
}
