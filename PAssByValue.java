import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class PAssByValue
{
    public void print(final int[] myarray) {
        for (int length = myarray.length, i = 0; i < length; ++i) {
            System.out.println("Array elements  " + myarray[i]);
        }
    }
    
    public void sum_of_array(final int[] myarray) {
        final int length = myarray.length;
        int sum = 0;
        for (int i = 0; i < length; ++i) {
            sum += myarray[i];
        }
        System.out.println("Sum of Array elements is " + sum);
    }
    
    public void adjacent_sum(final int[] myarray) {
        final int length = myarray.length;
        int sum = 0;
        for (int i = 0; i < length - 1; ++i) {
            sum = myarray[i] + myarray[i + 1];
            System.out.println("Sum of  adjacent Array elements is " + sum);
        }
    }
    
    public int[] leftrotatearray(final int[] myarray, final int length, final int k) {
        int temp = 0;
        for (int i = 0; i < k; ++i) {
            temp = myarray[0];
            for (int j = 1; j < length; ++j) {
                myarray[j - 1] = myarray[j];
            }
            myarray[length - 1] = temp;
        }
        return myarray;
    }
    
    public int[] rightrotatearray(final int[] myarray, final int length, final int k) {
        int temp = 0;
        for (int i = 0; i < k; ++i) {
            temp = myarray[length - 1];
            for (int j = 1; j < length; ++j) {
                myarray[j - 1] = myarray[j];
            }
            myarray[0] = temp;
        }
        return myarray;
    }
    
    public void reversestring(final String str) {
        String str_rev = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            str_rev = String.valueOf(str_rev) + str.charAt(i);
        }
        System.out.println("Reverse String" + str_rev);
    }
    
    public void reversestring2(final String str) {
        final StringBuilder str_rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; --i) {
            str_rev.append(str.charAt(i));
        }
        System.out.println("Reverse String");
        System.out.println(str_rev.toString());
    }
    
    public void rev_array(final String[] str) {
        final String[] rev = new String[str.length];
        for (int i = 0; i < str.length; ++i) {
            rev[i] = this.reversestring3(str[i]);
        }
    }
    
    public String reversestring3(final String str) {
        final StringBuffer str_rev = new StringBuffer(str);
        System.out.println("Reverse String");
        System.out.println(str_rev.reverse().toString());
        return str_rev.reverse().toString();
    }
    
    public void reversestring4(final String str) {
        final char[] a = str.toCharArray();
        for (int i = a.length - 1; i >= 0; --i) {
            System.out.println(a[i]);
        }
        System.out.println("Reverse String");
        System.out.println();
    }
    
    public void staircase(final int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j < n - 1 - i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
    
    public void chk_palindrome(final String str1) {
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; --i) {
            str2 = String.valueOf(str2) + str1.charAt(i);
        }
        System.out.println(str2);
        System.out.println(str1);
        if (str1.toUpperCase().equals(str2.toUpperCase())) {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
    
    public void chkdiv(final int length) {
        System.out.println("Checking Divisibility");
        for (int i = 1; i <= length; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println("Number" + i);
            }
        }
    }
    
    public void miniMaxSum(final int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        System.out.println(sum);
        long max = 0L;
        for (int j = 0; j < arr.length; ++j) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("Maximum element " + max);
        long min = arr[0];
        for (int k = 0; k < arr.length; ++k) {
            if (arr[k] <= min) {
                min = arr[k];
            }
        }
        System.out.println("Minimum element " + min);
        System.out.println(String.valueOf(sum - max) + " " + (sum - min));
    }
    
    public void bday(final int n, final int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            }
            else if (arr[i] == max) {
                ++count;
            }
        }
        System.out.println(count);
    }
    
    public boolean chkpalindrome_correct(final String str) {
        for (int i = 0, j = str.length() - 1; i < j; ++i, --j) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    public void chkpalindrome_witharray(final char[] word) {
        for (int i = 0, j = word.length - 1; i < j; ++i, --j) {
            if (word[i] != word[j]) {
                System.out.println("Not a palindrome");
            }
        }
        System.out.println("Palindrome");
    }
    
    public void reversearray(final String[] str) {
        for (int i = 0, j = str.length - 1; i < j; ++i, --j) {
            final String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        for (int k = 0; k < str.length; ++k) {
            System.out.print(String.valueOf(str[k]) + " ");
        }
    }
    
    public int[] rev_int_array(final int[] arr) {
        int temp = 0;
        for (int start = 0, end = arr.length - 1; start < end; ++start, --end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
    
    public int even_sum(final int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] % 2 == 0) {
                sum += arr1[i];
            }
        }
        System.out.println(sum);
        return sum;
    }
    
    public void fibonacci(final int n) {
        int a = 0;
        int b = 1;
        final int sum = 0;
        System.out.print(String.valueOf(a) + " ");
        System.out.print(String.valueOf(b) + " ");
        for (int c = 2; c <= n; ++c) {
            c = a + b;
            System.out.print(String.valueOf(c) + " ");
            a = b;
            b = c;
        }
    }
    
    public boolean chkprime(final int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int search_element(final int[] arr, final int n) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public String reverse_str(String str) {
        final String[] words = str.split("\\s");
        for (int i = 0, j = words.length - 1; i < j; ++i, --j) {
            final String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        str = String.join(" ", (CharSequence[])words);
        System.out.println(str);
        return str;
    }
    
    public void secondlast_max(final int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int j = 0; j < arr.length - 1; ++j) {
            System.out.println(arr[j]);
        }
    }
    
    public Map<String, Integer> word_count(final String str1) {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final String[] str2 = str1.split("\\s");
        for (int i = 0; i < str2.length; ++i) {
            if (!map.containsKey(str2[i])) {
                map.put(str2[i], 1);
            }
            else {
                final int count = map.get(str2[i]);
                map.put(str2[i], count + 1);
            }
        }
        for (final String key : map.keySet()) {
            System.out.println("Word: " + key + " " + "Count: " + map.get(key));
        }
        return map;
    }
    
    public String max_word_count(final String str) {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final String[] str2 = str.split("\\s");
        int maxC = 0;
        String result = "";
        for (int i = 0; i < str2.length; ++i) {
            int count = 1;
            if (map.containsKey(str2[i])) {
                count = map.get(str2[i]) + 1;
            }
            map.put(str2[i], count);
            if (count > maxC) {
                maxC = count;
                result = str2[i];
            }
        }
        System.out.println(result);
        return result;
    }
    
    public ArrayList sum_of_all() {
        final ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        int sum = 0;
        for (int i = 0; i < arr.size(); ++i) {
            sum += arr.get(i);
            System.out.println(arr.get(i));
        }
        System.out.println("sum  " + sum);
        return arr;
    }
    
    public int[] top3winners(final String[] str) {
        final int[] result = new int[3];
        final int max = 0;
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < str.length; ++i) {
            int value = 1;
            if (map.containsKey(str[i])) {
                value = map.get(str[i]) + 1;
            }
            map.put(str[i], value);
        }
     //   map.entrySet().stream().sorted((Comparator<? super Object>)Collections.reverseOrder(Map.Entry.comparingByValue())).limit(3L).forEach(System.out::println);
        return result;
    }
    
    public int[] array_sum(final int[] arr, final int sum) {
        final int[] result = new int[2];
        int x = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (x == sum) {
                    System.out.println("We are getting the given sum " + sum + " by adding following elements");
                    result[0] = i;
                    result[1] = j - 1;
                    for (int k = 0; k < result.length; ++k) {
                        System.out.println("result elements  " + result[k]);
                    }
                    return result;
                }
                if (x > sum || j == arr.length) {
                    x -= arr[i];
                    ++i;
                }
                x = arr[i] + arr[j];
            }
        }
        System.out.println("No sum found");
        return result;
    }
    
    public int[] best_array_sum(final int[] arr, final int sum) {
        final int[] result = new int[2];
        int curr_sum = arr[0];
        int start = 0;
        for (int i = 1; i < arr.length; ++i) {
            while (curr_sum > sum && start < i - 1) {
                curr_sum -= arr[start];
                ++start;
            }
            if (curr_sum == sum) {
                System.out.println("We are getting the given sum " + sum + " by adding  elements at the indexes");
                result[0] = start;
                result[1] = i - 1;
                for (int k = 0; k < result.length; ++k) {
                    System.out.println("result elements  " + result[k]);
                }
                return result;
            }
            if (i < arr.length) {
                curr_sum += arr[i];
            }
        }
        System.out.println("No sum found");
        return result;
    }
    
    public int[] getSumElements(final int[] arr, final int expectedSum) {
        final int[] result = new int[2];
        final Set<Integer> reminderSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            if (reminderSet.contains(arr[i])) {
                result[0] = expectedSum - arr[i];
                result[1] = arr[i];
                break;
            }
            reminderSet.add(expectedSum - arr[i]);
        }
        return result;
    }
    
    public int secondlargest(final int[] arr) {
        final int n = arr.length;
        int first = 0;
        int second = 0;
        if (n <= 2) {
            System.out.println("Invalid input");
            return 0;
        }
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == 0) {
            System.out.println("There is no second largest value");
        }
        else {
            System.out.println("result  " + second);
        }
        return second;
    }
    
    public String reversewords(final String str) {
        final String result = "";
        final String[] words = str.split(",");
        return result;
    }
    
    public int second_smallest(final int[] arr) {
        final int n = arr.length;
        int min3;
        int min2 = min3 = Integer.MAX_VALUE;
        if (n <= 2) {
            System.out.println("Enter valid input");
            return 0;
        }
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min3) {
                min2 = min3;
                min3 = arr[i];
            }
            else if (arr[i] < min2 && arr[i] != min3) {
                min2 = arr[i];
            }
        }
        if (min2 == 0) {
            System.out.println("There is no second smallest number in array");
        }
        else {
            System.out.println("second smallest " + min2);
        }
        return min2;
    }
    
    public boolean isAnagram(final String str1, final String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        final int[] count = new int[26];
        for (int i = 0; i < str1.length(); ++i) {
            final int index = str1.toLowerCase().charAt(i) - 'a';
            System.out.println(index);
            final int[] array = count;
            final int n = index;
            ++array[n];
            final int index2 = str2.toLowerCase().charAt(i) - 'a';
            System.out.println(index2);
            final int[] array2 = count;
            final int n2 = index2;
            --array2[n2];
        }
        for (int i = 0; i < 26; ++i) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public boolean count_vowels(final String str) {
        final boolean count = true;
        final char[] s = str.toLowerCase().toCharArray();
        for (int i = 0; i < s.length; ++i) {
            if (s[i] == 'a' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'u' || s[i] == 'e') {
                return count;
            }
        }
        System.out.println(count);
        return count;
    }
    
    public String[] reverse_vowels(final String str) {
        int i = 0;
        int j = str.length();
        final String[] s1 = str.split(",");
        while (i < j) {
            if (!this.count_vowels(s1[i])) {
                ++i;
            }
            else if (!this.count_vowels(s1[j])) {
                --j;
            }
            else {
                this.swap(s1);
                ++i;
                --j;
            }
        }
        return s1;
    }
    
    public String[] swap(final String[] str) {
        for (int i = 0, j = str.length - 1; i < j; ++i, --j) {
            final String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        return str;
    }
    
    public boolean isAnagram_best(final String str1, final String str2) {
        final String s1 = str1.replaceAll("\\s", "").toLowerCase();
        final String s2 = str2.replaceAll("\\s", "").toLowerCase();
        if (s1 == null || s2 == null || s1.equals("") || s2.equals("")) {
            System.out.println("Enter valid input");
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        final Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); ++i) {
            final char key = s1.charAt(i);
            int value = 1;
            if (map.containsKey(key)) {
                value = map.get(key) + 1;
            }
            map.put(key, value);
        }
        for (int i = 0; i < s2.length(); ++i) {
            final char key = s2.charAt(i);
            if (!map.containsKey(key)) {
                return false;
            }
            int value = map.get(key);
            if (value == 0) {
                return false;
            }
            map.put(key, --value);
        }
        return true;
    }
    
    public int[] getLongestString(final String str) {
        final int[] result = new int[2];
        int prevIndex = 0;
        int prevLength = 1;
        int maxIndex = 0;
        int maxLength = 1;
        char prevChar = str.charAt(0);
        for (int i = 1; i < str.length(); ++i) {
            final char curChar = str.charAt(i);
            if (curChar == prevChar) {
                if (++prevLength > maxLength) {
                    maxIndex = prevIndex;
                    maxLength = prevLength;
                }
            }
            else {
                prevLength = 1;
                prevIndex = i;
                prevChar = curChar;
            }
        }
        result[0] = maxIndex;
        result[1] = maxLength;
        return result;
    }
    
    public int sum13(final int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 13) {
                sum += nums[i];
            }
            else if (nums[i] == 13 && i < nums.length - 1) {
                nums[i + 1] = (nums[i] = 0);
            }
        }
        return sum;
    }
    
    public boolean chkunique(final String str) {
        char prev = str.toLowerCase().charAt(0);
        for (int i = 1; i < str.length(); ++i) {
            final char current = str.toLowerCase().charAt(i);
            if (current == prev) {
                return false;
            }
            prev = current;
        }
        return true;
    }
    
    public void linearSearch(final int[] arr, final int num) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == num) {
                System.out.println("The element is present at position" + i);
            }
        }
        System.out.println("The element is not present in the array");
    }
    
    public int jumpsearch(final int[] arr, final int num, final int k) {
        Arrays.sort(arr);
        for (int i = k; i < arr.length; i += k) {
            if (arr[i] == num && arr[i] < num) {
                return i;
            }
            for (int j = i - k; j < arr.length; ++j) {
                if (arr[j] == num) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    public int[] selectionsort(final int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        return arr;
    }
}

// 
// Decompiled by Procyon v0.5.36
// 

 class Runner
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 2, 3, 4 };
        final PAssByValue first = new PAssByValue();
        final String input = "aabbbccccc";
        final String str1 = "There is no holiday on sunday";
        final String s1 = "cab";
        final String s2 = "bac";
        final String in = "Hello";
        final int[] arr2 = { 22, 67, 55, 77, 88, 45, 90 };
        final int n = 90;
        final int k = 3;
        System.out.println(first.selectionsort(arr2));
    }
}
