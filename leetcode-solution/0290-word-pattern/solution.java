class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> WordToChar = new HashMap<>();

        for(int i = 0; i< pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(ch)){
                if(!charToWord.get(ch).equals(word)){
                    return false;
                }
            }else{
                charToWord.put(ch, word);
            }

            if(WordToChar.containsKey(word)){
                if(WordToChar.get(word) != ch){
                    return false;
                }
            }else{
                WordToChar.put(word, ch);
            }

        }
        return true;
    }
}
