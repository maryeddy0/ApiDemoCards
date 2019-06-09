package com.apipractice.ApiPractice;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apipractice.ApiPractice.entity.Chuck;
import com.apipractice.ApiPractice.entity.Value;

@Controller
public class ChuckController {

	RestTemplate rt = new RestTemplate();
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("/jokes")
	public ModelAndView jokes(@RequestParam("quantity") int num) {
		
		String url = "http://api.icndb.com/jokes/random/" + "quantity";
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.USER_AGENT,"testing");
		
		Chuck c = rt.getForObject(url, Chuck.class);

		ArrayList<Value> list = c.getValue();
		for(Value v: list) {
			System.out.println("Jokes: " + v.getId());
		}
		return new ModelAndView("random-jokes", "list", list);
	}
	
	
}
