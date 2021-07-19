package com.example.demo.security;


import java.nio.ByteBuffer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSecurityProvider {
	
	@Value("${algorithm}")
	protected String algorithm;
	
	@Value("${key}")
	protected String key;
	
	@Value("${keySpec}")
	protected String keySpec;
	
	public DataSecurityProvider() {
		super();
	}
	
	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}

	public String getKeySpec() {
		return keySpec;
	}

	public void setKeySpec(String keySpec) {
		this.keySpec = keySpec;
	}
	
	
	/**
	 * It generates a custom key for each data that needs to be encrypted.
	 */
	/**
	 * @param asciiSum The sum of the ascii values of the data
	 * @return The new generated key of type byte[] 
	 */
	public byte[] genKey(int asciiSum) {
		
		byte[] keyByte = key.getBytes();
		byte[] dataByte = ByteBuffer.allocate(4).putInt(asciiSum).array();
		
		int limit = Math.min(keyByte.length,dataByte.length);
		for(int i=0;i<limit;i++) {
			keyByte[i] = (byte) ((int)keyByte[i] ^ (int)dataByte[i]);
		}
		
		int difference = 16 - keyByte.length;
		byte[] newKey = new byte[16];
		if(difference>0) {
			int i=0;
			for(i=0;i<keyByte.length;i++)
			{
				newKey[i] = keyByte[i];
			}
			
			while(i<16) {
				newKey[i]= (byte)0;
				i++;
			}
		}
		else {
			int i=0;
			for(i=0;i<16;i++) {
				newKey[i] = keyByte[i];
			}
		}
		
		return newKey;
	}
}
