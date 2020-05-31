package com.reactrestfulwebservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		for (int i = 0; i < 10; i++) {
			String encodedString = encoder.encode("Password@!123");
			System.out.println(encodedString);
		}
	}

}
