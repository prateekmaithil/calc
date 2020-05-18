package com.example.calc;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@RequestMapping(value="/addition/{param1}/{param2}", method=RequestMethod.GET,produces="application/json")
	public String getAddition(@PathVariable String param1, @PathVariable String param2){
		
		
		System.out.println(param1);
		System.out.println(param2);
		return String.valueOf(Integer.valueOf(param1)+Integer.valueOf(param2));
	}
	
	@RequestMapping(value="/subtraction/{param1}/{param2}", method=RequestMethod.GET,produces="application/json")
	public String getSubtraction(@PathVariable String param1, @PathVariable String param2){
		
		System.out.println(param1);
		System.out.println(param2);
		return String.valueOf(Integer.valueOf(param1)-Integer.valueOf(param2));
	}
	
	@RequestMapping(value="/multlipication/{param1}/{param2}", method=RequestMethod.GET,produces="application/json")
	public String getMultiplication(@PathVariable String param1, @PathVariable String param2){
		
		System.out.println(param1);
		System.out.println(param2);
		return String.valueOf(Integer.valueOf(param1)*Integer.valueOf(param2));
	}
	
	@RequestMapping(value="/division/{param1}/{param2}", method=RequestMethod.GET,produces="application/json")
	public String getDivision(@PathVariable String param1, @PathVariable String param2){
		
		System.out.println(param1);
		System.out.println(param2);
		return String.valueOf(Integer.valueOf(param1)/Integer.valueOf(param2));
	}
}
