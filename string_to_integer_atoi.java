class Solution {
    public int myAtoi(String s) {
        s = s.trim() ;
        int ans = 0, flag = 0;
       for(int i = 0 ; i < s.length() ; i++) {
           char c = s.charAt( i );
           if(  c == '-' ){
               if( flag == 0 ){ flag = 1 ;}
               else{ break ; }
           }
           else if(  c == '+' ){
               if( flag == 0 ){ flag = 2 ;}
               else{ break ; }
           }
           if(ans == 0 && c != '-' && c != '+' ){
               while(i < s.length() && c - '0'<= 9 && c -'0' >= 0 ) {
                   if( ans > ( Integer.MAX_VALUE - ( c - '0' ) ) / 10 ){
                       if( flag == 1 ){ return ( Integer.MAX_VALUE * -1 ) - 1 ; }
                       else{ return Integer.MAX_VALUE; }
                   } 
                   ans = ans * 10 + c - '0'; 
                    if( i + 1 != s.length() ){ c = s.charAt( i + 1 ) ; }               
                    i++;
               }
                break;
           }
       }
        if( flag == 1){
            ans *= -1 ;
        }
        return ans;
    }
}