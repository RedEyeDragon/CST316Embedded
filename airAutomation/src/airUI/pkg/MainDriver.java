package airUI.pkg;
/*
 *****************************************************************************************************************
 *  In this main driver that will open the GUI. The main that we all have been using for our individual
 *  code is now just commented out and all placed here.
 *****************************************************************************************************************
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainDriver implements ActionListener
{
	static MainPage mp = new MainPage(new MainDriver());
	static Reports fr = new Reports(new MainDriver());
	static Customize run = new Customize(new MainDriver());

	public static void main(String[] args)
	{
		// This is for the main page
		mp.showMainGUI();
	}


	public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();

        if (obj == mp.reportsButton) {
            mp.hideMainGUI();
            fr.showReportsGUI();
        }

        if (obj == fr.backButton) {
            mp.showMainGUI();
            fr.hideReportsGUI();
        }


        if (obj == mp.customizeButton) {
            mp.hideMainGUI();
            run.showcustomize();
        }

        if(obj == run.backButton){
            mp.showMainGUI();
            run.hidecustomize();
        }

    }

}
