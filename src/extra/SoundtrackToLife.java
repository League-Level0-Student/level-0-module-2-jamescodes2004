//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Angry", "Excited", "Stressed" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		if (userMood==4) {
		JOptionPane.showMessageDialog(null, "So you're stressed eh.");
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

		playVideo("https://www.youtube.com/watch?v=lFcSrYw-ARY");}
		if (userMood==1) {
			JOptionPane.showMessageDialog(null, "It really does suck to be sad.");
		playVideo("https://www.youtube.com/watch?v=aWIE0PX1uXk");}
		if (userMood==2) {
			JOptionPane.showMessageDialog(null, "Being angry is terrible.");
		playVideo("https://www.youtube.com/watch?v=1qKS51qh4OY");}
		if (userMood==0) {
			JOptionPane.showMessageDialog(null, "Happy really is the best emotion!");
		playVideo("https://www.youtube.com/watch?v=NvZtkt9973A");}
		if (userMood==3) {
			JOptionPane.showMessageDialog(null, "Excitement is just wonderful!");
		playVideo("https://www.youtube.com/watch?v=0lkEoAnZSR8");}
		// 4. Play different songs for other moods.

/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



