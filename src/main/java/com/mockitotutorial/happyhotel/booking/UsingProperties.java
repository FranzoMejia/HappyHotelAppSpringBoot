package com.mockitotutorial.happyhotel.booking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:otherprops.properties")
public class UsingProperties {
	
	@Value("${myName}") 
	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
