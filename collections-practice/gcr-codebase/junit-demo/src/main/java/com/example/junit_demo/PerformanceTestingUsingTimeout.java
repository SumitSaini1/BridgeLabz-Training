package com.example.junit_demo;

public class PerformanceTestingUsingTimeout {
	public String longRunningTask() throws InterruptedException{
		Thread.sleep(3000);
		return "Completed";
	}

}
