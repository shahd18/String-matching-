
package stringmatching;

public class StringMatching {

    //char array
    public static void main(String[] args) {
        
        String T = "akfkdfdsfsfsdfhsdfhsdfhdsfhdshfdsfhskhfsdfjksd";
        String P = "dsfh";
        
       
                
        char[] ch = new char[T.length()];
        char[] ch2 = new char[P.length()];
        
  
        // Copying character by character into array
        // using for each a loop
        for (int i = 0; i < T.length(); i++) {
            ch[i] = T.charAt(i);
        }
        for (int i = 0; i < P.length(); i++) {
            ch2[i] = P.charAt(i);
        }
        
        int position = match(ch, ch2);
        int endindex = position+1;
        if(position == -1){
                System.out.println("No match found");
        }else{
                System.out.println("Match found at position:" + (position+1));
                System.out.println("End at the position:" + (endindex + ch2.length));
        }
                
        
    }
    
    public static int match(char[] T , char[] P){

        int n = T.length;//length of the text
        int m = P.length;//length of the pattern;

        //loop condition
        for(int i=0;i<n-m;i++){
            //initialization of j
            int j=0;
            while((j < m) && (T[i+j] == P[j])){
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
	}
    }
    
    
    //string
        /*
    public static int bruteforce(String T,String P){
        int n = T.length();
        int m = P.length();
 
        for(int i=0;i<n-m;i++){
 
            int j=0;
            while(j < m && T.charAt(i+j) == P.charAt(j)){
                j++;
            }
            if(j == m){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        String text1 = "akfkdfdsfsfsdfhsdfhsdfhdsfhdshfdsfhskhfsdfjksd";	
        String text12 = "dsfh";

        int position = bruteforce(text1,text12);

        int endindex = position+1;
        if(position == -1){
            System.out.println("Pattern is not matched in the text");
        }else{
            System.out.println("Found at position:" + (position+1));
            System.out.println("End at the position:" + (endindex + text12.length()));
        }
    }
    
    
}

*/