//package LinearSearch;
//
//import java.sql.SQLOutput;
//import java.util.ArrayList;
//
//public class ValidParenthesis {
//    /*
//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//     */
//
//    public static boolean isValid(String s) {
//        char[] arr = s.toCharArray();
//        ArrayList<Character> list = new ArrayList<>();
//        for (char c : arr) {
//            list.add(c);
//        }
//
//        int i = 0;
//        while (i < list.size()) {
//
//            if (list.get(i) == '(') {
//                boolean found = false;
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (list.get(j) == ')') {
//                        list.remove(j);
//                        list.remove(i);
//                        found = true;
//                        break;
//
//                    }
//                }
//                //if (!found) break;
//            }
//
//            else if (list.get(i) == '[') {
//                boolean found = false;
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (list.get(j) == ']') {
//                        list.remove(j);
//                        list.remove(i);
//                        found = true;
//                        break;
//
//
//                    }
//
//                }
//                //if (!found) break;
//
//            }
//
//
//            else if (list.get(i) == '{') {
//                boolean found = false;
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (list.get(j) == '}') {
//                        list.remove(j);
//                        list.remove(i);
//                        found = true;
//                        break;
//
//                    }
//                }
//                //if (!found) break;
//            } else {
//                // If current char is a closing bracket or invalid char, return false immediately
//                return false;
//            }
//            if (found) {
//                // After removal, reset i to 0, but only if list is not empty
//                if (list.isEmpty()) {
//                    return true;  // All matched!
//                }
//                i = 0;
//            } else {
//                // No matching closing bracket found for this opening bracket
//                return false;
//            }
//        }
//
//        return list.isEmpty();
//    }
//
//
//
//    public static void main(String[] args) {
//        String  s = "()[]{";
//        System.out.println(isValid(s));
//    }
//}
//
//
