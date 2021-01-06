package Students;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("The first student");
      Student student = new Student();
        System.out.println(student.toString());
        System.out.println("The second student");
        Student student2 = new Student("Roza", "Negrea", 28);
        System.out.println(student2.toString());
        System.out.println("-----------------------------------------------");


        Student student3 = new Student("Katia", "Petrova", 23);
        Student student4 = new Student("Tatiana", "Smirnova", 22);
        Student student5 = new Student("Vera", "Sidorova", 25);
        Student student6 = new Student("Eugen", "Costas", 26);
        Student student7 = new Student("Simeon", "Gutu", 18);
        Student student8 = new Student("Alex", "Morar", 24);
        Student student9 = new Student("Oleg", "Grib", 25);
        Student student10 = new Student("Suzana", "Rusu", 22);


        List<Student> stl = new ArrayList<Student>();
        stl.add(student2);
        stl.add(0,student);
      stl.add(student3);
      stl.add(student4);
      stl.add(student5);
      stl.add(student6);
      stl.add(student7);
      stl.add(student8);
      stl.add(student9);
      stl.add(student10);
      System.out.println(stl);

      Student new_stud1= new Student("Ivan", "Roska", 21);
      Student new_stud2= new Student("Victor", "Bejenar", 19);

      List<Student> lstn = new ArrayList<>();
        lstn.add(new_stud1);
        lstn.add(new_stud2);

      stl.addAll(lstn);
      for(Student s: stl)
        System.out.println(s);

         if(stl.contains(new Student("Victor", "Bejenar", 19)))
         {
           stl.remove(new Student("Victor", "Bejenar", 19));
           System.out.println("This element was removed");
         }
         else{
           System.out.println("This element does not find");
         }

      System.out.println( stl.get(0));
      System.out.println(stl.hashCode());









      System.out.println("------------------------------------------------------");

        List<Student> stl1 = new LinkedList<Student>();
        stl1.add(student);
      stl1.add(student2);
      stl1.add(student3);
      stl1.add(student4);
      stl1.add(student5);
      stl1.add(student6);
      stl1.add(student7);
      stl1.add(student8);
      stl1.add(student9);
      stl1.add(student10);
      System.out.println(stl1);
    }
}
