import java.io.IOException;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

class l extends Canvas implements Runnable {
  final int a = 120;
  
  final int b = 160;
  
  final int c = 24;
  
  final int d = 25;
  
  final int e = 26;
  
  final int f = 27;
  
  final int g = 28;
  
  final JSVenice h;
  
  boolean i = false;
  
  short j = 20;
  
  boolean k = false;
  
  volatile boolean l = false;
  
  volatile Thread m = null;
  
  static final int n = 40;
  
  long o = 0L;
  
  Random p;
  
  int[][] q;
  
  int r;
  
  short s = 0;
  
  final short t = 1;
  
  final short u = 2;
  
  final short v = 5;
  
  final short w = 6;
  
  final short x = 8;
  
  final short y = 9;
  
  short z = -1;
  
  final short A = 1;
  
  final short B = 2;
  
  final short C = 3;
  
  final short D = 4;
  
  Image E;
  
  Image F;
  
  Image G;
  
  int H;
  
  f I;
  
  int J;
  
  int K;
  
  int L;
  
  int M;
  
  int N;
  
  int O = 0;
  
  int P = 256;
  
  int Q = 0;
  
  int R = 7680;
  
  int S = 0;
  
  int T;
  
  int U = 25600;
  
  int V = 100;
  
  j W;
  
  int[] X = new int[] { 
      66300, 66810, 67320, 67830, 68340, 68595, 68850, 68977, 69105, 69232, 
      69360, 69487, 69615, 69742, 69870, 69997, 70125, 70252, 70380, 70507 };
  
  int[][] Y = new int[][] { { 0, -10, 10, -8, 10, -7, 13, -8, 0 }, { 0, 10, -15, 8, -7, 10, -12, 12, 0 }, { 0, -15, 15, 0, -15, 0, 15, -15, 0 } };
  
  int[] Z = new int[] { 18100, 27100, 36100 };
  
  int[] ab;
  
  int[] bb;
  
  int[] cb;
  
  int[] db;
  
  a[] eb;
  
  i fb;
  
  b gb;
  
  e hb;
  
  int ib;
  
  c jb;
  
  int kb = 50;
  
  int lb = 0;
  
  g mb;
  
  final Font nb = Font.getFont(0, 1, 8);
  
  long ob;
  
  long pb;
  
  boolean qb = true;
  
  boolean rb = true;
  
  d sb;
  
  int tb = 100;
  
  final int ub = 10;
  
  int vb;
  
  Image[] wb = new Image[30];
  
  boolean xb = false;
  
  boolean yb;
  
  long zb;
  
  boolean Ab = false;
  
  boolean Bb = false;
  
  int[][] Cb = new int[][] { 
      { 0, 0, 0, 65, 30 }, { 0, 66, 0, 10, 10 }, { 0, 76, 0, 10, 10 }, { 0, 66, 10, 12, 12 }, { 0, 78, 10, 8, 8 }, { 0, 78, 18, 8, 12 }, { 1, 0, 0, 24, 8 }, { 2, 0, 0, 11, 11 }, { 3, 82, 9, 4, 33 }, { 3, 79, 9, 3, 24 }, 
      { 3, 78, 15, 1, 15 }, { 3, 77, 15, 1, 8 }, { 3, 105, 0, 45, 28 }, { 3, 114, 28, 38, 22 }, { 3, 86, 28, 28, 17 }, { 3, 86, 9, 19, 11 }, { 3, 86, 22, 9, 6 }, { 3, 0, 0, 11, 16 }, { 3, 11, 0, 8, 13 }, { 3, 19, 0, 6, 9 }, 
      { 3, 25, 0, 4, 6 }, { 3, 29, 0, 2, 3 }, { 3, 0, 17, 75, 15 }, { 3, 0, 32, 63, 13 }, { 3, 58, 0, 47, 9 }, { 3, 48, 10, 31, 6 }, { 3, 9, 14, 16, 3 }, { 3, 31, 0, 17, 17 }, { 3, 63, 32, 14, 14 }, { 3, 48, 0, 10, 10 }, 
      { 3, 24, 6, 7, 7 }, { 3, 21, 9, 3, 3 } };
  
  l(JSVenice paramJSVenice) {
    this.h = paramJSVenice;
    try {
      this.E = Image.createImage("/immagini/pre.png");
      this.F = Image.createImage("/immagini/logo1.png");
      this.G = Image.createImage("/immagini/logo2.png");
    } catch (IOException iOException) {}
    this.i = false;
    this.H = 10;
    this.s = 1;
    this.p = new Random();
  }
  
