import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class j {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private Image d;
  
  private int e;
  
  private int f;
  
  private int g = 90;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private l k;
  
  private int l;
  
  private int m;
  
  private int n = 5120;
  
  private int o = 20;
  
  final int p = 108;
  
  final int q = 90;
  
  final int r = 108;
  
  final int s = 16;
  
  final int t = 124;
  
  final int u = 36;
  
  final int v = 9947596;
  
  public j(l paraml) {
    this.k = paraml;
    Object object = null;
    try {
      this.b = Image.createImage("/immagini/mi.png");
      paraml.I.a(10);
      this.a = Image.createImage("/immagini/ms.png");
      paraml.I.a(15);
      this.c = Image.createImage("/immagini/cam.png");
      this.d = Image.createImage("/immagini/ven.png");
      paraml.I.a(20);
    } catch (IOException iOException) {
      System.err.println(iOException);
    } 
    this.i = -(this.d.getWidth() + 145);
    this.j = 290 + this.d.getWidth();
  }
  
  void a(Graphics paramGraphics, int paramInt) {
    paramGraphics.setColor(9947596);
    this;
    this;
    paramGraphics.fillRect(0, 0, 120, 160);
    paramGraphics.drawImage(this.d, this.i - this.j + 145, 108 - this.d.getHeight(), this.k.j);
    paramGraphics.drawImage(this.c, this.i - this.j + 145 + 143, 108 - this.c.getHeight() - 17, this.k.j);
    paramGraphics.drawImage(this.d, this.i + 145, 108 - this.d.getHeight(), this.k.j);
    paramGraphics.drawImage(this.c, this.i + 145 + 143, 108 - this.c.getHeight() - 17, this.k.j);
  }
  
  public void a(Graphics paramGraphics) {
    this;
    this;
    paramGraphics.setClip(0, 0, 120, 160);
    a(paramGraphics, this.i);
    this;
    paramGraphics.setClip(0, 108, 120, 16);
    paramGraphics.drawImage(this.a, this.m / 2 - 90, 108 - this.e / 2 * 16, this.k.j);
    paramGraphics.drawImage(this.a, this.m / 2, 108 - this.e / 2 * 16, this.k.j);
    paramGraphics.drawImage(this.a, this.m / 2 + 90, 108 - this.e / 2 * 16, this.k.j);
    this.e++;
    if (this.e > 3)
      this.e = 0; 
    this;
    paramGraphics.setClip(0, 124, 120, 36);
    paramGraphics.drawImage(this.b, this.o - 90, 124 - this.f / 2 * 36, this.k.j);
    paramGraphics.drawImage(this.b, this.o, 124 - this.f / 2 * 36, this.k.j);
    paramGraphics.drawImage(this.b, this.o + 90, 124 - this.f / 2 * 36, this.k.j);
    this.f++;
    if (this.f > 9)
      this.f = 0; 
  }
  
  void a(int paramInt) {
    paramInt = -paramInt >> 1;
    this.h += paramInt;
    this.l += paramInt * 3;
    this.n += paramInt * 3;
    this.l = a(this.l, 23040);
    this.n = a(this.n, 23040);
    this.h = a(this.h, this.j << 8);
    this.i = this.h >> 8;
    this.m = this.l >> 8;
    this.o = this.n >> 8;
  }
  
  int a(int paramInt1, int paramInt2) {
    if (paramInt1 < 0) {
      paramInt1 += paramInt2;
      if (JSVenice.b) {
        if (paramInt1 > paramInt2)
          paramInt1 -= paramInt2; 
        return paramInt1;
      } 
      return paramInt1;
    } 
    if (paramInt1 > paramInt2)
      paramInt1 -= paramInt2; 
    return paramInt1;
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */