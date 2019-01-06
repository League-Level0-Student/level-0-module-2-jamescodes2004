//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==1) {
JOptionPane.showMessageDialog(null, "You are so intelligent!");}
if (randomNumber==2) {
JOptionPane.showMessageDialog(null, "You might as well be the most kind person around!");}
if (randomNumber==3) {
JOptionPane.showMessageDialog(null, "Your'e so fine that when the guys/girls see you they faint");}
if (randomNumber==4) {
JOptionPane.showMessageDialog(null, "Your'e the most adept coder I've ever seen!");}
if (randomNumber==5) {
JOptionPane.showMessageDialog(null, "You be UGLY");}
if (randomNumber==6) {
JOptionPane.showMessageDialog(null, "Your'e so friendly its crazy");}
if (randomNumber==7) {
JOptionPane.showMessageDialog(null, "You be dumb!");}
if (randomNumber==8) {
JOptionPane.showMessageDialog(null, "You be annoying!");}
if (randomNumber==9) {
JOptionPane.showMessageDialog(null, "You be evil!");}
if (randomNumber==0) {
JOptionPane.showMessageDialog(null, "You be thiccccccc!");}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
