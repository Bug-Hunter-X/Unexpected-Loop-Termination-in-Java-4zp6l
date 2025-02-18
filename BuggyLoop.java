public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            --i; //decrementing i
            if (i == 5) {
                break; //exiting the loop
            }
        }
        System.out.println("Loop finished");
    }
}