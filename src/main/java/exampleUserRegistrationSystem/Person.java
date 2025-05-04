package exampleUserRegistrationSystem;

public class Person {

    private String name;
    private int age;


    public Person(int age, String name) {
        setAge(age) ;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
        if (age>0){
            this.age=age;}
            else{
                System.out.println("yaşı yanlış girdiniz");
                this.age=0;
            }
        }


    public void showInfo(){

        System.out.println( "adı"+ name );
        System.out.println("yaşı:" + age);
    }
}