  public void paint(Graphics paramGraphics) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #13
    //   5: aload_1
    //   6: iconst_0
    //   7: iconst_0
    //   8: bipush #120
    //   10: sipush #160
    //   13: invokevirtual setClip : (IIII)V
    //   16: invokestatic currentTimeMillis : ()J
    //   19: lstore_2
    //   20: aload_1
    //   21: aload_0
    //   22: getfield nb : Ljavax/microedition/lcdui/Font;
    //   25: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   28: aload_0
    //   29: getfield s : S
    //   32: iconst_1
    //   33: if_icmpne -> 157
    //   36: aload_1
    //   37: aload_0
    //   38: getfield E : Ljavax/microedition/lcdui/Image;
    //   41: iconst_0
    //   42: iconst_0
    //   43: aload_0
    //   44: getfield j : S
    //   47: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   50: aload_0
    //   51: getfield F : Ljavax/microedition/lcdui/Image;
    //   54: ifnull -> 109
    //   57: aload_0
    //   58: getfield E : Ljavax/microedition/lcdui/Image;
    //   61: invokevirtual getWidth : ()I
    //   64: aload_0
    //   65: getfield F : Ljavax/microedition/lcdui/Image;
    //   68: invokevirtual getWidth : ()I
    //   71: isub
    //   72: iconst_5
    //   73: isub
    //   74: istore #4
    //   76: aload_0
    //   77: getfield E : Ljavax/microedition/lcdui/Image;
    //   80: invokevirtual getHeight : ()I
    //   83: aload_0
    //   84: getfield F : Ljavax/microedition/lcdui/Image;
    //   87: invokevirtual getHeight : ()I
    //   90: isub
    //   91: iconst_5
    //   92: isub
    //   93: istore #6
    //   95: aload_1
    //   96: aload_0
    //   97: getfield F : Ljavax/microedition/lcdui/Image;
    //   100: iload #4
    //   102: iload #6
    //   104: bipush #20
    //   106: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   109: aload_0
    //   110: getfield G : Ljavax/microedition/lcdui/Image;
    //   113: ifnull -> 152
    //   116: iconst_5
    //   117: istore #5
    //   119: aload_0
    //   120: getfield E : Ljavax/microedition/lcdui/Image;
    //   123: invokevirtual getHeight : ()I
    //   126: aload_0
    //   127: getfield G : Ljavax/microedition/lcdui/Image;
    //   130: invokevirtual getHeight : ()I
    //   133: isub
    //   134: iconst_5
    //   135: isub
    //   136: istore #7
    //   138: aload_1
    //   139: aload_0
    //   140: getfield G : Ljavax/microedition/lcdui/Image;
    //   143: iload #5
    //   145: iload #7
    //   147: bipush #20
    //   149: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   152: iload #13
    //   154: ifeq -> 1350
    //   157: aload_0
    //   158: getfield s : S
    //   161: iconst_2
    //   162: if_icmpne -> 178
    //   165: aload_0
    //   166: getfield I : Lf;
    //   169: aload_1
    //   170: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   173: iload #13
    //   175: ifeq -> 1350
    //   178: aload_0
    //   179: getfield s : S
    //   182: bipush #9
    //   184: if_icmpeq -> 213
    //   187: aload_0
    //   188: getfield s : S
    //   191: iconst_5
    //   192: if_icmpeq -> 213
    //   195: aload_0
    //   196: getfield s : S
    //   199: bipush #6
    //   201: if_icmpeq -> 213
    //   204: aload_0
    //   205: getfield s : S
    //   208: bipush #8
    //   210: if_icmpne -> 1350
    //   213: aload_1
    //   214: iconst_0
    //   215: iconst_0
    //   216: bipush #120
    //   218: sipush #160
    //   221: invokevirtual setClip : (IIII)V
    //   224: aload_0
    //   225: getfield W : Lj;
    //   228: aload_1
    //   229: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   232: iconst_0
    //   233: istore #4
    //   235: iload #13
    //   237: ifeq -> 254
    //   240: aload_0
    //   241: getfield eb : [La;
    //   244: iload #4
    //   246: aaload
    //   247: aload_1
    //   248: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   251: iinc #4, 1
    //   254: iload #4
    //   256: iconst_5
    //   257: if_icmplt -> 240
    //   260: aload_0
    //   261: getfield q : [[I
    //   264: iconst_0
    //   265: aaload
    //   266: iconst_0
    //   267: aload_0
    //   268: getfield hb : Le;
    //   271: invokevirtual d : ()I
    //   274: iastore
    //   275: aload_0
    //   276: getfield q : [[I
    //   279: iconst_0
    //   280: aaload
    //   281: iconst_1
    //   282: iconst_0
    //   283: iastore
    //   284: aload_0
    //   285: getfield q : [[I
    //   288: iconst_1
    //   289: aaload
    //   290: iconst_0
    //   291: aload_0
    //   292: getfield gb : Lb;
    //   295: invokevirtual d : ()I
    //   298: iastore
    //   299: aload_0
    //   300: getfield q : [[I
    //   303: iconst_1
    //   304: aaload
    //   305: iconst_1
    //   306: iconst_1
    //   307: iastore
    //   308: aload_0
    //   309: getfield q : [[I
    //   312: iconst_2
    //   313: aaload
    //   314: iconst_0
    //   315: aload_0
    //   316: getfield jb : Lc;
    //   319: invokevirtual d : ()I
    //   322: iastore
    //   323: aload_0
    //   324: getfield q : [[I
    //   327: iconst_2
    //   328: aaload
    //   329: iconst_1
    //   330: iconst_2
    //   331: iastore
    //   332: aload_0
    //   333: getfield q : [[I
    //   336: iconst_3
    //   337: aaload
    //   338: iconst_0
    //   339: aload_0
    //   340: getfield fb : Li;
    //   343: invokevirtual d : ()I
    //   346: iastore
    //   347: aload_0
    //   348: getfield q : [[I
    //   351: iconst_3
    //   352: aaload
    //   353: iconst_1
    //   354: iconst_3
    //   355: iastore
    //   356: aload_0
    //   357: aload_0
    //   358: getfield q : [[I
    //   361: iconst_4
    //   362: invokespecial a : ([[II)V
    //   365: iconst_0
    //   366: istore #5
    //   368: iconst_0
    //   369: istore #6
    //   371: iload #13
    //   373: ifne -> 251
    //   376: iload #13
    //   378: ifeq -> 467
    //   381: aload_0
    //   382: getfield q : [[I
    //   385: iload #6
    //   387: aaload
    //   388: iconst_1
    //   389: iaload
    //   390: ifne -> 401
    //   393: aload_0
    //   394: getfield hb : Le;
    //   397: aload_1
    //   398: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   401: aload_0
    //   402: getfield q : [[I
    //   405: iload #6
    //   407: aaload
    //   408: iconst_1
    //   409: iaload
    //   410: iconst_1
    //   411: if_icmpne -> 422
    //   414: aload_0
    //   415: getfield gb : Lb;
    //   418: aload_1
    //   419: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   422: aload_0
    //   423: getfield q : [[I
    //   426: iload #6
    //   428: aaload
    //   429: iconst_1
    //   430: iaload
    //   431: iconst_2
    //   432: if_icmpne -> 443
    //   435: aload_0
    //   436: getfield jb : Lc;
    //   439: aload_1
    //   440: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   443: aload_0
    //   444: getfield q : [[I
    //   447: iload #6
    //   449: aaload
    //   450: iconst_1
    //   451: iaload
    //   452: iconst_3
    //   453: if_icmpne -> 464
    //   456: aload_0
    //   457: getfield fb : Li;
    //   460: aload_1
    //   461: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   464: iinc #6, 1
    //   467: iload #6
    //   469: iconst_4
    //   470: if_icmplt -> 381
    //   473: aload_0
    //   474: getfield mb : Lg;
    //   477: aload_1
    //   478: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;)V
    //   481: aload_0
    //   482: getfield s : S
    //   485: bipush #9
    //   487: iload #13
    //   489: ifne -> 411
    //   492: if_icmpne -> 619
    //   495: aload_0
    //   496: getfield tb : I
    //   499: bipush #25
    //   501: idiv
    //   502: iconst_1
    //   503: isub
    //   504: ifle -> 541
    //   507: new java/lang/StringBuffer
    //   510: dup
    //   511: invokespecial <init> : ()V
    //   514: ldc ''
    //   516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   519: aload_0
    //   520: getfield tb : I
    //   523: bipush #25
    //   525: idiv
    //   526: iconst_1
    //   527: isub
    //   528: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   531: invokevirtual toString : ()Ljava/lang/String;
    //   534: astore #8
    //   536: iload #13
    //   538: ifeq -> 545
    //   541: ldc 'START'
    //   543: astore #8
    //   545: aload_0
    //   546: getfield nb : Ljavax/microedition/lcdui/Font;
    //   549: aload #8
    //   551: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   554: istore #7
    //   556: aload_1
    //   557: iconst_0
    //   558: iconst_0
    //   559: iconst_0
    //   560: invokevirtual setColor : (III)V
    //   563: aload_1
    //   564: aload #8
    //   566: bipush #120
    //   568: iload #7
    //   570: isub
    //   571: iconst_2
    //   572: idiv
    //   573: bipush #50
    //   575: aload_0
    //   576: getfield j : S
    //   579: invokevirtual drawString : (Ljava/lang/String;III)V
    //   582: aload_1
    //   583: sipush #254
    //   586: sipush #248
    //   589: iconst_0
    //   590: invokevirtual setColor : (III)V
    //   593: aload_1
    //   594: aload #8
    //   596: bipush #120
    //   598: iload #7
    //   600: isub
    //   601: iconst_2
    //   602: idiv
    //   603: iconst_1
    //   604: isub
    //   605: bipush #49
    //   607: aload_0
    //   608: getfield j : S
    //   611: invokevirtual drawString : (Ljava/lang/String;III)V
    //   614: iload #13
    //   616: ifeq -> 1027
    //   619: aload_0
    //   620: getfield s : S
    //   623: bipush #6
    //   625: if_icmpne -> 726
    //   628: aload_0
    //   629: getfield nb : Ljavax/microedition/lcdui/Font;
    //   632: aload_0
    //   633: getfield I : Lf;
    //   636: getfield e : [Ljava/lang/String;
    //   639: bipush #27
    //   641: aaload
    //   642: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   645: istore #7
    //   647: aload_1
    //   648: iconst_0
    //   649: iconst_0
    //   650: iconst_0
    //   651: invokevirtual setColor : (III)V
    //   654: aload_1
    //   655: aload_0
    //   656: getfield I : Lf;
    //   659: getfield e : [Ljava/lang/String;
    //   662: bipush #27
    //   664: aaload
    //   665: bipush #120
    //   667: iload #7
    //   669: isub
    //   670: iconst_2
    //   671: idiv
    //   672: bipush #50
    //   674: aload_0
    //   675: getfield j : S
    //   678: invokevirtual drawString : (Ljava/lang/String;III)V
    //   681: aload_1
    //   682: sipush #254
    //   685: sipush #248
    //   688: iconst_0
    //   689: invokevirtual setColor : (III)V
    //   692: aload_1
    //   693: aload_0
    //   694: getfield I : Lf;
    //   697: getfield e : [Ljava/lang/String;
    //   700: bipush #27
    //   702: aaload
    //   703: bipush #120
    //   705: iload #7
    //   707: isub
    //   708: iconst_2
    //   709: idiv
    //   710: iconst_1
    //   711: isub
    //   712: bipush #49
    //   714: aload_0
    //   715: getfield j : S
    //   718: invokevirtual drawString : (Ljava/lang/String;III)V
    //   721: iload #13
    //   723: ifeq -> 1027
    //   726: aload_0
    //   727: getfield s : S
    //   730: bipush #8
    //   732: if_icmpne -> 1027
    //   735: aload_0
    //   736: getfield I : Lf;
    //   739: getfield e : [Ljava/lang/String;
    //   742: bipush #25
    //   744: aaload
    //   745: astore #8
    //   747: aload_0
    //   748: getfield nb : Ljavax/microedition/lcdui/Font;
    //   751: aload #8
    //   753: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   756: istore #7
    //   758: aload_1
    //   759: iconst_0
    //   760: iconst_0
    //   761: iconst_0
    //   762: invokevirtual setColor : (III)V
    //   765: aload_1
    //   766: aload #8
    //   768: bipush #120
    //   770: iload #7
    //   772: isub
    //   773: iconst_2
    //   774: idiv
    //   775: bipush #50
    //   777: aload_0
    //   778: getfield j : S
    //   781: invokevirtual drawString : (Ljava/lang/String;III)V
    //   784: aload_1
    //   785: sipush #254
    //   788: sipush #248
    //   791: iconst_0
    //   792: invokevirtual setColor : (III)V
    //   795: aload_1
    //   796: aload #8
    //   798: bipush #120
    //   800: iload #7
    //   802: isub
    //   803: iconst_2
    //   804: idiv
    //   805: iconst_1
    //   806: isub
    //   807: bipush #49
    //   809: aload_0
    //   810: getfield j : S
    //   813: invokevirtual drawString : (Ljava/lang/String;III)V
    //   816: aload_0
    //   817: getfield Q : I
    //   820: bipush #20
    //   822: if_icmpgt -> 868
    //   825: aload_0
    //   826: getfield V : I
    //   829: ifle -> 868
    //   832: aload_0
    //   833: dup
    //   834: getfield S : I
    //   837: bipush #10
    //   839: iadd
    //   840: putfield S : I
    //   843: aload_0
    //   844: getfield vb : I
    //   847: ifeq -> 868
    //   850: aload_0
    //   851: dup
    //   852: getfield S : I
    //   855: aload_0
    //   856: getfield vb : I
    //   859: iadd
    //   860: putfield S : I
    //   863: aload_0
    //   864: iconst_0
    //   865: putfield vb : I
    //   868: aload_0
    //   869: getfield V : I
    //   872: ifgt -> 1027
    //   875: new java/lang/StringBuffer
    //   878: dup
    //   879: invokespecial <init> : ()V
    //   882: ldc ' '
    //   884: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   887: aload_0
    //   888: getfield S : I
    //   891: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   894: invokevirtual toString : ()Ljava/lang/String;
    //   897: astore #9
    //   899: aload_0
    //   900: getfield I : Lf;
    //   903: getfield e : [Ljava/lang/String;
    //   906: bipush #26
    //   908: aaload
    //   909: astore #10
    //   911: aload_0
    //   912: getfield nb : Ljavax/microedition/lcdui/Font;
    //   915: aload #9
    //   917: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   920: istore #11
    //   922: aload_0
    //   923: getfield nb : Ljavax/microedition/lcdui/Font;
    //   926: aload #10
    //   928: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   931: istore #12
    //   933: aload_1
    //   934: iconst_0
    //   935: iconst_0
    //   936: iconst_0
    //   937: invokevirtual setColor : (III)V
    //   940: aload_1
    //   941: aload #10
    //   943: bipush #120
    //   945: iload #12
    //   947: isub
    //   948: iconst_2
    //   949: idiv
    //   950: bipush #77
    //   952: aload_0
    //   953: getfield j : S
    //   956: invokevirtual drawString : (Ljava/lang/String;III)V
    //   959: aload_1
    //   960: aload #9
    //   962: bipush #120
    //   964: iload #11
    //   966: isub
    //   967: iconst_2
    //   968: idiv
    //   969: bipush #95
    //   971: aload_0
    //   972: getfield j : S
    //   975: invokevirtual drawString : (Ljava/lang/String;III)V
    //   978: aload_1
    //   979: sipush #254
    //   982: sipush #248
    //   985: iconst_0
    //   986: invokevirtual setColor : (III)V
    //   989: aload_1
    //   990: aload #10
    //   992: bipush #120
    //   994: iload #12
    //   996: isub
    //   997: iconst_2
    //   998: idiv
    //   999: bipush #78
    //   1001: aload_0
    //   1002: getfield j : S
    //   1005: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1008: aload_1
    //   1009: aload #9
    //   1011: bipush #120
    //   1013: iload #11
    //   1015: isub
    //   1016: iconst_2
    //   1017: idiv
    //   1018: bipush #96
    //   1020: aload_0
    //   1021: getfield j : S
    //   1024: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1027: aload_0
    //   1028: aload_1
    //   1029: bipush #6
    //   1031: bipush #120
    //   1033: aload_0
    //   1034: getfield Cb : [[I
    //   1037: bipush #6
    //   1039: aaload
    //   1040: iconst_3
    //   1041: iaload
    //   1042: isub
    //   1043: iconst_5
    //   1044: isub
    //   1045: bipush #7
    //   1047: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   1050: aload_1
    //   1051: iconst_0
    //   1052: iconst_0
    //   1053: iconst_0
    //   1054: invokevirtual setColor : (III)V
    //   1057: aload_1
    //   1058: bipush #120
    //   1060: aload_0
    //   1061: getfield Cb : [[I
    //   1064: bipush #6
    //   1066: aaload
    //   1067: iconst_3
    //   1068: iaload
    //   1069: isub
    //   1070: iconst_2
    //   1071: isub
    //   1072: aload_0
    //   1073: getfield lb : I
    //   1076: iconst_4
    //   1077: imul
    //   1078: iadd
    //   1079: bipush #9
    //   1081: bipush #20
    //   1083: aload_0
    //   1084: getfield lb : I
    //   1087: iconst_4
    //   1088: imul
    //   1089: isub
    //   1090: iconst_3
    //   1091: invokevirtual fillRect : (IIII)V
    //   1094: aload_0
    //   1095: getfield r : I
    //   1098: ifle -> 1135
    //   1101: aload_0
    //   1102: dup
    //   1103: getfield r : I
    //   1106: iconst_1
    //   1107: isub
    //   1108: putfield r : I
    //   1111: aload_0
    //   1112: aload_1
    //   1113: bipush #7
    //   1115: bipush #120
    //   1117: aload_0
    //   1118: getfield Cb : [[I
    //   1121: bipush #7
    //   1123: aaload
    //   1124: iconst_3
    //   1125: iaload
    //   1126: isub
    //   1127: bipush #11
    //   1129: isub
    //   1130: bipush #16
    //   1132: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;III)V
    //   1135: aload_1
    //   1136: iconst_0
    //   1137: iconst_0
    //   1138: iconst_0
    //   1139: invokevirtual setColor : (III)V
    //   1142: aload_1
    //   1143: new java/lang/StringBuffer
    //   1146: dup
    //   1147: invokespecial <init> : ()V
    //   1150: ldc ''
    //   1152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1155: aload_0
    //   1156: getfield S : I
    //   1159: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1162: invokevirtual toString : ()Ljava/lang/String;
    //   1165: bipush #6
    //   1167: bipush #8
    //   1169: aload_0
    //   1170: getfield j : S
    //   1173: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1176: aload_1
    //   1177: sipush #254
    //   1180: sipush #248
    //   1183: iconst_0
    //   1184: invokevirtual setColor : (III)V
    //   1187: aload_1
    //   1188: new java/lang/StringBuffer
    //   1191: dup
    //   1192: invokespecial <init> : ()V
    //   1195: ldc ''
    //   1197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1200: aload_0
    //   1201: getfield S : I
    //   1204: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1207: invokevirtual toString : ()Ljava/lang/String;
    //   1210: bipush #6
    //   1212: bipush #7
    //   1214: aload_0
    //   1215: getfield j : S
    //   1218: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1221: aload_0
    //   1222: getfield nb : Ljavax/microedition/lcdui/Font;
    //   1225: new java/lang/StringBuffer
    //   1228: dup
    //   1229: invokespecial <init> : ()V
    //   1232: ldc ''
    //   1234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1237: aload_0
    //   1238: getfield V : I
    //   1241: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1244: invokevirtual toString : ()Ljava/lang/String;
    //   1247: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   1250: istore #7
    //   1252: aload_1
    //   1253: iconst_0
    //   1254: iconst_0
    //   1255: iconst_0
    //   1256: invokevirtual setColor : (III)V
    //   1259: aload_1
    //   1260: new java/lang/StringBuffer
    //   1263: dup
    //   1264: invokespecial <init> : ()V
    //   1267: ldc ''
    //   1269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1272: aload_0
    //   1273: getfield V : I
    //   1276: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1279: invokevirtual toString : ()Ljava/lang/String;
    //   1282: bipush #120
    //   1284: iload #7
    //   1286: isub
    //   1287: iconst_2
    //   1288: idiv
    //   1289: bipush #8
    //   1291: aload_0
    //   1292: getfield j : S
    //   1295: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1298: aload_1
    //   1299: sipush #254
    //   1302: sipush #248
    //   1305: iconst_0
    //   1306: invokevirtual setColor : (III)V
    //   1309: aload_1
    //   1310: new java/lang/StringBuffer
    //   1313: dup
    //   1314: invokespecial <init> : ()V
    //   1317: ldc ''
    //   1319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1322: aload_0
    //   1323: getfield V : I
    //   1326: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1329: invokevirtual toString : ()Ljava/lang/String;
    //   1332: bipush #120
    //   1334: iload #7
    //   1336: isub
    //   1337: iconst_2
    //   1338: idiv
    //   1339: iconst_1
    //   1340: isub
    //   1341: bipush #7
    //   1343: aload_0
    //   1344: getfield j : S
    //   1347: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1350: aload_0
    //   1351: getfield Ab : Z
    //   1354: ifeq -> 1527
    //   1357: aload_0
    //   1358: getfield s : S
    //   1361: iconst_5
    //   1362: if_icmpne -> 1527
    //   1365: aload_0
    //   1366: getfield I : Lf;
    //   1369: getfield e : [Ljava/lang/String;
    //   1372: bipush #28
    //   1374: aaload
    //   1375: astore #4
    //   1377: aload_0
    //   1378: getfield nb : Ljavax/microedition/lcdui/Font;
    //   1381: aload #4
    //   1383: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   1386: istore #5
    //   1388: aload_1
    //   1389: iconst_0
    //   1390: iconst_0
    //   1391: iconst_0
    //   1392: invokevirtual setColor : (III)V
    //   1395: aload_1
    //   1396: aload #4
    //   1398: bipush #120
    //   1400: iload #5
    //   1402: isub
    //   1403: iconst_2
    //   1404: idiv
    //   1405: bipush #50
    //   1407: aload_0
    //   1408: getfield j : S
    //   1411: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1414: aload_1
    //   1415: sipush #254
    //   1418: sipush #248
    //   1421: iconst_0
    //   1422: invokevirtual setColor : (III)V
    //   1425: aload_1
    //   1426: aload #4
    //   1428: bipush #120
    //   1430: iload #5
    //   1432: isub
    //   1433: iconst_2
    //   1434: idiv
    //   1435: iconst_1
    //   1436: isub
    //   1437: bipush #49
    //   1439: aload_0
    //   1440: getfield j : S
    //   1443: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1446: aload_0
    //   1447: getfield I : Lf;
    //   1450: getfield e : [Ljava/lang/String;
    //   1453: bipush #29
    //   1455: aaload
    //   1456: astore #4
    //   1458: aload_0
    //   1459: getfield nb : Ljavax/microedition/lcdui/Font;
    //   1462: aload #4
    //   1464: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   1467: istore #5
    //   1469: aload_1
    //   1470: iconst_0
    //   1471: iconst_0
    //   1472: iconst_0
    //   1473: invokevirtual setColor : (III)V
    //   1476: aload_1
    //   1477: aload #4
    //   1479: bipush #120
    //   1481: iload #5
    //   1483: isub
    //   1484: iconst_2
    //   1485: idiv
    //   1486: bipush #70
    //   1488: aload_0
    //   1489: getfield j : S
    //   1492: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1495: aload_1
    //   1496: sipush #254
    //   1499: sipush #248
    //   1502: iconst_0
    //   1503: invokevirtual setColor : (III)V
    //   1506: aload_1
    //   1507: aload #4
    //   1509: bipush #120
    //   1511: iload #5
    //   1513: isub
    //   1514: iconst_2
    //   1515: idiv
    //   1516: iconst_1
    //   1517: isub
    //   1518: bipush #69
    //   1520: aload_0
    //   1521: getfield j : S
    //   1524: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1527: return
  }
  
  private void a() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #9
    //   5: aload_0
    //   6: getfield yb : Z
    //   9: ifeq -> 57
    //   12: aload_0
    //   13: getfield Ab : Z
    //   16: ifne -> 57
    //   19: aload_0
    //   20: getfield i : Z
    //   23: ifeq -> 57
    //   26: aload_0
    //   27: getfield s : S
    //   30: iconst_2
    //   31: if_icmpeq -> 57
    //   34: ldc 60000
    //   36: istore_1
    //   37: invokestatic currentTimeMillis : ()J
    //   40: aload_0
    //   41: getfield zb : J
    //   44: lsub
    //   45: ldc2_w 60000
    //   48: lcmp
    //   49: ifle -> 57
    //   52: aload_0
    //   53: iconst_1
    //   54: putfield Ab : Z
    //   57: aload_0
    //   58: getfield s : S
    //   61: iconst_1
    //   62: if_icmpne -> 112
    //   65: aload_0
    //   66: dup
    //   67: getfield H : I
    //   70: iconst_1
    //   71: isub
    //   72: putfield H : I
    //   75: aload_0
    //   76: getfield H : I
    //   79: ifgt -> 1566
    //   82: aload_0
    //   83: aconst_null
    //   84: putfield E : Ljavax/microedition/lcdui/Image;
    //   87: invokestatic gc : ()V
    //   90: aload_0
    //   91: new f
    //   94: dup
    //   95: aload_0
    //   96: invokespecial <init> : (Ll;)V
    //   99: putfield I : Lf;
    //   102: aload_0
    //   103: iconst_2
    //   104: putfield s : S
    //   107: iload #9
    //   109: ifeq -> 1566
    //   112: aload_0
    //   113: getfield s : S
    //   116: iconst_2
    //   117: if_icmpne -> 132
    //   120: aload_0
    //   121: getfield I : Lf;
    //   124: invokevirtual b : ()V
    //   127: iload #9
    //   129: ifeq -> 1566
    //   132: aload_0
    //   133: getfield s : S
    //   136: iconst_5
    //   137: if_icmpeq -> 149
    //   140: aload_0
    //   141: getfield s : S
    //   144: bipush #9
    //   146: if_icmpne -> 1010
    //   149: aload_0
    //   150: getfield s : S
    //   153: bipush #9
    //   155: if_icmpne -> 185
    //   158: aload_0
    //   159: dup
    //   160: getfield tb : I
    //   163: iconst_1
    //   164: isub
    //   165: putfield tb : I
    //   168: aload_0
    //   169: getfield tb : I
    //   172: bipush #25
    //   174: idiv
    //   175: iconst_1
    //   176: isub
    //   177: ifge -> 185
    //   180: aload_0
    //   181: iconst_5
    //   182: putfield s : S
    //   185: aload_0
    //   186: getfield mb : Lg;
    //   189: invokevirtual e : ()Z
    //   192: ifeq -> 196
    //   195: return
    //   196: aload_0
    //   197: getfield z : S
    //   200: iconst_3
    //   201: if_icmpne -> 231
    //   204: aload_0
    //   205: getfield Q : I
    //   208: sipush #251
    //   211: if_icmpge -> 231
    //   214: aload_0
    //   215: dup
    //   216: getfield R : I
    //   219: sipush #2000
    //   222: iadd
    //   223: putfield R : I
    //   226: iload #9
    //   228: ifeq -> 272
    //   231: aload_0
    //   232: getfield z : S
    //   235: iconst_4
    //   236: if_icmpne -> 272
    //   239: aload_0
    //   240: getfield Q : I
    //   243: bipush #11
    //   245: if_icmple -> 272
    //   248: aload_0
    //   249: dup
    //   250: getfield R : I
    //   253: sipush #1000
    //   256: isub
    //   257: putfield R : I
    //   260: aload_0
    //   261: getfield R : I
    //   264: ifge -> 272
    //   267: aload_0
    //   268: iconst_0
    //   269: putfield R : I
    //   272: aload_0
    //   273: aload_0
    //   274: getfield R : I
    //   277: bipush #8
    //   279: ishr
    //   280: putfield Q : I
    //   283: aload_0
    //   284: getfield M : I
    //   287: aload_0
    //   288: getfield Y : [[I
    //   291: aload_0
    //   292: getfield J : I
    //   295: aaload
    //   296: aload_0
    //   297: getfield O : I
    //   300: iaload
    //   301: if_icmpge -> 335
    //   304: aload_0
    //   305: dup
    //   306: getfield N : I
    //   309: aload_0
    //   310: getfield Q : I
    //   313: iconst_2
    //   314: idiv
    //   315: bipush #16
    //   317: iadd
    //   318: aload_0
    //   319: getfield Q : I
    //   322: bipush #16
    //   324: idiv
    //   325: isub
    //   326: iadd
    //   327: putfield N : I
    //   330: iload #9
    //   332: ifeq -> 382
    //   335: aload_0
    //   336: getfield M : I
    //   339: aload_0
    //   340: getfield Y : [[I
    //   343: aload_0
    //   344: getfield J : I
    //   347: aaload
    //   348: aload_0
    //   349: getfield O : I
    //   352: iaload
    //   353: if_icmple -> 382
    //   356: aload_0
    //   357: dup
    //   358: getfield N : I
    //   361: aload_0
    //   362: getfield Q : I
    //   365: iconst_2
    //   366: idiv
    //   367: bipush #16
    //   369: iadd
    //   370: aload_0
    //   371: getfield Q : I
    //   374: bipush #16
    //   376: idiv
    //   377: isub
    //   378: isub
    //   379: putfield N : I
    //   382: aload_0
    //   383: aload_0
    //   384: getfield N : I
    //   387: bipush #8
    //   389: ishr
    //   390: putfield M : I
    //   393: aload_0
    //   394: getfield M : I
    //   397: bipush #-19
    //   399: if_icmpge -> 408
    //   402: aload_0
    //   403: bipush #-19
    //   405: putfield M : I
    //   408: aload_0
    //   409: getfield M : I
    //   412: bipush #19
    //   414: if_icmple -> 423
    //   417: aload_0
    //   418: bipush #19
    //   420: putfield M : I
    //   423: aload_0
    //   424: getfield s : S
    //   427: bipush #9
    //   429: if_icmpeq -> 492
    //   432: aload_0
    //   433: dup
    //   434: getfield P : I
    //   437: iconst_1
    //   438: isub
    //   439: putfield P : I
    //   442: aload_0
    //   443: getfield P : I
    //   446: ifge -> 492
    //   449: aload_0
    //   450: getfield Q : I
    //   453: ifle -> 492
    //   456: aload_0
    //   457: sipush #384
    //   460: aload_0
    //   461: getfield Q : I
    //   464: isub
    //   465: putfield P : I
    //   468: aload_0
    //   469: dup
    //   470: getfield O : I
    //   473: iconst_1
    //   474: iadd
    //   475: putfield O : I
    //   478: aload_0
    //   479: getfield O : I
    //   482: bipush #9
    //   484: if_icmpne -> 492
    //   487: aload_0
    //   488: iconst_0
    //   489: putfield O : I
    //   492: iconst_1
    //   493: istore_1
    //   494: aload_0
    //   495: getfield M : I
    //   498: ifge -> 503
    //   501: iconst_m1
    //   502: istore_1
    //   503: aload_0
    //   504: getfield X : [I
    //   507: iload_1
    //   508: aload_0
    //   509: getfield M : I
    //   512: imul
    //   513: iaload
    //   514: istore_3
    //   515: sipush #255
    //   518: istore #4
    //   520: bipush #75
    //   522: istore #5
    //   524: iload #9
    //   526: ifeq -> 577
    //   529: iload #4
    //   531: iload_3
    //   532: imul
    //   533: istore #4
    //   535: iload #4
    //   537: bipush #16
    //   539: ishr
    //   540: istore #4
    //   542: iload_1
    //   543: iload #4
    //   545: bipush #8
    //   547: ishr
    //   548: imul
    //   549: iconst_1
    //   550: iadd
    //   551: iconst_1
    //   552: iload_1
    //   553: iadd
    //   554: iconst_2
    //   555: idiv
    //   556: isub
    //   557: istore_2
    //   558: aload_0
    //   559: getfield cb : [I
    //   562: iload #5
    //   564: aload_0
    //   565: getfield ab : [I
    //   568: iload #5
    //   570: iaload
    //   571: iload_2
    //   572: iadd
    //   573: iastore
    //   574: iinc #5, -1
    //   577: iload #5
    //   579: ifgt -> 529
    //   582: bipush #75
    //   584: istore #6
    //   586: iload #9
    //   588: ifne -> 542
    //   591: iload #9
    //   593: ifeq -> 613
    //   596: aload_0
    //   597: getfield cb : [I
    //   600: iload #6
    //   602: aload_0
    //   603: getfield ab : [I
    //   606: iload #6
    //   608: iaload
    //   609: iastore
    //   610: iinc #6, 1
    //   613: iload #6
    //   615: sipush #195
    //   618: if_icmplt -> 596
    //   621: aload_0
    //   622: getfield W : Lj;
    //   625: aload_0
    //   626: getfield M : I
    //   629: aload_0
    //   630: getfield Q : I
    //   633: imul
    //   634: invokevirtual a : (I)V
    //   637: aload_0
    //   638: iload #9
    //   640: ifne -> 597
    //   643: getfield Q : I
    //   646: bipush #20
    //   648: if_icmple -> 671
    //   651: aload_0
    //   652: getfield mb : Lg;
    //   655: aload_0
    //   656: getfield M : I
    //   659: aload_0
    //   660: getfield Q : I
    //   663: imul
    //   664: ineg
    //   665: bipush #11
    //   667: ishr
    //   668: invokevirtual a : (I)V
    //   671: aload_0
    //   672: getfield mb : Lg;
    //   675: getfield s : I
    //   678: ifgt -> 722
    //   681: aload_0
    //   682: getfield mb : Lg;
    //   685: getfield o : I
    //   688: ifle -> 703
    //   691: aload_0
    //   692: getfield mb : Lg;
    //   695: getfield o : I
    //   698: bipush #120
    //   700: if_icmplt -> 722
    //   703: aload_0
    //   704: getfield R : I
    //   707: ifle -> 722
    //   710: aload_0
    //   711: dup
    //   712: getfield R : I
    //   715: sipush #128
    //   718: isub
    //   719: putfield R : I
    //   722: aload_0
    //   723: aload_0
    //   724: getfield R : I
    //   727: bipush #8
    //   729: ishr
    //   730: putfield Q : I
    //   733: aload_0
    //   734: getfield s : S
    //   737: bipush #9
    //   739: if_icmpeq -> 772
    //   742: aload_0
    //   743: aload_0
    //   744: getfield L : I
    //   747: aload_0
    //   748: getfield Q : I
    //   751: bipush #8
    //   753: ishl
    //   754: bipush #40
    //   756: idiv
    //   757: iadd
    //   758: putfield L : I
    //   761: aload_0
    //   762: aload_0
    //   763: getfield L : I
    //   766: bipush #8
    //   768: ishr
    //   769: putfield K : I
    //   772: aload_0
    //   773: getfield K : I
    //   776: aload_0
    //   777: getfield Z : [I
    //   780: aload_0
    //   781: getfield J : I
    //   784: iaload
    //   785: if_icmplt -> 825
    //   788: aload_0
    //   789: getfield V : I
    //   792: iflt -> 825
    //   795: aload_0
    //   796: bipush #8
    //   798: putfield s : S
    //   801: aload_0
    //   802: aload_0
    //   803: getfield V : I
    //   806: bipush #10
    //   808: irem
    //   809: putfield vb : I
    //   812: aload_0
    //   813: sipush #2816
    //   816: putfield R : I
    //   819: aload_0
    //   820: bipush #11
    //   822: putfield Q : I
    //   825: iconst_0
    //   826: istore #7
    //   828: iload #9
    //   830: ifeq -> 846
    //   833: aload_0
    //   834: getfield eb : [La;
    //   837: iload #7
    //   839: aaload
    //   840: invokevirtual b : ()V
    //   843: iinc #7, 1
    //   846: iload #7
    //   848: iconst_5
    //   849: if_icmplt -> 833
    //   852: aload_0
    //   853: getfield fb : Li;
    //   856: invokevirtual b : ()V
    //   859: aload_0
    //   860: getfield gb : Lb;
    //   863: invokevirtual b : ()V
    //   866: aload_0
    //   867: getfield jb : Lc;
    //   870: invokevirtual b : ()V
    //   873: aload_0
    //   874: getfield hb : Le;
    //   877: invokevirtual b : ()V
    //   880: aload_0
    //   881: getfield mb : Lg;
    //   884: invokevirtual a : ()V
    //   887: aload_0
    //   888: getfield Q : I
    //   891: bipush #50
    //   893: idiv
    //   894: istore #8
    //   896: iload #9
    //   898: ifne -> 843
    //   901: iload #8
    //   903: iconst_5
    //   904: if_icmple -> 910
    //   907: iconst_5
    //   908: istore #8
    //   910: aload_0
    //   911: iload #8
    //   913: putfield lb : I
    //   916: aload_0
    //   917: aload_0
    //   918: getfield K : I
    //   921: aload_0
    //   922: getfield T : I
    //   925: iadd
    //   926: putfield S : I
    //   929: aload_0
    //   930: getfield S : I
    //   933: ifge -> 941
    //   936: aload_0
    //   937: iconst_0
    //   938: putfield S : I
    //   941: aload_0
    //   942: getfield s : S
    //   945: bipush #9
    //   947: if_icmpeq -> 1005
    //   950: aload_0
    //   951: dup
    //   952: getfield U : I
    //   955: bipush #50
    //   957: isub
    //   958: putfield U : I
    //   961: aload_0
    //   962: aload_0
    //   963: getfield U : I
    //   966: bipush #8
    //   968: ishr
    //   969: putfield V : I
    //   972: aload_0
    //   973: getfield V : I
    //   976: ifgt -> 1005
    //   979: aload_0
    //   980: getfield xb : Z
    //   983: ifne -> 1005
    //   986: aload_0
    //   987: bipush #6
    //   989: putfield s : S
    //   992: aload_0
    //   993: sipush #2816
    //   996: putfield R : I
    //   999: aload_0
    //   1000: bipush #11
    //   1002: putfield Q : I
    //   1005: iload #9
    //   1007: ifeq -> 1566
    //   1010: aload_0
    //   1011: getfield s : S
    //   1014: bipush #8
    //   1016: if_icmpne -> 1361
    //   1019: aload_0
    //   1020: getfield qb : Z
    //   1023: ifeq -> 1205
    //   1026: aload_0
    //   1027: getfield V : I
    //   1030: ifgt -> 1205
    //   1033: aload_0
    //   1034: getfield I : Lf;
    //   1037: getfield Pb : [I
    //   1040: aload_0
    //   1041: getfield J : I
    //   1044: dup2
    //   1045: iaload
    //   1046: iconst_1
    //   1047: iadd
    //   1048: iastore
    //   1049: aload_0
    //   1050: new d
    //   1053: dup
    //   1054: invokespecial <init> : ()V
    //   1057: putfield sb : Ld;
    //   1060: aload_0
    //   1061: getfield I : Lf;
    //   1064: getfield Pb : [I
    //   1067: aload_0
    //   1068: getfield J : I
    //   1071: iaload
    //   1072: invokestatic valueOf : (I)Ljava/lang/String;
    //   1075: astore_1
    //   1076: aload_0
    //   1077: pop
    //   1078: aload_1
    //   1079: aload_0
    //   1080: pop
    //   1081: iconst_3
    //   1082: aload_0
    //   1083: getfield J : I
    //   1086: imul
    //   1087: invokestatic a : (Ljava/lang/String;I)V
    //   1090: goto -> 1094
    //   1093: astore_1
    //   1094: aload_0
    //   1095: getfield S : I
    //   1098: istore_1
    //   1099: iload_1
    //   1100: i2l
    //   1101: aload_0
    //   1102: getfield I : Lf;
    //   1105: getfield Rb : [J
    //   1108: aload_0
    //   1109: getfield J : I
    //   1112: laload
    //   1113: lcmp
    //   1114: ifgt -> 1134
    //   1117: aload_0
    //   1118: getfield I : Lf;
    //   1121: getfield Rb : [J
    //   1124: aload_0
    //   1125: getfield J : I
    //   1128: laload
    //   1129: lconst_0
    //   1130: lcmp
    //   1131: ifne -> 1195
    //   1134: aload_0
    //   1135: getfield I : Lf;
    //   1138: getfield Rb : [J
    //   1141: aload_0
    //   1142: getfield J : I
    //   1145: iload_1
    //   1146: i2l
    //   1147: lastore
    //   1148: aload_0
    //   1149: getfield I : Lf;
    //   1152: getfield Nb : [Ljava/lang/String;
    //   1155: aload_0
    //   1156: getfield J : I
    //   1159: iload_1
    //   1160: invokestatic toString : (I)Ljava/lang/String;
    //   1163: aastore
    //   1164: aload_0
    //   1165: pop
    //   1166: aload_0
    //   1167: getfield I : Lf;
    //   1170: getfield Nb : [Ljava/lang/String;
    //   1173: aload_0
    //   1174: getfield J : I
    //   1177: aaload
    //   1178: aload_0
    //   1179: pop
    //   1180: iconst_3
    //   1181: aload_0
    //   1182: getfield J : I
    //   1185: imul
    //   1186: iconst_2
    //   1187: iadd
    //   1188: invokestatic a : (Ljava/lang/String;I)V
    //   1191: goto -> 1195
    //   1194: astore_2
    //   1195: aload_0
    //   1196: iconst_0
    //   1197: putfield qb : Z
    //   1200: aload_0
    //   1201: aconst_null
    //   1202: putfield sb : Ld;
    //   1205: iconst_0
    //   1206: istore_1
    //   1207: iload #9
    //   1209: ifeq -> 1224
    //   1212: aload_0
    //   1213: getfield eb : [La;
    //   1216: iload_1
    //   1217: aaload
    //   1218: invokevirtual b : ()V
    //   1221: iinc #1, 1
    //   1224: iload_1
    //   1225: iconst_5
    //   1226: if_icmplt -> 1212
    //   1229: aload_0
    //   1230: iload #9
    //   1232: ifne -> 1213
    //   1235: getfield R : I
    //   1238: sipush #2816
    //   1241: if_icmple -> 1299
    //   1244: aload_0
    //   1245: dup
    //   1246: getfield R : I
    //   1249: sipush #256
    //   1252: isub
    //   1253: putfield R : I
    //   1256: aload_0
    //   1257: aload_0
    //   1258: getfield L : I
    //   1261: aload_0
    //   1262: getfield R : I
    //   1265: bipush #40
    //   1267: idiv
    //   1268: iadd
    //   1269: putfield L : I
    //   1272: aload_0
    //   1273: aload_0
    //   1274: getfield L : I
    //   1277: bipush #8
    //   1279: ishr
    //   1280: putfield K : I
    //   1283: aload_0
    //   1284: aload_0
    //   1285: getfield R : I
    //   1288: bipush #8
    //   1290: ishr
    //   1291: putfield Q : I
    //   1294: iload #9
    //   1296: ifeq -> 1329
    //   1299: aload_0
    //   1300: getfield V : I
    //   1303: ifle -> 1329
    //   1306: aload_0
    //   1307: dup
    //   1308: getfield V : I
    //   1311: bipush #10
    //   1313: isub
    //   1314: putfield V : I
    //   1317: aload_0
    //   1318: getfield V : I
    //   1321: ifgt -> 1329
    //   1324: aload_0
    //   1325: iconst_0
    //   1326: putfield V : I
    //   1329: aload_0
    //   1330: getfield mb : Lg;
    //   1333: invokevirtual a : ()V
    //   1336: aload_0
    //   1337: getfield Q : I
    //   1340: bipush #50
    //   1342: idiv
    //   1343: istore_2
    //   1344: iload_2
    //   1345: iconst_5
    //   1346: if_icmple -> 1351
    //   1349: iconst_5
    //   1350: istore_2
    //   1351: aload_0
    //   1352: iload_2
    //   1353: putfield lb : I
    //   1356: iload #9
    //   1358: ifeq -> 1566
    //   1361: aload_0
    //   1362: getfield s : S
    //   1365: bipush #6
    //   1367: if_icmpne -> 1566
    //   1370: aload_0
    //   1371: getfield rb : Z
    //   1374: ifeq -> 1450
    //   1377: aload_0
    //   1378: getfield I : Lf;
    //   1381: getfield Qb : [I
    //   1384: aload_0
    //   1385: getfield J : I
    //   1388: dup2
    //   1389: iaload
    //   1390: iconst_1
    //   1391: iadd
    //   1392: iastore
    //   1393: aload_0
    //   1394: new d
    //   1397: dup
    //   1398: invokespecial <init> : ()V
    //   1401: putfield sb : Ld;
    //   1404: aload_0
    //   1405: getfield I : Lf;
    //   1408: getfield Qb : [I
    //   1411: aload_0
    //   1412: getfield J : I
    //   1415: iaload
    //   1416: invokestatic valueOf : (I)Ljava/lang/String;
    //   1419: astore_1
    //   1420: aload_0
    //   1421: pop
    //   1422: aload_1
    //   1423: aload_0
    //   1424: pop
    //   1425: iconst_3
    //   1426: aload_0
    //   1427: getfield J : I
    //   1430: imul
    //   1431: iconst_1
    //   1432: iadd
    //   1433: invokestatic a : (Ljava/lang/String;I)V
    //   1436: goto -> 1440
    //   1439: astore_1
    //   1440: aload_0
    //   1441: iconst_0
    //   1442: putfield rb : Z
    //   1445: aload_0
    //   1446: aconst_null
    //   1447: putfield sb : Ld;
    //   1450: iconst_0
    //   1451: istore_1
    //   1452: iload #9
    //   1454: ifeq -> 1469
    //   1457: aload_0
    //   1458: getfield eb : [La;
    //   1461: iload_1
    //   1462: aaload
    //   1463: invokevirtual b : ()V
    //   1466: iinc #1, 1
    //   1469: iload_1
    //   1470: iconst_5
    //   1471: if_icmplt -> 1457
    //   1474: aload_0
    //   1475: iload #9
    //   1477: ifne -> 1458
    //   1480: getfield Q : I
    //   1483: sipush #2816
    //   1486: if_icmple -> 1501
    //   1489: aload_0
    //   1490: dup
    //   1491: getfield R : I
    //   1494: sipush #256
    //   1497: isub
    //   1498: putfield R : I
    //   1501: aload_0
    //   1502: aload_0
    //   1503: getfield L : I
    //   1506: aload_0
    //   1507: getfield R : I
    //   1510: bipush #40
    //   1512: idiv
    //   1513: iadd
    //   1514: putfield L : I
    //   1517: aload_0
    //   1518: aload_0
    //   1519: getfield L : I
    //   1522: bipush #8
    //   1524: ishr
    //   1525: putfield K : I
    //   1528: aload_0
    //   1529: aload_0
    //   1530: getfield R : I
    //   1533: bipush #8
    //   1535: ishr
    //   1536: putfield Q : I
    //   1539: aload_0
    //   1540: getfield mb : Lg;
    //   1543: invokevirtual a : ()V
    //   1546: aload_0
    //   1547: getfield Q : I
    //   1550: bipush #50
    //   1552: idiv
    //   1553: istore_2
    //   1554: iload_2
    //   1555: iconst_5
    //   1556: if_icmple -> 1561
    //   1559: iconst_5
    //   1560: istore_2
    //   1561: aload_0
    //   1562: iload_2
    //   1563: putfield lb : I
    //   1566: return
    // Exception table:
    //   from	to	target	type
    //   1060	1090	1093	java/lang/Exception
    //   1164	1191	1194	java/lang/Exception
    //   1404	1436	1439	java/lang/Exception
  }
  
  public void run() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #8
    //   5: invokestatic currentThread : ()Ljava/lang/Thread;
    //   8: astore_1
    //   9: iload #8
    //   11: ifeq -> 159
    //   14: invokestatic currentTimeMillis : ()J
    //   17: lstore_2
    //   18: aload_0
    //   19: getfield l : Z
    //   22: ifne -> 65
    //   25: aload_0
    //   26: invokevirtual isShown : ()Z
    //   29: ifeq -> 53
    //   32: aload_0
    //   33: getfield k : Z
    //   36: ifne -> 44
    //   39: aload_0
    //   40: iconst_1
    //   41: putfield k : Z
    //   44: aload_0
    //   45: invokespecial a : ()V
    //   48: iload #8
    //   50: ifeq -> 65
    //   53: aload_0
    //   54: getfield k : Z
    //   57: ifeq -> 65
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield l : Z
    //   65: aload_0
    //   66: aload_0
    //   67: getfield Bb : Z
    //   70: ifne -> 77
    //   73: iconst_1
    //   74: goto -> 78
    //   77: iconst_0
    //   78: putfield Bb : Z
    //   81: aload_0
    //   82: invokevirtual isShown : ()Z
    //   85: ifeq -> 110
    //   88: aload_0
    //   89: getfield Bb : Z
    //   92: ifeq -> 110
    //   95: aload_0
    //   96: iconst_0
    //   97: iconst_0
    //   98: bipush #120
    //   100: sipush #160
    //   103: invokevirtual repaint : (IIII)V
    //   106: aload_0
    //   107: invokevirtual serviceRepaints : ()V
    //   110: invokestatic currentTimeMillis : ()J
    //   113: lload_2
    //   114: lsub
    //   115: lstore #4
    //   117: lload #4
    //   119: ldc2_w 40
    //   122: lcmp
    //   123: ifge -> 156
    //   126: aload_0
    //   127: astore #6
    //   129: aload #6
    //   131: monitorenter
    //   132: aload_0
    //   133: ldc2_w 40
    //   136: lload #4
    //   138: lsub
    //   139: invokevirtual wait : (J)V
    //   142: aload #6
    //   144: monitorexit
    //   145: goto -> 159
    //   148: astore #7
    //   150: aload #6
    //   152: monitorexit
    //   153: aload #7
    //   155: athrow
    //   156: invokestatic yield : ()V
    //   159: aload_1
    //   160: aload_0
    //   161: getfield m : Ljava/lang/Thread;
    //   164: if_acmpeq -> 14
    //   167: iload #8
    //   169: ifne -> 159
    //   172: goto -> 176
    //   175: astore_2
    //   176: return
    // Exception table:
    //   from	to	target	type
    //   9	167	175	java/lang/Exception
    //   132	145	148	finally
    //   148	153	148	finally
  }
  
  public synchronized void b() {
    this.m = new Thread(this);
    this.m.start();
  }
  
  public synchronized void c() {
    this.m = null;
  }
  
  public void hideNotify() {
    this.l = true;
  }
  
  public void keyPressed(int paramInt) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #4
    //   5: aload_0
    //   6: getfield l : Z
    //   9: ifeq -> 46
    //   12: aload_0
    //   13: invokevirtual isShown : ()Z
    //   16: ifeq -> 46
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield l : Z
    //   24: aload_0
    //   25: getfield I : Lf;
    //   28: getfield g : [Z
    //   31: iconst_2
    //   32: iconst_1
    //   33: bastore
    //   34: aload_0
    //   35: getfield I : Lf;
    //   38: invokevirtual a : ()V
    //   41: aload_0
    //   42: iconst_2
    //   43: putfield s : S
    //   46: aload_0
    //   47: getfield Ab : Z
    //   50: ifeq -> 101
    //   53: iload_1
    //   54: bipush #-20
    //   56: if_icmpeq -> 65
    //   59: iload_1
    //   60: bipush #-21
    //   62: if_icmpne -> 100
    //   65: aload_0
    //   66: getfield I : Lf;
    //   69: getfield g : [Z
    //   72: iconst_2
    //   73: iconst_0
    //   74: bastore
    //   75: aload_0
    //   76: getfield I : Lf;
    //   79: invokevirtual a : ()V
    //   82: aload_0
    //   83: getfield I : Lf;
    //   86: invokevirtual c : ()V
    //   89: aload_0
    //   90: iconst_2
    //   91: putfield s : S
    //   94: aload_0
    //   95: iconst_0
    //   96: putfield Ab : Z
    //   99: return
    //   100: return
    //   101: iconst_0
    //   102: istore_2
    //   103: aload_0
    //   104: iload_1
    //   105: invokevirtual getGameAction : (I)I
    //   108: istore_2
    //   109: goto -> 113
    //   112: astore_3
    //   113: aload_0
    //   114: getfield s : S
    //   117: iconst_1
    //   118: if_icmpne -> 136
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield H : I
    //   126: aload_0
    //   127: iconst_2
    //   128: putfield s : S
    //   131: iload #4
    //   133: ifeq -> 353
    //   136: aload_0
    //   137: getfield s : S
    //   140: iconst_2
    //   141: if_icmpne -> 157
    //   144: aload_0
    //   145: getfield I : Lf;
    //   148: iload_1
    //   149: invokevirtual b : (I)V
    //   152: iload #4
    //   154: ifeq -> 353
    //   157: aload_0
    //   158: getfield s : S
    //   161: iconst_5
    //   162: if_icmpne -> 289
    //   165: iload_1
    //   166: bipush #-20
    //   168: if_icmpeq -> 177
    //   171: iload_1
    //   172: bipush #-21
    //   174: if_icmpne -> 204
    //   177: aload_0
    //   178: getfield I : Lf;
    //   181: getfield g : [Z
    //   184: iconst_2
    //   185: iconst_1
    //   186: bastore
    //   187: aload_0
    //   188: getfield I : Lf;
    //   191: invokevirtual a : ()V
    //   194: aload_0
    //   195: iconst_2
    //   196: putfield s : S
    //   199: iload #4
    //   201: ifeq -> 353
    //   204: iload_2
    //   205: iconst_5
    //   206: if_icmpeq -> 215
    //   209: iload_1
    //   210: bipush #54
    //   212: if_icmpne -> 225
    //   215: aload_0
    //   216: iconst_1
    //   217: putfield z : S
    //   220: iload #4
    //   222: ifeq -> 353
    //   225: iload_2
    //   226: iconst_2
    //   227: if_icmpeq -> 236
    //   230: iload_1
    //   231: bipush #52
    //   233: if_icmpne -> 246
    //   236: aload_0
    //   237: iconst_2
    //   238: putfield z : S
    //   241: iload #4
    //   243: ifeq -> 353
    //   246: iload_2
    //   247: iconst_1
    //   248: if_icmpeq -> 257
    //   251: iload_1
    //   252: bipush #50
    //   254: if_icmpne -> 267
    //   257: aload_0
    //   258: iconst_3
    //   259: putfield z : S
    //   262: iload #4
    //   264: ifeq -> 353
    //   267: iload_2
    //   268: bipush #6
    //   270: if_icmpeq -> 279
    //   273: iload_1
    //   274: bipush #56
    //   276: if_icmpne -> 353
    //   279: aload_0
    //   280: iconst_4
    //   281: putfield z : S
    //   284: iload #4
    //   286: ifeq -> 353
    //   289: aload_0
    //   290: getfield s : S
    //   293: bipush #6
    //   295: if_icmpeq -> 307
    //   298: aload_0
    //   299: getfield s : S
    //   302: bipush #8
    //   304: if_icmpne -> 353
    //   307: iload_2
    //   308: bipush #8
    //   310: if_icmpeq -> 331
    //   313: iload_1
    //   314: bipush #53
    //   316: if_icmpeq -> 331
    //   319: iload_1
    //   320: bipush #-20
    //   322: if_icmpeq -> 331
    //   325: iload_1
    //   326: bipush #-21
    //   328: if_icmpne -> 353
    //   331: aload_0
    //   332: getfield I : Lf;
    //   335: getfield g : [Z
    //   338: iconst_2
    //   339: iconst_0
    //   340: bastore
    //   341: aload_0
    //   342: getfield I : Lf;
    //   345: invokevirtual a : ()V
    //   348: aload_0
    //   349: iconst_2
    //   350: putfield s : S
    //   353: return
    // Exception table:
    //   from	to	target	type
    //   103	109	112	java/lang/IllegalArgumentException
  }
  
  public void keyReleased(int paramInt) {
    this.z = -1;
  }
  
  private void a(int[][] paramArrayOfint, int paramInt) {
    a(paramArrayOfint, 0, paramInt - 1);
  }
  
  private void a(int[][] paramArrayOfint, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #10
    //   5: iload_2
    //   6: istore #4
    //   8: iload_3
    //   9: istore #5
    //   11: aload_1
    //   12: iload_2
    //   13: iload_3
    //   14: iadd
    //   15: iconst_2
    //   16: idiv
    //   17: aaload
    //   18: iconst_0
    //   19: iaload
    //   20: istore #9
    //   22: iload #10
    //   24: ifeq -> 30
    //   27: iinc #4, 1
    //   30: aload_1
    //   31: iload #4
    //   33: aaload
    //   34: iconst_0
    //   35: iaload
    //   36: iload #9
    //   38: if_icmple -> 55
    //   41: iload #4
    //   43: iload_3
    //   44: if_icmplt -> 27
    //   47: iload #10
    //   49: ifeq -> 55
    //   52: iinc #5, -1
    //   55: iload #9
    //   57: aload_1
    //   58: iload #5
    //   60: aaload
    //   61: iconst_0
    //   62: iaload
    //   63: if_icmple -> 77
    //   66: iload #5
    //   68: iload_2
    //   69: iload #10
    //   71: ifne -> 81
    //   74: if_icmpgt -> 52
    //   77: iload #4
    //   79: iload #5
    //   81: if_icmpgt -> 146
    //   84: aload_1
    //   85: iload #4
    //   87: aaload
    //   88: iconst_0
    //   89: iaload
    //   90: istore #7
    //   92: aload_1
    //   93: iload #4
    //   95: aaload
    //   96: iconst_1
    //   97: iaload
    //   98: istore #8
    //   100: aload_1
    //   101: iload #4
    //   103: aaload
    //   104: iconst_0
    //   105: aload_1
    //   106: iload #5
    //   108: aaload
    //   109: iconst_0
    //   110: iaload
    //   111: iastore
    //   112: aload_1
    //   113: iload #4
    //   115: aaload
    //   116: iconst_1
    //   117: aload_1
    //   118: iload #5
    //   120: aaload
    //   121: iconst_1
    //   122: iaload
    //   123: iastore
    //   124: aload_1
    //   125: iload #5
    //   127: aaload
    //   128: iconst_0
    //   129: iload #7
    //   131: iastore
    //   132: aload_1
    //   133: iload #5
    //   135: aaload
    //   136: iconst_1
    //   137: iload #8
    //   139: iastore
    //   140: iinc #4, 1
    //   143: iinc #5, -1
    //   146: iload #4
    //   148: iload #5
    //   150: if_icmple -> 30
    //   153: iload_2
    //   154: iload #5
    //   156: iload #10
    //   158: ifne -> 63
    //   161: if_icmpge -> 172
    //   164: aload_0
    //   165: aload_1
    //   166: iload_2
    //   167: iload #5
    //   169: invokespecial a : ([[III)V
    //   172: iload #5
    //   174: iload_3
    //   175: if_icmpge -> 186
    //   178: aload_0
    //   179: aload_1
    //   180: iload #4
    //   182: iload_3
    //   183: invokespecial a : ([[III)V
    //   186: return
  }
  
  void d() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore_3
    //   4: aload_0
    //   5: getfield I : Lf;
    //   8: iconst_0
    //   9: invokevirtual a : (I)V
    //   12: aload_0
    //   13: getfield I : Lf;
    //   16: aconst_null
    //   17: putfield lc : Lh;
    //   20: invokestatic gc : ()V
    //   23: aload_0
    //   24: getfield i : Z
    //   27: ifeq -> 253
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield l : Z
    //   35: aload_0
    //   36: lconst_0
    //   37: putfield o : J
    //   40: aload_0
    //   41: iconst_m1
    //   42: putfield z : S
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield O : I
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield N : I
    //   55: aload_0
    //   56: iconst_0
    //   57: putfield M : I
    //   60: aload_0
    //   61: sipush #256
    //   64: putfield P : I
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield S : I
    //   72: aload_0
    //   73: iconst_0
    //   74: putfield T : I
    //   77: aload_0
    //   78: sipush #25600
    //   81: putfield U : I
    //   84: aload_0
    //   85: bipush #100
    //   87: putfield V : I
    //   90: aload_0
    //   91: bipush #50
    //   93: putfield kb : I
    //   96: aload_0
    //   97: iconst_0
    //   98: putfield lb : I
    //   101: aload_0
    //   102: bipush #100
    //   104: putfield tb : I
    //   107: aload_0
    //   108: iconst_0
    //   109: putfield r : I
    //   112: aload_0
    //   113: iconst_0
    //   114: putfield K : I
    //   117: aload_0
    //   118: iconst_0
    //   119: putfield L : I
    //   122: aload_0
    //   123: sipush #256
    //   126: putfield P : I
    //   129: aload_0
    //   130: iconst_0
    //   131: putfield Q : I
    //   134: aload_0
    //   135: sipush #2816
    //   138: putfield R : I
    //   141: aload_0
    //   142: iconst_0
    //   143: putfield ib : I
    //   146: aload_0
    //   147: getfield mb : Lg;
    //   150: invokevirtual f : ()V
    //   153: aload_0
    //   154: getfield gb : Lb;
    //   157: invokevirtual a : ()V
    //   160: aload_0
    //   161: getfield jb : Lc;
    //   164: invokevirtual a : ()V
    //   167: aload_0
    //   168: getfield hb : Le;
    //   171: invokevirtual a : ()V
    //   174: aload_0
    //   175: getfield fb : Li;
    //   178: invokevirtual a : ()V
    //   181: aload_0
    //   182: getfield I : Lf;
    //   185: bipush #100
    //   187: invokevirtual a : (I)V
    //   190: iconst_0
    //   191: istore_1
    //   192: iload_3
    //   193: ifeq -> 208
    //   196: aload_0
    //   197: getfield eb : [La;
    //   200: iload_1
    //   201: aaload
    //   202: invokevirtual a : ()V
    //   205: iinc #1, 1
    //   208: iload_1
    //   209: iconst_5
    //   210: if_icmplt -> 196
    //   213: aload_0
    //   214: bipush #9
    //   216: putfield s : S
    //   219: aload_0
    //   220: aload_0
    //   221: iconst_1
    //   222: dup_x1
    //   223: putfield rb : Z
    //   226: putfield qb : Z
    //   229: aload_0
    //   230: iload_3
    //   231: ifne -> 197
    //   234: getfield yb : Z
    //   237: ifeq -> 252
    //   240: aload_0
    //   241: invokestatic currentTimeMillis : ()J
    //   244: putfield zb : J
    //   247: aload_0
    //   248: iconst_0
    //   249: putfield Ab : Z
    //   252: return
    //   253: aload_0
    //   254: getfield I : Lf;
    //   257: iconst_5
    //   258: invokevirtual a : (I)V
    //   261: aload_0
    //   262: new j
    //   265: dup
    //   266: aload_0
    //   267: invokespecial <init> : (Ll;)V
    //   270: putfield W : Lj;
    //   273: aload_0
    //   274: sipush #196
    //   277: newarray int
    //   279: putfield ab : [I
    //   282: aload_0
    //   283: sipush #196
    //   286: newarray int
    //   288: putfield bb : [I
    //   291: aload_0
    //   292: sipush #196
    //   295: newarray int
    //   297: putfield cb : [I
    //   300: aload_0
    //   301: sipush #196
    //   304: newarray int
    //   306: putfield db : [I
    //   309: aload_0
    //   310: getfield I : Lf;
    //   313: bipush #20
    //   315: invokevirtual a : (I)V
    //   318: iconst_1
    //   319: istore_1
    //   320: iload_3
    //   321: ifeq -> 377
    //   324: aload_0
    //   325: getfield ab : [I
    //   328: iload_1
    //   329: bipush #45
    //   331: iload_1
    //   332: bipush #74
    //   334: imul
    //   335: bipush #50
    //   337: idiv
    //   338: isub
    //   339: iastore
    //   340: aload_0
    //   341: getfield bb : [I
    //   344: iload_1
    //   345: bipush #15
    //   347: iload_1
    //   348: bipush #74
    //   350: imul
    //   351: bipush #50
    //   353: idiv
    //   354: iadd
    //   355: iastore
    //   356: aload_0
    //   357: getfield db : [I
    //   360: iload_1
    //   361: ldc 65536
    //   363: aload_0
    //   364: getfield bb : [I
    //   367: iload_1
    //   368: iaload
    //   369: imul
    //   370: bipush #74
    //   372: idiv
    //   373: iastore
    //   374: iinc #1, 1
    //   377: iload_1
    //   378: sipush #196
    //   381: if_icmplt -> 324
    //   384: aload_0
    //   385: getfield I : Lf;
    //   388: bipush #25
    //   390: invokevirtual a : (I)V
    //   393: aload_0
    //   394: getfield db : [I
    //   397: iconst_0
    //   398: aload_0
    //   399: getfield db : [I
    //   402: iconst_1
    //   403: iaload
    //   404: iastore
    //   405: aload_0
    //   406: getfield wb : [Ljavax/microedition/lcdui/Image;
    //   409: iconst_1
    //   410: ldc '/immagini/velocita.png'
    //   412: invokestatic createImage : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   415: aastore
    //   416: aload_0
    //   417: getfield wb : [Ljavax/microedition/lcdui/Image;
    //   420: iconst_2
    //   421: ldc '/immagini/lampo.png'
    //   423: invokestatic createImage : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   426: aastore
    //   427: aload_0
    //   428: getfield wb : [Ljavax/microedition/lcdui/Image;
    //   431: iconst_3
    //   432: ldc '/immagini/oggetti.png'
    //   434: invokestatic createImage : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   437: aastore
    //   438: iload_3
    //   439: ifne -> 374
    //   442: goto -> 454
    //   445: astore_2
    //   446: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   449: ldc 'Errore'
    //   451: invokevirtual println : (Ljava/lang/String;)V
    //   454: aload_0
    //   455: iconst_5
    //   456: anewarray a
    //   459: putfield eb : [La;
    //   462: iconst_0
    //   463: istore_2
    //   464: iload_3
    //   465: ifeq -> 491
    //   468: aload_0
    //   469: getfield eb : [La;
    //   472: iload_2
    //   473: new a
    //   476: dup
    //   477: aload_0
    //   478: bipush #100
    //   480: iload_2
    //   481: imul
    //   482: bipush #8
    //   484: invokespecial <init> : (Ll;II)V
    //   487: aastore
    //   488: iinc #2, 1
    //   491: iload_2
    //   492: iconst_5
    //   493: if_icmplt -> 468
    //   496: aload_0
    //   497: new i
    //   500: dup
    //   501: aload_0
    //   502: bipush #12
    //   504: invokespecial <init> : (Ll;I)V
    //   507: putfield fb : Li;
    //   510: aload_0
    //   511: getfield I : Lf;
    //   514: bipush #30
    //   516: invokevirtual a : (I)V
    //   519: aload_0
    //   520: new b
    //   523: dup
    //   524: aload_0
    //   525: bipush #17
    //   527: invokespecial <init> : (Ll;I)V
    //   530: putfield gb : Lb;
    //   533: aload_0
    //   534: getfield I : Lf;
    //   537: bipush #40
    //   539: invokevirtual a : (I)V
    //   542: aload_0
    //   543: new e
    //   546: dup
    //   547: aload_0
    //   548: bipush #22
    //   550: invokespecial <init> : (Ll;I)V
    //   553: putfield hb : Le;
    //   556: aload_0
    //   557: getfield I : Lf;
    //   560: bipush #60
    //   562: invokevirtual a : (I)V
    //   565: aload_0
    //   566: new c
    //   569: dup
    //   570: aload_0
    //   571: bipush #27
    //   573: invokespecial <init> : (Ll;I)V
    //   576: putfield jb : Lc;
    //   579: aload_0
    //   580: getfield I : Lf;
    //   583: bipush #70
    //   585: invokevirtual a : (I)V
    //   588: aload_0
    //   589: new g
    //   592: dup
    //   593: aload_0
    //   594: invokespecial <init> : (Ll;)V
    //   597: putfield mb : Lg;
    //   600: aload_0
    //   601: getfield I : Lf;
    //   604: bipush #90
    //   606: invokevirtual a : (I)V
    //   609: aload_0
    //   610: bipush #10
    //   612: iconst_2
    //   613: multianewarray[[I 2
    //   617: putfield q : [[I
    //   620: aload_0
    //   621: iconst_0
    //   622: putfield T : I
    //   625: aload_0
    //   626: aload_0
    //   627: lconst_0
    //   628: dup2_x1
    //   629: putfield pb : J
    //   632: putfield ob : J
    //   635: aload_0
    //   636: getfield W : Lj;
    //   639: iconst_0
    //   640: invokevirtual a : (I)V
    //   643: aload_0
    //   644: getfield I : Lf;
    //   647: bipush #100
    //   649: invokevirtual a : (I)V
    //   652: aload_0
    //   653: iconst_1
    //   654: putfield i : Z
    //   657: aload_0
    //   658: bipush #9
    //   660: putfield s : S
    //   663: aload_0
    //   664: iload_3
    //   665: ifne -> 469
    //   668: getfield yb : Z
    //   671: ifeq -> 686
    //   674: aload_0
    //   675: invokestatic currentTimeMillis : ()J
    //   678: putfield zb : J
    //   681: aload_0
    //   682: iconst_0
    //   683: putfield Ab : Z
    //   686: return
    // Exception table:
    //   from	to	target	type
    //   405	438	445	java/io/IOException
  }
  
  void e() {
    try {
      this.wb[0] = Image.createImage("/immagini/m.png");
    } catch (IOException iOException) {
      System.out.println("Eccezione");
    } 
  }
  
  void f() {
    this.I.lc = null;
    System.gc();
    this.s = 5;
  }
  
  void g() {
    if (this.s != 2) {
      this.I.g[2] = true;
      this.I.a();
    } 
    this.s = 2;
    this.l = true;
  }
  
  void h() {
    this.l = false;
  }
  
  void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #9
    //   5: iload_3
    //   6: aload_0
    //   7: getfield Cb : [[I
    //   10: iload_2
    //   11: aaload
    //   12: iconst_3
    //   13: iaload
    //   14: iadd
    //   15: ifle -> 46
    //   18: iload #4
    //   20: aload_0
    //   21: getfield Cb : [[I
    //   24: iload_2
    //   25: aaload
    //   26: iconst_4
    //   27: iaload
    //   28: iadd
    //   29: ifle -> 46
    //   32: iload_3
    //   33: bipush #120
    //   35: if_icmpge -> 46
    //   38: iload #4
    //   40: sipush #160
    //   43: if_icmplt -> 47
    //   46: return
    //   47: iload_3
    //   48: istore #5
    //   50: iload #4
    //   52: istore #6
    //   54: aload_0
    //   55: getfield Cb : [[I
    //   58: iload_2
    //   59: aaload
    //   60: iconst_3
    //   61: iaload
    //   62: istore #7
    //   64: aload_0
    //   65: getfield Cb : [[I
    //   68: iload_2
    //   69: aaload
    //   70: iconst_4
    //   71: iaload
    //   72: istore #8
    //   74: iload #5
    //   76: ifge -> 94
    //   79: iload #7
    //   81: iload #5
    //   83: iadd
    //   84: istore #7
    //   86: iconst_0
    //   87: istore #5
    //   89: iload #9
    //   91: ifeq -> 105
    //   94: iload #5
    //   96: bipush #120
    //   98: if_icmple -> 105
    //   101: bipush #120
    //   103: istore #5
    //   105: iload #6
    //   107: ifge -> 125
    //   110: iload #8
    //   112: iload #6
    //   114: iadd
    //   115: istore #8
    //   117: iconst_0
    //   118: istore #6
    //   120: iload #9
    //   122: ifeq -> 138
    //   125: iload #6
    //   127: sipush #160
    //   130: if_icmple -> 138
    //   133: sipush #160
    //   136: istore #6
    //   138: iload #5
    //   140: iload #7
    //   142: iadd
    //   143: bipush #120
    //   145: if_icmple -> 155
    //   148: bipush #120
    //   150: iload #5
    //   152: isub
    //   153: istore #7
    //   155: iload #6
    //   157: iload #8
    //   159: iadd
    //   160: sipush #160
    //   163: if_icmple -> 174
    //   166: sipush #160
    //   169: iload #6
    //   171: isub
    //   172: istore #8
    //   174: aload_1
    //   175: iload #5
    //   177: iload #6
    //   179: iload #7
    //   181: iload #8
    //   183: invokevirtual setClip : (IIII)V
    //   186: aload_1
    //   187: aload_0
    //   188: getfield wb : [Ljavax/microedition/lcdui/Image;
    //   191: aload_0
    //   192: getfield Cb : [[I
    //   195: iload_2
    //   196: aaload
    //   197: iconst_0
    //   198: iaload
    //   199: aaload
    //   200: iload_3
    //   201: aload_0
    //   202: getfield Cb : [[I
    //   205: iload_2
    //   206: aaload
    //   207: iconst_1
    //   208: iaload
    //   209: isub
    //   210: iload #4
    //   212: aload_0
    //   213: getfield Cb : [[I
    //   216: iload_2
    //   217: aaload
    //   218: iconst_2
    //   219: iaload
    //   220: isub
    //   221: bipush #20
    //   223: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   226: aload_1
    //   227: iconst_0
    //   228: iconst_0
    //   229: bipush #120
    //   231: bipush #120
    //   233: invokevirtual setClip : (IIII)V
    //   236: return
  }
  
  void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #19
    //   5: aload_1
    //   6: iload_2
    //   7: iload_3
    //   8: iload #4
    //   10: iload #5
    //   12: invokevirtual drawLine : (IIII)V
    //   15: aload_1
    //   16: iload #4
    //   18: iload #5
    //   20: iload #6
    //   22: iload #7
    //   24: invokevirtual drawLine : (IIII)V
    //   27: aload_1
    //   28: iload #6
    //   30: iload #7
    //   32: iload_2
    //   33: iload_3
    //   34: invokevirtual drawLine : (IIII)V
    //   37: iload #4
    //   39: iload_2
    //   40: isub
    //   41: bipush #8
    //   43: ishl
    //   44: iload #5
    //   46: iload_3
    //   47: isub
    //   48: idiv
    //   49: istore #9
    //   51: iload #6
    //   53: iload_2
    //   54: isub
    //   55: bipush #8
    //   57: ishl
    //   58: iload #7
    //   60: iload_3
    //   61: isub
    //   62: idiv
    //   63: istore #10
    //   65: iload #4
    //   67: bipush #8
    //   69: ishl
    //   70: istore #11
    //   72: iload_2
    //   73: bipush #8
    //   75: ishl
    //   76: istore #12
    //   78: iload #12
    //   80: istore #13
    //   82: iload #8
    //   84: newarray int
    //   86: astore #14
    //   88: iload #8
    //   90: newarray int
    //   92: astore #15
    //   94: iconst_0
    //   95: istore #16
    //   97: iconst_1
    //   98: istore #17
    //   100: iconst_0
    //   101: istore #18
    //   103: iload #19
    //   105: ifeq -> 261
    //   108: iload #4
    //   110: iload #6
    //   112: if_icmpne -> 175
    //   115: iload #5
    //   117: iload #18
    //   119: iadd
    //   120: bipush #8
    //   122: ishl
    //   123: istore #16
    //   125: aload #14
    //   127: iload #18
    //   129: iload #11
    //   131: iastore
    //   132: aload #15
    //   134: iload #18
    //   136: iload #4
    //   138: bipush #8
    //   140: ishl
    //   141: iastore
    //   142: iload #18
    //   144: iload #8
    //   146: iconst_2
    //   147: idiv
    //   148: if_icmpge -> 163
    //   151: iload #11
    //   153: iload #9
    //   155: iadd
    //   156: istore #11
    //   158: iload #19
    //   160: ifeq -> 224
    //   163: iload #11
    //   165: iload #10
    //   167: iadd
    //   168: istore #11
    //   170: iload #19
    //   172: ifeq -> 224
    //   175: iload_3
    //   176: iload #5
    //   178: if_icmple -> 184
    //   181: iconst_m1
    //   182: istore #17
    //   184: iload_3
    //   185: iload #17
    //   187: iload #18
    //   189: imul
    //   190: iadd
    //   191: bipush #8
    //   193: ishl
    //   194: istore #16
    //   196: aload #14
    //   198: iload #18
    //   200: iload #12
    //   202: iastore
    //   203: aload #15
    //   205: iload #18
    //   207: iload #13
    //   209: iastore
    //   210: iload #12
    //   212: iload #9
    //   214: iadd
    //   215: istore #12
    //   217: iload #13
    //   219: iload #10
    //   221: iadd
    //   222: istore #13
    //   224: aload_1
    //   225: aload #14
    //   227: iload #18
    //   229: iaload
    //   230: sipush #256
    //   233: idiv
    //   234: iload #16
    //   236: sipush #256
    //   239: idiv
    //   240: aload #15
    //   242: iload #18
    //   244: iaload
    //   245: sipush #256
    //   248: idiv
    //   249: iload #16
    //   251: sipush #256
    //   254: idiv
    //   255: invokevirtual drawLine : (IIII)V
    //   258: iinc #18, 1
    //   261: iload #18
    //   263: iload #8
    //   265: if_icmplt -> 108
    //   268: iload #19
    //   270: ifne -> 175
    //   273: return
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */