package com.example.junit_demo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class PerformanceTestingUsingTimeoutTest {
	PerformanceTestingUsingTimeout service=new PerformanceTestingUsingTimeout();
	
	
	@Test
	@Timeout(3)
	public void testTimeOut() throws InterruptedException {
        service.longRunningTask();
    }

}
