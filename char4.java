

package stringlevel1.pkg2;

import java.util.Arrays;
public class char4 {
    public static void main(String[] args) {
        //char4 o=new char4();
        int c=dup('a',"java");
        System.out.println(c);
    }
  
  public  static int dup(char ch,String s){
        //char c1[]=new char[c.length];
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            int t=0;
   
            for(int j=0;j<c.length;j++){
                if(c[j]==ch){
                    t++;
                }
                //if(t==1){
                  //  retur; 
                }
            return t;
            }
        return 0;
        
       
    
    
  }
}

    