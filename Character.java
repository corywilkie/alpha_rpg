public class Character {
/***********
  VARIABLES
 ***********/
	private String name;
	private String className;
	private int level;
	private int HP;
	private int maxHP;
	private int MP;
	private int maxMP;
	private int armor;
	private int STR;
	private int INT;
	private int WIS;
	private int DEX;
	private int CON;
	private int CHA;
	private int EXP;
	private int gold;
	private String armorName;
	private String weaponName;
	private int weaponDamage;
	private String location;

/*********
  OBJECTS
 *********/
	Equipment equipment = new Equipment();

/***********
  CHARACTER
 ***********/
	public Character(){
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public String getClassName(){
		return className;
	}
	public void setClassName(String c){
		className = c;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int l){
		level = l;
	}
	public int getHP(){
		return HP;
	}
	public void setHP(int h){
		HP = h;
	}
	public int getMaxHP(){
		return maxHP;
	}
	public void setMaxHP(int h){
		maxHP = h;
	}
	public int getMP(){
		return MP;
	}
	public void setMP(int m){
		MP = m;
	}
	public int getMaxMP(){
		return maxMP;
	}
	public void setMaxMP(int m){
		maxMP = m;
	}
	public int getWeaponDamage(){
		return weaponDamage;
	}
	public void setWeaponDamage(int w){
		weaponDamage = w+(int)(w*getSTR()/10+0.5);
	}
	public int getArmor(){
		return armor;
	}
	public void setArmor(int a){
		armor = a+(int)(a*getDEX()/10+0.5);
	}
	public int getSTR(){
		return STR;
	}
	public void setSTR(int s){
		STR = s;
	}
	public int getINT(){
		return INT;
	}
	public void setINT(int i){
		INT = i;
	}
	public int getWIS(){
		return WIS;
	}
	public void setWIS(int w){
		WIS = w;
	}
	public int getDEX(){
		return DEX;
	}
	public void setDEX(int d){
		DEX = d;
	}
	public int getCON(){
		return CON;
	}
	public void setCON(int c){
		CON = c;
	}
	public int getCHA(){
		return CHA;
	}
	public void setCHA(int c){
		CHA = c;
	}
	public int getEXP(){
		return EXP;
	}
	public void setEXP(int e){
		EXP = e;
	}
	public int getGold(){
		return gold;
	}
	public void setGold(int g){
		gold = g;
	}
	public String getWeaponName(){
		return weaponName;
	}
	public void setWeaponName(String w){
		weaponName = w;
	}
	public String getArmorName(){
		return armorName;
	}
	public void setArmorName(String a){
		armorName = a;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String l){
		location = l;
	}
	public String toString(){
		return ("NAME:   " + getName() +
			"\nCLASS:  " + getClassName() +
			"\nLEVEL:  " + getLevel() +
			"\nEXP:    " + getEXP() +
			"\nHP:     " + getHP() + "/" + getMaxHP() +
			"\nMP:     " + getMP() + "/" + getMaxMP() +
			"\nSTR:    " + getSTR() +
			"\nINT:    " + getINT() +
			"\nWIS:    " + getWIS() +
			"\nDEX:    " + getDEX() +
			"\nCON:    " + getCON() +
			"\nCHA:    " + getCHA() +
			"\nWEAPON: " + getWeaponDamage() + " (" + getWeaponName() + ")" +
			"\nARMOR:  " + getArmor() + " (" + getArmorName() + ")" +
			"\nGOLD:   " + getGold());
	}

	/******************
 	  CREATE CHARACTER
	 ******************/
	public void createClass1(){
		setClassName("Fighter");
                setSTR(12+(int)((Math.random()*6+0.5)));
                setINT(6+(int)((Math.random()*12+0.5)));
                setWIS(6+(int)((Math.random()*12+0.5)));
                setDEX(9+(int)((Math.random()*9+0.5)));
                setCON(12+(int)((Math.random()*6+0.5)));
                setCHA(3+(int)((Math.random()*15+0.5)));
                setMaxHP(getCON());
                setHP(getMaxHP());
                setMaxMP(getWIS());
                setMP(getMaxMP()); 
                setArmor(equipment.class1ArmorDefense1());
                setGold(getCHA()*100);
		setWeaponName(equipment.class1WeaponName1());
		setArmorName(equipment.class1ArmorName1());
		setWeaponDamage(equipment.class1WeaponDamage1());
                setLevel(1);
                setEXP(0);
	}
	public void createClass2(){
		setClassName("Cleric");
                setSTR(6+(int)((Math.random()*12+0.5)));
                setINT(6+(int)((Math.random()*12+0.5)));
                setWIS(12+(int)((Math.random()*6+0.5)));
                setDEX(9+(int)((Math.random()*9+0.5)));
                setCON(12+(int)((Math.random()*6+0.5)));
                setCHA(3+(int)((Math.random()*15+0.5)));
                setMaxHP(getCON());
                setHP(getMaxHP());
                setMaxMP(getWIS());
                setMP(getMaxMP());
                setArmor(equipment.class2ArmorDefense1());
                setGold(getCHA()*100);
		setWeaponName(equipment.class2WeaponName1());
		setArmorName(equipment.class2ArmorName1());
		setWeaponDamage(equipment.class2WeaponDamage1());
		setLevel(1);
                setEXP(0);
	}
	public void createClass3(){
		setClassName("Thief");
                setSTR(9+(int)((Math.random()*9+0.5)));
                setINT(6+(int)((Math.random()*12+0.5)));
                setWIS(6+(int)((Math.random()*12+0.5)));
                setDEX(12+(int)((Math.random()*6+0.5)));
                setCON(12+(int)((Math.random()*6+0.5)));
                setCHA(3+(int)((Math.random()*15+0.5)));
                setMaxHP(getCON());
                setHP(getMaxHP()); 
                setMaxMP(getWIS());
                setMP(getMaxMP());
                setArmor(equipment.class3ArmorDefense1());
                setGold(getCHA()*100);
		setWeaponName(equipment.class3WeaponName1());
		setArmorName(equipment.class3ArmorName1());
		setWeaponDamage(equipment.class3WeaponDamage1());
		setLevel(1);
                setEXP(0);
        }
	public void createClass4(){
		setClassName("Magic-User");
                setSTR(6+(int)((Math.random()*12+0.5)));
                setINT(12+(int)((Math.random()*6+0.5)));
                setWIS(12+(int)((Math.random()*6+0.5)));
                setDEX(6+(int)((Math.random()*12+0.5)));
                setCON(9+(int)((Math.random()*9+0.5)));
                setCHA(3+(int)((Math.random()*15+0.5)));
                setMaxHP(getCON());
                setHP(getMaxHP());
                setMaxMP(getWIS());
                setMP(getMaxMP());
                setArmor(equipment.class4ArmorDefense1());
 		setGold(getCHA()*100);
		setWeaponName(equipment.class4WeaponName1());
		setArmorName(equipment.class4ArmorName1());
		setWeaponDamage(equipment.class4WeaponDamage1());
                setLevel(1);
                setEXP(0);
	}

	/****************
	  REST CHARACTER
	 ****************/
	public void rest(){	
		setHP(getMaxHP());
		setMP(getMaxMP());
		System.out.println("You rest for 8 hours. Your HP and MP is restored.");
	}

	/*****************
	  LEVEL CHARACTER
	 *****************/
	public void level(){
		double l = getLevel();
		if(getEXP()>=100*Math.pow(2.0,l)){
			setLevel(getLevel()+1);
			System.out.println("YOU ARE NOW LEVEL " + getLevel() + "!");
			setMaxHP(getMaxHP()+(int)(getCON()/2));
			setMaxMP(getMaxMP()+(int)(getWIS()/2));
			setHP(getMaxHP());
			setMP(getMaxMP());
			System.out.println("Your HP and MP are fully restored.");
			System.out.println("Your maximum HP increases to " + getMaxHP());
			System.out.println("Your maximum MP increases to " + getMaxMP());
		}
	}
}
