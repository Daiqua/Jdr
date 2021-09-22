public class Character{

    int mHealth;
    int mAttackPower;
    String mName;
    String mRole;


    /**
     *
     * @param name
     * @param health
     * @param attackPower
     */
    public Character(String name, int health, int attackPower) {

        this.mName = name;
        this.mAttackPower=attackPower;
        this.mHealth=health;
        this.mRole= "basic character";
    }

    public void present(){
        System.out.println("Hello, I am "+this.mName+", a "+this.mRole+". My health is "+this.mHealth+" and my attack power is "+this.mAttackPower+".");
    }

    public void compareTo(Character character){
        // comparator fonction

        System.out.println(this.mName+" has "+this.mHealth+" and "+this.mAttackPower+" attack power.");
        System.out.println(character.mName+" has "+character.mHealth+" and "+character.mAttackPower+" attack power.");

        //variables to define the better stats
        int compareCase = 0;
        boolean characterOneAttackPowerIsBetter = this.mAttackPower > character.mAttackPower;
        boolean characterOneHealthIsBetter = this.mHealth > character.mHealth;
        boolean attackPowerEquality = this.mAttackPower == character.mAttackPower;
        boolean healthEquality = this.mHealth == character.mHealth;
        if (characterOneAttackPowerIsBetter){compareCase=1;}
        if (attackPowerEquality && characterOneHealthIsBetter){compareCase=2;}
        if (!characterOneAttackPowerIsBetter){compareCase=3;}
        if (attackPowerEquality && !characterOneHealthIsBetter){compareCase=4;} // ajout cas 5 car le cas 4 est utilisé en cas d'égalité...
        if (attackPowerEquality && healthEquality){compareCase=5;}

        //variable for redondant inner text
        String ibt = " is better than ";
        String becauseAP = " because his attak power is higher";
        String becauseHealth = " because his health is better while their attak power are equal";

        //
        switch (compareCase)
        {
            case 1:
                System.out.println(this.mName+ibt+character.mName+becauseAP+".");
                break;
            case 2:
                System.out.println(this.mName+ibt+character.mName+becauseHealth+".");
                break;
            case 3:
                System.out.println(character.mName+ibt+this.mName+becauseAP+".");
                break;
            case 4:
                System.out.println(character.mName+ibt+this.mName+becauseHealth+".");
                break;
            case 5:
                System.out.println("It seems both characters have the same health and attack power...");
                break;

        }

    }


    /**
     *
     * @param character
     */
    public void actionOn(Character character){
        System.out.println(this.mName+" is going to attack "+character.mName+".");
        System.out.println(this.mName+" hits "+character.mName+" who losts "+this.mAttackPower+" health points.");
        int healthAfterActionOn = character.mHealth-this.mAttackPower;
        character.mHealth= healthAfterActionOn;
        System.out.println(character.mName+" has now "+character.mHealth+" health points remaining.");
    }


}
