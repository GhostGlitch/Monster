package monster.view;

import javax.swing.JOptionPane;

import monster.controller.Controller;


public class MonsterView
{
	private Controller controller;

	public MonsterView(Controller controller)
	{
		this.controller = controller;
	}
	public void displayinformation()
	{

		JOptionPane.showMessageDialog(null, controller.getSnickel().getName());

	}
}
