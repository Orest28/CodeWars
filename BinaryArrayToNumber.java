import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        AtomicInteger index = new AtomicInteger();
        index.set(binary.size() - 1);
        return binary.stream().map(num -> (int)(num * Math.pow(2, index.getAndDecrement()))).mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(List.of(1,1,1,1)));
    }
}
