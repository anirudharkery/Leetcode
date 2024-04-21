class Solution {
    
         final int UP = 0;
         final int LEFT = 1;
         final int RIGHT = 3;
         final int DOWN = 2;
        
        final int Orgposition = UP;
        
      
    
    public boolean isRobotBounded(String instructions) {
        
          int curr_position = Orgposition;
        
        
        int numrows = 0;
        int numcols = 0;
        
        
        for(char c : instructions.toCharArray())
        {
            
            if(c == 'G')
            {
                
                if(curr_position == UP)
                {
                    numrows--;
                }
                    
                if(curr_position == LEFT)
                {
                    numcols--;
                }
                
                if(curr_position == RIGHT)
                {
                     numcols++;
                }
                
                if(curr_position == DOWN)
                {
                    numrows++;
                }
                
            }
            
           else if(c == 'R')
            {
                curr_position--;
                if(curr_position < UP)
                    curr_position =  RIGHT;
                
                
            }
            
           else if(c == 'L')
            {
                curr_position++;
                if(curr_position > RIGHT)
                    curr_position =  UP;
            }
            
        }
        
        boolean changeposition = numrows !=0 || numcols != 0;
        
        if(!changeposition)
            return true;
        
       else if(curr_position != Orgposition)
        return true;
            
        return false;
    } 
        
    }
