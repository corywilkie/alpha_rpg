import java.lang.Math;
import java.util.*;

public class Combat {
	Scanner keyboard = new Scanner(System.in);
	Monsters monster = new Monsters();
	Spells spell = new Spells();
	int life;
	int damage;
	int exp;
	int gold;
	String name;

/*****************
  COMBAT MONSTERS
 *****************/	
	public void combat(Character character){
		double i = Math.random();
		if (character.getLocation().equalsIgnoreCase("Plains")){
			if (i<=0.01){
				life = monster.bossHP1();
				damage = monster.bossDamage1();
				exp = monster.bossEXP1();
				name = monster.bossName1();
				gold = monster.bossGold1();
				System.out.println("You have finally found the bastard, " + name + "!");
			}
			else if (i<=0.4){
				life = monster.monsterHP1();
				damage = monster.monsterDamage1();
				exp = monster.monsterEXP1();
				name = monster.monsterName1();
				gold = monster.monsterGold1();
				System.out.println("You are being attacked by a " + name + "!");
			}
			else if (i<=0.6){
				life = monster.monsterHP2();
				damage = monster.monsterDamage2();
				exp = monster.monsterEXP2();
				name = monster.monsterName2();
				gold = monster.monsterGold2();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.75){
				life = monster.monsterHP3();
				damage = monster.monsterDamage3();
				exp = monster.monsterEXP3();
				name = monster.monsterName3();
				gold = monster.monsterGold3();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.9){
				life = monster.monsterHP4();
				damage = monster.monsterDamage4();
				exp = monster.monsterEXP4();
				name = monster.monsterName4();
				gold = monster.monsterGold4();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=1){
				life = monster.monsterHP5();
				damage = monster.monsterDamage5();
				exp = monster.monsterEXP5();
				name = monster.monsterName5();
				gold = monster.monsterGold5();
				System.out.println("You are being attacked by " + name + "!");
			}
		}
		if (character.getLocation().equalsIgnoreCase("Forest")){
			if (i<=0.01){
				life = monster.bossHP2();
				damage = monster.bossDamage2();
				exp = monster.bossEXP2();
				name = monster.bossName2();
				gold = monster.bossGold2();
				System.out.println("You have finally found the bastard, " + name + "!");
			}
			else if (i<=0.4){
				life = monster.monsterHP6();
				damage = monster.monsterDamage6();
				exp = monster.monsterEXP6();
				name = monster.monsterName6();
				gold = monster.monsterGold6();
				System.out.println("You are being attacked by a " + name + "!");
			}
			else if (i<=0.6){
				life = monster.monsterHP7();
				damage = monster.monsterDamage7();
				exp = monster.monsterEXP7();
				name = monster.monsterName7();
				gold = monster.monsterGold7();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.75){
				life = monster.monsterHP8();
				damage = monster.monsterDamage8();
				exp = monster.monsterEXP8();
				name = monster.monsterName8();
				gold = monster.monsterGold8();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.9){
				life = monster.monsterHP9();
				damage = monster.monsterDamage9();
				exp = monster.monsterEXP9();
				name = monster.monsterName9();
				gold = monster.monsterGold9();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=1){
				life = monster.monsterHP10();
				damage = monster.monsterDamage10();
				exp = monster.monsterEXP10();
				name = monster.monsterName10();
				gold = monster.monsterGold10();
				System.out.println("You are being attacked by " + name + "!");
			}
		}
		if (character.getLocation().equalsIgnoreCase("Swamp")){
			if (i<=0.01){
				life = monster.bossHP3();
				damage = monster.bossDamage3();
				exp = monster.bossEXP3();
				name = monster.bossName3();
				gold = monster.bossGold3();
				System.out.println("You have finally found the bastard, " + name + "!");
			}
			else if (i<=0.4){
				life = monster.monsterHP11();
				damage = monster.monsterDamage11();
				exp = monster.monsterEXP11();
				name = monster.monsterName11();
				gold = monster.monsterGold11();
				System.out.println("You are being attacked by a " + name + "!");
			}
			else if (i<=0.6){
				life = monster.monsterHP12();
				damage = monster.monsterDamage12();
				exp = monster.monsterEXP12();
				name = monster.monsterName12();
				gold = monster.monsterGold12();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.75){
				life = monster.monsterHP13();
				damage = monster.monsterDamage13();
				exp = monster.monsterEXP13();
				name = monster.monsterName13();
				gold = monster.monsterGold13();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.9){
				life = monster.monsterHP14();
				damage = monster.monsterDamage14();
				exp = monster.monsterEXP14();
				name = monster.monsterName14();
				gold = monster.monsterGold14();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=1){
				life = monster.monsterHP15();
				damage = monster.monsterDamage15();
				exp = monster.monsterEXP15();
				name = monster.monsterName15();
				gold = monster.monsterGold15();
				System.out.println("You are being attacked by " + name + "!");
			}
		}
		if (character.getLocation().equalsIgnoreCase("Islands")){
			if (i<=0.01){
				life = monster.bossHP4();
				damage = monster.bossDamage4();
				exp = monster.bossEXP4();
				name = monster.bossName4();
				gold = monster.bossGold4();
				System.out.println("You have finally found the bastard, " + name + "!");
			}
			else if (i<=0.4){
				life = monster.monsterHP16();
				damage = monster.monsterDamage16();
				exp = monster.monsterEXP16();
				name = monster.monsterName16();
				gold = monster.monsterGold16();
				System.out.println("You are being attacked by a " + name + "!");
			}
			else if (i<=0.6){
				life = monster.monsterHP17();
				damage = monster.monsterDamage17();
				exp = monster.monsterEXP17();
				name = monster.monsterName17();
				gold = monster.monsterGold17();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.75){
				life = monster.monsterHP18();
				damage = monster.monsterDamage18();
				exp = monster.monsterEXP18();
				name = monster.monsterName18();
				gold = monster.monsterGold18();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.9){
				life = monster.monsterHP19();
				damage = monster.monsterDamage19();
				exp = monster.monsterEXP19();
				name = monster.monsterName19();
				gold = monster.monsterGold19();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=1){
				life = monster.monsterHP20();
				damage = monster.monsterDamage20();
				exp = monster.monsterEXP20();
				name = monster.monsterName20();
				gold = monster.monsterGold20();
				System.out.println("You are being attacked by " + name + "!");
			}
		}
		if (character.getLocation().equalsIgnoreCase("Mountains")){
			if (i<=0.01){
				life = monster.bossHP5();
				damage = monster.bossDamage5();
				exp = monster.bossEXP5();
				name = monster.bossName5();
				gold = monster.bossGold5();
				System.out.println("You have finally found the bastard, " + name + "!");
			}
			else if (i<=0.4){
				life = monster.monsterHP21();
				damage = monster.monsterDamage21();
				exp = monster.monsterEXP21();
				name = monster.monsterName21();
				gold = monster.monsterGold21();
				System.out.println("You are being attacked by a " + name + "!");
			}
			else if (i<=0.6){
				life = monster.monsterHP22();
				damage = monster.monsterDamage22();
				exp = monster.monsterEXP22();
				name = monster.monsterName22();
				gold = monster.monsterGold22();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.75){
				life = monster.monsterHP23();
				damage = monster.monsterDamage23();
				exp = monster.monsterEXP23();
				name = monster.monsterName23();
				gold = monster.monsterGold23();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.9){
				life = monster.monsterHP24();
				damage = monster.monsterDamage24();
				exp = monster.monsterEXP24();
				name = monster.monsterName24();
				gold = monster.monsterGold24();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=1){
				life = monster.monsterHP25();
				damage = monster.monsterDamage25();
				exp = monster.monsterEXP25();
				name = monster.monsterName25();
				gold = monster.monsterGold25();
				System.out.println("You are being attacked by " + name + "!");
			}
		}
		if (character.getLocation().equalsIgnoreCase("Portal")){
			if (i<=0.01){
				life = monster.bossHP6();
				damage = monster.bossDamage6();
				exp = monster.bossEXP6();
				name = monster.bossName6();
				gold = monster.bossGold6();
				System.out.println("You have finally found the bastard, " + name + "!");
			}
			else if (i<=0.4){
				life = monster.monsterHP26();
				damage = monster.monsterDamage26();
				exp = monster.monsterEXP26();
				name = monster.monsterName26();
				gold = monster.monsterGold26();
				System.out.println("You are being attacked by a " + name + "!");
			}
			else if (i<=0.6){
				life = monster.monsterHP27();
				damage = monster.monsterDamage27();
				exp = monster.monsterEXP27();
				name = monster.monsterName27();
				gold = monster.monsterGold27();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.75){
				life = monster.monsterHP28();
				damage = monster.monsterDamage28();
				exp = monster.monsterEXP28();
				name = monster.monsterName28();
				gold = monster.monsterGold28();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=0.9){
				life = monster.monsterHP29();
				damage = monster.monsterDamage29();
				exp = monster.monsterEXP29();
				name = monster.monsterName29();
				gold = monster.monsterGold29();
				System.out.println("You are being attacked by " + name + "!");
			}
			else if (i<=1){
				life = monster.monsterHP30();
				damage = monster.monsterDamage30();
				exp = monster.monsterEXP30();
				name = monster.monsterName30();
				gold = monster.monsterGold30();
				System.out.println("You are being attacked by " + name + "!");
			}
		}

		/********
		  COMBAT
		 ********/
		while (life>0 && character.getHP()>0){
			System.out.println();
			System.out.println(name + "\t\tHP:" + life);
			System.out.println(character.getName()+"\t\tHP:"+character.getHP()+"/"+character.getMaxHP()+"\tMP:" + character.getMP() + "/" + character.getMaxMP());
			System.out.print("(A)ttack, (S)kill, (D)efend, (F)lee: ");
			String a = keyboard.next();
			if (a.equalsIgnoreCase("A")){
				characterAttack(character);
				if (life>0)
					monsterAttack(character);
			}
			else if (a.equalsIgnoreCase("S")){
				if (character.getClassName().equals("Fighter")){
					System.out.println("1. " + spell.class1Cost1() + "MP" + "\t" + spell.class1Name1());
					System.out.println("2. " + spell.class1Cost2() + "MP" + "\t" + spell.class1Name2());
					System.out.println("3. " + spell.class1Cost3() + "MP" + "\t" + spell.class1Name3());
					System.out.println("4. " + spell.class1Cost4() + "MP" + "\t" + spell.class1Name4());
					System.out.println("5. " + spell.class1Cost5() + "MP" + "\t" + spell.class1Name5());
					System.out.println("6. BACK");
					System.out.print("Your selection: ");
					String s = keyboard.next();
					if (s.equals("1")){
						if (character.getMP()>spell.class1Cost1()){
//							cast spell
							character.setMP(character.getMP()-spell.class1Cost1());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("2")){
						if (character.getMP()>spell.class1Cost2()){
//							cast spell
							character.setMP(character.getMP()-spell.class1Cost2());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("3")){
						if (character.getMP()>spell.class1Cost3()){
//							cast spell
							character.setMP(character.getMP()-spell.class1Cost3());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("4")){
						if (character.getMP()>spell.class1Cost4()){
//							cast spell
							character.setMP(character.getMP()-spell.class1Cost4());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("5")){
						if (character.getMP()>spell.class1Cost5()){
//							cast spell
							character.setMP(character.getMP()-spell.class1Cost5());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
				}
				if (character.getClassName().equals("Cleric")){
					System.out.println("1. " + spell.class2Cost1() + "MP" + "\t" + spell.class2Name1());
					System.out.println("2. " + spell.class2Cost2() + "MP" + "\t" + spell.class2Name2());
					System.out.println("3. " + spell.class2Cost3() + "MP" + "\t" + spell.class2Name3());
					System.out.println("4. " + spell.class2Cost4() + "MP" + "\t" + spell.class2Name4());
					System.out.println("5. " + spell.class2Cost5() + "MP" + "\t" + spell.class2Name5());
					System.out.println("6. BACK");
					System.out.print("Your selection: ");
					String s = keyboard.next();
					if (s.equals("1")){
						if (character.getMP()>spell.class2Cost1()){
//							cast spell
							character.setMP(character.getMP()-spell.class2Cost1());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("2")){
						if (character.getMP()>spell.class2Cost2()){
//							cast spell
							character.setMP(character.getMP()-spell.class2Cost2());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("3")){
						if (character.getMP()>spell.class2Cost3()){
//							cast spell
							character.setMP(character.getMP()-spell.class2Cost3());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("4")){
						if (character.getMP()>spell.class2Cost4()){
//							cast spell
							character.setMP(character.getMP()-spell.class2Cost4());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("5")){
						if (character.getMP()>spell.class2Cost5()){
//							cast spell
							character.setMP(character.getMP()-spell.class2Cost5());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
				}
				if (character.getClassName().equals("Thief")){
					System.out.println("1. " + spell.class3Cost1() + "MP" + "\t" + spell.class3Name1());
					System.out.println("2. " + spell.class3Cost2() + "MP" + "\t" + spell.class3Name2());
					System.out.println("3. " + spell.class3Cost3() + "MP" + "\t" + spell.class3Name3());
					System.out.println("4. " + spell.class3Cost4() + "MP" + "\t" + spell.class3Name4());
					System.out.println("5. " + spell.class3Cost5() + "MP" + "\t" + spell.class3Name5());
					System.out.println("6. BACK");
					System.out.print("Your selection: ");
					String s = keyboard.next();
					if (s.equals("1")){
						if (character.getMP()>spell.class3Cost1()){
//							cast spell
							character.setMP(character.getMP()-spell.class3Cost1());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("2")){
						if (character.getMP()>spell.class3Cost2()){
//							cast spell
							character.setMP(character.getMP()-spell.class3Cost2());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("3")){
						if (character.getMP()>spell.class3Cost3()){
//							cast spell
							character.setMP(character.getMP()-spell.class3Cost3());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("4")){
						if (character.getMP()>spell.class3Cost4()){
//							cast spell
							character.setMP(character.getMP()-spell.class3Cost4());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("5")){
						if (character.getMP()>spell.class3Cost5()){
//							cast spell
							character.setMP(character.getMP()-spell.class3Cost5());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
				}
				if (character.getClassName().equals("Magic-User")){
					System.out.println("1. " + spell.class4Cost1() + "MP" + "\t" + spell.class4Name1());
					System.out.println("2. " + spell.class4Cost2() + "MP" + "\t" + spell.class4Name2());
					System.out.println("3. " + spell.class4Cost3() + "MP" + "\t" + spell.class4Name3());
					System.out.println("4. " + spell.class4Cost4() + "MP" + "\t" + spell.class4Name4());
					System.out.println("5. " + spell.class4Cost5() + "MP" + "\t" + spell.class4Name5());
					System.out.println("6. BACK");
					System.out.print("Your selection: ");
					String s = keyboard.next();
					if (s.equals("1")){
						if (character.getMP()>spell.class4Cost1()){
//							cast spell
							character.setMP(character.getMP()-spell.class4Cost1());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("2")){
						if (character.getMP()>spell.class4Cost2()){
//							cast spell
							character.setMP(character.getMP()-spell.class4Cost2());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("3")){
						if (character.getMP()>spell.class4Cost3()){
//							cast spell
							character.setMP(character.getMP()-spell.class4Cost3());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("4")){
						if (character.getMP()>spell.class4Cost4()){
//							cast spell
							character.setMP(character.getMP()-spell.class4Cost4());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
					else if (s.equals("5")){
						if (character.getMP()>spell.class4Cost5()){
//							cast spell
							character.setMP(character.getMP()-spell.class4Cost5());
						}
						else
							System.out.println("You don't have enough MP.");
						if (life>0)
							monsterAttack(character);
					}
				}
			}
			else if (a.equalsIgnoreCase("D")){
				characterDefend(character);
			}
			else if (a.equalsIgnoreCase("F")){
				double flee = Math.random()*character.getCHA();
				if (flee>=5){
					life = -9000;
					System.out.println("You run away like the little bitch you are.");
				}
				else{
					System.out.println("You fail to run away.");
					monsterAttack(character);
				}
			}
		}
		if (life==-9000)
			System.out.println();
		else if (life<=0){
			System.out.println("Congratulations! Victory merits you:");
			System.out.println(exp + " Experience");
			System.out.println(gold + " Gold");
			character.setEXP(character.getEXP()+exp);
			character.setGold(character.getGold()+gold);
			character.level();
		}
		else if (character.getHP()<=0){
			System.out.println("You have died. Game over man, game over!");
			System.exit(0);
		}
	}
	public void monsterAttack(Character character){
		System.out.println();
		int attack = (int)(damage*Math.random()-character.getArmor()*Math.random());
		if (attack<0)
			attack = 0;
		character.setHP(character.getHP()-attack);
		System.out.println(name + " attacks you! " + name + " deals you " + attack + " damage.");
	}
	public void characterAttack(Character character){
		System.out.println();
		int attack = (int)(character.getWeaponDamage()*Math.random());
		life = life-attack;
		System.out.println("You attack " + name + "! You deal " + attack + " damage!");
	}
	public void characterDefend(Character character){
		System.out.println("You defend yourself.");
		character.setHP(character.getHP()+character.getLevel());
		if (character.getHP()>character.getMaxHP())
			character.setHP(character.getMaxHP());
		System.out.println("You gain " + character.getLevel() + " HP.");
		System.out.println();
		int attack = (int)(damage/2*Math.random()-character.getArmor()*Math.random());
		if (attack<0)
			attack = 0;
		character.setHP(character.getHP()-attack);
		System.out.println(name + " attacks you! " + name + " deals you " + attack + " damage.");
	}
}
