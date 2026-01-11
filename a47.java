//monthtest.

import java.util.*;
public class a47{
    public static void main(String args[]){ 
        int month=0,days=0;
        String m=args[0];
        int y=Integer.parseInt(args[1]);
        System.out.println(m+" "+y);
        if(m.equals("jan"))
        {
            month=1;
            days=31;
        }
        else if(m.equals("feb"))
        {
            month=2;
         if(y%4==0)
            days=29;
         
         else
         days=28;
        }
        else if(m.equals("march"))
        {
            month=3;
            days=31;
        }
        else if(m.equals("april"))
        {
            month=4;
            days=30;
        }
        else if(m.equals("may"))
        {
            month=5;
            days=31;
        }
        else if(m.equals("june"))
        {
            month=6;
            days=30;
        }
        else if(m.equals("july"))
        {
            month=7;
            days=31;
        }
        else if(m.equals("aug"))
        {
            month=8;
            days=31;
        }
        else if(m.equals("sep"))
        {
            month=9;
            days=30;
        }
        else if(m.equals("oct"))
        {
            month=10;
            days=31;
        }
        else if(m.equals("nov"))
        {
            month=11;
            days=30;
        }
        else if(m.equals("dec"))
        {
            month=12;
            days=31;
        }
        //System.out.println(month+" "+days);
        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
        GregorianCalendar obj1=new GregorianCalendar(y,month-1,1);
        int wd=obj1.get(Calendar.DAY_OF_WEEK);
        int c=0;
        for(int a=1;a<=wd;a++)
        {
            System.out.print("\t");
            c++;
        }
        
        for(int a=1;a<=days;a++)
        {
            if(c==8)
            {
            System.out.println();
            System.out.print("\t"+a+"\t");    
            c=1;
        }
        else
        {
            System.out.print(a+"\t");
        }
        c++;
        

        }
            }
       
    
}