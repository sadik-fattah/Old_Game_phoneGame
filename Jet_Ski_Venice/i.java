import javax.microedition.lcdui.Graphics;

public class i {
  private final l a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  int f;
  
  int[] g = new int[] { 600, 900, 1200 };
  
  int[] h = new int[] { 10, 12, 20 };
  
  int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  public i(l paraml, int paramInt) {
    this.a = paraml;
    this.j = paramInt;
    this.i = this.g[paraml.J];
    this.c = this.i;
    this.b = this.c;
    this.e = 2;
    this.f = this.h[paraml.J];
  }
  
  void a() {
    this.i = this.g[this.a.J];
    this.c = this.i;
    this.b = this.c;
    this.e = 2;
    this.f = this.h[this.a.J];
  }
  
  public void b() {
    int j = this.b - this.a.K;
    if (j < 100 && j > 50)
      this.a.mb.b(); 
    if (this.b < this.a.K - 50)
      this.b += this.i; 
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
    //   14: getfield j : I
    //   17: aaload
    //   18: iconst_3
    //   19: iaload
    //   20: aload_0
    //   21: getfield a : Ll;
    //   24: getfield db : [I
    //   27: aload_0
    //   28: getfield d : I
    //   31: iaload
    //   32: imul
    //   33: bipush #16
    //   35: ishr
    //   36: putfield k : I
    //   39: aload_0
    //   40: aload_0
    //   41: getfield a : Ll;
    //   44: getfield Cb : [[I
    //   47: aload_0
    //   48: getfield j : I
    //   51: aaload
    //   52: iconst_4
    //   53: iaload
    //   54: aload_0
    //   55: getfield a : Ll;
    //   58: getfield db : [I
    //   61: aload_0
    //   62: getfield d : I
    //   65: iaload
    //   66: imul
    //   67: bipush #16
    //   69: ishr
    //   70: putfield l : I
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
    //   94: getfield k : I
    //   97: aload_0
    //   98: getfield a : Ll;
    //   101: getfield Cb : [[I
    //   104: iload_2
    //   105: aload_0
    //   106: getfield j : I
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
    //   142: getfield j : I
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
    int j = this.b - this.a.K;
    if (j < -50 || j > 530)
      return; 
    this.d = (13924 - 25 * j) / (118 + j);
    if (this.d < 1 || this.d > 196)
      return; 
    int k = c();
    int m = -2 + this.a.cb[this.d] + (this.e * this.a.bb[this.d] - this.a.Cb[k][3]) / 2;
    this.a.a(paramGraphics, k, m, 108 + this.d - this.a.Cb[k][4]);
  }
  
  int d() {
    return this.b - this.a.K;
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */