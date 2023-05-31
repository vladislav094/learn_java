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

    public static boolean isPalindromeSecondEdition(String s) {
        if (s.isEmpty()) return true;

        int first = 0;
        int last = s.length() - 1;
        while (first<=last){
            char currFirst = s.charAt(first);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) {
                first++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                first++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(word));
//        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindromeSecondEdition(word));
    }
}
