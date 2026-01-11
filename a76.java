
public class a76 extends Thread{
    public static void main(String [] args){
        a76 obj=new a76();
        obj.create();       //call crete method which is declare down
        System.out.println("<--------This is main thread--------->");      //ye main thread hai matlab ye hmesha chalega.

    }
    public void create(){
        Thread obj2=new Thread(this);       //create new thread
        obj2.start();           //in built method start 
    }
    public void run(){      //yha child thread hai.
        while(true){    //ye method infinte chalega.
            try{
                System.out.println("hello !"); 
                Thread.sleep(500);      //yha par sleep method matlab jo bhi message hai use kitni der delay karwana hai 1000 milisecond matalb after 1 second
            }catch(InterruptedException e){

            }
        }
    }
}
