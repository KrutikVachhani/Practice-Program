public class HayStack {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";

        int len1 = haystack.length(); 
        int len2 = needle.length();
        
        HayStack hStack = new HayStack();

        System.out.println(hStack.SubStr(haystack, needle, len1, len2));
        
    }
    public int SubStr(String haystack,String needle, int len1, int len2){
        for(int i=0; i<len1-len2; i++){
            if(haystack.substring(i, i+len2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
