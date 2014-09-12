package monster.controller;

import monster.model.Monster;
import monster.view.MonsterView;

public class Controller
{
	private MonsterView appView;
	private Monster Snickelfritz;
	private Monster RandomMonster;

	public Controller()
	{
		appView = new MonsterView(this);
		Snickelfritz = new Monster("Snickelfritz", 5, 1, 2.0, 2.0, 3, true);
		RandomMonster = new Monster("Morph", 0, 0, 0, 0, 0, false);
	}

	public Monster getSnickel()
	{
		return Snickelfritz;
	}

	public void start()
	{
		appView.displayinformation();
	}

}
