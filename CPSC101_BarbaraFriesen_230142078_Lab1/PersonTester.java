/**
* This file is part of a solution to
*     CPSC 101 Lab 1, January 2020.
*
* Tests the Person object by telling a story.
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
*/

public class PersonTester{

	public static void main(String[] args){

		System.out.println("\nIn a far off jungle there was a mysterious ruin...");
		System.out.println("A brave group of adventurers sought to claim its hidden treasure!\n");

		Person dora = new Person("Dora");
		Person diego = new Person("Diego");
		Person boots = new Person("Boots");

		Person.allSayHello();

		System.out.println("\nDay One\n=========\nNumber Living: " + Person.numberLiving + "\nNumber Dead: " + Person.numberDead + "\n");
		System.out.println("By the time they reached the ruins night had fallen, so they decided to sleep before entering the ruins.");

		Person swiper = new Person("Swiper");

		System.out.println("Unknown to our brave group of explorers they had been followed by none other than " + swiper.name() + ". " +
			swiper.name() + " had gotten \ntired of " + dora.name() + " always getting in his way. So now he was going to do something about it. " +
			swiper.name() + " as stealthy as \na fox can be slipped into their camp and put some poison into " + boots.name() + "' mouth.");

		swiper.murder(boots);

		System.out.println("\nDay Two\n=========\nNumber Living: " + Person.numberLiving + "\nNumber Dead: " + Person.numberDead + "\n" +
			"\nThe next morning our adventurers couldn't wake their friend, he was dead." +
			dora.name() + " and " + diego.name() + " there could only /nbe one person responsible, " + (boots.murderer()).name() + ".\n\n" +
			"Having no other choice they pressed on into the ruins hoping no more tragedies would befall them. However \nfate would not be so kind " +
			"as " + swiper.name() + " had set a pitfall trap right inside the entrance. " + diego.name() + " led the way and \nfell into the pitfall." +
			"\"NOOO!\" shouted " + dora.name() + ", rushing to the edge. However it was clear that he was dead.\n");

		diego.die();

		System.out.println(dora.name() + " was now alone and she decided to bury both her friends before she moved forward, this took all day\n" +
			"so she made camp and went to bed alone.\n\nDay Three\n=========\nNumber Living: " + Person.numberLiving + "\nNumber Dead: " +
			Person.numberDead + "\n\nThe next morning " + dora.name() + " proceded alone into the ruin. " + dora.name() + " expertly avoided " +
			"every trap the ruin\nhad to offer and quickly made it into the treasure room. Before she could claim her treasure when she heard...\n");

		swiper.sayHello();

		System.out.println("\n" + dora.name() + " spun around and looked at him absolutely furious.\nHe had taken those she loved and now wanted to steal " +
			"the treasure she found, \nwithout a second thought she jumped at him putting her hands around his throat.");

		dora.murder(swiper);

		System.out.println("\nDora came to a few minutes later, and laying beside her was " + swiper.name() + ". " + dora.name() + " got up, gathered the \n" +
			"treasure, and headed back home.\n\nDay Four\n=========\nNumber Living: " + Person.numberLiving + "\nNumber Dead: " + Person.numberDead + "\n\n" +
			"The next day " + dora.name() + "'s mom was waiting for the brave group to arrive, and when they did they all said hi to her.\n");

		Person.allSayHello();

		System.out.println("\nBut only " + dora.name() + " was left.");

	}
}