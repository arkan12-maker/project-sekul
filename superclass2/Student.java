package superclass2;

public class Student extends Person{
    private int studentNumber;
    private int score;
    private String major;



    public Student(){
        super();
        studentNumber = 0;
        score = 0;
    }
    
    public Student(String name, int age, int studentNumber, int score, String major){
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }
    
    public int getStudentNumber(){
        return this.studentNumber;
    }
    
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setScore(int score){
        this.score = score;
    }

    
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
    public void print(){
        System.out.println();
        System.out.println("--- student ---");
        super.print();
        System.out.println("student number : "+studentNumber);
        System.out.println("score : "+score);
        System.out.println("major : "+major);
        System.out.println();
    }
}


