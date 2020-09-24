package examples;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Duck {
//	Member Variables: data
//	to achieve encapulation using private access specifier
	private String name;
	private int lifeExpectancy;
	private String favoriteFood;
	
//	constructor
	public Duck(String name, int lifeExpectancy, String favoriteFood) {
//		left -> member variables, associated with class
//		right  - parameters only lives upto life of constructor
		this.name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.favoriteFood = favoriteFood;
		
	}
	
//	Methods: functionality
	void waddle() {
		System.out.println("Waddle");
	};
	void quack() {
		System.out.println("Quack");
	};
	
}
