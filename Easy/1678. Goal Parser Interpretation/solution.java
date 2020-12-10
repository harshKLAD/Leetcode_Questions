class Solution {
    public String interpret(String command) {
        HashMap<String,String> map = new HashMap<String,String>();
        
        map.put("G","G");
        map.put("()","o");
        map.put("(al)","al");
        
        String out = "";
        
        for(int i = 0; i < command.length(); i++){
            String str = command.substring(i,i+1);
        
            if(str.equals("G")){
                out = out + map.get(str);
                continue;
            }
            
            if(i <= command.length() - 2){
                str = command.substring(i,i+2);
                System.out.println(str);
                
                if(str.equals("()")){
                    out = out + map.get(str);
                    i++;
                    continue;
                }
                
                if(i <= command.length() - 4){
                    str = command.substring(i,i+4);
                    System.out.println(str);
                    
                    if(str.equals("(al)")){
                    out = out + map.get(str);
                    i = i + 3;
                    continue;
                }
                
                }
                
            }            
        }
        
        return out;
    }
}