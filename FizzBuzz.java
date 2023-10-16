public class FizzBuzz{
    public static void main(String[] args) {
        if(isNumberic(args[0])) {
            int n;
            n = Integer.parseInt(args[0]);
            fizzBuzz(n);
            recursive(n);
        } else {
            System.out.println("Wrong argument");
        }
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i<=n; i++) {
            if (i % 3 ==0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 ==0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void recursive(int n) {
        if(n > 0) {
            recursive(n -1);
            if (n % 3 ==0 && n % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else if (n % 3 ==0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(n);
            }
        } else {
            return;
        }
    }
    
    private static boolean isNumberic(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}