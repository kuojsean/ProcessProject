package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohCube;

public class SampleController
{
	public SampleController()
	{
		
	}
	
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(5);
		
		PlayDohCube firstCube = new PlayDohCube();
		PlayDohCube secondCube;
		secondCube = new PlayDohCube(10);
		
		PlayDohCube thirdCube;
		thirdCube = new PlayDohCube(5);
		
		System.out.println("This is a sample project to show the github and");
		System.out.println("eclipse process so I develop muscle memory :D");
	
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner Object.
		firstScanner = new Scanner(System.in); //Instantiates a Scanner Object.
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}
}
