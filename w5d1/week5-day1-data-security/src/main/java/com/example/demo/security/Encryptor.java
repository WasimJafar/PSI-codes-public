package com.example.demo.security;

import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.demo.exception.EmptyFieldException;
import com.example.demo.exception.EmptyInputException;


@Component
@ComponentScan(basePackages = "com.example.demo")
public class Encryptor extends DataSecurityProvider{
	
	public Encryptor() {
		super();
	}
	
	/**
	 * @param data The data that needs to be encrypted.
	 * @param keyByte Custom generated key to be used for encryption.
	 * @return Returns the encrypted data
	 */
	public String encryptData(String data,byte[] keyByte){
		Key key = new SecretKeySpec(keyByte, keySpec);
		
		try {
			Cipher cipher;
	        cipher = Cipher.getInstance(algorithm);
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        return new String(Base64.getEncoder().encode(cipher.doFinal(data.getBytes())));
		}
		catch (Exception all) {
			throw new RuntimeException(all);
		}
	}
	
	/**
	 * @param the data which needs to be encrypted as a list of strings.
	 * @return Encrypted data in same order as a list of strings.
	 * @throws EmptyFieldException
	 * @throws EmptyInputException
	 */
	public List<String> encrypt(List<String> data) throws EmptyFieldException,EmptyInputException
	{
		if(data.isEmpty()) {
			throw new EmptyInputException();
		}
		
		List<String> output= new ArrayList<>();
		
		for(String value : data) {
			if(value.isBlank()) {
				throw new EmptyFieldException();
			}
			int asciiSum = value.chars().sum();
			output.add("*"+asciiSum+"*"+encryptData(value,genKey(asciiSum)));
			
		}
		return output;
	}
}
