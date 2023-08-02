import java.util.*;
import java.lang.*;
public class Game {
	public static void main(String[] args){
		/*********
		  OBJECTS
		 *********/
		Scanner keyboard = new Scanner(System.in);
		Character character = new Character();
		Places places = new Places();
		Equipment equipment = new Equipment();
		Combat combat = new Combat();

		/*************
 		  OPEN SCREEN
 		 *************/
		System.out.println();
		System.out.println("CORY'S AWESOME GAME");
		System.out.println();
//		System.out.println("@@@@@@@  @@@  @@@  @@@@@@@@      @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@  \n@@@@@@@  @@@  @@@  @@@@@@@@     @@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@  \n  @@!    @@!  @@@  @@!          !@@        @@!  @@@  @@! @@! @@!  @@!       \n  !@!    !@!  @!@  !@!          !@!        !@!  @!@  !@! !@! !@!  !@!       \n  @!!    @!@!@!@!  @!!!:!       !@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:!    \n  !!!    !!!@!!!!  !!!!!:       !!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!:    \n  !!:    !!:  !!!  !!:          :!!   !!:  !!:  !!!  !!:     !!:  !!:       \n  :!:    :!:  !:!  :!:          :!:   !::  :!:  !:!  :!:     :!:  :!:       \n   ::    ::   :::   :: ::::      ::: ::::  ::   :::  :::     ::    :: ::::  \n   :      :   : :  : :: ::       :: :: :    :   : :   :      :    : :: ::   ");

		/********************
		  CHARACTER CREATION
		 ********************/
		System.out.println("CHARACTER CREATION");
		System.out.println("What shall thou call thy?");
		System.out.print("Your name: ");
		character.setName(keyboard.nextLine());
		boolean stop = false;
		String c = "0";
		while (stop!=true) {
			System.out.println();
			System.out.println("Welcome " + character.getName() + "! What is doust class? (123)");
			System.out.println("1. Fighter");
			System.out.println("2. Cleric");
			System.out.println("3. Thief");
			System.out.println("4. Magic-User");
			System.out.print("Your selection: ");
			c = keyboard.next();
			if (c.equals("1")){
				character.createClass1();
				stop = true;
			}
			else if (c.equals("2")){
				character.createClass2();
				stop = true;
			}
			else if (c.equals("3")){
				character.createClass3();
				stop = true;
			}
			else if (c.equals("4")){
				character.createClass4();
				stop = true;
			}
			else {
				stop = false;
			}
		}
		stop = false;
		while (stop!=true) {
			if (c.equals("1") || c.equals("2") || c.equals("3") || c.equals("4")){
				System.out.println();
				System.out.println(character);
                 		System.out.print("Re-roll? (Y/N) ");
                   		String yesOrNo = keyboard.next();
                     		if (yesOrNo.equalsIgnoreCase("Y")){
					if (c.equals("1"))
						character.createClass1();
					if (c.equals("2"))
						character.createClass2();
					if (c.equals("3"))
						character.createClass3();
					if (c.equals("4"))
						character.createClass4();
					stop = false;
				}
         	       		else if (yesOrNo.equalsIgnoreCase("N"))
					stop = true;
				else {
					stop = false;
					System.out.println("You fucked up.");
				}
			}
		}
		System.out.println(character.getClassName() + "! Excellent choice!");
		
		/***********
		  MAIN MENU
		 ***********/
		boolean quit = false;
		while (quit!=true){
			System.out.println();
			System.out.println("WHERE DO YOU WANT TO TRAVEL?");
			System.out.println("----------------------------");
			System.out.println(" 0. VIEW YOUR STATS");
			System.out.println(" 1. THE PLAINS");
			System.out.println(" 2. THE FOREST");
			System.out.println(" 3. THE SWAMP");
			System.out.println(" 4. THE ISLANDS");
			System.out.println(" 5. THE MOUNTAINS");
			System.out.println(" 6. THE MO FUCKING PORTAL");
			System.out.println(" 7. THE SHOP");
			System.out.println(" 8. THE TAVERN");
			System.out.println(" 9. A RESTING PLACE");
			System.out.println("99. QUIT THE GAME");
			System.out.print("Your selection: ");
			String i = keyboard.next();
			if (i.equalsIgnoreCase("0")){
				System.out.println();
				System.out.println(character);
			}
			else if (i.equalsIgnoreCase("1")){
				System.out.println();
				System.out.println("You travel to the plains.");
				character.setLocation("Plains");
		                boolean end = false;
                		while (end==false){
					places.plains();
                        		i = keyboard.next();
                        		if (i.equalsIgnoreCase("0")){
                                		System.out.println();
                                		System.out.println(character);
                        		}
                        		else if (i.equalsIgnoreCase("1")){
                                		System.out.println();
						combat.combat(character);
                        		}                    
                        		else if (i.equalsIgnoreCase("2")){
                                		System.out.println();
						character.rest();
                        		}
                        		else if (i.equalsIgnoreCase("3")){
						System.out.println();
						System.out.println("You travel back to town.");
                                		end = true;
                        		}
                        		else{
                                		System.out.println();
                                		System.out.println("Stop being a dumbass. Try again.");
                        		}
                		}
			}
			else if (i.equalsIgnoreCase("2")){
				System.out.println();
				System.out.println("You travel to the forest.");
				character.setLocation("Forest");
		                boolean end = false;
                		while (end==false){
					places.forest();
                        		i = keyboard.next();
                        		if (i.equalsIgnoreCase("0")){
                                		System.out.println();
                                		System.out.println(character);
                        		}
                        		else if (i.equalsIgnoreCase("1")){
                                		System.out.println();
						combat.combat(character);
                        		}                                                        
                        		else if (i.equalsIgnoreCase("2")){
                                		System.out.println();
						character.rest();
                        		}
                        		else if (i.equalsIgnoreCase("3")){
						System.out.println();
						System.out.println("You travel back to town.");
                                		end = true;
                        		}
                        		else{
                                		System.out.println();
                                		System.out.println("Stop being a dumbass. Try again.");
                        		}
                		}
			}
			else if (i.equalsIgnoreCase("3")){
				System.out.println();
				System.out.println("You travel to the swamp.");
				character.setLocation("Swamp");
		                boolean end = false;
                		while (end==false){
					places.plains();
                        		i = keyboard.next();
                        		if (i.equalsIgnoreCase("0")){
                                		System.out.println();
                                		System.out.println(character);
                        		}
                        		else if (i.equalsIgnoreCase("1")){
                                		System.out.println();
						combat.combat(character);
                        		}                                                        
                        		else if (i.equalsIgnoreCase("2")){
                                		System.out.println();
						character.rest();
                        		}
                        		else if (i.equalsIgnoreCase("3")){
						System.out.println();
						System.out.println("You travel back to town.");
                                		end = true;
                        		}
                        		else{
                                		System.out.println();
                                		System.out.println("Stop being a dumbass. Try again.");
                        		}
                		}
			}
			else if (i.equalsIgnoreCase("4")){
				System.out.println();
				System.out.println("You travel to the islands.");
				character.setLocation("Islands");
		                boolean end = false;
                		while (end==false){
					places.islands();
                        		i = keyboard.next();
                        		if (i.equalsIgnoreCase("0")){
                                		System.out.println();
                                		System.out.println(character);
                        		}
                        		else if (i.equalsIgnoreCase("1")){
                                		System.out.println();
						combat.combat(character);
                        		}                                                        
                        		else if (i.equalsIgnoreCase("2")){
                                		System.out.println();
						character.rest();
                        		}
                        		else if (i.equalsIgnoreCase("3")){
						System.out.println();
						System.out.println("You travel back to town.");
                                		end = true;
                        		}
                        		else{
                                		System.out.println();
                                		System.out.println("Stop being a dumbass. Try again.");
                        		}
                		}
			}
			else if (i.equalsIgnoreCase("5")){
				System.out.println();
				System.out.println("You travel to the mountains.");
				character.setLocation("Mountains");
		                boolean end = false;
                		while (end==false){
					places.mountains();
                        		i = keyboard.next();
                        		if (i.equalsIgnoreCase("0")){
                                		System.out.println();
                                		System.out.println(character);
                        		}
                        		else if (i.equalsIgnoreCase("1")){
                                		System.out.println();
						combat.combat(character);
                        		}                                                        
                        		else if (i.equalsIgnoreCase("2")){
                                		System.out.println();
						character.rest();
                        		}
                        		else if (i.equalsIgnoreCase("3")){
						System.out.println();
						System.out.println("You travel back to town.");
                                		end = true;
                        		}
                        		else{
                                		System.out.println();
                                		System.out.println("Stop being a dumbass. Try again.");
                        		}
                		}
			}
			else if (i.equalsIgnoreCase("6")){
				System.out.println();
				System.out.println("You travel to the portal.");
				character.setLocation("Portal");
		                boolean end = false;
                		while (end==false){
					places.portal();
                        		i = keyboard.next();
                        		if (i.equalsIgnoreCase("0")){
                                		System.out.println();
                                		System.out.println(character);
                        		}
                        		else if (i.equalsIgnoreCase("1")){
                                		System.out.println();
						combat.combat(character);
                        		}                                                        
                        		else if (i.equalsIgnoreCase("2")){
                                		System.out.println();
						character.rest();
                        		}
                        		else if (i.equalsIgnoreCase("3")){
						System.out.println();
						System.out.println("You travel back to town.");
                                		end = true;
                        		}
                        		else{
                                		System.out.println();
                                		System.out.println("Stop being a dumbass. Try again.");
                        		}
                		}
			}
			else if (i.equalsIgnoreCase("7")){
				System.out.println();
				System.out.println("You enter the shop.");
				boolean end = false;
				while (end==false){
					places.shop();
					String s = keyboard.next();
					if (s.equalsIgnoreCase("0")){
						System.out.println();
						System.out.println(character);
					}
					else if (s.equalsIgnoreCase("1"))
						places.buyWeapons(character);
					else if (s.equalsIgnoreCase("2"))
						places.buyArmor(character);
					else if (s.equalsIgnoreCase("3")){
//						talk to the shop keeper method
					}
					else if (s.equalsIgnoreCase("4")){
						System.out.println();
						System.out.println("You travel back to town.");
						end = true;
					}
					else {
						System.out.println();
						System.out.println("Silly goose. Try again");
					}
				}
			}
			else if (i.equalsIgnoreCase("8")){
				System.out.println();
				System.out.println("You enter the tavern.");
				boolean end = false;
				while (end==false){
					places.tavern();
					String t = keyboard.next();
					if (t.equals("0")){
						System.out.println(character);
					}
					else if (t.equals("1")){
//						talk to bartender method					
					}
					else if (t.equals("2")){
//						talk to the drunks method
					}
					else if (t.equals("3")){
//						talk to the babes method
					}
					else if (t.equals("4")){
						System.out.println();
						System.out.println("You travel back to town.");
						end = true;
					}
					else{
						System.out.println();
						System.out.println("Silly goose. Try again");
					}
				}
			}
			else if (i.equalsIgnoreCase("9")){
				System.out.println();
				System.out.println("You enter the healer's hut.");
				character.rest();
			}
			else if (i.equalsIgnoreCase("99")){
				System.out.println();
				System.out.println("See you next time!");
				System.exit(0);
			}
			else {
				System.out.println();
				System.out.println("Please enter a number from the menu.");
				quit = false;
			}
		}
	}
}
