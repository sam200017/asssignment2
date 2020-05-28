

package stringlevel1.pkg2;
import java.util.Scanner;
import java.util.Arrays;


public class frequencycharacter{
    public static void main(String[] args) 
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string;");
        s=sc.nextLine();
        
      char[] c=s.toCharArray();
     
       
      for(int i=0;i<s.length();i++)
      {
          int t=1;
          for(int j=i+1;j<s.length();j++)
          {
            
              if(c[i]==c[j])
              {
                  t++;
                  c[j]='0';
                  
                }
             
          }
        if(t>0 && c[i]!='0')
        {System.out.println(c[i]+"-"+t);
      }
    }
}
}
        

