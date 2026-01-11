 //strings options.
 public class a21 {
    public static void main(String args[])
    {
        String s1="aptech computer education";
        System.out.println("1. "+s1);                       //'"Full name", beacuse there we will input simpley string'.
        System.out.println("2. "+s1.charAt(5));             //'"h", beacuse 'h' is present on 5th position'
        System.out.println("3. "+s1.indexOf('r'));          //'"14", beacuse r is present on 14th position in this name'
        System.out.println("4. "+s1.split(" "));            //'"aptech,computer,education"'
        System.out.println("5. "+s1.replace('h','k'));      //'"apteck computer education"'
        System.out.println("6. "+s1.substring(3));          //'"ech computer education"'
        System.out.println("7. "+s1.substring(3,10));       //'"ech com", because it will start from 3rd character and end on 10th character'
        System.out.println("8. "+s1.toLowerCase());         //'"aptech computer education"'
        System.out.println("9. "+s1.toUpperCase());         //'"APTECH COMPUTER EDUCATION"'
        System.out.println("10. "+s1.lastIndexOf('e'));     //'"16", beacause it will start counting from last of index but answer give us in starting counting'
        System.out.println("11. "+s1.contains("computer")); //'"true", because it will check that, Is computer is pesent in it?'

    }
}
