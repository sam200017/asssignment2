

package stringlevel1.pkg2;


public class concat2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        String s3="";
        for(int i=s1.length()-1;i>=0;i--){
            s3+=s2.charAt(i);
        }
        System.out.println("atring after concat:"+"\n"+s1+s3);
}
    
}
