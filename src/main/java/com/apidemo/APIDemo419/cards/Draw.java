package com.apidemo.APIDemo419.cards;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Draw {

	private ArrayList<Cards> cards;

	public Draw() {
		super();
	}
	public Draw( ArrayList<Cards> cards) {
		super();
		this.cards = cards;
	}
	
	public ArrayList<Cards> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Cards> cards) {
		this.cards = cards;
	}
	@Override
	public String toString() {
		return "Draw [cards=" + cards + "]";
	}
	
	
}
