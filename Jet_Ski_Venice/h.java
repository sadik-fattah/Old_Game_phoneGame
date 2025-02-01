import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.rms.RecordStore;

public class h {
  private l a = null;
  
  private boolean b = false;
  
  private boolean c = false;
  
  String d;
  
  Random e = new Random();
  
  final int f = 0;
  
  final int g = 1;
  
  final int h = 2;
  
  final int i = 20;
  
  final int j = 3;
  
  final int k = 4;
  
  int l = 0;
  
  String m = "";
  
  String n = "";
  
  String o = "";
  
  String p = "";
  
  String q = "";
  
  boolean[] r = new boolean[256];
  
  void a(Graphics paramGraphics, String paramString1, String paramString2) {
    this;
    int i = 120 / 2;
    this;
    int j = 160 / 2 - 20;
    paramGraphics.drawString(paramString1, i, j + 20, 0x10 | 0x1);
    paramGraphics.drawString(paramString2, i, j + 40, 0x10 | 0x1);
  }
  
  void a(Graphics paramGraphics, String paramString) {
    this;
    int i = 120 / 2;
    this;
    int j = 160 / 2 - 20;
    paramGraphics.drawString(paramString, i, j, 0x10 | 0x1);
    int k = paramGraphics.getFont().stringWidth(paramString);
    paramGraphics.drawLine(i - k / 2, j + 16, i + k / 2, j + 16);
    paramGraphics.drawLine(i - k / 2, j + 18, i + k / 2, j + 18);
    paramGraphics.drawString("#  TO DELETE", i, j + 25, 0x10 | 0x1);
    paramGraphics.drawString("*  TO CONFIRM", i, j + 40, 0x10 | 0x1);
    paramGraphics.drawString(this.q, i, j + 60, 0x10 | 0x1);
    int m = paramGraphics.getFont().getHeight();
    if (System.currentTimeMillis() / 200L % 3L > 0L)
      paramGraphics.drawLine(i + paramGraphics.getFont().stringWidth(this.q) / 2, j + 60 + m, i + paramGraphics.getFont().stringWidth(this.q) / 2 + 7, j + 60 + m); 
  }
  
