package superclass2;

public class partTime extends Teacher {
    private int hoursWorked;
    private int salary;


    public partTime(String name, int age, String subject, int hoursWorked) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.salary = 200000;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = 200000;
    }



  
    public void print() {
        System.out.println("-- part time teacher --");
        super.print();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + this.salary);
        System.out.println("Total salary: " + (hoursWorked * this.salary));
    }
}
