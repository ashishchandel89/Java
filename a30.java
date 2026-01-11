//string buffer.
public class a30 {
    protected a30(){}
    public static void main(final String args[]){
        StringBuffer buf=new StringBuffer("aptech");
        buf.append(" education");
        buf.append(10);
        int index=6;
        buf.insert(index," computer");
        index=25;
        buf.setCharAt(index,'.');
        int start=24;
        int end=27;
        buf.replace(start,end,"15");
        String s=buf.toString();
        System.out.println(s);
    }
}
