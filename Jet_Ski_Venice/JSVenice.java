import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class JSVenice extends MIDlet {
  public l a = null;
  
  public static boolean b;
  
  public void startApp() throws MIDletStateChangeException {
    if (this.a == null) {
      this.a = new l(this);
      Display.getDisplay(this).setCurrent((Displayable)this.a);
      this.a.b();
      if (b) {
        Display.getDisplay(this).setCurrent((Displayable)this.a);
        this.a.h();
        return;
      } 
      return;
    } 
    Display.getDisplay(this).setCurrent((Displayable)this.a);
    this.a.h();
  }
  
  public void pauseApp() {
    this.a.g();
    notifyPaused();
  }
  
  void a() {
    try {
      destroyApp(true);
    } catch (MIDletStateChangeException mIDletStateChangeException) {}
  }
  
  public void destroyApp(boolean paramBoolean) throws MIDletStateChangeException {
    Display.getDisplay(this).setCurrent(null);
    if (this.a != null)
      this.a.c(); 
    notifyDestroyed();
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/JSVenice.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */