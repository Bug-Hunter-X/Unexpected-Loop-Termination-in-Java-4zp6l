public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            --i; //decrementing i
            if (i == 5) {
                // Instead of exiting the loop directly with break;
                // We set i to 0 to ensure the while condition is met, avoiding unexpected behavior
                i = 0; 
            }
        }
        System.out.println("Loop finished");
    }
}