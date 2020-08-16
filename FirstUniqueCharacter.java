public int findFirstUiqueCharacterIndex(Sring s)
{
HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,i);
            }
            else
            {
                map.put(c,-1);
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for(char c: map.keySet())
        {
            if(map.get(c) > -1 && map.get(c)<min)
            {
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE?-1:min;
        
       }
