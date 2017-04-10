package org.lb.MarketingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MarketingSystemController {
	
	@RequestMapping(value="/manage",method=RequestMethod.GET)
	public String managepage(Model model)
	{
		model.addAttribute("manage","manage   ok");
		return "manage";
	}
	
	@RequestMapping(value="/trade",method=RequestMethod.GET)
	public String tradepage(Model model)
	{
		model.addAttribute("trade","trade   ok");
		return "trade";
	}
}
