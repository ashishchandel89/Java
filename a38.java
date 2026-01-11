//automatic passward generate.
import java.util.Random;
public class a38{
    public static void main(String args[]){

        int count=0;
        double d;
        String pass="";
        Random obj=new Random();
        int a;
        while(true)
        {
            d=obj.nextDouble();
            d=d*122;
            a=(int)d;
                    if(a>=0 && a<=9){
                        pass=pass+a;
                        count++;
                    }
                    else if((a>=97 && a>=122) || (a>=65 && a<=90))
                    {
                        pass=pass+(char)a;
                        count++;
                    }
                    if(count==6)
                    break;
            
                }
              
                System.out.println("passward: "+pass);
            }
        }
    