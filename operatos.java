public class operatos {
    public static void main(String[] args) {
        int a = 10; boolean b = true;
        System.out.println("Unary Operators:");
        System.out.println("++a: " + (++a));
        System.out.println("--a: " + (--a));
        System.out.println("!b: " + (!b));
        System.out.println("a: " + a);
        int x = 20; int y = 5;
        System.out.println("\nAssignment Operators:");
        x += y;
        System.out.println("x += y: " + x);
        x -= 5;
        System.out.println("x -= 5: " + x);
        int z = 10;
        z *= 2;
        System.out.println("z *= 2: " + z);
        int num1 = 15;int num2 = 10;
        System.out.println("\nRelational Operators:");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        boolean cond1 = true;boolean cond2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        int val1 = 5;int val2 = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("val1 & val2: " + (val1 & val2));
        System.out.println("val1 | val2: " + (val1 | val2));
        System.out.println("val1 ^ val2: " + (val1 ^ val2));
        System.out.println("~val1: " + (~val1));
        System.out.println("val1 << 1: " + (val1 << 1));
        System.out.println("val1 >> 1: " + (val1 >> 1));
    }
}