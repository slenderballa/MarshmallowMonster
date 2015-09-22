package marshmallows.controller;

import marshmallows.model.MarshmallowMonster; 
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;



public class MonsterController
{
	private MarshmallowMonster garrettMonster; 
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;

	public MonsterController()
	{
		int eyes = 3;
		double legs = 5;
		double hair = .2;
		int noses =1;
		boolean hasBellyButton = false;
		String name = "Beast";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		garrettMonster = new MarshmallowMonster (name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(garrettMonster.toString());
		//askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + garrettMonster.toString());;
		myOutput.displayMonsterGUI(garrettMonster.toString());
		myOutput.displayPopupGUI("Garrett is amazing");
		myOutput.displayGarrettGUI("Gangster rap made me do it");
		
	}
	
	private void askQuestions()

	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		garrettMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in a different numer of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		garrettMonster.setMonsterEyes(betterMonsterEyes);
	}
	/**
	 * This method will get the information to create an instance of a MarmallowMonster.
	 */
	private void makeUserMonster()
	{
	//Step one: Get variables
		String userName;   //Declare a String type called userName
		int userEyes;     //Declare an int type called userEyes
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define variables by using Scanner to get user input.
		System.out.println("Type in youname for your monster. ");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for this monster.");
		userNoseCount   =   monsterScanner.nextInt();
		System.out.println("How much hair does your monster have? Type in a floating pointor decimal number");
		userHair = monsterScanner.nextDouble ();
		System.out.println("How many legs???");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does it have a bellybutton? Type true or false");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor!!! Remember that order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
		
	}
}