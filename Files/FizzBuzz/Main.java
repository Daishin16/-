/*
2019/04/10
*/

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(start(i));
        }
    }

    static String start(int i) {
        String result = "";

        if (i % 3 == 0 && i % 5 == 0) {
            result += "FizzBuzz";
            return result;
        }
        if (i % 5 == 0) {
            result += "Buzz";
            return result;
        }
        if (i % 3 == 0) {
            result += "Fizz";
            return result;
        }
        return Integer.toString(i);
    }
}
