/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cp.mood;

import org.junit.Test;

import com.cp.mood.MoodAnalyser;

import static org.junit.Assert.*;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void testMoodAnalysis() {
		MoodAnalyser mood = new MoodAnalyser("this is Happy msg");
		String str = mood.analyseMood();
		Assert.assertEquals("HAPPY", str);
	}
}
