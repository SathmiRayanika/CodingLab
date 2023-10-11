public abstract class Animal{
    int age;
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    public abstract void eat();
}
class Dog extends Animal{
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Main {
    public static void main(String[] args){
        Dog a = new Dog();
        a.sleep();
        a.eat();
    }

}