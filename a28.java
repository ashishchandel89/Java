class num_wrap{
protected num_wrap(){}
}
public class a28{
public static void main(String args[])
{
    String number=args[0]; 
    Byte by_num=Byte.valueOf(number);
    Short sh_num=Short.valueOf(number);
    Integer int_num=Integer.valueOf(number);
    Long lg_num=Long.valueOf(number);
    System.out.println("output");
    System.out.println(by_num);
    System.out.println(sh_num);
    System.out.println(int_num);
    System.out.println(lg_num);
}
}
