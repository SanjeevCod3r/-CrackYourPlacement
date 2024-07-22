class Solution {
    public String getFreqStr(String str){
        int[] freq = new int[26];
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder freqString = new StringBuilder("");
        char c = 'a';
        for(int i: freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }
       return freqString.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        } 
        Map<String, List<String>>freqStrMap = new HashMap<>();
        for(String str: strs){
            String freqStr = getFreqStr(str);
            if(freqStrMap.containsKey(freqStr)){
                freqStrMap.get(freqStr).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                freqStrMap.put(freqStr, strList);
            }
        }
        return new ArrayList<>(freqStrMap.values());
    }
}