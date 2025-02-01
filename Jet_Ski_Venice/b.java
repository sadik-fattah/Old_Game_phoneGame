import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class b {
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
        { 200, 180 }, { 800, 130 }, { 1300, 100 }, { 1900, 90 }, { 2400, 220 }, { 2900, 120 }, { 3400, 128 }, { 3900, 120 }, { 4400, 110 }, { 4900, 160 }, 
        { 5600, 120 }, { 6100, 170 }, { 6800, 110 }, { 7300, 100 }, { 7800, 200 }, { 8300, 40 }, { 8900, 140 }, { 9400, 100 }, { 10100, 200 }, { 10600, 40 }, 
        { 11200, 90 }, { 11800, 60 }, { 12300, 40 }, { 13000, 150 }, { 13700, 128 }, { 14200, 40 }, { 13100, 140 }, { 13600, 128 }, { 14100, 180 }, { 14600, 200 }, 
        { 15200, 20 }, { 15700, 110 }, { 16200, 40 }, { 16700, 180 }, { 17100, 200 }, { 17800, 200 } }, { 
        { 200, 100 }, { 700, 150 }, { 1500, 200 }, { 2200, 210 }, { 2900, 150 }, { 3400, 40 }, { 3900, 90 }, { 4400, 100 }, { 5000, 130 }, { 5600, 120 }, 
        { 6100, 90 }, { 6600, 220 }, { 7100, 150 }, { 7700, 40 }, { 8200, 190 }, { 8700, 220 }, { 9400, 60 }, { 10100, 128 }, { 10600, 60 }, { 11100, 140 }, 
        { 11600, 70 }, { 12200, 110 }, { 12800, 80 }, { 13300, 128 }, { 13900, 130 }, { 14300, 30 }, { 14800, 100 }, { 15200, 200 }, { 15800, 210 }, { 16500, 70 }, 
        { 17000, 190 }, { 17500, 210 }, { 18300, 180 }, { 18800, 160 }, { 19500, 220 }, { 20100, 110 }, { 20600, 120 }, { 21100, 140 }, { 21800, 128 }, { 22300, 220 }, 
        { 22800, 40 }, { 23300, 200 }, { 23800, 40 }, { 24500, 170 }, { 25000, 128 }, { 25800, 90 }, { 26300, 60 }, { 26800, 200 } }, { 
        { 600, 128 }, { 1100, 100 }, { 1800, 200 }, { 2300, 20 }, { 3000, 236 }, { 3400, 200 }, { 3800, 128 }, { 4400, 80 }, { 5000, 100 }, { 5400, 0 }, 
        { 5800, 20 }, { 6400, 100 }, { 7000, 200 }, { 7600, 70 }, { 8100, 128 }, { 8500, 40 }, { 9200, 40 }, { 9500, 210 }, { 9800, 200 }, { 10600, 160 }, 
        { 11400, 60 }, { 11800, 30 }, { 12200, 90 }, { 12600, 180 }, { 13400, 128 }, { 14200, 40 }, { 14800, 0 }, { 15200, 128 }, { 15700, 200 }, { 16200, 40 }, 
        { 16800, 20 }, { 17400, 180 }, { 18000, 210 }, { 18600, 180 }, { 19400, 40 }, { 19800, 220 }, { 20200, 128 }, { 20700, 20 }, { 21200, 220 }, { 22000, 40 }, 
        { 22600, 128 }, { 23400, 128 }, { 24200, 60 }, { 24900, 200 }, { 25600, 90 }, { 26000, 230 }, { 26700, 100 }, { 27100, 210 }, { 27500, 30 }, { 27900, 110 }, 
        { 28200, 140 }, { 28900, 150 }, { 29400, 230 }, { 30100, 130 }, { 30700, 100 }, { 31300, 100 }, { 31800, 160 }, { 32200, 30 }, { 32800, 210 }, { 33200, 130 }, 
        { 33800, 140 }, { 34200, 70 }, { 34700, 256 }, { 35300, 128 } } };
  
  int m;
  
  int n;
  
  public b(l paraml, int paramInt) {
    this.a = paraml;
    this.i = paramInt;
    this.m = 0;
    this.d = this.l[paraml.J][this.m][0];
    this.b = this.d;
    this.c = new Random();
    this.f = this.l[paraml.J][this.m][1];
    this.n = (this.l[paraml.J]).length;
    if (bool)
      g.B = !g.B; 
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


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */