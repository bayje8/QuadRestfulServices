package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadServicesController {

	@GetMapping("/service1")
	public String getServiceOne() {
		String serviceOne = "Default JSON response";
		try {
			serviceOne = FileUtils.readFileToString(new File(getClass().getClassLoader().getResource("ServiceOne.json").getFile()), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceOne;
	}
	
	@GetMapping("/service2")
	public String getServiceTwo() {
		String serviceTwo = "Default JSON response";
		try {
			serviceTwo = FileUtils.readFileToString(new File(getClass().getClassLoader().getResource("ServiceTwo.json").getFile()), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceTwo;
	}
	
	@GetMapping("/service3")
	public String getServiceThree() {
		String serviceThree = "Default JSON response";
		try {
			serviceThree = FileUtils.readFileToString(new File(getClass().getClassLoader().getResource("ServiceThree.json").getFile()), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceThree;
	}
}
