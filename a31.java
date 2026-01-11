//math class
public class a31 {
    protected a31(){}
    public static void main(String args[]){
        int  num=59;
        float num1=12.6f;
        System.out.println(Math.ceil(num));// answer=59.
        System.out.println(Math.ceil(num1));// answer=13.because, ceiling keyword will take next digit.
        System.out.println(Math.floor(num));// answer=59.
        System.out.println(Math.floor(num1));// answer=12.because, floor keyword will take previous digit.
        System.out.println(Math.round(num));// answer=59.
        System.out.println(Math.round(num1));// answer=13. beacuse, round keyword will take if decimal digit is smaller than 5 then it will take previous digit and if that digit is greater than 5 then it will take next digit.
    }
}
