/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/
/**
 * 
 */
package co.grandcircus.DONUT_API;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.DONUT_API.entity.Donut;
import co.grandcircus.DONUT_API.entity.DonutDetails;
import co.grandcircus.DONUT_API.entity.DonutResponse;

@Component
public class ApiService {
	private RestTemplate restTemplate = new RestTemplate();

	public List<Donut> listAllDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);
		return response.getResults();
	}

	public DonutDetails getDonutDetails(Integer id) {

		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DonutDetails response = restTemplate.getForObject(url, DonutDetails.class);
		return response;

	}
}
