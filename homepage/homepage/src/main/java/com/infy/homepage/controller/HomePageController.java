package com.infy.homepage.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.PropertyResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.infy.homepage.service.HomePageService;
import com.infy.homepage.dto.*;

@RestController


public class HomePageController {
	
org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());	

@Autowired
HomePageService homepageService;


@PostMapping(value = "/addstory", consumes = MediaType.APPLICATION_JSON_VALUE)
public boolean homepage(@RequestBody HomepageDTO homepageDTO) {
	logger.info("Contributor request for adding a story  {}", homepageDTO.getStory());
	return homepageService.homepage(homepageDTO);
}

@GetMapping(value = "/api/contributorsName", produces = MediaType.APPLICATION_JSON_VALUE)
public List<HomepageDTO> getAllContributors() {
	logger.info("Fetching all products");
	return homepageService.getAllContributorsName();
}


@PostMapping(value = "/addcomments", consumes = MediaType.APPLICATION_JSON_VALUE)
public boolean homepage(@RequestBody HomepageDTO homepageDTO) {
	logger.info(" adding comments to a story  {}", homepageDTO.getStory());
	return homepageService.homepage(homepageDTO);
}
	
@DeleteMapping(value = "/story")
public ResponseEntity<String> deleteBuyer(@PathVariable String contributorName) throws Exception {
	homepageService.deleteStory(contributorName);
	PropertyResolver environment = null;
	String successMessage = environment.getProperty("API.DELETE_SUCCESS");
	return new ResponseEntity<>(successMessage, HttpStatus.OK);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


