class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true; 
        }
        int start = 0; 
        int last = (s.length()-1);
        
        while(start <= last){
            char curr_first = s.charAt(start);
            char curr_next = s.charAt(last); 

            if (!Character.isLetterOrDigit(curr_first)){
                start++;
            }
            else if (!Character.isLetterOrDigit(curr_next)){
                last--;
            }
            else{
                if (Character.toLowerCase(curr_first)!= Character.toLowerCase(curr_next)){
                    return false;
                }
                start++; 
                last--;
            }
        }
        return true; 
    }
}
