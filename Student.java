public class Student {
    String Fname;
    String Lname;
    int marks;
    int age;

    public String method1() {
        String Fullname = Fname + " " + Lname;
        return Fullname;
    }

    public void method2() {
        if (marks >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    public int method3() {
        int b_year = 2023 - age;
        return b_year;
    }
            public static void main(String[] args) {
        Student obj = new Student();
        obj.Fname = "Sathmi";
        obj.Lname = "Rayanika";
        obj.marks = 45;
        obj.age = 22;

        System.out.println("Full Name: " + obj.method1());
        obj.method2();
        System.out.println("Birth Year: " + obj.method3());

    }
    
}
