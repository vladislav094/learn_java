package leetcode;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        String firstWord = "";
        String secondWord = "";
        for(int i = 0, x = s.length()-1; i < s.length(); i++, x--) {
            if(Character.isLetter(s.charAt(i)) | Character.isDigit(s.charAt(i))) {
                firstWord += Character.toLowerCase(s.charAt(i));
            }
            if(Character.isLetter(s.charAt(x)) | Character.isDigit(s.charAt(x))) {
                secondWord += Character.toLowerCase(s.charAt(x));
            }
        }

        return firstWord.equals(secondWord);
    }

    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome("0P"));
    }
}
