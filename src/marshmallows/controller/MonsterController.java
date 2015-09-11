package marshmallows.controller;

import marshmallows.model.MarshmallowMonster; 
import marshmallows.view.MarshmallowOutput;
public class MonsterController
{
	private MarshmallowMonster garrettMonster; 
	private MarshmallowOutput myOutput;

	public MonsterController()
	{
		int eyes = 3;
		double legs = 5;
		double hair = .2;
		int noses =1;
		boolean hasBellyButton = false;
		String name = "Ickle Diddykins";
		
		myOutput = new MarshmallowOutput();
		garrettMonster = new MarshmallowMonster (name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(garrettMonster.toString());
	}
}
