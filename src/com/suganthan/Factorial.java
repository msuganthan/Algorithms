public class Factorial {

    static int factorial(int n) {
        System.out.println("I am calculating factorial("+ n+ ")");
        if(n==0) {
            return 1;
        }
        int fact = n * factorial(n-1);
        System.out.println("Done!!! factorial("+ n+ ") ==> "+fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some n :");
        System.out.println(factorial(in.nextInt()));
    }

}
