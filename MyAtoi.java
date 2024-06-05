public class MyAtoi {
    public static void main(String[] args) {
        String str = "  -042";

        String string = str.trim();

        String str2 = "";
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == '-'){
                str2+=string.charAt(i);
            }
            else if(string.charAt(i) == '0'){
                continue;
            }
            else{
                str2+=string.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
