package com.src.guessserGame;

public class GuesserGame 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------Game Start--------");
		System.out.println();
		
		Umpire U=new Umpire();
		U.collectDataFromGuesser();
		U.collectDataFromPlayer();
		U.compare();
		
		System.out.println();
		System.out.println("-----------Game Over--------");
	}
}
