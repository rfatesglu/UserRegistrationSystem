package bankingSystemExample;

import java.util.Scanner;

public class BankingSystem {

    private static Customer[] customers= new Customer[10];


    public static void main(String[] args) {

        Customer customer=new Customer("Elif","12345678","5413774565","AK","789456123");
        customers[0]=customer;


    }

    public static void menu(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("merhaba"+ customers[0].getName());
        System.out.print("Şifrenizi giriniz:");
        String password =scanner.nextLine();


    }
}
