package bankingSystemExample;

public class Customer {
    private String name;
    private String surname;
    private String phone;
    private String password;
    private String Id;
    private BankAccount[] bankAccounts;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Customer(String name, String password, String phone, String surname, String Id) {

        if (password.length()<8 && password.length()>12);
        System.out.println("şifre 8- 16 haneli olabilir!!");
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.surname = surname;
        this.Id=Id;
         bankAccounts=new BankAccount[4];


    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

