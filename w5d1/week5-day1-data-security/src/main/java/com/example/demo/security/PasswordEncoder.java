package com.example.demo.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.exception.EmptyFieldException;
import com.example.demo.exception.EmptyInputException;



public class PasswordEncoder {
	
	
	
	/**
	 * @param data The password data to be encoded
	 * @return
	 * @throws EmptyInputException
	 * @throws EmptyFieldException
	 */
	
	public List<String> encoder(List<String> data) throws EmptyInputException, EmptyFieldException 
	{
		if(data.isEmpty()) {
			throw new EmptyInputException();
		}
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		
		List<String> output = new ArrayList<>();
		
		for(String password : data) {
			
			if(password.isBlank()) {
				throw new EmptyFieldException();
			}
			output.add(encoder.encode(password));
		}
		return output;
	}
	
	/**
	 * @param password The plaintext password to be tested.
	 * @param hash The hash to be matched with the password.
	 * @return
	 */
	public boolean isPasswordCorrect(String password,String hash) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		return encoder.matches(password, hash);
	}
}
