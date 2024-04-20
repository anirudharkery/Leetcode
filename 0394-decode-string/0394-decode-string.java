class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        
        
        for(char ch: s.toCharArray())
        {
        
            List<Character> decode = new ArrayList<>();
            if(ch == ']')
            {
            
            while(st.peek() != '[')
            {
                decode.add(st.pop());
            }
            st.pop();
            
            int k=0;
            int base=1;
            
            while(!st.isEmpty() && Character.isDigit(st.peek()))
            {
                k = k + (st.pop() - '0') * base;
                base = base*10;
            }
        
            while(k != 0 )
            {
              for(int j=decode.size()-1;j>=0;j--)
              {
                  st.push(decode.get(j));
              }
                k--;
            }
            }
            else
            {
                st.push(ch);
            }
        }
        char[] result = new char[st.size()];
        
        for(int i=result.length-1;i >=0;i--)
        {
            result[i] = st.pop();
        }
        
        return new String(result);
    }
}