  void a(Graphics paramGraphics) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore_2
    //   4: aload_1
    //   5: iconst_0
    //   6: iconst_0
    //   7: aload_0
    //   8: pop
    //   9: bipush #120
    //   11: aload_0
    //   12: pop
    //   13: sipush #160
    //   16: invokevirtual setClip : (IIII)V
    //   19: aload_0
    //   20: getfield l : I
    //   23: iconst_1
    //   24: if_icmpne -> 42
    //   27: aload_0
    //   28: aload_1
    //   29: ldc 'YOUR APP.CODE IS'
    //   31: aload_0
    //   32: getfield m : Ljava/lang/String;
    //   35: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;Ljava/lang/String;)V
    //   38: iload_2
    //   39: ifeq -> 119
    //   42: aload_0
    //   43: getfield l : I
    //   46: iconst_3
    //   47: if_icmpne -> 63
    //   50: aload_0
    //   51: aload_1
    //   52: ldc 'APPLICATION'
    //   54: ldc 'REGISTERED'
    //   56: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;Ljava/lang/String;)V
    //   59: iload_2
    //   60: ifeq -> 119
    //   63: aload_0
    //   64: getfield l : I
    //   67: iconst_4
    //   68: if_icmpne -> 84
    //   71: aload_0
    //   72: aload_1
    //   73: ldc 'INVALID'
    //   75: ldc 'REGISTRATION'
    //   77: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;Ljava/lang/String;)V
    //   80: iload_2
    //   81: ifeq -> 119
    //   84: aload_0
    //   85: getfield l : I
    //   88: iconst_2
    //   89: if_icmpne -> 103
    //   92: aload_0
    //   93: aload_1
    //   94: ldc 'ENTER BOX.CODE'
    //   96: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;)V
    //   99: iload_2
    //   100: ifeq -> 119
    //   103: aload_0
    //   104: getfield l : I
    //   107: bipush #20
    //   109: if_icmpne -> 119
    //   112: aload_0
    //   113: aload_1
    //   114: ldc 'ENTER REG.CODE'
    //   116: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;)V
    //   119: return
  }
  
  void a() {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore_3
    //   4: aload_0
    //   5: getfield l : I
    //   8: ifne -> 84
    //   11: aload_0
    //   12: aload_0
    //   13: aload_0
    //   14: aload_0
    //   15: aload_0
    //   16: ldc ''
    //   18: dup_x1
    //   19: putfield q : Ljava/lang/String;
    //   22: dup_x1
    //   23: putfield p : Ljava/lang/String;
    //   26: dup_x1
    //   27: putfield o : Ljava/lang/String;
    //   30: dup_x1
    //   31: putfield n : Ljava/lang/String;
    //   34: putfield m : Ljava/lang/String;
    //   37: iconst_0
    //   38: istore_1
    //   39: iload_3
    //   40: ifeq -> 53
    //   43: aload_0
    //   44: getfield r : [Z
    //   47: iload_1
    //   48: iconst_0
    //   49: bastore
    //   50: iinc #1, 1
    //   53: iload_1
    //   54: aload_0
    //   55: getfield r : [Z
    //   58: arraylength
    //   59: if_icmplt -> 43
    //   62: aload_0
    //   63: aload_0
    //   64: invokevirtual c : ()Ljava/lang/String;
    //   67: putfield m : Ljava/lang/String;
    //   70: iload_3
    //   71: ifne -> 50
    //   74: goto -> 79
    //   77: astore_2
    //   78: return
    //   79: aload_0
    //   80: iconst_1
    //   81: putfield l : I
    //   84: return
    // Exception table:
    //   from	to	target	type
    //   62	70	77	java/lang/Exception
  }
  
  void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : I
    //   4: iconst_1
    //   5: if_icmpne -> 14
    //   8: aload_0
    //   9: iconst_2
    //   10: putfield l : I
    //   13: return
    //   14: aload_0
    //   15: getfield l : I
    //   18: iconst_3
    //   19: if_icmpeq -> 30
    //   22: aload_0
    //   23: getfield l : I
    //   26: iconst_4
    //   27: if_icmpne -> 62
    //   30: aload_0
    //   31: getfield a : Ll;
    //   34: getfield I : Lf;
    //   37: invokevirtual e : ()V
    //   40: aload_0
    //   41: getfield a : Ll;
    //   44: getfield I : Lf;
    //   47: aload_0
    //   48: getfield a : Ll;
    //   51: pop
    //   52: iconst_0
    //   53: putfield mc : I
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield l : I
    //   61: return
    //   62: aload_0
    //   63: getfield r : [Z
    //   66: iload_1
    //   67: invokestatic abs : (I)I
    //   70: iconst_1
    //   71: bastore
    //   72: aload_0
    //   73: getfield r : [Z
    //   76: aload_0
    //   77: pop
    //   78: bipush #48
    //   80: invokestatic abs : (I)I
    //   83: baload
    //   84: ifeq -> 126
    //   87: aload_0
    //   88: getfield r : [Z
    //   91: aload_0
    //   92: pop
    //   93: bipush #48
    //   95: invokestatic abs : (I)I
    //   98: iconst_0
    //   99: bastore
    //   100: new java/lang/StringBuffer
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: aload_0
    //   108: dup_x1
    //   109: getfield p : Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   115: ldc '0'
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: putfield p : Ljava/lang/String;
    //   126: aload_0
    //   127: getfield r : [Z
    //   130: aload_0
    //   131: pop
    //   132: bipush #49
    //   134: invokestatic abs : (I)I
    //   137: baload
    //   138: ifeq -> 180
    //   141: aload_0
    //   142: getfield r : [Z
    //   145: aload_0
    //   146: pop
    //   147: bipush #49
    //   149: invokestatic abs : (I)I
    //   152: iconst_0
    //   153: bastore
    //   154: new java/lang/StringBuffer
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: aload_0
    //   162: dup_x1
    //   163: getfield p : Ljava/lang/String;
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   169: ldc '1'
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: putfield p : Ljava/lang/String;
    //   180: aload_0
    //   181: getfield r : [Z
    //   184: aload_0
    //   185: pop
    //   186: bipush #50
    //   188: invokestatic abs : (I)I
    //   191: baload
    //   192: ifeq -> 234
    //   195: aload_0
    //   196: getfield r : [Z
    //   199: aload_0
    //   200: pop
    //   201: bipush #50
    //   203: invokestatic abs : (I)I
    //   206: iconst_0
    //   207: bastore
    //   208: new java/lang/StringBuffer
    //   211: dup
    //   212: invokespecial <init> : ()V
    //   215: aload_0
    //   216: dup_x1
    //   217: getfield p : Ljava/lang/String;
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   223: ldc '2'
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: putfield p : Ljava/lang/String;
    //   234: aload_0
    //   235: getfield r : [Z
    //   238: aload_0
    //   239: pop
    //   240: bipush #51
    //   242: invokestatic abs : (I)I
    //   245: baload
    //   246: ifeq -> 288
    //   249: aload_0
    //   250: getfield r : [Z
    //   253: aload_0
    //   254: pop
    //   255: bipush #51
    //   257: invokestatic abs : (I)I
    //   260: iconst_0
    //   261: bastore
    //   262: new java/lang/StringBuffer
    //   265: dup
    //   266: invokespecial <init> : ()V
    //   269: aload_0
    //   270: dup_x1
    //   271: getfield p : Ljava/lang/String;
    //   274: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   277: ldc '3'
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   282: invokevirtual toString : ()Ljava/lang/String;
    //   285: putfield p : Ljava/lang/String;
    //   288: aload_0
    //   289: getfield r : [Z
    //   292: aload_0
    //   293: pop
    //   294: bipush #52
    //   296: invokestatic abs : (I)I
    //   299: baload
    //   300: ifeq -> 342
    //   303: aload_0
    //   304: getfield r : [Z
    //   307: aload_0
    //   308: pop
    //   309: bipush #52
    //   311: invokestatic abs : (I)I
    //   314: iconst_0
    //   315: bastore
    //   316: new java/lang/StringBuffer
    //   319: dup
    //   320: invokespecial <init> : ()V
    //   323: aload_0
    //   324: dup_x1
    //   325: getfield p : Ljava/lang/String;
    //   328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   331: ldc '4'
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   336: invokevirtual toString : ()Ljava/lang/String;
    //   339: putfield p : Ljava/lang/String;
    //   342: aload_0
    //   343: getfield r : [Z
    //   346: aload_0
    //   347: pop
    //   348: bipush #53
    //   350: invokestatic abs : (I)I
    //   353: baload
    //   354: ifeq -> 396
    //   357: aload_0
    //   358: getfield r : [Z
    //   361: aload_0
    //   362: pop
    //   363: bipush #53
    //   365: invokestatic abs : (I)I
    //   368: iconst_0
    //   369: bastore
    //   370: new java/lang/StringBuffer
    //   373: dup
    //   374: invokespecial <init> : ()V
    //   377: aload_0
    //   378: dup_x1
    //   379: getfield p : Ljava/lang/String;
    //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   385: ldc '5'
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   390: invokevirtual toString : ()Ljava/lang/String;
    //   393: putfield p : Ljava/lang/String;
    //   396: aload_0
    //   397: getfield r : [Z
    //   400: aload_0
    //   401: pop
    //   402: bipush #54
    //   404: invokestatic abs : (I)I
    //   407: baload
    //   408: ifeq -> 450
    //   411: aload_0
    //   412: getfield r : [Z
    //   415: aload_0
    //   416: pop
    //   417: bipush #54
    //   419: invokestatic abs : (I)I
    //   422: iconst_0
    //   423: bastore
    //   424: new java/lang/StringBuffer
    //   427: dup
    //   428: invokespecial <init> : ()V
    //   431: aload_0
    //   432: dup_x1
    //   433: getfield p : Ljava/lang/String;
    //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   439: ldc '6'
    //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   444: invokevirtual toString : ()Ljava/lang/String;
    //   447: putfield p : Ljava/lang/String;
    //   450: aload_0
    //   451: getfield r : [Z
    //   454: aload_0
    //   455: pop
    //   456: bipush #55
    //   458: invokestatic abs : (I)I
    //   461: baload
    //   462: ifeq -> 504
    //   465: aload_0
    //   466: getfield r : [Z
    //   469: aload_0
    //   470: pop
    //   471: bipush #55
    //   473: invokestatic abs : (I)I
    //   476: iconst_0
    //   477: bastore
    //   478: new java/lang/StringBuffer
    //   481: dup
    //   482: invokespecial <init> : ()V
    //   485: aload_0
    //   486: dup_x1
    //   487: getfield p : Ljava/lang/String;
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   493: ldc '7'
    //   495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   498: invokevirtual toString : ()Ljava/lang/String;
    //   501: putfield p : Ljava/lang/String;
    //   504: aload_0
    //   505: getfield r : [Z
    //   508: aload_0
    //   509: pop
    //   510: bipush #56
    //   512: invokestatic abs : (I)I
    //   515: baload
    //   516: ifeq -> 558
    //   519: aload_0
    //   520: getfield r : [Z
    //   523: aload_0
    //   524: pop
    //   525: bipush #56
    //   527: invokestatic abs : (I)I
    //   530: iconst_0
    //   531: bastore
    //   532: new java/lang/StringBuffer
    //   535: dup
    //   536: invokespecial <init> : ()V
    //   539: aload_0
    //   540: dup_x1
    //   541: getfield p : Ljava/lang/String;
    //   544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   547: ldc '8'
    //   549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   552: invokevirtual toString : ()Ljava/lang/String;
    //   555: putfield p : Ljava/lang/String;
    //   558: aload_0
    //   559: getfield r : [Z
    //   562: aload_0
    //   563: pop
    //   564: bipush #57
    //   566: invokestatic abs : (I)I
    //   569: baload
    //   570: ifeq -> 612
    //   573: aload_0
    //   574: getfield r : [Z
    //   577: aload_0
    //   578: pop
    //   579: bipush #57
    //   581: invokestatic abs : (I)I
    //   584: iconst_0
    //   585: bastore
    //   586: new java/lang/StringBuffer
    //   589: dup
    //   590: invokespecial <init> : ()V
    //   593: aload_0
    //   594: dup_x1
    //   595: getfield p : Ljava/lang/String;
    //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   601: ldc '9'
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   606: invokevirtual toString : ()Ljava/lang/String;
    //   609: putfield p : Ljava/lang/String;
    //   612: aload_0
    //   613: invokespecial b : ()Z
    //   616: ifne -> 634
    //   619: aload_0
    //   620: getfield r : [Z
    //   623: aload_0
    //   624: pop
    //   625: bipush #42
    //   627: invokestatic abs : (I)I
    //   630: baload
    //   631: ifeq -> 790
    //   634: aload_0
    //   635: getfield r : [Z
    //   638: aload_0
    //   639: pop
    //   640: bipush #42
    //   642: invokestatic abs : (I)I
    //   645: iconst_0
    //   646: bastore
    //   647: aload_0
    //   648: aload_0
    //   649: getfield p : Ljava/lang/String;
    //   652: putfield q : Ljava/lang/String;
    //   655: aload_0
    //   656: getfield l : I
    //   659: iconst_1
    //   660: if_icmpne -> 669
    //   663: aload_0
    //   664: iconst_2
    //   665: putfield l : I
    //   668: return
    //   669: aload_0
    //   670: getfield l : I
    //   673: iconst_2
    //   674: if_icmpne -> 703
    //   677: aload_0
    //   678: aload_0
    //   679: getfield q : Ljava/lang/String;
    //   682: putfield n : Ljava/lang/String;
    //   685: aload_0
    //   686: aload_0
    //   687: ldc ''
    //   689: dup_x1
    //   690: putfield q : Ljava/lang/String;
    //   693: putfield p : Ljava/lang/String;
    //   696: aload_0
    //   697: bipush #20
    //   699: putfield l : I
    //   702: return
    //   703: aload_0
    //   704: getfield l : I
    //   707: bipush #20
    //   709: if_icmpne -> 790
    //   712: aload_0
    //   713: aload_0
    //   714: getfield q : Ljava/lang/String;
    //   717: putfield o : Ljava/lang/String;
    //   720: aload_0
    //   721: aload_0
    //   722: getfield n : Ljava/lang/String;
    //   725: aload_0
    //   726: getfield m : Ljava/lang/String;
    //   729: invokespecial a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   732: astore_2
    //   733: aload_2
    //   734: aload_0
    //   735: getfield o : Ljava/lang/String;
    //   738: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   741: invokevirtual equals : (Ljava/lang/Object;)Z
    //   744: ifeq -> 773
    //   747: aload_0
    //   748: invokespecial d : ()V
    //   751: aload_0
    //   752: aload_0
    //   753: ldc ''
    //   755: dup_x1
    //   756: putfield q : Ljava/lang/String;
    //   759: putfield p : Ljava/lang/String;
    //   762: aload_0
    //   763: iconst_3
    //   764: putfield l : I
    //   767: getstatic JSVenice.b : Z
    //   770: ifeq -> 789
    //   773: aload_0
    //   774: aload_0
    //   775: ldc ''
    //   777: dup_x1
    //   778: putfield q : Ljava/lang/String;
    //   781: putfield p : Ljava/lang/String;
    //   784: aload_0
    //   785: iconst_4
    //   786: putfield l : I
    //   789: return
    //   790: aload_0
    //   791: getfield r : [Z
    //   794: aload_0
    //   795: pop
    //   796: bipush #35
    //   798: invokestatic abs : (I)I
    //   801: baload
    //   802: ifeq -> 851
    //   805: aload_0
    //   806: getfield r : [Z
    //   809: aload_0
    //   810: pop
    //   811: bipush #35
    //   813: invokestatic abs : (I)I
    //   816: iconst_0
    //   817: bastore
    //   818: aload_0
    //   819: getfield p : Ljava/lang/String;
    //   822: invokevirtual length : ()I
    //   825: ifle -> 851
    //   828: aload_0
    //   829: getfield p : Ljava/lang/String;
    //   832: iconst_0
    //   833: aload_0
    //   834: getfield p : Ljava/lang/String;
    //   837: invokevirtual length : ()I
    //   840: iconst_1
    //   841: isub
    //   842: invokevirtual substring : (II)Ljava/lang/String;
    //   845: astore_2
    //   846: aload_0
    //   847: aload_2
    //   848: putfield p : Ljava/lang/String;
    //   851: aload_0
    //   852: aload_0
    //   853: getfield p : Ljava/lang/String;
    //   856: putfield q : Ljava/lang/String;
    //   859: return
  }
  
  private boolean b() {
    if (this.r[5]) {
      this.r[5] = false;
      return true;
    } 
    if (this.r[32]) {
      this.r[32] = false;
      return true;
    } 
    if (this.r[13]) {
      this.r[13] = false;
      return true;
    } 
    this;
    if (this.r[Math.abs(42)]) {
      this;
      this.r[Math.abs(42)] = false;
      return true;
    } 
    return false;
  }
  
  public h(l paraml, String paramString) {
    RecordStore recordStore = null;
    this.a = paraml;
    this.d = paramString;
    try {
      recordStore = RecordStore.openRecordStore("PR" + this.d, true);
    } catch (Exception exception) {
      return;
    } 
    try {
      recordStore.closeRecordStore();
    } catch (Exception exception) {}
    try {
      recordStore = RecordStore.openRecordStore("PAC" + this.d, true);
    } catch (Exception exception) {
      return;
    } 
    int i = a(recordStore);
    if (i == 0) {
      String str = a(this.d);
      try {
        a(str, recordStore);
      } catch (Exception exception) {
        return;
      } 
    } 
    try {
      recordStore.closeRecordStore();
    } catch (Exception exception) {}
  }
  
  private int a(RecordStore paramRecordStore) {
    int i = -1;
    try {
      i = paramRecordStore.getNumRecords();
    } catch (Exception exception) {}
    return i;
  }
  
  private void a(String paramString, RecordStore paramRecordStore) throws Exception {
    byte[] arrayOfByte = new byte[paramString.length()];
    arrayOfByte = paramString.getBytes();
    paramRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private String b(RecordStore paramRecordStore) throws Exception {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #5
    //   5: ldc ''
    //   7: astore_2
    //   8: sipush #150
    //   11: newarray byte
    //   13: astore_3
    //   14: aload_1
    //   15: aload_1
    //   16: invokevirtual getNextRecordID : ()I
    //   19: iconst_1
    //   20: isub
    //   21: invokevirtual getRecord : (I)[B
    //   24: astore_3
    //   25: iconst_0
    //   26: istore #4
    //   28: iload #5
    //   30: ifeq -> 59
    //   33: new java/lang/StringBuffer
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: aload_2
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   44: aload_3
    //   45: iload #4
    //   47: baload
    //   48: i2c
    //   49: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   52: invokevirtual toString : ()Ljava/lang/String;
    //   55: astore_2
    //   56: iinc #4, 1
    //   59: iload #4
    //   61: aload_3
    //   62: arraylength
    //   63: if_icmplt -> 33
    //   66: aload_2
    //   67: iload #5
    //   69: ifne -> 55
    //   72: areturn
  }
  
  private long a(long paramLong) {
    long l1 = 0L;
    long l2 = 2147483647L;
    l1 = this.e.nextInt();
    if (l1 < 0L)
      l1 = -l1; 
    return paramLong * l1 / l2;
  }
  
  private char a(byte paramByte) {
    return (paramByte <= 9) ? (char)(paramByte + 48) : '?';
  }
  
  private byte a(char paramChar) {
    byte b = (byte)paramChar;
    return (b >= 48 && b <= 57) ? (byte)(b - 48) : -1;
  }
  
  private String a(String paramString) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #7
    //   5: iconst_0
    //   6: istore_3
    //   7: ldc ''
    //   9: astore #4
    //   11: aload_1
    //   12: invokevirtual length : ()I
    //   15: iconst_3
    //   16: if_icmpeq -> 22
    //   19: ldc '0000000'
    //   21: areturn
    //   22: aload_1
    //   23: astore #4
    //   25: iconst_0
    //   26: istore_2
    //   27: iload #7
    //   29: ifeq -> 77
    //   32: aload_0
    //   33: ldc2_w 10
    //   36: invokespecial a : (J)J
    //   39: l2i
    //   40: i2b
    //   41: istore #5
    //   43: iload_3
    //   44: iload #5
    //   46: iadd
    //   47: istore_3
    //   48: new java/lang/StringBuffer
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: aload #4
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   60: aload_0
    //   61: iload #5
    //   63: invokespecial a : (B)C
    //   66: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: astore #4
    //   74: iinc #2, 1
    //   77: iload_2
    //   78: iconst_3
    //   79: if_icmplt -> 32
    //   82: aload_1
    //   83: invokevirtual length : ()I
    //   86: newarray char
    //   88: astore #6
    //   90: aload_1
    //   91: invokevirtual toCharArray : ()[C
    //   94: astore #6
    //   96: iconst_0
    //   97: iload #7
    //   99: ifne -> 41
    //   102: istore_2
    //   103: iload #7
    //   105: ifeq -> 122
    //   108: iload_3
    //   109: aload_0
    //   110: aload #6
    //   112: iload_2
    //   113: caload
    //   114: invokespecial a : (C)B
    //   117: iadd
    //   118: istore_3
    //   119: iinc #2, 1
    //   122: iload_2
    //   123: aload #6
    //   125: arraylength
    //   126: if_icmplt -> 108
    //   129: iload_3
    //   130: bipush #10
    //   132: irem
    //   133: i2b
    //   134: istore #5
    //   136: new java/lang/StringBuffer
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: aload #4
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   148: aload_0
    //   149: iload #5
    //   151: invokespecial a : (B)C
    //   154: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: astore #4
    //   162: iload #7
    //   164: ifne -> 119
    //   167: aload #4
    //   169: areturn
  }
  
  public String c() throws Exception {
    RecordStore recordStore = null;
    recordStore = RecordStore.openRecordStore("PAC" + this.d, false);
    recordStore.getNextRecordID();
    String str = b(recordStore);
    recordStore.closeRecordStore();
    return str;
  }
  
  private String a(String paramString1, String paramString2) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #12
    //   5: aload_1
    //   6: invokevirtual length : ()I
    //   9: newarray byte
    //   11: astore #6
    //   13: aload_2
    //   14: invokevirtual length : ()I
    //   17: newarray byte
    //   19: astore #7
    //   21: bipush #16
    //   23: newarray byte
    //   25: astore #8
    //   27: ldc '2754318209768193'
    //   29: astore #10
    //   31: bipush #16
    //   33: newarray byte
    //   35: astore #11
    //   37: aload_1
    //   38: invokevirtual length : ()I
    //   41: bipush #12
    //   43: if_icmplt -> 55
    //   46: aload_2
    //   47: invokevirtual length : ()I
    //   50: bipush #7
    //   52: if_icmpge -> 58
    //   55: ldc 'NULL'
    //   57: areturn
    //   58: aload_1
    //   59: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   62: invokevirtual getBytes : ()[B
    //   65: astore #6
    //   67: aload_2
    //   68: invokevirtual getBytes : ()[B
    //   71: astore #7
    //   73: aload #10
    //   75: invokevirtual getBytes : ()[B
    //   78: astore #11
    //   80: iconst_0
    //   81: istore #4
    //   83: iload #12
    //   85: ifeq -> 177
    //   88: aload #8
    //   90: iload #4
    //   92: iconst_4
    //   93: imul
    //   94: aload_0
    //   95: aload #6
    //   97: iload #4
    //   99: iconst_3
    //   100: imul
    //   101: baload
    //   102: i2c
    //   103: invokespecial a : (C)B
    //   106: bastore
    //   107: aload #8
    //   109: iload #4
    //   111: iconst_4
    //   112: imul
    //   113: iconst_1
    //   114: iadd
    //   115: aload_0
    //   116: aload #6
    //   118: iload #4
    //   120: iconst_3
    //   121: imul
    //   122: iconst_1
    //   123: iadd
    //   124: baload
    //   125: i2c
    //   126: invokespecial a : (C)B
    //   129: bastore
    //   130: aload #8
    //   132: iload #4
    //   134: iconst_4
    //   135: imul
    //   136: iconst_2
    //   137: iadd
    //   138: aload_0
    //   139: aload #6
    //   141: iload #4
    //   143: iconst_3
    //   144: imul
    //   145: iconst_2
    //   146: iadd
    //   147: baload
    //   148: i2c
    //   149: invokespecial a : (C)B
    //   152: bastore
    //   153: aload #8
    //   155: iload #4
    //   157: iconst_4
    //   158: imul
    //   159: iconst_3
    //   160: iadd
    //   161: aload_0
    //   162: aload #7
    //   164: iload #4
    //   166: iconst_3
    //   167: iadd
    //   168: baload
    //   169: i2c
    //   170: invokespecial a : (C)B
    //   173: bastore
    //   174: iinc #4, 1
    //   177: iload #4
    //   179: iconst_4
    //   180: if_icmplt -> 88
    //   183: iconst_0
    //   184: istore #4
    //   186: iload #12
    //   188: ifne -> 174
    //   191: iload #12
    //   193: ifeq -> 232
    //   196: aload #8
    //   198: iload #4
    //   200: baload
    //   201: istore #5
    //   203: iload #5
    //   205: aload_0
    //   206: aload #11
    //   208: iload #4
    //   210: baload
    //   211: i2c
    //   212: invokespecial a : (C)B
    //   215: iadd
    //   216: istore #5
    //   218: aload #8
    //   220: iload #4
    //   222: iload #5
    //   224: bipush #10
    //   226: irem
    //   227: i2b
    //   228: bastore
    //   229: iinc #4, 1
    //   232: iload #4
    //   234: bipush #16
    //   236: if_icmplt -> 196
    //   239: ldc ''
    //   241: astore #9
    //   243: iconst_0
    //   244: iload #12
    //   246: ifne -> 201
    //   249: istore #4
    //   251: iload #12
    //   253: ifeq -> 304
    //   256: new java/lang/StringBuffer
    //   259: dup
    //   260: invokespecial <init> : ()V
    //   263: aload #9
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   268: aload_0
    //   269: aload #8
    //   271: iload #4
    //   273: iconst_2
    //   274: imul
    //   275: baload
    //   276: aload #8
    //   278: iload #4
    //   280: iconst_2
    //   281: imul
    //   282: iconst_1
    //   283: iadd
    //   284: baload
    //   285: iadd
    //   286: bipush #10
    //   288: irem
    //   289: i2b
    //   290: invokespecial a : (B)C
    //   293: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   296: invokevirtual toString : ()Ljava/lang/String;
    //   299: astore #9
    //   301: iinc #4, 1
    //   304: iload #4
    //   306: bipush #8
    //   308: if_icmplt -> 256
    //   311: aload #9
    //   313: iload #12
    //   315: ifne -> 299
    //   318: areturn
  }
  
  private void d() {
    RecordStore recordStore = null;
    try {
      recordStore = RecordStore.openRecordStore("PR" + this.d, false);
    } catch (Exception exception) {
      return;
    } 
    int i = a(recordStore);
    if (i == 0)
      try {
        a("Laetita", recordStore);
      } catch (Exception exception) {
        return;
      }  
    try {
      recordStore.closeRecordStore();
    } catch (Exception exception) {}
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */