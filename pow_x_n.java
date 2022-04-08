class Solution {
    public double myPow(double x, int n) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }
        
        if (n == 0) {
            return 1;
        }
        
        if (n == 1) {
            return x;
        }
        
        if (n == -1) {
            return 1 / x;
        }
        
        double temp = myPow(x, n / 2);
        
        return n % 2 == 0 ? temp * temp : temp * temp * (n > 0 ? x : 1 / x);
    }
}