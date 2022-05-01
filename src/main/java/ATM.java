//https://www.codewars.com/kata/5635e7cb49adc7b54500001c/train/java
public class ATM {
    public static void main(String[] args) {
        int n = 760;
        System.out.println(solve(n));
    }

    public static int solvex(int n) {
        if (n % 10 != 0) {
            return -1;
        }
        int[] banknotes = {500, 200, 100, 50, 20, 10};
        int result = 0;
        for (int i = 0; i < banknotes.length; i++) {
            result += n / banknotes[i];
            n = n - (banknotes[i] * (n / banknotes[i]));
        }
        return result;
    }

    public static int solveCWSolution1(int n) {
        int[] denominations = new int[]{500, 200, 100, 50, 20, 10};
        int result = 0;

        for (int denomination: denominations) {
            result += n / denomination;
            n %= denomination;
        }

        return n == 0 ? result : -1;
    }

    public static int solve(int n) {
        int count = 0;
        int [] arr = {500,200,100,50,20,10};
        for (int x : arr) {
            while (x <= n) {
                n = n - x;
                count++;
            }
        }

        if (n!=0)return -1;else return count;
    }
}
