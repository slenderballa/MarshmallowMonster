package marshmallows.model;

public class MarshmallowMonster
{
	
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs; 
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
	
	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	//Getters & Setters
	
	
	
	
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonstereyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	
	public void setMonsterEyes (int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	
	
	
	
	
	
	
	
	
	
	public String toString ()
	{
		String monster = "This monster has " + monsterEyes + " eyes, and its' name is " + monsterName + " it also has " + monsterNoses + " noses, his hair length is " + monsterHair + " inches, and he has " + monsterLegs + " legs.";
	
		return monster;
	}
	}
