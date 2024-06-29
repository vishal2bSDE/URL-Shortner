package main.java.service;

import java.util.HashSet;
import java.util.Set;

public class URLShortnerService {

	UUIDGeneratorService generatorService;
	public URLShortnerService() {
		generatorService=new UUIDGeneratorService();
	}
	
	public String urlShortnerWithNoCustom() {
		String shortenedUrl = generatorService.randomGenerator();
		System.out.println("URLShortner, https://demourlshortner.com/"+shortenedUrl);
		return shortenedUrl;
	}
	
	public String urlShortnerWithCustom(String prefer) {
		if(!generatorService.preferStringAvailable(prefer)) {
			generatorService.registerString(prefer);
			System.out.println("URLShortner with custom string, https://demourlshortner.com/"+prefer);
			return prefer;
		}
		System.out.println("URLShortner with custom string "+prefer+" is not available ");
		return "";
	}
}
