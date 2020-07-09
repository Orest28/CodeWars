import java.util.ArrayList;
import java.util.List;

public class Line {
    public static String WhoIsNext(String[] names, int n) {

        if(n <= 5) {
            return names[n-1];
        }

        int block = 1;
        int previous = 5;
        int counter = 5;
        while(counter < n) {
            counter += previous * 2;
            previous *= 2;
            block++;
        }


        int result = 0;
        int position = 0;

        while((counter - previous) + result < n) {
            result += Math.pow(2,block - 1);
            position++;
        }


        return names[position-1];
    }

    public static void main(String[] args) {
        System.out.println(WhoIsNext(new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" }, 841));
    }
}