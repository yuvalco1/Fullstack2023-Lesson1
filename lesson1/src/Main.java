public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        int a = 5;
        int b = 10;
        System.out.println("initially a is:" + a + " and b is:" + b);
        System.out.println("Now switching values between a & b");
//        switch values with 3rd argument
//        int c=b;
//        b=a;
//        a=c;

        // Switch values without 3rd argument
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Now a is:" + a + " and b is:" + b);
        System.out.println();

    }
}