class Solution {
    public String reformatDate(String date) {
        
        String[] str = date.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i=2;i>=0;i--)
        {
            if(i==2)
            {
                sb.append(str[i]).append("-");
            }
             if(i==1)
            {
                sb.append(index(str[i])).append("-");
            }
            if(i==0)
            {
                if(str[i].length() == 3)
                {
                    sb.append("0").append(str[i].charAt(0));
                }
                else
                {
                    sb.append(str[i].charAt(0));         
                    sb.append(str[i].charAt(1));    
                }
            }      
        }
         return sb.toString();
    }
        
        public String index(String s)
        {
            String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            
                for(int i=0;i<=11;i++)
                {
                    if(s.equals(month[i]))
                    {
                        if(i<9)
                            return ("0"+(i+1)+"");
            
                        else
                            return ((i+1)+"");
                    }
                }
            return "";
    }
}
