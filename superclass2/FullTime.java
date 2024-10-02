package superclass2;

public class FullTime extends Teacher{
    private int anualSalary;
    private String unit;

    public FullTime() {
        super();
        anualSalary = 0;
        unit = "";
    }

    public FullTime(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }
    public int getanualSalary() {
        return this.anualSalary;
    }

    public void setanualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void print() {
        System.out.println("-- full time teacher --");
        super.print();
        System.out.println("anualSalary : " + anualSalary);
        System.out.println("unit : " + unit);
    }
}
