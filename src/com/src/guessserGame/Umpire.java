package com.src.guessserGame;

public class Umpire 
{
	int GuesserNum;
	int Player1;
	int Player2;
	int Player3;
	
	void collectDataFromGuesser()
	{
		Guesser Gu= new Guesser();
		GuesserNum=Gu.Guess();
	}
	void collectDataFromPlayer()
	{
		Player Pl=new Player();
		
		System.out.println("Player 1 enter your Number");
		Player1=Pl.PlayerNumber();
		
		System.out.println("Player 2 enter your Number");
		Player2=Pl.PlayerNumber();
		
		System.out.println("Player 3 enter your Number");
		Player3=Pl.PlayerNumber();
	}
	void compare()
	{
		if(GuesserNum==Player1)
		{
			if(GuesserNum==Player2 && GuesserNum==Player3)
			{
				System.out.println("All the Players Won");
			}
			else if (GuesserNum==Player3)
			{
				System.out.println("Player 1 and Player 3 Both won the Game");
			}
			else if(GuesserNum==Player2)
			{
				System.out.println("Player 1 and Player 2 Both won the Game");
			}
			else
			{
				System.out.println("Player 1 Won");
			}
		}
		else if(GuesserNum==Player2) 
		{
			if(GuesserNum==Player3)
			{
				System.out.println("Player 2 and Player 3 Both won the Game");
			}
			else
			{
				System.out.println("Player 2 Won");
			}
		}
		else if(GuesserNum==Player3)
		{
			System.out.println("Player 3 Won");
		}
		else
		{
			System.out.println("No One Wins");
		}
	}
}
