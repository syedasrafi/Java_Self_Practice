package practice_tasks.java_day11_Class_Objects;

public class CydeoStudent {

    public String name;
    public int age, batchNumber, groupNumber;
    public double id;
    public char grade;
    public static String schoolName, programmingLanguage;

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, double id, char grade){
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.grade = grade;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studying.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }
    public void printSchoolName(){
        System.out.println(schoolName);
    }
    public void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
