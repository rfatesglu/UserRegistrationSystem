package game;

public class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    public void attack(){
        System.out.println( name + " saldırıyor" + attackPower);
    }

    public void showStats(){
        System.out.println(" Karakter:" + name);
        System.out.println(" Saldırı gücü:" + attackPower);
        System.out.println(" can:"+ health);
        System.out.println("--------------");


    }
}
