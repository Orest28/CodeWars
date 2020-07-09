/*You will be given a number and you will need to return it as a string in Expanded Form.
Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 */


public class Kata2 {
    public static String expandedForm(int num)
    {
        String result = "";
        String[] dividedNumber = Integer.toString(num).split("");
        for(int i = 0; i < dividedNumber.length; i++) {
            if(dividedNumber[i].equals("0")) continue;
            result = result.concat(dividedNumber[i]);
            int addedZeroes = dividedNumber.length - i - 1;
            while(addedZeroes-- != 0) {
                result = result.concat("0");
            }
            result = result.concat(i + 1 != dividedNumber.length ? " + " : "");
        }

        return result.substring(result.length() - 1).equals(" ") ? result.substring(0, result.length() - 3) : result;
    }

    public static void main(String[] args) {
        //test
        System.out.println(expandedForm(900000));
    }
}
