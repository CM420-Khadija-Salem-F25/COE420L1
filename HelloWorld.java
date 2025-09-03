public class HelloWorld {
    public void featureB() {
        System.out.println("This is Feature B");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
     
        HelloWorld hw = new HelloWorld();
        hw.featureB();
    }
}