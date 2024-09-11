public class Main{
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("public void must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
        Main myobj = new Main();
        myobj.myPublicMethod();
        }
    }