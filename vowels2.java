

package stringlevel1.pkg2;
import java.util.Scanner;
import java.util.Arrays;
public class vowels2 {
      public static void main(String[] args) {
        
    
      Scanner sc=new Scanner(System.in);
      String n;
          System.out.println("enter the string");
          n=sc.nextLine();
          char chr[]=n.toCharArray();
          char[] c=new char[chr.length];
          
          for(int i=0;i<n.length();i++){
                 
              if(chr[i]=='a' || chr[i]=='e' || chr[i]=='i' || chr[i]=='o' || chr[i]=='u'){
                  
                  c[i]='z';
                  
              }
              else{
                  c[i]=chr[i];
              }
          }
          System.out.println("new string:");
          for(int i=0;i<n.length();i++){
          System.out.print(c[i]+" ");
         
      }
}
}