package marshmallows.view;

import javax.swing.JOptionPane;


public class MarshmallowOutput
{
	public void displayMonsterInfo(String info)
	{
		System.out.println("My monster info is: " + info);
	}

	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is:" + info);
	}
	
	public void displayPopupGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "Garrett is amazing");
	
	}
	
	public void displayGarrettGUI(String info)
	{
		JOptionPane.showMessageDialog(null,  "Gangster rap made me do it");
	}
	
}
