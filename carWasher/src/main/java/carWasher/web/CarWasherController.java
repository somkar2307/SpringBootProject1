package carWasher.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/carWasherController")
public class CarWasherController {
	
	@RequestMapping("/cacheBustingTest")
	public ModelAndView cacheBustingTest() {
		ModelAndView m=new ModelAndView();
		m.setViewName("cacheBustingTest");
		return m;
	}

}
