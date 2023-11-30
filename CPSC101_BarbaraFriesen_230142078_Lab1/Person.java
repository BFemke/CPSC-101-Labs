/**
* This file is part of a solution to
*     CPSC 101 Lab 1, January 2020.
*
* Creates Person objects with minor interation possibilities.
*
* @author Barbara Friesen
* Student Number: 230142078
* @version 1
*/

import java.util.ArrayList;

public class Person{

	private static ArrayList<Person> thePeople = new ArrayList<Person>();
	public static int numberLiving;
	public static int numberDead;
	private boolean amAlive = true;
	private Person murderer;
	private String name = "";

	public Person(String name){

		this.name = name;
		thePeople.add(this); //adds person to array list
		numberLiving++;
	}

	/**
	* PURPOSE: Kills person.
	*
	*@param 	None
	*@return	None
	*/
	public void die(){

		if(this.amAlive){
			amAlive = false;
			numberDead ++;
			numberLiving --;
			thePeople.remove(this); //removes person from array list
		}

	}

	/**
	* PURPOSE: Causes the victim to die, making the murderer known to the victim.
	*
	*@param 	Person victim - Who is going to get murdered
	*@return	None
	*/
	public void murder(Person victim){

		if(this.isAlive()){
			if(victim.isAlive()){
				victim.die();
				victim.murderer = this;
			}

		}

	}

	/**
	* PURPOSE: Makes person introduce themselves.
	*
	*@param 	None
	*@return	None
	*/
	public void sayHello(){

		if(this.amAlive)
			System.out.println("Hi, I'm " + name);
	}

	/**
	* PURPOSE: Returns the name of the murderer if that person has been murdered, else null.
	*
	*@param 	None
	*@return	Person murderer
	*/
	public Person murderer(){

		return murderer;
	}

	/**
	* PURPOSE: Returns this person's name, followed by ", deceased" if dead.
	*
	*@param		None
	*@return	String name
	*/
	public String name(){
		if(amAlive){
			return name;
		}
		else{
			return (name + ", deceased");
		}
	}

	/**
	* PURPOSE: Returns boolean indicating if this person is alive.
	*
	*@param 	None
	*@return	Boolean amAlive
	*/
	public boolean isAlive(){
		return amAlive;
	}

	/**
	* PURPOSE: Causes every living person to introduce themselves.
	*
	*@param 	None
	*@return	None
	*/
	public static void allSayHello(){

		for(Person aPerson: thePeople){ //loops through all Person objects

			System.out.println("Hi, I'm " + aPerson.name());

		}
	}
}