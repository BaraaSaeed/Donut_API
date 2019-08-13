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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.DONUT_API.entity.Donut;
import co.grandcircus.DONUT_API.entity.DonutDetails;

@Controller
public class DonutController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView showHome() {
		List<Donut> donuts = apiService.listAllDonuts();
		return new ModelAndView("index", "donuts", donuts);
	}

	@RequestMapping("/details")
	public ModelAndView showDonutDetails(@RequestParam("id") Integer id) {
		DonutDetails donutDetails = apiService.getDonutDetails(id);
		return new ModelAndView("show-details", "donutDetails", donutDetails);
	}

}
