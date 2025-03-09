package com.afdalgroup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController("/")
public class MainController {

	@RequestMapping("")
	public ModelAndView MainCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	
	
	@RequestMapping("about")
	public ModelAndView AboutCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("about");
		return model;
	}
	
	@RequestMapping("accountandbook")
	public ModelAndView AccountandBookCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("accountandbook");
		return model;
	}
	
	
	@RequestMapping("blog")
	public ModelAndView BlogCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("blog");
		return model;
	}
	
	@RequestMapping("contact_us")
	public ModelAndView contact_usCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("contact_us");
		return model;
	}
	
	@RequestMapping("corporate")
	public ModelAndView corporateCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("corporate");
		return model;
	}
	
	@RequestMapping("faq")
	public ModelAndView faqCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("faq");
		return model;
	}
	
	@RequestMapping("freezone")
	public ModelAndView FreezoneCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("freezone");
		return model;
	}
		
	@RequestMapping("mainland")
	public ModelAndView MainlandCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("mainland");
		return model;
	}
	
	@RequestMapping("privacyandpolicy")
	public ModelAndView PrivacyAndPolicyCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("privacyandpolicy");
		return model;
	}
	
	@RequestMapping("teams")
	public ModelAndView TeamsCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("teams");
		return model;
	}
	
	@RequestMapping("termsandcondition")
	public ModelAndView TermsandConditionCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("teamsandcondition");
		return model;
	}
	
	@RequestMapping("vatandtax")
	public ModelAndView VatandTaxCall() {
		ModelAndView model = new ModelAndView();
		model.setViewName("vatandtax");
		return model;
	}
	
	
	
	
}




