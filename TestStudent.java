public class TestStudent {
    public static void main(String[] args) {
        BBAStudent b1 = new BBAStudent();
        BBAStudent b2 = new BBAStudent("Humty Dumty");
        BBAStudent b3 = new BBAStudent("Little Bo Peep");
        b1.details();
        System.out.println("1---------------");
        b2.details();
        System.out.println("2---------------");
        b3.details();
    }

}

// class starts here

class Student {
    private String name = "Just a Student";
    private String department = "nothing";

    public void setDepartment(String dpt) {
        this.department = dpt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Name : " + name + " Department: " + department);
    }
}

class BBAStudent extends Student {

    public BBAStudent() {

        setName("Default");
        setDepartment("BBA");

    }

    public BBAStudent(String n) {
        setName(n);
        setDepartment("BBA");
    }
}
