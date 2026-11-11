package question;
import java.util.ArrayList;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String same = strs[0];                      // ✔️ Base string for comparison
        String com = "";
        ArrayList<Character> list = new ArrayList<>();
        int l = strs.length;

        for (int j = 1; j < l; j++) {
            String common = strs[j];

            if (list.isEmpty()) {                   // ✔️ First comparison
                if (common.length() < same.length()) {
                    for (int a = 0; a < common.length(); a++) { // 🔁 FIX: loop until common.length()
                        if (common.charAt(a) == same.charAt(a)) {
                            list.add(common.charAt(a));
                        } else {
                            break;                  // 🛠️ STOP adding if mismatch
                        }
                    }
                } else {
                    for (int a = 0; a < same.length(); a++) { // 🔁 FIX: loop until same.length()
                        if (common.charAt(a) == same.charAt(a)) {
                            list.add(common.charAt(a));
                        } else {
                            break;                  // 🛠️ STOP adding if mismatch
                        }
                    }
                }
            } else {
                if (common.length() < list.size()) {
                    list.subList(common.length(), list.size()).clear(); // ✅ FIX: clear properly

                    for (int i = 0; i < common.length(); i++) {
                        if (common.charAt(i) == list.get(i)) {
                            continue;
                        } else {
                            list.subList(i, list.size()).clear();      // ✅ FIXED: clear after mismatch
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        if (common.charAt(i) == list.get(i)) {
                            continue;
                        } else {
                            list.subList(i, list.size()).clear();     // ✅ FIXED: actually clear mismatched suffix
                            break;
                        }
                    }
                }
            }
        }

        if (list.isEmpty()) {
            return "";
        } else {
            for (Character character : list) {
                com = com + character;  // Alternatively use StringBuilder for performance
            }
        }

        return com;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));  // Output: "fl"
    }
}
