
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class question3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Vector<students> vec = new Vector<>();
//        vec.add(inputUniversity_students());
//        vec.add(inputCollege_students());
//        Iterator iter=vec.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next().toString());
//        }
        vec.add(new university_students("what ever1", 20, "2", "do dang quang", 30, 30));
        vec.add(new university_students("what ever2", 20, "3", "do dang quang", 30, 30));
        vec.add(new university_students("what ever3", 20, "1", "do dang quang", 30, 30));
        vec.add(new college_students(40, "31", "quang", 100, 7));
        vec.add(new college_students(40, "50", "quang", 100, 7));
        vec.add(new college_students(40, "61", "quang", 100, 7));
        int menu;
        do {
            System.out.print("1. Add a new college student.\n"
                    + "2. Add a new university student.\n"
                    + "3. Remove a student from the list with the student code entered from the keyboard.\n"
                    + "4. Print student list.\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible\n"
                    + "students.\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code\n"
                    + "7. Find student list by student's full name (Contains).\n"
                    + "8. Exit\n Enter the menu_number : ");
            menu = reader.nextInt();
            switch (menu) {
                case 1:
                    vec.add(inputCollege_students());
                    break;
                case 2:
                    vec.add(inputUniversity_students());
                    break;
                case 3:
                    System.out.println("Enter the student code : ");
                    String code = reader.next();
                    removeStudent(code, vec);
                    break;
                case 4:
                    print(vec);
                    break;
                case 5:
                    checkGraduation(vec);
                    break;
                case 6:
                    sort(vec);
                    break;
                case 7:
                    System.out.println("Enter the name/char : ");
                    String name=reader.next();
                    findName(vec, name);
                case 8:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("wrong input");
            }
        } while (menu != 8);
    }

    public static university_students inputUniversity_students() {
        university_students temp = new university_students();
        temp.input();
        return temp;
    }
public static void findName(Vector<students> vec,String name){
      for (int i = 0; i < vec.size(); i++) {
            students temp = vec.get(i);
            if (temp.getStudent_fullName().contains(name)) {
            System.out.println(temp.toString());
            }
        }
}
    public static void sort(Vector<students> vec){
        Comparator<students> com = new Comparator<students>() {
            @Override
            public int compare(students o1, students o2) {
                if (o1.getClass().equals(o2.getClass())) {
                    return o1.getStudent_number().compareTo(o2.getStudent_number());
                }
                return o1.getClass().getName().compareTo(o2.getClass().getName());
            }
        };
        vec.sort(com);
    }

    public static college_students inputCollege_students() {
        college_students temp = new college_students();
        temp.input();
        return temp;
    }

    public static void print(Vector<students> vec) {
        Iterator iter = vec.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void removeStudent(String student_code, Vector<students> vec) {
        for (int i = 0; i < vec.size(); i++) {
            students temp = vec.get(i);
            if (temp.getStudent_number().equalsIgnoreCase(student_code)) {
                System.out.println("delete : " + temp.toString());
                vec.remove(temp);
            }
        }
    }

    public static void checkGraduation(Vector<students> vec) {
        for (int i = 0; i < vec.size(); i++) {
            students temp = vec.get(i);
            if (temp.graduation()) {
                System.out.println(temp.toString());
            }
        }
    }
}
