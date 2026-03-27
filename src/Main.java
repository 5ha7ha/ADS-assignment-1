import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write a number (n)");
        int n = scanner.nextInt();

        //first Q:
//        int result = sumSquares(n);

        //second Q:
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int result = firstSumArr(n, arr);

        //third Q:
//        System.out.println("Enter a number for base: ");
//        int b = scanner.nextInt();
//        int result = nPowerBaseSum(b, n);

        //fourth Q:
        reversOrder(n,scanner);




        //printing result
        //System.out.println(result);
    }

    //first
    public static int sumSquares(int n) {
        if (n == 1) return 1; //comparing n times
        return sumSquares(n - 1) + square(n); //will call the sumSqu n times and square n times
        //counting the operations: n + n + n == 3n (ignoring the coefficient => so the big-O notation is O(n)
    }
    public static int square(int n) {
        return n * n; //O(1) - just one operation
    }

    //second
    public static int firstSumArr(int n, int[] arr){
        if (n > arr.length) throw new RuntimeException("N is greater than the array");
        //checking if n = 1 runs -> O(n) times
        if(n == 1) return arr[0]; //return first element
        //calling the function n times
        return firstSumArr(n - 1, arr) + arr[n - 1]; // + arr[n - 1]{O(1)} cause array is 0-indexed
        //so the complexity of this function is O(n) {n + n + 1 = n }
    }

    //third
    public static int nPowerBaseSum(int b, int n){
        if(n == 0) return 1;
        // recursive call complexity is n + 1 O(n) and power is (n)^2  {each call of power = n runs}
        return nPowerBaseSum(b, n - 1) + power(b, n);//O(n) calls * O(n) each = O(n^2)
        //so total complexity is n + n^2 ==> O(n^2)
    }
    public static int power(int b, int n) {
        if(n == 0 ) return 1;
        return b * power(b, n - 1); //O(n + 1) = O(n)
    }

    //fourth
    public static void reversOrder(int n, Scanner scanner){//O(n)
        int num = scanner.nextInt(); //O(1)
        if(n == 1){ //if we at last item in sequence
           System.out.print(num);//print it first //O(1)
           return;
        }
        reversOrder(n -1, scanner); //O(n) //after recursion, call prints current number its in
        System.out.print(" " + num);//O(1)

    }
}
