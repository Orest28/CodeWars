/*Check to see if a string has the same amount of 'x's and 'o's.
The method must return a boolean and be case insensitive. The string can contain any char.*/

public class XO {
    public static void main(String[] args) {

    }

    public static boolean getXO(String str) {
        int countX = 0, countO = 0;

        for(String letter : str.split("")) {
            if(letter.toLowerCase().equals("x")) {
                countX++;
            }else if(letter.toLowerCase().equals("o")) {
                countO++;
            }
        }

        return countX == countO;
    }
}
