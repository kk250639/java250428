package leetcode;

public class ValidPalindrmoe {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: panama";

        String cleaned = "";
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);

            if((ch>='a'&&ch<='z')||
                    (ch >= 'A' && ch <= 'Z')||
                    (ch >= '0' && ch <= '9')) {

                if(ch>='A'&&ch<='Z'){
                    ch = (char)(ch+32);
                }
                cleaned += ch;
            }
        }
        int start = 0;
        int end = cleaned.length() - 1;
        boolean isPalindrome = true;

        while(start<end) {
            if(cleaned.charAt(start)!=cleaned.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome);
    }
}
