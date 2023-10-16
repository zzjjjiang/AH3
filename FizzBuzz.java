public class FizzBuzz{
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(args[0]);
        fizzBuzz(n);
        recursive(n, 1);
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

    public static void recursive(int n, int counter) {
        if(counter <= n) {
            if (counter % 3 ==0 && counter % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else if (counter % 3 ==0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(counter);
            }
            recursive(n, counter +1);
        } else {
            return;
        }
    }
}