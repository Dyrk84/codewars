// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java

public class RoundUpToTheNextMultipleOf5 {

    public static void main(String[] args) {
        int result = roundToNext5(0);
        System.out.println(result);
    }

    public static int roundToNext5mySolution(int number) {
        int result = 0;
        if (number > 0 && number % 5 != 0) {
            result = (number - (number % 5) + 5);
        }
        if (number >= 0 && number % 5 == 0) {
            result = number;
        }
        if (number < 0) {
            result = (number - (number % 5));
        }
        return result;
    }

    public static int roundToNext5CWSolution1(int number) {
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }

    public static int roundToNext5CWSolution2(int number) {
        return (int) (Math.ceil((float) number / 5) * 5);
    }

    public static int roundToNext5CWSolution3(int number) {
        if (number % 5 == 0) {
            return number;
        } else {
            number++;
            return roundToNext5CWSolution3(number);
        }
    }

    public static int roundToNext5CWSolution4(int number) {
        return number + (5 - (number % 5)) % 5;
    }

    public static int roundToNext5CWSolution5(int number) {
        if (number % 5 == 0) return number;
        if (number < 0) return number - number % 5;
        else return number / 5 * 5 + 5;
    }

    //public static int roundToNext5CWSolution6(int number) {
    public static int roundToNext5(int number) {
        return number % 5 == 0 ? number : number < 0 ? number + (-number % 5) : number + (5 - number % 5);
    }

    public static int roundToNext5CWSolution7(int number) {
        if (number >= 0)
            return (number + 4) / 5 * 5;
        else
            return number / 5 * 5;
    }


}
