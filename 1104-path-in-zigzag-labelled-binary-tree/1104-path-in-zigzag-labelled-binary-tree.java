class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int current_level=0;
        int level=1;
        List<Integer> output = new ArrayList<>();
    
        while(current_level < label)
        {
            current_level += level;
            level *= 2;   
        }
        level = level/2;
      
        while(label != 1)
        {
            output.add(label);
            int comp = 3*level-label-1;
                int parent = (comp)/2;
            label = parent;
            level = level/2;
        }
        output.add(1);
        Collections.sort(output);
        return output;
        
    }
}