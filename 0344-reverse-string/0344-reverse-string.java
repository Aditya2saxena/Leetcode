class Solution {
    static void ans(char []s,int left,int right){
        if(left >= right){
            return;
        }
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;

        ans(s, left + 1, right - 1);
    }
    public void reverseString(char[] s) {
       ans(s,0,s.length-1);
    }

        

        
       
       
    
        
    
}