class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=1;i<=26;i++){
            char ch=(char)(96+i);
            if(sentence.indexOf(ch)==-1)
                return false;
        }
        return true;
    }
}