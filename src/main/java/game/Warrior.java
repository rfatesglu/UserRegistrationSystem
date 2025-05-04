package game;

public class Warrior extends Character{


    public Warrior(String name) {
        super(name, 200,100);
    }

    @Override
    public void attack() {
        System.out.println(name + "kılıcıyla saldırıyor" + attackPower);
    }

    public void shieldBlock(){
        System.out.println( name + " kalkanla savunma");
    }
}
