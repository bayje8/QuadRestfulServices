package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadServicesController {

	@GetMapping("/int66")
	public String getServiceOne() {
		String serviceOne = "Default JSON response";
		try {
			serviceOne = FileUtils.readFileToString(new File("C:\\temp\\INT66.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return serviceOne;
	}
	
	@GetMapping("/int510")
	public String getServiceTwo() {
		String serviceTwo = "Default JSON response";
		try {
			serviceTwo = FileUtils.readFileToString(new File("C:\\temp\\INT510.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceTwo;
	}
	
	@GetMapping("/int501")
	public String getServiceThree() {
		String serviceThree = "Default JSON response";
		try {
			serviceThree = FileUtils.readFileToString(new File("C:\\temp\\INT501.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceThree;
	}
}
