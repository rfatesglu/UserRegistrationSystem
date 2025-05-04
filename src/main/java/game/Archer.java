package game;

public class Archer extends Character{
    public Archer(String name) {
        super(name, 50,90);
    }

    @Override
    public void attack() {
        System.out.println( name +"ok atar" + "hasar" + attackPower);
    }

    public void multiShot(){
        System.out.println(name + " 3 ok atar");
    }
}
