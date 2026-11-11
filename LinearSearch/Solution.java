package LinearSearch;

class Solution {
    public static boolean isPalindrome(String s) {
        String lower =s.toLowerCase();
        String temp="";
        for(int i =0; i<s.length();i++){
            if ((lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z') || (lower.charAt(i) >= '0' && lower.charAt(i) <= '9'))
            {
                temp=lower.charAt(i)+temp;

            }
        }
        int l=0;
        int h=temp.length()-1;

        while(l<h){
            if(temp.charAt(l)==temp.charAt(h)){
                l++;
                h--;
            }
            else{
                return false;
            }

        }
        System.out.println(temp+" is a palindrome");
        return true;

    }

    public static void main(String[] args) {
        String s= "race a car";
        isPalindrome(s);
    }

}
