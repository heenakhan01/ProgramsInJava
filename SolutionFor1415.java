import java.util.ArrayList;
import java.util.List;

public class SolutionFor1415 {
        public static String getHappyString(int n, int k) {
            char[] chars = new char[]{'a', 'b', 'c'};
            List<String> happyStrings = new ArrayList<>();
            happyStrings.add("");
            happyStrings = findAllHappyStrings(chars, n, happyStrings);
            return happyStrings.size() < k ? "" : happyStrings.get(k - 1);
        }

        private static List<String> findAllHappyStrings(char[] chars, int n, List<String> happyStrings) {
            if (happyStrings.get(0).length() == n) {
                return happyStrings;
            }
            List<String> newHappyStrings = new ArrayList<>();
            for (String str : happyStrings) {
                for (char c : chars) {
                    if (str.equals("") || str.charAt(str.length() - 1) != c) {
                        StringBuilder newSb = new StringBuilder(str);
                        newSb.append(c);
                        newHappyStrings.add(newSb.toString());
                    }
                }
            }
            happyStrings = newHappyStrings;
            return findAllHappyStrings(chars, n, happyStrings);
        }
        
        public static void main(String args[]) {
        	getHappyString(3, 9);
        }
    }