package com.dj.learn.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.linku.learning.jenkins.JenkinsCalculator;

public class JenkinsCalculatorTest {

	@Test
	public void addTest() {
		assertEquals(7, new JenkinsCalculator().add(4, 3));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(1, new JenkinsCalculator().subTract(4, 3));
	}

}
