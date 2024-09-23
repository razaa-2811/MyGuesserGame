package com.src.guessserGame;

import java.util.Scanner;

public class Guesser 
{
	int guesserNum;
	public int Guess()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser please guess a Number");
		guesserNum=sc.nextInt();
		return guesserNum;
	}
}
