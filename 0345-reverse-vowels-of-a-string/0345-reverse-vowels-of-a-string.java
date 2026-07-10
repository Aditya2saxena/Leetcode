class Solution {
    boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'||  ch=='i'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='E' || ch=='I' ||  ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j ){
            while(i<j && !isVowel(ch[i])){
                i++;
            }
            while(i<j && !isVowel(ch[j])){
                j--;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;

        }
        return new String(ch);
    }
}