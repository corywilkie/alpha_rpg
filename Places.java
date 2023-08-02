import java.util.*;
public class Places {
	Scanner keyboard = new Scanner(System.in);
	Equipment equipment = new Equipment();
	public void plains(){
		System.out.println();
		System.out.println("THE PLAINS");
		System.out.println("----------");
		System.out.println("0. VIEW YOUR STATS");
		System.out.println("1. LOOK FOR ADVENTURE");
		System.out.println("2. STOP TO REST");
		System.out.println("3. TRAVEL BACK TO TOWN");
		System.out.print("Your selection: ");
	}
	public void forest(){
		System.out.println();
                System.out.println("THE FOREST");
                System.out.println("----------");
                System.out.println("0. VIEW YOUR STATS");
                System.out.println("1. LOOK FOR ADVENTURE");
                System.out.println("2. STOP TO REST");
                System.out.println("3. TRAVEL BACK TO TOWN");
                System.out.print("Your selection: ");
	}
	public void swamp(){
		System.out.println();
                System.out.println("THE SWAMP");
                System.out.println("---------");
                System.out.println("0. VIEW YOUR STATS");
                System.out.println("1. LOOK FOR ADVENTURE");
                System.out.println("2. STOP TO REST");
                System.out.println("3. TRAVEL BACK TO TOWN");
                System.out.print("Your selection: ");
	}
	public void islands(){
		System.out.println();
                System.out.println("THE ISLANDS");
                System.out.println("-----------");
                System.out.println("0. VIEW YOUR STATS");
                System.out.println("1. LOOK FOR ADVENTURE");
                System.out.println("2. STOP TO REST");
                System.out.println("3. TRAVEL BACK TO TOWN");
                System.out.print("Your selection: ");
	}
	public void mountains(){
		System.out.println();
                System.out.println("THE MOUNTAINS");
                System.out.println("-------------");
                System.out.println("0. VIEW YOUR STATS");
                System.out.println("1. LOOK FOR ADVENTURE");
                System.out.println("2. STOP TO REST");
                System.out.println("3. TRAVEL BACK TO TOWN");
                System.out.print("Your selection: ");
	}
	public void portal(){
		System.out.println();
                System.out.println("THE PORTAL");
                System.out.println("----------");
                System.out.println("0. VIEW YOUR STATS");
                System.out.println("1. LOOK FOR ADVENTURE");
                System.out.println("2. STOP TO REST");
                System.out.println("3. TRAVEL BACK TO TOWN");
                System.out.print("Your selection: ");
	}
	public void tavern(){
		System.out.println();
		System.out.println("THE TAVERN");
		System.out.println("----------");
		System.out.println("0. VIEW YOUR STATS");
		System.out.println("1. TALK TO THE BARTENDER");
		System.out.println("2. TALK TO THE DRUNKS");
		System.out.println("3. CHARM THE HOT BABES");
		System.out.println("4. RETURN TO THE TOWN");
		System.out.print("Your selection: ");
	}
	public void shop(){
		System.out.println();
		System.out.println("THE SHOP");
		System.out.println("--------");
		System.out.println("0. VIEW YOUR STATS");
		System.out.println("1. BUY WEAPONS");
		System.out.println("2. BUY ARMOR");
		System.out.println("3. TALK TO THE SHOPKEEPER");
		System.out.println("4. RETURN TO THE TOWN");
		System.out.print("Your selection: ");
	}
	public void buyWeapons(Character character){
		System.out.println();
		System.out.println("WEAPONS");
		System.out.println("-------");
		if (character.getClassName().equals("Fighter")){
			System.out.println("   NAME\t\t\tGOLD\t\tDAMAGE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class1WeaponName1() + "\t" + equipment.class1WeaponCost1() + "\t\t" + equipment.class1WeaponDamage1());
			System.out.println("2. " + equipment.class1WeaponName2() + "\t" + equipment.class1WeaponCost2() + "\t\t" + equipment.class1WeaponDamage2());
			System.out.println("3. " + equipment.class1WeaponName3() + "\t" + equipment.class1WeaponCost3() + "\t\t" + equipment.class1WeaponDamage3());
			System.out.println("4. " + equipment.class1WeaponName4() + "\t" + equipment.class1WeaponCost4() + "\t\t" + equipment.class1WeaponDamage4());
			System.out.println("5. " + equipment.class1WeaponName5() + "\t" + equipment.class1WeaponCost5() + "\t\t" + equipment.class1WeaponDamage5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which weapon would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                        	if (character.getGold() > equipment.class1WeaponCost1()){
                        		character.setGold(character.getGold()-equipment.class1WeaponCost1());
                        		character.setWeaponName(equipment.class1WeaponName1());
                        		character.setWeaponDamage(equipment.class1WeaponDamage1());
                        		System.out.println("You purchase the " + equipment.class1WeaponName1() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
			else if (w.equals("2")){         
                        	if (character.getGold() > equipment.class1WeaponCost2()){
                            		character.setGold(character.getGold()-equipment.class1WeaponCost2());
                                        character.setWeaponName(equipment.class1WeaponName2());
                                        character.setWeaponDamage(equipment.class1WeaponDamage2());
                                        System.out.println("You purchase the " + equipment.class1WeaponName2() + ".");
                                }
                                else
                                	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("3")){
                        	if (character.getGold() > equipment.class1WeaponCost3()){
                                	character.setGold(character.getGold()-equipment.class1WeaponCost3());
                                	character.setWeaponName(equipment.class1WeaponName3());
                                	character.setWeaponDamage(equipment.class1WeaponDamage3());
                                	System.out.println("You purchase the " + equipment.class1WeaponName3() + ".");
                           	}
                                else
                                	System.out.println("You don't have enough gold Fool.");
                      	}
                        else if (w.equals("4")){
                        	if (character.getGold() > equipment.class1WeaponCost4()){
                        		character.setGold(character.getGold()-equipment.class1WeaponCost4());
                        		character.setWeaponName(equipment.class1WeaponName4());
                        		character.setWeaponDamage(equipment.class1WeaponDamage4());
                        		System.out.println("You purchase the " + equipment.class1WeaponName4() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("5")){
                        	if (character.getGold() > equipment.class1WeaponCost5()){
                        		character.setGold(character.getGold()-equipment.class1WeaponCost5());
                        		character.setWeaponName(equipment.class1WeaponName5());
                        		character.setWeaponDamage(equipment.class1WeaponDamage5());
                        		System.out.println("You purchase the " + equipment.class1WeaponName5() + ".");
                        	}
                       		else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
		if (character.getClassName().equals("Cleric")){
      			System.out.println("   NAME\t\t\tGOLD\t\tDAMAGE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class2WeaponName1() + "\t" + equipment.class2WeaponCost1() + "\t\t" + equipment.class2WeaponDamage1());
			System.out.println("2. " + equipment.class2WeaponName2() + "\t" + equipment.class2WeaponCost2() + "\t\t" + equipment.class2WeaponDamage2());
			System.out.println("3. " + equipment.class2WeaponName3() + "\t" + equipment.class2WeaponCost3() + "\t\t" + equipment.class2WeaponDamage3());
			System.out.println("4. " + equipment.class2WeaponName4() + "\t" + equipment.class2WeaponCost4() + "\t\t" + equipment.class2WeaponDamage4());
			System.out.println("5. " + equipment.class2WeaponName5() + "\t" + equipment.class2WeaponCost5() + "\t\t" + equipment.class2WeaponDamage5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which weapon would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                        	if (character.getGold() > equipment.class2WeaponCost1()){
                        		character.setGold(character.getGold()-equipment.class2WeaponCost1());
                        		character.setWeaponName(equipment.class2WeaponName1());
                        		character.setWeaponDamage(equipment.class2WeaponDamage1());
                        		System.out.println("You purchase the " + equipment.class2WeaponName1() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
			else if (w.equals("2")){         
                        	if (character.getGold() > equipment.class2WeaponCost2()){
                            		character.setGold(character.getGold()-equipment.class2WeaponCost2());
                                        character.setWeaponName(equipment.class2WeaponName2());
                                        character.setWeaponDamage(equipment.class2WeaponDamage2());
                                        System.out.println("You purchase the " + equipment.class2WeaponName2() + ".");
                                }
                                else
                                	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("3")){
                        	if (character.getGold() > equipment.class2WeaponCost3()){
                                	character.setGold(character.getGold()-equipment.class2WeaponCost3());
                                	character.setWeaponName(equipment.class2WeaponName3());
                                	character.setWeaponDamage(equipment.class2WeaponDamage3());
                                	System.out.println("You purchase the " + equipment.class2WeaponName3() + ".");
                           	}
                                else
                                	System.out.println("You don't have enough gold Fool.");
                      	}
                        else if (w.equals("4")){
                        	if (character.getGold() > equipment.class2WeaponCost4()){
                        		character.setGold(character.getGold()-equipment.class2WeaponCost4());
                        		character.setWeaponName(equipment.class2WeaponName4());
                        		character.setWeaponDamage(equipment.class2WeaponDamage4());
                        		System.out.println("You purchase the " + equipment.class2WeaponName4() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("5")){
                        	if (character.getGold() > equipment.class2WeaponCost5()){
                        		character.setGold(character.getGold()-equipment.class2WeaponCost5());
                        		character.setWeaponName(equipment.class2WeaponName5());
                        		character.setWeaponDamage(equipment.class2WeaponDamage5());
                        		System.out.println("You purchase the " + equipment.class2WeaponName5() + ".");
                        	}
                       		else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
		if (character.getClassName().equals("Thief")){
			System.out.println("   NAME\t\t\tGOLD\t\tDAMAGE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class3WeaponName1() + "\t" + equipment.class3WeaponCost1() + "\t\t" + equipment.class3WeaponDamage1());
			System.out.println("2. " + equipment.class3WeaponName2() + "\t" + equipment.class3WeaponCost2() + "\t\t" + equipment.class3WeaponDamage2());
			System.out.println("3. " + equipment.class3WeaponName3() + "\t" + equipment.class3WeaponCost3() + "\t\t" + equipment.class3WeaponDamage3());
			System.out.println("4. " + equipment.class3WeaponName4() + "\t" + equipment.class3WeaponCost4() + "\t\t" + equipment.class3WeaponDamage4());
			System.out.println("5. " + equipment.class3WeaponName5() + "\t" + equipment.class3WeaponCost5() + "\t\t" + equipment.class3WeaponDamage5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which weapon would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                        	if (character.getGold() > equipment.class3WeaponCost1()){
                        		character.setGold(character.getGold()-equipment.class3WeaponCost1());
                        		character.setWeaponName(equipment.class3WeaponName1());
                        		character.setWeaponDamage(equipment.class3WeaponDamage1());
                        		System.out.println("You purchase the " + equipment.class3WeaponName1() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
			else if (w.equals("2")){         
                        	if (character.getGold() > equipment.class3WeaponCost2()){
                            		character.setGold(character.getGold()-equipment.class3WeaponCost2());
                                        character.setWeaponName(equipment.class3WeaponName2());
                                        character.setWeaponDamage(equipment.class3WeaponDamage2());
                                        System.out.println("You purchase the " + equipment.class3WeaponName2() + ".");
                                }
                                else
                                	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("3")){
                        	if (character.getGold() > equipment.class3WeaponCost3()){
                                	character.setGold(character.getGold()-equipment.class3WeaponCost3());
                                	character.setWeaponName(equipment.class3WeaponName3());
                                	character.setWeaponDamage(equipment.class3WeaponDamage3());
                                	System.out.println("You purchase the " + equipment.class3WeaponName3() + ".");
                           	}
                                else
                                	System.out.println("You don't have enough gold Fool.");
                      	}
                        else if (w.equals("4")){
                        	if (character.getGold() > equipment.class3WeaponCost4()){
                        		character.setGold(character.getGold()-equipment.class3WeaponCost4());
                        		character.setWeaponName(equipment.class3WeaponName4());
                        		character.setWeaponDamage(equipment.class3WeaponDamage4());
                        		System.out.println("You purchase the " + equipment.class3WeaponName4() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("5")){
                        	if (character.getGold() > equipment.class3WeaponCost5()){
                        		character.setGold(character.getGold()-equipment.class3WeaponCost5());
                        		character.setWeaponName(equipment.class3WeaponName5());
                        		character.setWeaponDamage(equipment.class3WeaponDamage5());
                        		System.out.println("You purchase the " + equipment.class3WeaponName5() + ".");
                        	}
                       		else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
		if (character.getClassName().equals("Magic-User")){
			System.out.println("   NAME\t\t\tGOLD\t\tDAMAGE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class4WeaponName1() + "\t" + equipment.class4WeaponCost1() + "\t\t" + equipment.class4WeaponDamage1());
			System.out.println("2. " + equipment.class4WeaponName2() + "\t" + equipment.class4WeaponCost2() + "\t\t" + equipment.class4WeaponDamage2());
			System.out.println("3. " + equipment.class4WeaponName3() + "\t" + equipment.class4WeaponCost3() + "\t\t" + equipment.class4WeaponDamage3());
			System.out.println("4. " + equipment.class4WeaponName4() + "\t" + equipment.class4WeaponCost4() + "\t\t" + equipment.class4WeaponDamage4());
			System.out.println("5. " + equipment.class4WeaponName5() + "\t" + equipment.class4WeaponCost5() + "\t\t" + equipment.class4WeaponDamage5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which weapon would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                        	if (character.getGold() > equipment.class4WeaponCost1()){
                        		character.setGold(character.getGold()-equipment.class4WeaponCost1());
                        		character.setWeaponName(equipment.class4WeaponName1());
                        		character.setWeaponDamage(equipment.class4WeaponDamage1());
                        		System.out.println("You purchase the " + equipment.class4WeaponName1() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
			else if (w.equals("2")){         
                        	if (character.getGold() > equipment.class4WeaponCost2()){
                            		character.setGold(character.getGold()-equipment.class4WeaponCost2());
                                        character.setWeaponName(equipment.class4WeaponName2());
                                        character.setWeaponDamage(equipment.class4WeaponDamage2());
                                        System.out.println("You purchase the " + equipment.class4WeaponName2() + ".");
                                }
                                else
                                	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("3")){
                        	if (character.getGold() > equipment.class4WeaponCost3()){
                                	character.setGold(character.getGold()-equipment.class4WeaponCost3());
                                	character.setWeaponName(equipment.class4WeaponName3());
                                	character.setWeaponDamage(equipment.class4WeaponDamage3());
                                	System.out.println("You purchase the " + equipment.class4WeaponName3() + ".");
                           	}
                                else
                                	System.out.println("You don't have enough gold Fool.");
                      	}
                        else if (w.equals("4")){
                        	if (character.getGold() > equipment.class4WeaponCost4()){
                        		character.setGold(character.getGold()-equipment.class4WeaponCost4());
                        		character.setWeaponName(equipment.class4WeaponName4());
                        		character.setWeaponDamage(equipment.class4WeaponDamage4());
                        		System.out.println("You purchase the " + equipment.class4WeaponName4() + ".");
                        	}
                        	else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("5")){
                        	if (character.getGold() > equipment.class4WeaponCost5()){
                        		character.setGold(character.getGold()-equipment.class4WeaponCost5());
                        		character.setWeaponName(equipment.class4WeaponName5());
                        		character.setWeaponDamage(equipment.class4WeaponDamage5());
                        		System.out.println("You purchase the " + equipment.class4WeaponName5() + ".");
                        	}
                       		else
                        		System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
	}
	public void buyArmor(Character character){
		System.out.println();
		System.out.println("ARMOR");
		System.out.println("-----");
		if (character.getClassName().equals("Fighter")){
			System.out.println("   NAME\t\t\tGOLD\t\tDEFENSE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class1ArmorName1() + "\t" + equipment.class1ArmorCost1() + "\t\t" + equipment.class1ArmorDefense1());
			System.out.println("2. " + equipment.class1ArmorName2() + "\t" + equipment.class1ArmorCost2() + "\t\t" + equipment.class1ArmorDefense2());
			System.out.println("3. " + equipment.class1ArmorName3() + "\t" + equipment.class1ArmorCost3() + "\t\t" + equipment.class1ArmorDefense3());
			System.out.println("4. " + equipment.class1ArmorName4() + "\t" + equipment.class1ArmorCost4() + "\t\t" + equipment.class1ArmorDefense4());
			System.out.println("5. " + equipment.class1ArmorName5() + "\t" + equipment.class1ArmorCost5() + "\t\t" + equipment.class1ArmorDefense5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which armor would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                                if (character.getGold() > equipment.class1ArmorCost1()){
                                       	character.setGold(character.getGold()-equipment.class1ArmorCost1());
                                        character.setArmorName(equipment.class1ArmorName1());
                                        character.setArmor(equipment.class1ArmorDefense1());
                                      	System.out.println("You purchase the " + equipment.class1ArmorName1() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("2")){
                                if (character.getGold() > equipment.class1ArmorCost2()){
                              		character.setGold(character.getGold()-equipment.class1ArmorCost2());
                                        character.setArmorName(equipment.class1ArmorName2());
                                        character.setArmor(equipment.class1ArmorDefense2());
                                      	System.out.println("You purchase the " + equipment.class1ArmorName2() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("3")){
                                if (character.getGold() > equipment.class1ArmorCost3()){
                                       	character.setGold(character.getGold()-equipment.class1ArmorCost3());
                                        character.setArmorName(equipment.class1ArmorName3());
                                        character.setArmor(equipment.class1ArmorDefense3());
                                      	System.out.println("You purchase the " + equipment.class1ArmorName3() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("4")){
                                if (character.getGold() > equipment.class1ArmorCost4()){
                              		character.setGold(character.getGold()-equipment.class1ArmorCost4());
                                        character.setArmorName(equipment.class1ArmorName4());
                                        character.setArmor(equipment.class1ArmorDefense4());
                                      	System.out.println("You purchase the " + equipment.class1ArmorName4() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("5")){
                                if (character.getGold() > equipment.class1ArmorCost5()){
                                       	character.setGold(character.getGold()-equipment.class1ArmorCost5());
                                        character.setArmorName(equipment.class1ArmorName5());
                                        character.setArmor(equipment.class1ArmorDefense5());
                                      	System.out.println("You purchase the " + equipment.class1ArmorName5() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
		if (character.getClassName().equals("Cleric")){
			System.out.println("   NAME\t\t\tGOLD\t\tDEFENSE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class2ArmorName1() + "\t" + equipment.class2ArmorCost1() + "\t\t" + equipment.class2ArmorDefense1());
			System.out.println("2. " + equipment.class2ArmorName2() + "\t" + equipment.class2ArmorCost2() + "\t\t" + equipment.class2ArmorDefense2());
			System.out.println("3. " + equipment.class2ArmorName3() + "\t" + equipment.class2ArmorCost3() + "\t\t" + equipment.class2ArmorDefense3());
			System.out.println("4. " + equipment.class2ArmorName4() + "\t" + equipment.class2ArmorCost4() + "\t\t" + equipment.class2ArmorDefense4());
			System.out.println("5. " + equipment.class2ArmorName5() + "\t" + equipment.class2ArmorCost5() + "\t\t" + equipment.class2ArmorDefense5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which armor would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                                if (character.getGold() > equipment.class2ArmorCost1()){
                                       	character.setGold(character.getGold()-equipment.class2ArmorCost1());
                                        character.setArmorName(equipment.class2ArmorName1());
                                        character.setArmor(equipment.class2ArmorDefense1());
                                      	System.out.println("You purchase the " + equipment.class2ArmorName1() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("2")){
                                if (character.getGold() > equipment.class2ArmorCost2()){
                              		character.setGold(character.getGold()-equipment.class2ArmorCost2());
                                        character.setArmorName(equipment.class2ArmorName2());
                                        character.setArmor(equipment.class2ArmorDefense2());
                                      	System.out.println("You purchase the " + equipment.class2ArmorName2() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("3")){
                                if (character.getGold() > equipment.class2ArmorCost3()){
                                       	character.setGold(character.getGold()-equipment.class2ArmorCost3());
                                        character.setArmorName(equipment.class2ArmorName3());
                                        character.setArmor(equipment.class2ArmorDefense3());
                                      	System.out.println("You purchase the " + equipment.class2ArmorName3() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("4")){
                                if (character.getGold() > equipment.class2ArmorCost4()){
                              		character.setGold(character.getGold()-equipment.class2ArmorCost4());
                                        character.setArmorName(equipment.class2ArmorName4());
                                        character.setArmor(equipment.class2ArmorDefense4());
                                      	System.out.println("You purchase the " + equipment.class2ArmorName4() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("5")){
                                if (character.getGold() > equipment.class2ArmorCost5()){
                                       	character.setGold(character.getGold()-equipment.class2ArmorCost5());
                                        character.setArmorName(equipment.class2ArmorName5());
                                        character.setArmor(equipment.class2ArmorDefense5());
                                      	System.out.println("You purchase the " + equipment.class2ArmorName5() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
		if (character.getClassName().equals("Thief")){
			System.out.println("   NAME\t\t\tGOLD\t\tDEFENSE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class3ArmorName1() + "\t" + equipment.class3ArmorCost1() + "\t\t" + equipment.class3ArmorDefense1());
			System.out.println("2. " + equipment.class3ArmorName2() + "\t" + equipment.class3ArmorCost2() + "\t\t" + equipment.class3ArmorDefense2());
			System.out.println("3. " + equipment.class3ArmorName3() + "\t" + equipment.class3ArmorCost3() + "\t\t" + equipment.class3ArmorDefense3());
			System.out.println("4. " + equipment.class3ArmorName4() + "\t" + equipment.class3ArmorCost4() + "\t\t" + equipment.class3ArmorDefense4());
			System.out.println("5. " + equipment.class3ArmorName5() + "\t" + equipment.class3ArmorCost5() + "\t\t" + equipment.class3ArmorDefense5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which armor would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                                if (character.getGold() > equipment.class3ArmorCost1()){
                                       	character.setGold(character.getGold()-equipment.class3ArmorCost1());
                                        character.setArmorName(equipment.class3ArmorName1());
                                        character.setArmor(equipment.class3ArmorDefense1());
                                      	System.out.println("You purchase the " + equipment.class3ArmorName1() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("2")){
                                if (character.getGold() > equipment.class3ArmorCost2()){
                              		character.setGold(character.getGold()-equipment.class3ArmorCost2());
                                        character.setArmorName(equipment.class3ArmorName2());
                                        character.setArmor(equipment.class3ArmorDefense2());
                                      	System.out.println("You purchase the " + equipment.class3ArmorName2() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("3")){
                                if (character.getGold() > equipment.class3ArmorCost3()){
                                       	character.setGold(character.getGold()-equipment.class3ArmorCost3());
                                        character.setArmorName(equipment.class3ArmorName3());
                                        character.setArmor(equipment.class3ArmorDefense3());
                                      	System.out.println("You purchase the " + equipment.class3ArmorName3() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("4")){
                                if (character.getGold() > equipment.class3ArmorCost4()){
                              		character.setGold(character.getGold()-equipment.class3ArmorCost4());
                                        character.setArmorName(equipment.class3ArmorName4());
                                        character.setArmor(equipment.class3ArmorDefense4());
                                      	System.out.println("You purchase the " + equipment.class3ArmorName4() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("5")){
                                if (character.getGold() > equipment.class3ArmorCost5()){
                                       	character.setGold(character.getGold()-equipment.class3ArmorCost5());
                                        character.setArmorName(equipment.class3ArmorName5());
                                        character.setArmor(equipment.class3ArmorDefense5());
                                      	System.out.println("You purchase the " + equipment.class3ArmorName5() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}
		if (character.getClassName().equals("Magic-User")){
			System.out.println("   NAME\t\t\tGOLD\t\tDEFENSE");
			System.out.println("   ----\t\t\t----\t\t------");
			System.out.println("1. " + equipment.class4ArmorName1() + "\t" + equipment.class4ArmorCost1() + "\t\t" + equipment.class4ArmorDefense1());
			System.out.println("2. " + equipment.class4ArmorName2() + "\t" + equipment.class4ArmorCost2() + "\t\t" + equipment.class4ArmorDefense2());
			System.out.println("3. " + equipment.class4ArmorName3() + "\t" + equipment.class4ArmorCost3() + "\t\t" + equipment.class4ArmorDefense3());
			System.out.println("4. " + equipment.class4ArmorName4() + "\t" + equipment.class4ArmorCost4() + "\t\t" + equipment.class4ArmorDefense4());
			System.out.println("5. " + equipment.class4ArmorName5() + "\t" + equipment.class4ArmorCost5() + "\t\t" + equipment.class4ArmorDefense5());
			System.out.println("6. EXIT");
			System.out.println();
			System.out.println("Which armor would you like to buy?");
			System.out.print("Your selection: ");
                        String w = keyboard.next();
                        if (w.equals("1")){
                                if (character.getGold() > equipment.class4ArmorCost1()){
                                       	character.setGold(character.getGold()-equipment.class4ArmorCost1());
                                        character.setArmorName(equipment.class4ArmorName1());
                                        character.setArmor(equipment.class4ArmorDefense1());
                                      	System.out.println("You purchase the " + equipment.class4ArmorName1() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("2")){
                                if (character.getGold() > equipment.class4ArmorCost2()){
                              		character.setGold(character.getGold()-equipment.class4ArmorCost2());
                                        character.setArmorName(equipment.class4ArmorName2());
                                        character.setArmor(equipment.class4ArmorDefense2());
                                      	System.out.println("You purchase the " + equipment.class4ArmorName2() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("3")){
                                if (character.getGold() > equipment.class4ArmorCost3()){
                                       	character.setGold(character.getGold()-equipment.class4ArmorCost3());
                                        character.setArmorName(equipment.class4ArmorName3());
                                        character.setArmor(equipment.class4ArmorDefense3());
                                      	System.out.println("You purchase the " + equipment.class4ArmorName3() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("4")){
                                if (character.getGold() > equipment.class4ArmorCost4()){
                              		character.setGold(character.getGold()-equipment.class4ArmorCost4());
                                        character.setArmorName(equipment.class4ArmorName4());
                                        character.setArmor(equipment.class4ArmorDefense4());
                                      	System.out.println("You purchase the " + equipment.class4ArmorName4() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
                        }
                        else if (w.equals("5")){
                                if (character.getGold() > equipment.class4ArmorCost5()){
                                       	character.setGold(character.getGold()-equipment.class4ArmorCost5());
                                        character.setArmorName(equipment.class4ArmorName5());
                                        character.setArmor(equipment.class4ArmorDefense5());
                                      	System.out.println("You purchase the " + equipment.class4ArmorName5() + ".");
                                }
                                else
                                      	System.out.println("You don't have enough gold Fool.");
			}
                        else if (w.equals("6"))
                                System.out.println();
                        else {
                                System.out.println();
                                System.out.println("Try again");
                        }
		}	
	}
}
