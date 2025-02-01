import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class e {
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
  
  private int[][][] l = new int[][][] { { 
        { 400, 80 }, { 900, 220 }, { 1500, 60 }, { 2100, 128 }, { 2600, 140 }, { 3100, 150 }, { 3700, 100 }, { 4200, 230 }, { 4700, 128 }, { 5300, 160 }, 
        { 5900, 140 }, { 6400, 70 }, { 7000, 180 }, { 7600, 150 }, { 8200, 128 }, { 8700, 80 }, { 9200, 160 }, { 9700, 140 }, { 10400, 170 }, { 10900, 110 }, 
        { 11600, 160 }, { 12300, 110 }, { 12800, 190 }, { 13400, 130 }, { 13900, 60 }, { 14600, 30 }, { 15100, 150 }, { 15600, 240 }, { 16100, 128 }, { 16600, 128 }, 
        { 17500, 100 } }, { 
        { 300, 180 }, { 800, 220 }, { 1300, 90 }, { 2000, 128 }, { 2500, 40 }, { 3200, 150 }, { 4000, 140 }, { 4800, 200 }, { 5300, 180 }, { 5800, 160 }, 
        { 6500, 128 }, { 7000, 180 }, { 7500, 130 }, { 8000, 90 }, { 8700, 80 }, { 9200, 150 }, { 9700, 120 }, { 10200, 180 }, { 10700, 90 }, { 11400, 120 }, 
        { 11900, 120 }, { 12400, 160 }, { 13000, 120 }, { 13700, 160 }, { 14300, 120 }, { 15100, 70 }, { 15600, 190 }, { 16300, 140 }, { 16800, 128 }, { 17500, 60 }, 
        { 18200, 80 }, { 18700, 220 }, { 19300, 100 }, { 19900, 30 }, { 20400, 180 }, { 20900, 160 }, { 21400, 80 }, { 21900, 140 }, { 22400, 30 }, { 22900, 120 }, 
        { 23600, 150 }, { 24100, 70 }, { 24600, 140 }, { 25100, 30 }, { 25700, 180 }, { 26500, 128 } }, { 
        { 400, 180 }, { 1200, 256 }, { 1700, 60 }, { 2200, 128 }, { 2900, 128 }, { 3400, 0 }, { 4000, 100 }, { 4600, 200 }, { 5400, 128 }, { 6200, 200 }, 
        { 6800, 100 }, { 7300, 0 }, { 7900, 200 }, { 8700, 128 }, { 9400, 100 }, { 10200, 128 }, { 11000, 60 }, { 11600, 180 }, { 12400, 128 }, { 13000, 0 }, 
        { 13800, 180 }, { 14800, 128 }, { 15800, 100 }, { 16400, 200 }, { 17200, 60 }, { 18200, 128 }, { 19000, 180 }, { 20000, 40 }, { 20800, 128 }, { 21400, 128 }, 
        { 22200, 100 }, { 23200, 60 }, { 23800, 180 }, { 24400, 180 }, { 25000, 100 }, { 25900, 128 }, { 26800, 200 }, { 27400, 180 }, { 28000, 100 }, { 28600, 200 }, 
        { 29200, 128 }, { 29800, 0 }, { 30500, 128 }, { 31000, 180 }, { 31600, 70 }, { 32100, 150 }, { 32900, 110 }, { 33500, 230 }, { 34000, 70 }, { 34600, 128 }, 
        { 35200, 80 }, { 35700, 128 } } };
  
  int m;
  
  int n;
  
  public e(l paraml, int paramInt) {
    this.a = paraml;
    this.i = paramInt;
    this.m = 0;
    this.d = this.l[paraml.J][this.m][0];
    this.b = this.d;
    this.c = new Random();
    this.f = this.l[paraml.J][this.m][1];
    this.n = (this.l[paraml.J]).length;
    if (g.B)
      JSVenice.b = !bool; 
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
      this.a.mb.c();
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


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */