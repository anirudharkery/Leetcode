class Solution {
    public int findTheWinner(int n, int k) {
        int count=0;
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            arr.add(i);
        }
       
        while(arr.size() >1)
        {
        for(int i=0;i< arr.size();i++)
        {
            count++;
            
            if(count == k)
            {
                arr.remove(i);
                i--;
                count=0;
            }
            if(arr.size() ==1)
                return arr.get(0);
        }
        }
        return arr.get(0);
    }
}