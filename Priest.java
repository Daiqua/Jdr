public class Priest extends Character{

    /**
     *
     * @param name
     * @param health
     * @param attackPower
     */
    public Priest(String name, int health, int attackPower){
        super(name, health, attackPower);
        this.mRole="priest character";

    }
    public void actionOn(Character character){
        System.out.println(this.mName+" is going to heal "+character.mName+".");
        System.out.println(this.mName+" heals "+character.mName+" who earns "+this.mAttackPower+" health points.");
        int healthAfterActionOn = character.mHealth+this.mAttackPower;
        character.mHealth= healthAfterActionOn; // pas réussi à ne pas répéter cette ligne
    }



}
