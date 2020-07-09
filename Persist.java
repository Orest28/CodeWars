/*Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.*/

public class Persist {
    public static int persistence(long n) {
        int result = 0;
        long step = 1;
        long temp = n;
        while(n / 10 != 0) {
            if(temp / 10 != 0) {
                step *= temp % 10;
                temp /= 10;
                if(temp / 10 == 0) {
                    step *= temp;
                }
            }else {
                System.out.println(n);
                n = step;
                step = 1;
                temp = n;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
}
