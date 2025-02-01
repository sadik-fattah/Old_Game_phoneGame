import java.util.Random;
import javax.microedition.lcdui.Graphics;

class a {
  private final l a;
  
  private int b;
  
  private int c = 0;
  
  private int d;
  
  private int e;
  
  private int[] f = new int[] { -1, 5 };
  
  private Random g;
  
  private int h;
  
  private int i;
  
  a(l paraml, int paramInt1, int paramInt2) {
    this.a = paraml;
    this.i = paramInt2;
    this.h = paramInt1;
    this.b = this.h;
    this.g = new Random();
  }
  
  void a() {
    this.b = this.h;
  }
  
  public void b() {
    if (this.b < this.a.K + 100) {
      this.b += 500;
      this.d = this.c;
      this.c = this.g.nextInt() & 0x64;
      if (this.c <= 10 && this.d != 1) {
        this.c = 1;
        if (JSVenice.b) {
          this.c = 0;
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    this.c = 0;
  }

  int c() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #5
    //   5: aload_0
    //   6: getfield a : Ll;
    //   9: getfield Cb : [[I
    //   12: aload_0
    //   13: getfield i : I
    //   16: aaload
    //   17: iconst_4
    //   18: iaload
    //   19: aload_0
    //   20: getfield a : Ll;
    //   23: getfield db : [I
    //   26: aload_0
    //   27: getfield e : I
    //   30: iaload
    //   31: imul
    //   32: bipush #16
    //   34: ishr
    //   35: istore_1
    //   36: iconst_2
    //   37: newarray int
    //   39: dup
    //   40: iconst_0
    //   41: ldc 100000000
    //   43: iastore
    //   44: dup
    //   45: iconst_1
    //   46: iconst_m1
    //   47: iastore
    //   48: astore_2
    //   49: iconst_0
    //   50: istore_3
    //   51: iload #5
    //   53: ifeq -> 99
    //   56: iload_1
    //   57: aload_0
    //   58: getfield a : Ll;
    //   61: getfield Cb : [[I
    //   64: iload_3
    //   65: aload_0
    //   66: getfield i : I
    //   69: iadd
    //   70: aaload
    //   71: iconst_4
    //   72: iaload
    //   73: isub
    //   74: invokestatic abs : (I)I
    //   77: istore #4
    //   79: iload #4
    //   81: aload_2
    //   82: iconst_0
    //   83: iaload
    //   84: if_icmpge -> 96
    //   87: aload_2
    //   88: iconst_0
    //   89: iload #4
    //   91: iastore
    //   92: aload_2
    //   93: iconst_1
    //   94: iload_3
    //   95: iastore
    //   96: iinc #3, 1
    //   99: iload_3
    //   100: iconst_4
    //   101: if_icmplt -> 56
    //   104: aload_0
    //   105: getfield i : I
    //   108: iconst_2
    //   109: iadd
    //   110: iload #5
    //   112: ifne -> 77
    //   115: ireturn

  }
  
  public void a(Graphics paramGraphics) {
    int i = this.b - this.a.K;
    if (i < 0 || i > 530)
      return; 
    this.e = (13924 - 25 * i) / (118 + i);
    if (this.e < 1 || this.e > 109)
      return; 
    int j = c();
    int k = this.a.cb[this.e] + (this.f[0] * this.a.bb[this.e] - this.a.Cb[j][2]) / 2;
    this.a.a(paramGraphics, j, k, 108 + this.e - this.a.Cb[j][3]);
    k = this.a.cb[this.e] + (this.f[1] * this.a.bb[this.e] - this.a.Cb[j][2]) / 2;
    this.a.a(paramGraphics, j, k, 108 + this.e - this.a.Cb[j][3]);
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */