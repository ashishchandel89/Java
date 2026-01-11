//runtime method and executation of calculator program.
public class a32{
    public static void main(String args[]){
        Runtime objRun=Runtime.getRuntime();
        Process objProcess=null;
        try{
            objProcess=objRun.exec("calc.exe");
        }
        catch(Exception e){
            System.out.println("Error executing Calculator" );//calculator open.
        }
    }

}