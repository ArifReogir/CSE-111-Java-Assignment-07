/*Given the following classes, write the code for 
the CSEStudent class derived from Student so that the following output is generated.
 */

public class StudentTester { // driver code
    public static void main(String args[]) {
        CSEStudent.details();
        System.out.println("1--------------");
        CSEStudent s1 = new CSEStudent("Bob", 23);
        s1.info();
        System.out.println("2--------------");
        CSEStudent s2 = new CSEStudent("Don", 33);
        s2.info();
        System.out.println("3--------------");
        s1.addLabBasedCourse("CSE220");
        s1.addLabBasedCourse("CSE221");
        System.out.println("4--------------");
        s1.info();
        System.out.println("5--------------");
        CSEStudent.details();
        System.out.println("6--------------");
        s1.addLabBasedCourse("CSE230");
        System.out.println("7--------------");
        s1.info();
        System.out.println("8--------------");
        s2.addLabBasedCourse("CSE110");
        s2.info();
    }
}

// class starts here

class Student { // parent class
    public String name;
    public int id;
    public String courses = "";

    public Student(String n, int i) {
        name = n;
        id = i;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses: " + courses);
    }
}

class CSEStudent extends Student { // child class
    public static int total_students;
    public static String[] course = { "CSE110", "CSE111", "CSE220", "CSE221" };

    public String[] addcourse = new String[10];
    public int course_count;

    public static void details() {
        System.out.println("Total CSE Students: " + total_students);
        System.out.println("Available Lab Based Courses: ");
        for (int i = 0; i < course.length; i++) {
            System.out.print(course[i] + " ");
        }
        System.out.println();
    }

    public CSEStudent(String name, int id) {
        super(name, id);
        total_students++;
    }

    public void info() {
        super.info();
        if (course_count > 0) {
            for (int i = 0; i < course_count; i++) {
                System.out.print(addcourse[i] + " ");
            }
        }
        System.out.println();

    }

    public void addLabBasedCourse(String name) {
        boolean found = false;
        for (int i = 0; i < course.length; i++) {

            if (course[i].equals(name)) {
                addcourse[course_count] = name;
                course_count++;
                found = true;
                return;
            }

        }

        if (!found) {
            System.out.println("It is not a lab based course!");
        }
    }

}
