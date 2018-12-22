//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 *
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
String count=JOptionPane.showInputDialog(null,"Where should I start counting from");
		// 3. Change the countdown to use the new starting point

Integer count1 = Integer.valueOf(count);		


		// 1. Print a countdown from 10 to 0 on the console
for(int i=count1; i>=0; i--) {
JOptionPane.showMessageDialog(null, i);
speak(i+"");
Thread.sleep(10);
}
			// 4. Use the speak method to hear the countdown.
		
			// 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
		Thread.sleep(1000);
		// 5. when the counting is done, speak "blastoff!"
	speak("Blastoff!");}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


