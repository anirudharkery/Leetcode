class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ')')
            {
                stack.push(s.charAt(i));
                continue;
            }
            String popping = "";
            while(!stack.isEmpty() && stack.peek() != '(')
            {
                popping += stack.pop();
            }
            if(!stack.isEmpty())
            {
                stack.pop();
            }
            
            if(popping.length() > 0)
            {
                for(int j=0;j<popping.length();j++)
                {
                    stack.push(popping.charAt(j));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
        
    }
}
