import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int [] b) {
        if(a == null || b == null) return false;

        a = Arrays.stream(a).map(i-> i*i).sorted().toArray();
        b = Arrays.stream(b).sorted().toArray();

        return Arrays.equals(a,b);
    }

    public static void main(String[] args) {
        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }
}
