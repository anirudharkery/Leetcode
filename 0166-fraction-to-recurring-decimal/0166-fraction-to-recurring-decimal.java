class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        StringBuilder function = new StringBuilder();
        if(numerator == 0)
            return "0";
        if(numerator < 0 ^ denominator < 0)
            function.append("-");
        
        
        
        long num = Math.abs(Long.valueOf(numerator));
        long den = Math.abs(Long.valueOf(denominator));
        
        function.append(String.valueOf(num/den));
        long remainder = num%den;
        if(remainder == 0)
            return function.toString();
        
        Map<Long,Integer> mp = new HashMap<>(); 
          function.append(".");
        while(remainder != 0)
        {
          
            if(mp.containsKey(remainder))
            {
                function.insert(mp.get(remainder),"(");
                function.append(")");
                break;
            }
            mp.put(remainder,function.length());
            remainder *=10;
            function.append(String.valueOf(remainder/den));
            remainder = remainder%den;
            
        }
        
        return function.toString();
    }
}