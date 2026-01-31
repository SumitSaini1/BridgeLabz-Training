package com.example.junit_demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTests {
	Parameterized para=para=new Parameterized();
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8})
	public void testIsEven(int number) {
		if(number%2==0) {
			assertTrue(para.isEven(number));
			
		}else {
			assertFalse(para.isEven(number));
		}
		
	}
	
	

}
