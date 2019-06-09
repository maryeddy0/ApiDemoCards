package com.apipractice.ApiPractice;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.APIDemo419.cards.Cards;
import com.apidemo.APIDemo419.cards.Deck;
import com.apidemo.APIDemo419.cards.Draw;

@Controller
public class CardsController {
	



		RestTemplate rt = new RestTemplate();

		@RequestMapping("cards")
		public ModelAndView showCards() {
//			String apiTest = rt.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", String.class);
//			System.out.println(apiTest);
			String url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=5";
			// setup headers
			HttpHeaders headers = new HttpHeaders();
			// typically the documentation will tell you what headers are needed
			// we added uder agent because the api returned 403 forbidden
			headers.add(HttpHeaders.USER_AGENT, "testing");
			ResponseEntity<Deck> deck = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers),
					Deck.class);
			return new ModelAndView("cards", "cards", deck.getBody());
		}

		@RequestMapping("draw-deck")
		public ModelAndView drawCards() {
			
			String url = "https://deckofcardsapi.com/api/deck/new/draw/?count=5";
			
			//img = "https://deckofcardsapi.com/static/img/KH.png";
					
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.USER_AGENT, "testing");

			ResponseEntity<Cards> c = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers), Cards.class);
			return new ModelAndView("redirect:/cards","draw", c.getBody());

		}

	}


