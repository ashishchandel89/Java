class c1 extends Thread{
    Thread t1,t2;
    public c1(){
        t1=new Thread(this);
        t2=new Thread(this);

        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.start();
        t2.start();
    }
    public void run(){
        try{
           
            if(Thread.currentThread().getName().equals("Thread1")){   
                 while (true){  //compare kiya yha Thread1 ke sath matalab if kya current thread Thread1 ke equal hai
                for(int i=1;i<=26;i++){         //agr hai to no print karaye after 2 sec.
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            }
            }   //isme no.print honge after 2 sec ab ye time barbad nahi karega jo 2 sec hote me a
            else if(Thread.currentThread().getName().equals("Thread2")){
                while(true){
                for(int i=97;i<=122;i++){
                    System.out.println("\t"+(char)i);
                    Thread.sleep(1000);
                }
            }
            }
        }catch(Exception e){

        }
    }
}
public class a77 {
    public static void main(String []args){
        c1 obj=new c1();

    }
}
