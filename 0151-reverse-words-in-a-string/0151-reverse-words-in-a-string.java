class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        String[] arr = s.split("\\s+");
        Collections.reverse(Arrays.asList(arr));
        
        return String.join(" ",arr);
        
    }
}