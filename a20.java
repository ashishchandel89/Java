//string comparision in java.
public class a20 {
    public static void main(String args[]){
        String s1="ashish";
        String s2="ashish";
        if(s1==s2)
        System.out.println("same");
        else 
        System.out.println("not same"); //it shows same. Because (==) will check strings address. So, after checking in RAM it has same name. So, it will store on same address. 

        String s3=new String("ashish");
        String s4=new String("ashish");
        if(s3==s4)
        System.out.println("same");
        else
        System.out.println("not same"); //it shows not same. Because it store randomly.So, with (==) it matches adderess. So, both addresses doesn't match.
        if(s3.equals(s4))
        System.out.println("same");
        else 
        System.out.println("not same"); //it shows same. because (s3.eqaul(s4)) check value in RAM instead of address.
    }
}
