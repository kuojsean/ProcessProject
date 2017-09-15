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
		thirdCircle = new PlayDohCircle(15);
		
		PlayDohCube firstCube = new PlayDohCube();
		PlayDohCube secondCube;
		secondCube = new PlayDohCube(10);
		
		PlayDohCube thirdCube;
		thirdCube = new PlayDohCube(5);
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + thirdCircle);
		
		System.out.println("This is the play doh cube");
		System.out.println(firstCube);
		System.out.println("Here is another cube number two " + secondCube);
		
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
		System.out.println("How old are you????");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("You said that you are " + ageAnswer + " years old");
		
		PlayDohCircle changeCircle = new PlayDohCircle();
		System.out.println("Here is the circle before I change it");
		System.out.println(changeCircle);
		System.out.println("Type in a new size - use numbers please.");
		int mySize = firstScanner.nextInt();
		changeCircle.setSize(mySize);
		System.out.println("Now look at the circle");
		System.out.println(changeCircle);
	}
}
