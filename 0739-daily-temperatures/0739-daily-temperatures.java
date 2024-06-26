class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> st = new Stack<>();
        int[] map = new int[temperatures.length];

        for(int i=0;i< temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i])
            {
                int topindex = st.pop();
                int val = i - topindex;
                map[topindex] = val;
            }
            st.push(i);
        }
        
        while(!st.isEmpty())
        {
            int lastindex = st.pop();
            map[lastindex] = 0;
        }
        return map;
    }
}