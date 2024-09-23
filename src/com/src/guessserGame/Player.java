package com.src.guessserGame;

import java.util.Scanner;

public class Player 
{
	int playerNum;
	public int PlayerNumber() {
		Scanner sc=new Scanner(System.in);
		
		playerNum=sc.nextInt();
		return playerNum;
	}
}
