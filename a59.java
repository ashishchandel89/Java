//applet
//<applet code="a59" width="700" height="700"> </applet>
import java.applet.*;
import java.awt.*;
public class a59 extends Applet{
    String s1;
    public void init(){
        s1="JAVA is interesting";
    }
    public void paint(Graphics g){
        g.drawString(s1,170,180);
    }

}


