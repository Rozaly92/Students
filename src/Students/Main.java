package Students;

public class Main {
    public static void main(String[] args) {
        System.out.println("The first student");
      Student student = new Student();
        System.out.println(student.toString());
        System.out.println("The second student");
        Student student2 = new Student("Roza", "Negrea", 28);
        System.out.println(student2.toString());
        System.out.println("----------------------");
    }
}
