package game;

public class Game {
    /**
     * büyücü
     * savaşcı
     * okçu
     */

    public static void main(String[] args) {
        Warrior warrior=new Warrior("Thor");
        Mage mage=new Mage("Gandalf");
        Archer archer=new Archer("Legolas");

        warrior.showStats();
        mage.showStats();
        archer.showStats();

        System.out.println("::özel yenetekler::");
        warrior.shieldBlock();
        mage.castSpell();
        archer.multiShot();

    }
}
