import java.util.Scanner;
public class practice3 {
    public static void main(String args[]){
        String str[]=new String[]{"flower","fly","flight","flown"};
        String s1;
        String s2="fl";
        for(int i=0;i<str.length-1;i++){
            String str2=str[i];
            for(int j=0;j<=2;j++){
                s1=str2.charAt(j);
            }
        }
         if(s1.equals(s2)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
    }
}
