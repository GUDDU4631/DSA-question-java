class Solution {
    public int reverse(int x) {
       int newNum =0 ;
       int neg =0;
       if(x < 0){
        neg = x;
        x = -x ;
       }
       while (x > 0){
        int r = x % 10;
        x = x / 10;
        if (newNum > Integer.MAX_VALUE / 10 ||
            (newNum == Integer.MAX_VALUE / 10 && r > 7)) {
            return 0;
        }

        // Check for underflow
        if (newNum < Integer.MIN_VALUE / 10 ||
            (newNum == Integer.MIN_VALUE / 10 && r < -8)) {
            return 0;
        }
        newNum = (newNum*10) + r;
        
       } 
       if(neg < 0){
        newNum = -newNum;
       }
       
       return newNum;
    }
}