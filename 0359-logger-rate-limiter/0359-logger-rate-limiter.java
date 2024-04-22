class Logger {
    private Map<String,Integer> mp;
    public Logger() {
      mp = new HashMap<String,Integer>();  
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!this.mp.containsKey(message))
        {
            mp.put(message,timestamp);
            return true;
        }
       
            Integer oldtimestamp = this.mp.get(message);
            if(timestamp >= oldtimestamp + 10)
            {
                this.mp.put(message,timestamp);
                return true;
            }
            else
                return false;
        
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */