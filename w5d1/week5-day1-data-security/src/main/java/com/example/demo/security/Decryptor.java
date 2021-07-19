package com.example.demo.security;

import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.demo.exception.EmptyFieldException;
import com.example.demo.exception.EmptyInputException;
import com.example.demo.exception.InvalidInputException;

@Component
@ComponentScan(basePackages = "com.example.demo")
public class Decryptor extends DataSecurityProvider {
	
		
	public Decryptor() {
		super();
	}

	/**
	 * @param data The data to be decrypted as a string
	 * @param keyByte The custom generated key to be used to decrypt the data 
	 * @return The decrypted data as String
	 */
	public String decryptData(String data,byte[] keyByte) {
		Key key = new SecretKeySpec(keyByte, keySpec);
		
		try {
			Cipher cipher;
			cipher = Cipher.getInstance(algorithm);
			cipher.init(Cipher.DECRYPT_MODE, key);
			return new String(cipher.doFinal(Base64.getDecoder().decode(data.getBytes())));			
		}
		catch (Exception all) {
			throw new RuntimeException(all);
			
		}
	}
	
	/**
	 * @param data The data to be decrypted as a list of Strings
	 * @return Decrypted data as a list of Strings
	 * @throws InvalidInputException
	 * @throws EmptyFieldException
	 * @throws EmptyInputException
	 */
	public List<String> decrypt(List<String> data) throws InvalidInputException,EmptyFieldException,EmptyInputException
	{ 
		if(data.isEmpty()) {
			throw new EmptyInputException();
		}
		
		List<String> output = new ArrayList<>();
		for(String value : data) {
			if(value.isBlank()) {
				throw new EmptyFieldException();
			}
			if(!Pattern.matches("\\*[\\d]+\\*.+",value))
			{
				throw new InvalidInputException();
			}
			int asciiSum;
			String[] valueArray = value.split("\\*");
			asciiSum = Integer.parseInt(valueArray[1]);
			value = valueArray[2];
			output.add(decryptData(value,genKey(asciiSum)));
		}
		return output;
	}
}
