public class vactori {
    
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) { 
            System.out.println(permutation);
             return;
            }
    
            for(int i = 0; i < str.length(); i++) {
                char currChar = str.charAt(i);
                // Remove current character and pass remaining string
                String newStr = str.substring(0, i) + str.substring(i + 1);
                printPerm(newStr, permutation + currChar);
            }    
        }
    
    public static void main(String[] args) {
    String str = "abc";
     printPerm(str, "");
    }
}