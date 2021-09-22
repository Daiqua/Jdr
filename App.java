public class App {

    public static void main(String[] args){

        Character p1 = new Character("Yo", 10, 5);
        p1.present();

        Warrior p2 = new Warrior("Joe", 10, 5);
        p2.present();

        Magus p3 = new Magus("Nat", 10, 5);
        p3.present();

        Priest p4 = new Priest("Pi", 10, 5);
        p4.present();

        p1.actionOn(p2);
        p2.present();
        p2.compareTo(p1);
        p4.actionOn(p2);
        p2.present();
        p1.compareTo(p2);





    }
}