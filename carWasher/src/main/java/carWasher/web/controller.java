package carWasher.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import carWasher.model.Car;
import carWasher.model.Driver;

@RestController
@RequestMapping(value="/carWasherController")
public class controller {

	@RequestMapping("/cars")
	public List<Car> getCars(){
		List<Car> cars=new ArrayList<>();
		Driver driver =new Driver(1,"Omkar","Singh","Phone1","Address1");
		Driver driver1 =new Driver(2,"Pargat","Singh","Phone2","Address2");
		Driver driver2 =new Driver(4,"Het","Patel","Phone3","Address3");
		
		Car car1=new Car(1,"Fiat","Red",driver,2018);
		Car car2=new Car(2,"Mercede","Blue",driver1,2020);
		Car car3=new Car(3,"BMW","green",driver2,2022);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		return cars;
	}
	
	@RequestMapping("carFord")
	public ModelAndView forJSP() {
		ModelAndView m=new ModelAndView();
		m.addObject("name", "MUSTANG");
		m.setViewName("ford");
		return m;
	}
	
	
}
 