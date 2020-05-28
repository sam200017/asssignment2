

package stringlevel1.pkg2;
import java.util.Scanner;

public class reverse1 {

   
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        s=sc.nextLine();
        char c;
        int l=s.length();
        String n=" ";
        for(int i=l-1;i>=0;i--){
            c=s.charAt(i);
            n+=c;
        }
        System.out.println("reverse="+n);
        
        
        
       
    }
    
}
