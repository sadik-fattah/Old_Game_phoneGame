import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class c {
  private final l a;
  
  private int b;
  
  private Random c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  int[][][] l = new int[][][] { { 
        { 1100, 180 }, { 2200, 210 }, { 3300, 135 }, { 4400, 60 }, { 5500, 140 }, { 6500, 220 }, { 7700, 200 }, { 8800, 128 }, { 9900, 20 }, { 11000, 100 }, 
        { 12100, 220 }, { 13300, 80 }, { 14300, 128 }, { 15400, 220 }, { 16500, 140 }, { 17600, 200 } }, { 
        { 2100, 250 }, { 4000, 20 }, { 5900, 90 }, { 7800, 40 }, { 9700, 230 }, { 11600, 150 }, { 13100, 200 }, { 15700, 50 }, { 17700, 150 }, { 19600, 100 }, 
        { 21500, 240 }, { 23200, 180 }, { 24900, 120 } }, { 
        { 2000, 60 }, { 5000, 210 }, { 8000, 40 }, { 11000, 220 }, { 14000, 128 }, { 17000, 200 }, { 20000, 200 }, { 23000, 128 }, { 26000, 20 }, { 29000, 100 }, 
        { 32000, 220 }, { 35000, 80 } } };
  
  int m;
  
  int n;
  
  public c(l paraml, int paramInt) {
    this.a = paraml;
    this.i = paramInt;
    this.m = 0;
    this.d = this.l[paraml.J][this.m][0];
    this.b = this.d;
    this.c = new Random();
    this.f = this.l[paraml.J][this.m][1];
    this.n = (this.l[paraml.J]).length;
  }
  
  void a() {
    this.b = this.d;
    this.m = 0;
    this.f = this.l[this.a.J][this.m][1];
    this.n = (this.l[this.a.J]).length;
  }
  
  public void b() {
    this.h = this.b - this.a.K;
    if (this.h < 100 && this.h > 50 && this.a.mb.o > this.g && this.a.mb.o < this.g + this.a.Cb[this.i][3]) {
      this.a.mb.d();
      this.m++;
      if (this.m < this.n - 1) {
        this.b = this.l[this.a.J][this.m][0];
        this.f = this.l[this.a.J][this.m][1];
      } 
    } 
    if (this.b < this.a.K - 50 && this.m < this.n - 1) {
      this.b = this.l[this.a.J][this.m][0];
      this.f = this.l[this.a.J][this.m][1];
      this.m++;
    } 
  }
  
  int c() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #4
    //   5: aload_0
    //   6: aload_0
    //   7: getfield a : Ll;
    //   10: getfield Cb : [[I
    //   13: aload_0
    //   14: getfield i : I
    //   17: aaload
    //   18: iconst_3
    //   19: iaload
    //   20: aload_0
    //   21: getfield a : Ll;
    //   24: getfield db : [I
    //   27: aload_0
    //   28: getfield e : I
    //   31: iaload
    //   32: imul
    //   33: bipush #16
    //   35: ishr
    //   36: putfield j : I
    //   39: aload_0
    //   40: aload_0
    //   41: getfield a : Ll;
    //   44: getfield Cb : [[I
    //   47: aload_0
    //   48: getfield i : I
    //   51: aaload
    //   52: iconst_4
    //   53: iaload
    //   54: aload_0
    //   55: getfield a : Ll;
    //   58: getfield db : [I
    //   61: aload_0
    //   62: getfield e : I
    //   65: iaload
    //   66: imul
    //   67: bipush #16
    //   69: ishr
    //   70: putfield k : I
    //   73: iconst_2
    //   74: newarray int
    //   76: dup
    //   77: iconst_0
    //   78: ldc 100000000
    //   80: iastore
    //   81: dup
    //   82: iconst_1
    //   83: iconst_m1
    //   84: iastore
    //   85: astore_1
    //   86: iconst_0
    //   87: istore_2
    //   88: iload #4
    //   90: ifeq -> 136
    //   93: aload_0
    //   94: getfield j : I
    //   97: aload_0
    //   98: getfield a : Ll;
    //   101: getfield Cb : [[I
    //   104: iload_2
    //   105: aload_0
    //   106: getfield i : I
    //   109: iadd
    //   110: aaload
    //   111: iconst_3
    //   112: iaload
    //   113: isub
    //   114: invokestatic abs : (I)I
    //   117: istore_3
    //   118: iload_3
    //   119: aload_1
    //   120: iconst_0
    //   121: iaload
    //   122: if_icmpge -> 133
    //   125: aload_1
    //   126: iconst_0
    //   127: iload_3
    //   128: iastore
    //   129: aload_1
    //   130: iconst_1
    //   131: iload_2
    //   132: iastore
    //   133: iinc #2, 1
    //   136: iload_2
    //   137: iconst_5
    //   138: if_icmplt -> 93
    //   141: aload_0
    //   142: getfield i : I
    //   145: aload_1
    //   146: iconst_1
    //   147: iaload
    //   148: iadd
    //   149: iload #4
    //   151: ifne -> 117
    //   154: ireturn
  }
  
  public void a(Graphics paramGraphics) {
    boolean bool = false;
    int i = this.b - this.a.K;
    if (i < -50 || i > 530)
      return; 
    this.e = (13924 - 25 * i) / (118 + i);
    if (this.e < 1 || this.e > 196)
      return; 
    int j = c();
    this.g = -2 + this.a.cb[this.e] + (this.f * this.a.bb[this.e] >> 7) - this.a.Cb[j][3] / 2;
    this.a.a(paramGraphics, j, this.g, 108 + this.e - this.a.Cb[j][4]);
  }
  
  int d() {
    return this.b - this.a.K;
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */