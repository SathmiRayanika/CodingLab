class Student {

    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char newGrade) {
        this.grade = newGrade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        student.setGrade('A');
        student.displayInfo();
    }
}

