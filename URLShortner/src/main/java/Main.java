package main.java;

import main.java.service.URLShortnerService;

public class Main {

	private static URLShortnerService shortnerService;
	public static void main(String[] args) {
		System.out.println("URL Shortner started");
		shortnerService=new URLShortnerService();
		
		createShortenedURL("");
		createShortenedURL("abc");
		createShortenedURL("abc");
		createShortenedURL("");
		
		System.out.println("URL Shortner stopped");
	}

	private static void createShortenedURL(String prefer) {
		if(prefer.isBlank()) {
			shortnerService.urlShortnerWithNoCustom();
			return;
		}
		shortnerService.urlShortnerWithCustom(prefer);
	}
}
