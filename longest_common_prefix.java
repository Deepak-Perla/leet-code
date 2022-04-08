class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String first=strs[0];
        String second=strs[strs.length-1];
        String result="";
        
        
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==second.charAt(i)) result+=first.charAt(i);
            else break;
        }
        return result;
    }
}