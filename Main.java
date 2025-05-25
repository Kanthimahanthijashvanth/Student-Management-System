import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // student management system
        /*
         * basic data - student data  -> names , roll no , marks

         * operations ->  arrange based on names for roll no and give roll numbers then insert marks
         * add student data and delete student data
         * search student data
         * top performers and failures

         * */
        Manager m = new Manager();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = in.next();
            System.out.print("Enter roll: ");
            int roll = in.nextInt();
            System.out.print("Enter marks: ");
            float marks = in.nextFloat();

            m.addname(name, roll, marks);
        }

        System.out.println("\nBefore Sorting:");
        m.display();

        m.sort();

        System.out.println("\nAfter Sorting by Name:");
        m.display();

    }
}
class Manager{
    class student{
        String names ;
        int roll;
        float marks;
        student(String names , int roll , float marks){
            this.names= names;
            this.roll = roll;
            this.marks = marks;
        }
    }
    ArrayList<student> list = new ArrayList<>();

    void addname(String name , int roll , float marks){
        student s = new student(name,roll,marks);
        list.add(s);
    }
    void removename(String name , int roll , float marks){
        student s = new student(name,roll ,marks);
        list.remove(s);
    }
    void sort(){
        list.sort((Comparator.comparing(s -> s.names)));
    }

    void display(){
        for (student s: list){
            System.out.println("Name :  " + s.names +  "Marks :  "+ s.marks + "Roll :  "+s.roll);
        }

    }

    }
