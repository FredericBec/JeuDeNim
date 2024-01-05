#Jeu de nim

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Usage](#usage)

## General info

This program can arbitrate a game between two players at Nim game.

Game's goal :
Each player choose between one and four matches and remove of the matches total since any matches can be remove. The player, who remove the last matche, lose the game


## Technologies

* Java SE 8
* Eclipse IDE for java developers
* Git bash

## Usage

The program start to ask each user name and generate the first player randomly. Then each player choose a number between one and four that the program verify with the method validMove below.

```
public static boolean validMove(int matches) {
		
		return matches >= 1 && matches <= 4 && matches <= matchesCount;
			
	}
```

The program remove the number of matches with the method removeMatches and switch player only if the count of matches is different of 0 like code below.

```
	if(validMove(matchesNumber)) {
		removeMatches(matchesNumber);
			if(matchesCount != 0) {					
				currentPlayer = currentPlayer.equals(playerOne) ? playerTwo : playerOne;
			}
	}else System.out.println("Nombre d'allumettes non valide !!");
```

At the end, the program announce the winner.