class Solution {
    public int minimumCardPickup(int[] cards) {
//         Map<Integer,Integer> mp = new HashMap<>();
//         int max = Integer.MAX_VALUE;
        
//        for(int i=0;i< cards.length;i++)
//        {
//            if(mp.containsKey(cards[i]))
//            {
//                int ans = i - mp.get(cards[i]) +1;
//                max = Math.min(ans,max);
//            }
//            else
//                mp.put(cards[i],i);
//        }
//         return max==Integer.MAX_VALUE ? -1:max;
                int ans = Integer.MAX_VALUE;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<cards.length ; i++){
            if(map.containsKey(cards[i])){
                int val =  i-map.get(cards[i])+1;
                ans = Math.min(val,ans);
            } 
             map.put(cards[i] , i);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;

    }
}