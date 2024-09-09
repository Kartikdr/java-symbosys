package uplodeproram;

public class palindromeno {
	
	    public static void main(String[] args) {
	        int num = 121;
	        System.out.println(isPalindrome(num) ? num + " is a palindrome" : num + " is not a palindrome");
	    }

	    public static boolean isPalindrome(int num) {
	        String str = String.valueOf(num);
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    
	}
}
