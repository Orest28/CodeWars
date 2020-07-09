public class ASum {
    public static long findNb(long m) {
        int blocks = 1;
        while(m != 0) {
            m -= Math.pow(blocks++, 3);
            if(m < 0) return -1;
        }
        return blocks - 1;
    }
}
