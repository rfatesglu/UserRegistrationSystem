package game;

public class Mage extends  Character{
    public Mage(String name) {
        super(name, 300, 250);
    }

    @Override
    public void attack() {
        System.out.println( name + " büyü yapıyor" + " hasar" +attackPower);
    }
    public void castSpell(){
        System.out.println(name + "ateş topu büyüsü" );
    }
}
