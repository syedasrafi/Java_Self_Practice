package practice_tasks.java_day11_Class_Objects;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Syed A",25,33,10,1234,'B');

        cydeoStudent1.attendClass();
        cydeoStudent1.study();
        System.out.println(cydeoStudent1);

        cydeoStudent1.printSchoolName();  // empty
        cydeoStudent1.printProgLanguage(); // empty, null

    }
}
