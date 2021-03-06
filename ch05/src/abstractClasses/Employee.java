package abstractClasses;

import java.time.LocalDate;

/***
 *
 * @author jianglinChen
 * @Date 2020/11/30 14:44
 * @since 1.0.0
 */
public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;
    public Employee(String name,double salary,int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        this.salary += this.salary*byPercent/100;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
}
