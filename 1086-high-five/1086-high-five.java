class Solution {
    public int[][] highFive(int[][] items) {
        int k=5;
         TreeMap<Integer,Queue<Integer>> scorelist = new TreeMap<>();
        for(int[] item : items)
        {
            int id = item[0];
            int score = item[1];
         
            if(!scorelist.containsKey(id))
                scorelist.put(id,new PriorityQueue<>((a,b) -> b-a));
            
            scorelist.get(id).add(score);
        } 
            List<int[]> list = new ArrayList<>();
            for(int id : scorelist.keySet())
            {
                int sum=0;
                for(int i=0;i<k;i++)
                {
                    sum += scorelist.get(id).poll();
                }
                    list.add(new int[] {id,sum/k});
                    
                
            }
                
        int[][] array = new int[list.size()][];
        return list.toArray(array);
        
    }
}