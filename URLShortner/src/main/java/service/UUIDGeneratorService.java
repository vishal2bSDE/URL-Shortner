package main.java.service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class UUIDGeneratorService {

	Set<String> stringUsed;
	public UUIDGeneratorService() {
		stringUsed=new HashSet();
	}
	
	public String randomGenerator() {
		String rand=UUID.randomUUID().toString();
		System.out.println("Random number, "+rand);
		return rand;
	}

	public boolean preferStringAvailable(String prefer) {
		return stringUsed.contains(prefer);
	}

	public void registerString(String prefer) {
		stringUsed.add(prefer);
	}
}
