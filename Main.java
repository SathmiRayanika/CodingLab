class AccessModifiersDemo {

    private int privateVar = 10;
    double defaultVar = 20.0;
    protected boolean protectedVar ;
    public String publicVar = "Hello, world!";

    public int getPrivateVar() {
        return privateVar;
    }

    public double getDefaultVar() {
        return defaultVar;
    }

    protected boolean getProtectedVar() {
        return protectedVar;
    }

    public String getPublicVar() {
        return publicVar;
    }
}

class SubclassDemo extends AccessModifiersDemo {

    public void displayProtectedVar() {
        System.out.println("Protected variable: " + getProtectedVar());
    }
}

public class Main
 {

    public static void main(String[] args) {
          AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();

        System.out.println("Private variable: " + accessModifiersDemo.getPrivateVar());
        System.out.println("Default variable: " + accessModifiersDemo.getDefaultVar());
        System.out.println("Protected variable: " + accessModifiersDemo.getProtectedVar());
        System.out.println("Public variable: " + accessModifiersDemo.getPublicVar());

        SubclassDemo subclassDemo = new SubclassDemo();
        subclassDemo.displayProtectedVar();
}
}