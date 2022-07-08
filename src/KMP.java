public class KMP {

    public int[] computelps(String pattern){
        int len = pattern.length();
        int[] lps = new int[len];
        int index=0;
        for(int i=1;i<len;){
            if(pattern.charAt(index) == pattern.charAt(i)){
                i++;
                index++;
            }
            else{
                if(index!=0){
                    index = lps[index-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String pattern = "abcdeabfabc";
        String text = "abcdeabsdjbdsbsdabcdeabfabc";
        int[] lps = new KMP().computelps(pattern);

        int j=0,i=0;
        while(i<text.length() && j<pattern.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j>0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        if(j== pattern.length()) System.out.println("true");
        else System.out.println("false");
    }
}
