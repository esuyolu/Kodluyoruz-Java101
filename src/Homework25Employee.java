import java.time.LocalDate;

public class Homework25Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Homework25Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        }
        return salary * 0.03;
    }

    public double bonus() {
        if (workHours < 40) {
            return 0;
        }
        return workHours * 30;
    }

    public double raiseSalary() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int year = currentYear - hireYear;

        if (year < 10) {
            return salary * 0.05;
        }
        else if (year > 9 && year < 20) {
            return salary * 0.10;
        }
        else if (year > 19) {
            return salary * 0.15;
        }

        return 0;
    }

    public double netSalary() {
        return salary - tax() + bonus() + raiseSalary();
    }

    public void print() {
        System.out.println("Adı Soyadı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Net Maaş: " + netSalary());
    }
}
