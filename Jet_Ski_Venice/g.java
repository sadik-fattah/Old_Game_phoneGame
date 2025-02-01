import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class g {
  l a;
  
  final int b = 0;
  
  final int c = 1;
  
  final int d = 2;
  
  int[][] e = new int[][] { { 11, 12 }, { 9, 10 }, { 13, 14 } };
  
  int[] f = new int[] { 2, 0, 1 };
  
  int[] g = new int[] { 3, 4, 5, 6, 7, 8 };
  
  int h;
  
  int i;
  
  int[] j = new int[] { 0, 0, 0 };
  
  int[] k = new int[] { 10, 13, 13 };
  
  int[] l = new int[] { 0, -2, -2 };
  
  int[] m = new int[] { 0, 0, 0 };
  
  int n = 0;
  
  int o = 60;
  
  boolean p;
  
  int q = -1;
  
  int r;
  
  int s = 0;
  
  final int t = 50;
  
  int u;
  
  int v = 0;
  
  final int w = 2;
  
  final int x = 4;
  
  final int y = 60;
  
  Image[] z = new Image[3];
  
  int[][] A = new int[][] { 
      { 0, 0, 0, 22, 36 }, { 0, 22, 0, 21, 36 }, { 0, 43, 0, 19, 36 }, { 1, 0, 0, 42, 41 }, { 1, 42, 0, 42, 41 }, { 1, 84, 0, 42, 41 }, { 1, 126, 0, 42, 41 }, { 1, 168, 0, 42, 41 }, { 1, 210, 0, 42, 41 }, { 2, 0, 0, 33, 50 }, 
      { 2, 33, 0, 33, 50 }, { 2, 66, 0, 33, 50 }, { 2, 99, 0, 33, 50 }, { 2, 132, 0, 33, 50 }, { 2, 165, 0, 33, 50 } };
  
  public static boolean B;
  
  g(l paraml) {
    this.a = paraml;
    try {
      this.z[0] = Image.createImage("/immagini/corsa.png");
      this.z[1] = Image.createImage("/immagini/caduta.png");
      this.z[2] = Image.createImage("/immagini/scia.png");
    } catch (Exception exception) {
      System.out.println("Eccezioni");
    } 
  }
  
  void a(Graphics paramGraphics) {
    if (this.a.Q < 5)
      return; 
    this.i++;
    if (this.p) {
      b(paramGraphics);
      return;
    } 
    int i = this.o - 11;
    if (this.a.R <= 0)
      this.n = 0; 
    if (this.a.Q > 10 && this.s <= 0)
      a(paramGraphics, this.e[this.n][this.i % 2], i - 17 + this.k[this.n], 142 - this.s); 
    a(paramGraphics, this.f[this.n], i, 120 + this.i % 2 - this.l[this.n] - this.s);
    this.h = 0;
  }
  
  void b(Graphics paramGraphics) {
    int i = this.o - 11;
    a(paramGraphics, this.g[this.h], i, 120 - this.s);
    if (this.h < 2) {
      this.v++;
      if (this.v >= 2) {
        this.h++;
        this.v = 0;
      } 
    } 
    if (this.h == 2) {
      this.v++;
      if (this.v >= 4) {
        this.h = 3;
        this.v = 0;
      } 
    } 
    if (this.h == 3) {
      this.v++;
      if (this.v >= 4) {
        this.h = 2;
        this.v = 0;
      } 
    } 
  }
  
  void a() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield a : Ll;
    //   8: getfield z : S
    //   11: aload_0
    //   12: pop
    //   13: iconst_1
    //   14: if_icmpne -> 47
    //   17: aload_0
    //   18: getfield a : Ll;
    //   21: getfield Q : I
    //   24: iconst_2
    //   25: if_icmple -> 47
    //   28: aload_0
    //   29: iconst_2
    //   30: putfield n : I
    //   33: aload_0
    //   34: dup
    //   35: getfield o : I
    //   38: iconst_3
    //   39: iadd
    //   40: putfield o : I
    //   43: iload_1
    //   44: ifeq -> 95
    //   47: aload_0
    //   48: getfield a : Ll;
    //   51: getfield z : S
    //   54: aload_0
    //   55: pop
    //   56: iconst_2
    //   57: if_icmpne -> 90
    //   60: aload_0
    //   61: getfield a : Ll;
    //   64: getfield Q : I
    //   67: iconst_2
    //   68: if_icmple -> 90
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield n : I
    //   76: aload_0
    //   77: dup
    //   78: getfield o : I
    //   81: iconst_3
    //   82: isub
    //   83: putfield o : I
    //   86: iload_1
    //   87: ifeq -> 95
    //   90: aload_0
    //   91: iconst_0
    //   92: putfield n : I
    //   95: aload_0
    //   96: getfield o : I
    //   99: aload_0
    //   100: pop
    //   101: bipush #120
    //   103: if_icmple -> 118
    //   106: aload_0
    //   107: aload_0
    //   108: pop
    //   109: bipush #120
    //   111: putfield o : I
    //   114: iload_1
    //   115: ifeq -> 130
    //   118: aload_0
    //   119: getfield o : I
    //   122: ifge -> 130
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield o : I
    //   130: aload_0
    //   131: getfield q : I
    //   134: ifle -> 239
    //   137: aload_0
    //   138: getfield q : I
    //   141: aload_0
    //   142: getfield r : I
    //   145: if_icmple -> 184
    //   148: aload_0
    //   149: bipush #50
    //   151: aload_0
    //   152: getfield s : I
    //   155: isub
    //   156: iconst_5
    //   157: idiv
    //   158: putfield u : I
    //   161: aload_0
    //   162: dup
    //   163: getfield s : I
    //   166: aload_0
    //   167: getfield u : I
    //   170: iadd
    //   171: putfield s : I
    //   174: aload_0
    //   175: dup
    //   176: getfield q : I
    //   179: iconst_2
    //   180: isub
    //   181: putfield q : I
    //   184: aload_0
    //   185: getfield q : I
    //   188: aload_0
    //   189: getfield r : I
    //   192: if_icmpgt -> 222
    //   195: aload_0
    //   196: bipush #50
    //   198: aload_0
    //   199: getfield s : I
    //   202: isub
    //   203: ineg
    //   204: iconst_4
    //   205: idiv
    //   206: putfield u : I
    //   209: aload_0
    //   210: dup
    //   211: getfield s : I
    //   214: aload_0
    //   215: getfield u : I
    //   218: iadd
    //   219: putfield s : I
    //   222: aload_0
    //   223: getfield s : I
    //   226: ifge -> 239
    //   229: aload_0
    //   230: iconst_0
    //   231: putfield s : I
    //   234: aload_0
    //   235: iconst_m1
    //   236: putfield q : I
    //   239: return
  }
  
  void a(int paramInt) {
    if (this.s > 0)
      return; 
    this.o += paramInt;
    this;
    if (this.o > 120) {
      this;
      this.o = 120;
      if (JSVenice.b) {
        if (this.o < 0)
          this.o = 0; 
        return;
      } 
      return;
    } 
    if (this.o < 0)
      this.o = 0; 
  }
  
  void b() {
    if (this.o > 50 && this.o < 70 && this.q < 0) {
      this.q = this.a.Q / 4;
      this.r = this.q / 2;
      this.a.U += 9472;
      this.a.V = this.a.U >> 8;
      this.a.T += 100;
    } 
  }
  
  void c() {
    if (this.s <= 0) {
      if (this.a.xb)
        return; 
      this.a.R = 7680;
      this.a.kb = 50;
      this.a.T = -50;
      this.p = true;
    } 
  }
  
  void d() {
    if (this.s <= 0) {
      this.a.R += 12800;
      if (this.a.R < 56320)
        this.a.R = 56320; 
      this.a.Q = this.a.R >> 8;
      this.a.r = 100;
      this.a.T += 50;
    } 
  }
  
  boolean e() {
    if (this.p) {
      this.a.kb--;
      if (this.a.kb < 0) {
        this.a.kb = 50;
        this.o = 60;
        this.a.R = 2816;
        this.a.Q = 11;
        this.a.s = 5;
        this.p = false;
      } 
    } 
    return this.p;
  }
  
  void f() {
    this.n = 0;
    this.o = 60;
    this.p = false;
    this.q = -1;
    this.s = 0;
    this.v = 0;
  }
  
  void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #9
    //   5: iload_3
    //   6: aload_0
    //   7: getfield A : [[I
    //   10: iload_2
    //   11: aaload
    //   12: iconst_3
    //   13: iaload
    //   14: iadd
    //   15: ifle -> 50
    //   18: iload #4
    //   20: aload_0
    //   21: getfield A : [[I
    //   24: iload_2
    //   25: aaload
    //   26: iconst_4
    //   27: iaload
    //   28: iadd
    //   29: ifle -> 50
    //   32: iload_3
    //   33: aload_0
    //   34: pop
    //   35: bipush #120
    //   37: if_icmpge -> 50
    //   40: iload #4
    //   42: aload_0
    //   43: pop
    //   44: sipush #160
    //   47: if_icmplt -> 51
    //   50: return
    //   51: iload_3
    //   52: istore #5
    //   54: iload #4
    //   56: istore #6
    //   58: aload_0
    //   59: getfield A : [[I
    //   62: iload_2
    //   63: aaload
    //   64: iconst_3
    //   65: iaload
    //   66: istore #7
    //   68: aload_0
    //   69: getfield A : [[I
    //   72: iload_2
    //   73: aaload
    //   74: iconst_4
    //   75: iaload
    //   76: istore #8
    //   78: iload #5
    //   80: ifge -> 98
    //   83: iload #7
    //   85: iload #5
    //   87: iadd
    //   88: istore #7
    //   90: iconst_0
    //   91: istore #5
    //   93: iload #9
    //   95: ifeq -> 113
    //   98: iload #5
    //   100: aload_0
    //   101: pop
    //   102: bipush #120
    //   104: if_icmple -> 113
    //   107: aload_0
    //   108: pop
    //   109: bipush #120
    //   111: istore #5
    //   113: iload #6
    //   115: ifge -> 133
    //   118: iload #8
    //   120: iload #6
    //   122: iadd
    //   123: istore #8
    //   125: iconst_0
    //   126: istore #6
    //   128: iload #9
    //   130: ifeq -> 150
    //   133: iload #6
    //   135: aload_0
    //   136: pop
    //   137: sipush #160
    //   140: if_icmple -> 150
    //   143: aload_0
    //   144: pop
    //   145: sipush #160
    //   148: istore #6
    //   150: iload #5
    //   152: iload #7
    //   154: iadd
    //   155: aload_0
    //   156: pop
    //   157: bipush #120
    //   159: if_icmple -> 171
    //   162: aload_0
    //   163: pop
    //   164: bipush #120
    //   166: iload #5
    //   168: isub
    //   169: istore #7
    //   171: iload #6
    //   173: iload #8
    //   175: iadd
    //   176: aload_0
    //   177: pop
    //   178: sipush #160
    //   181: if_icmple -> 194
    //   184: aload_0
    //   185: pop
    //   186: sipush #160
    //   189: iload #6
    //   191: isub
    //   192: istore #8
    //   194: aload_1
    //   195: iload #5
    //   197: iload #6
    //   199: iload #7
    //   201: iload #8
    //   203: invokevirtual setClip : (IIII)V
    //   206: aload_1
    //   207: aload_0
    //   208: getfield z : [Ljavax/microedition/lcdui/Image;
    //   211: aload_0
    //   212: getfield A : [[I
    //   215: iload_2
    //   216: aaload
    //   217: iconst_0
    //   218: iaload
    //   219: aaload
    //   220: iload_3
    //   221: aload_0
    //   222: getfield A : [[I
    //   225: iload_2
    //   226: aaload
    //   227: iconst_1
    //   228: iaload
    //   229: isub
    //   230: iload #4
    //   232: aload_0
    //   233: getfield A : [[I
    //   236: iload_2
    //   237: aaload
    //   238: iconst_2
    //   239: iaload
    //   240: isub
    //   241: bipush #20
    //   243: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   246: aload_1
    //   247: iconst_0
    //   248: iconst_0
    //   249: aload_0
    //   250: pop
    //   251: bipush #120
    //   253: aload_0
    //   254: pop
    //   255: sipush #160
    //   258: invokevirtual setClip : (IIII)V
    //   261: return
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */