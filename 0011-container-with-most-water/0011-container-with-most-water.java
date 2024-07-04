class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length-1;
        int answer=0;
        
        while(last > first)
        {
            if(height[first] > height[last])
            {
                answer = Math.max(answer,(last-first)*height[last]);
                last--;
            }
            if(height[first] <= height[last])
            {
                answer = Math.max(answer,(last-first)*height[first]);
                first++;
            }
        }
        return answer;
    }
}