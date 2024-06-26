// class Solution {
// public:
//     int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        
//     }
// };
class Solution {
public:
    // Recursive function to return gcd of a and b  
    long long gcd(long long int a, long long int b) 
    { 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
    } 
    
    // Function to return LCM of two numbers  
    long long lcm(int a, int b) 
    { 
        return (a / gcd(a, b)) * b; 
    }

    bool conditionSatisfied(int d1, int d2, int u1, int u2, long long max_value) {
        long long both_invalid = max_value / lcm(d1, d2);
        long long arr1_invalid = ( max_value / d1 ) - both_invalid;
        long long arr2_invalid = ( max_value / d2 ) - both_invalid;
        long long both_valid = max_value - arr1_invalid - arr2_invalid - both_invalid;

        if (u1 > arr2_invalid) {
            both_valid = both_valid - ( u1 - arr2_invalid );
        }
        if (u2 > arr1_invalid) {
            both_valid = both_valid - ( u2 - arr1_invalid );
        }

        if (both_valid >= 0) return true;
        return false;
    }

    int minimizeSet(int d1, int d2, int u1, int u2) {
        long long lower_limit = 1;
        long long upper_limit = INT_MAX;
        
        while ( lower_limit + 1 < upper_limit ) {
            long long mid = (upper_limit + lower_limit) >> 1;
            if (conditionSatisfied(d1, d2, u1, u2, mid)) upper_limit = mid;
            else lower_limit = mid;
        }
        return upper_limit;
    }
};