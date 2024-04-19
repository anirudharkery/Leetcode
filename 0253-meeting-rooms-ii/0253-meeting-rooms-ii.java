class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        var q = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        
        for(var i : intervals)
        {
            if(!q.isEmpty() && q.peek()[1] <= i[0])
            { 
                q.poll();   
            }
            q.add(i);
        }
        return q.size();
        
    }
}