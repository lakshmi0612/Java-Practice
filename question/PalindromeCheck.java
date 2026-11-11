package question;

public class PalindromeCheck {
    public static void main(String[] args) {
        String a="malayalam";
        String b="madam";
        String c="abcba";
        pali(a);
        pali(b);
        pali(c);
    }
    static void pali(String a){
        int left=0;
        int right=a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;

        }
        System.out.println("Palindrome");


        }

    }

