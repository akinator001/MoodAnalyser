/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cp.mood;

public class MoodAnalyser {
    String msg;
	MoodAnalyser(){
		
	}
    
	MoodAnalyser(String msg){
		this.msg = msg ;
	}
	
	public String analyseMood() {
		if(msg.contains("Happy")) {
			return "HAPPY";
		}else {
			return null;
		}
	}
	
	public static void main(String []args) {
		System.out.println("Welcome to mood analyser");
	}
}
