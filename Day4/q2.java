
/*
 Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.
Example:
Input: S = “geeksforgeeks”
Output:
e, count = 4
g, count = 2
k, count = 2
s, count = 2
Explanation: e,g,k,and s are characters which are occured in string in more than one times.
 */
import java.util.*;

class q2 {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
            if (mapElement.getValue() > 1)
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
        }
    }
}
