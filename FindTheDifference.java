public char findTheDifference(String s, String t) {
        //sorting works the best here
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        int i = 0;
        while(i<s.length())
        {
            if(array1[i]!=array2[i])
            {
                return array2[i];
            }
            i+=1;
        }
        return array2[i];
    }
