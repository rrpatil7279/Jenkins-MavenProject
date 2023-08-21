package com.rpatil.trainings.jenkins.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rpatil.trainings.jenkins.JenkinsCalculator;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator calculator = new JenkinsCalculator();
		assertEquals(10, calculator.add(5, 5));
	}
	
	@Test
	public void subtractTest() {
		JenkinsCalculator calculator = new JenkinsCalculator();
		assertEquals(5, calculator.subtract(10, 5));
	}

}
