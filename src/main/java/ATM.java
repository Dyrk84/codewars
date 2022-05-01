//https://www.codewars.com/kata/5635e7cb49adc7b54500001c/train/java
public class ATM {
    public static void main(String[] args) {
        int n = 760;
        System.out.println(solve(n));
    }

    public static int solve(int n) {
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

        for (int denomination : denominations) {
            result += n / denomination;
            n %= denomination;
        }

        return n == 0 ? result : -1;
    }

    public static int solveCWSolution2(int n) {
        int count = 0;
        int[] arr = {500, 200, 100, 50, 20, 10};
        for (int x : arr) {
            while (x <= n) {
                n = n - x;
                count++;
            }
        }
        if (n != 0) return -1;
        else return count;
    }

    public static int solveCWSolution3(int n) {
        if (n % 10 != 0) {
            return -1;
        }
        int notes = 0;
        notes += n / 500;
        notes += n % 500 / 200;
        notes += n % 500 % 200 / 100;
        notes += n % 500 % 200 % 100 / 50;
        notes += n % 500 % 200 % 100 % 50 / 20;
        notes += n % 500 % 200 % 100 % 50 % 20 / 10;
        return notes;
    }

    public static int solveCWSolution4(int n) {
        if (Integer.toString(n).endsWith("0")) {
            int notes = 0;
            while (n >= 500) {
                n -= 500;
                notes++;
            }
            while (n >= 200) {
                n -= 200;
                notes++;
            }
            while (n >= 100) {
                n -= 100;
                notes++;
            }
            while (n >= 50) {
                n -= 50;
                notes++;
            }
            while (n >= 20) {
                n -= 20;
                notes++;
            }
            while (n >= 10) {
                n -= 10;
                notes++;
            }
            return notes;
        }
        return -1;
    }

    public static int solveCWSolution5UpgradedByDyrk(int n) {
        return n%10==0?(n/500)+(n%500/200)+(n%500%200/100)+(n%100/50)+(n%50/20)+(n%50%20/10):-1;
    }

    public static int solveCWSolution6(int n) {
        if(n % 10 != 0) return -1;

        int bn = 0;
        while(n != 0){
            n -= n >= 500 ? 500 : n >= 200 ? 200 : n >= 100 ? 100 : n >= 50 ? 50 : n >= 20 ? 20 : 10;
            bn++;
        }
        return bn;
    }
}
