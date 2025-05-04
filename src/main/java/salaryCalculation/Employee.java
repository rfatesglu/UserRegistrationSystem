package salaryCalculation;

public class Employee {

    String name;
    double salary;
     int workHours;
     int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return (salary < 1000) ? 0 : salary * 0.03;
    }

    public double bonus() {
        return (workHours > 40) ? (workHours - 40) * 30 : 0;
    }

    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) return salary * 0.05;
        else if (yearsWorked < 20) return salary * 0.10;
        else return salary * 0.15;
    }

    public void printSalaryInfo() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryAfterTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryAfterTaxAndBonus + raise;

        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + salaryAfterTaxAndBonus);
        System.out.println("Toplam Maaş (Zamlı): " + totalSalary);
    }
}
