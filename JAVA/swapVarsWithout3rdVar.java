public class swapVarsWithout3rdVar {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b; // a  15
        b = a - b; // b  5 
        a = a - b; // a  10 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}