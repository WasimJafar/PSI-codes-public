package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.EmptyFieldException;
import com.example.demo.exception.EmptyInputException;
import com.example.demo.exception.InvalidInputException;
import com.example.demo.security.Decryptor;
import com.example.demo.security.Encryptor;
import com.example.demo.security.PasswordEncoder;


@RestController
//@RefreshScope
public class Controller {
	
	public static final String EMPTY_FIELD_EXCEPTION = "EmptyFieldException";
	public static final String EMPTY_INPUT_EXCEPTION = "EmptyInputException";
	public static final String INVALID_INPUT_EXCEPTION = "InvalidInputException";
	public static final String EXCEPTION = "Exception";
	public static final String RUNTIME_EXCEPTION = "RuntimeException";
	
	@Autowired
	public Encryptor encryptor;
	@Autowired
	public Decryptor decryptor;
	
	private PasswordEncoder passwordEncoder;
	
	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}
	
	public Encryptor getEncryptor() {
		return encryptor;
	}

	public Decryptor getDecryptor() {
		return decryptor;
	}

	public Controller() {
		passwordEncoder = new PasswordEncoder();
	}
	
//	ResourceBundle bundle = ResourceBundle.getBundle("oms");
	
	/**
	 * @param data The data to be encrypted.
	 * @return
	 */
	
	@GetMapping("/")
	public List<String> show() {
		List<String> list = Arrays.asList("Hello", "Encryption");
		return list;
	}
	
	@PostMapping("/encrypt")
	public ResponseEntity<List<String>> encrypt(@RequestBody List<String> data){
		System.out.println("API Hit");
		System.out.println(data);
		List<String> errorOutput = new ArrayList<>();
		try {
			List<String> encryptedOutput = encryptor.encrypt(data);
			return new ResponseEntity<>(encryptedOutput,HttpStatus.OK);
		}
		catch(EmptyFieldException e) {
			errorOutput.add("EMPTY_FIELD_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(EmptyInputException e) {
			errorOutput.add("EMPTY_INPUT_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(RuntimeException r)
		{
			errorOutput.add("RUNTIME_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e) {
			errorOutput.add("EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
	}
	
	/**
	 * @param data The data to be decrypted.
	 * @return
	 */
	@PostMapping("/decrypt")
	public ResponseEntity<List<String>> decrypt(@RequestBody List<String> data){
		
		List<String> errorOutput = new ArrayList<>();
		try {
			List<String> decryptedData = decryptor.decrypt(data); 
			return new ResponseEntity<>(decryptedData,HttpStatus.OK);
		}
		catch(EmptyFieldException e) {
			errorOutput.add("EMPTY_FIELD_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(EmptyInputException e) {
			errorOutput.add("EMPTY_INPUT_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(InvalidInputException ie) {
			errorOutput.add("INVALID_INPUT_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(RuntimeException r)
		{
			errorOutput.add("RUNTIME_EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e) {
			errorOutput.add("EXCEPTION");
			return new ResponseEntity<>(errorOutput,HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/**
	 * @param data The password data to be encoded.
	 * @return 
	 */
	@PostMapping("/encodePassword")
	public ResponseEntity<List<String>> encodePassword(@RequestBody List<String> data){
		
		List<String> encodeErrorOutput = new ArrayList<>();
		try {
			List<String> decryptedData = passwordEncoder.encoder(data); 
			return new ResponseEntity<>(decryptedData,HttpStatus.OK);
		}
		catch(EmptyFieldException e) {
			encodeErrorOutput.add("EMPTY_FIELD_EXCEPTION");
			return new ResponseEntity<>(encodeErrorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(EmptyInputException e) {
			encodeErrorOutput.add("EMPTY_INPUT_EXCEPTION");
			return new ResponseEntity<>(encodeErrorOutput,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e) {
			encodeErrorOutput.add("EXCEPTION");
			return new ResponseEntity<>(encodeErrorOutput,HttpStatus.BAD_REQUEST);
		}
	}
}
