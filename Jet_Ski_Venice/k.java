public class k {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private String e;
  
  private char f;
  
  k(String paramString, char paramChar) {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #4
    //   5: aload_0
    //   6: invokespecial <init> : ()V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield e : Ljava/lang/String;
    //   14: aload_0
    //   15: aload_0
    //   16: getfield e : Ljava/lang/String;
    //   19: invokevirtual length : ()I
    //   22: putfield a : I
    //   25: aload_0
    //   26: getfield a : I
    //   29: ifne -> 48
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield b : I
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield c : I
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield d : I
    //   47: return
    //   48: aload_0
    //   49: iload_2
    //   50: putfield f : C
    //   53: aload_0
    //   54: iconst_1
    //   55: putfield b : I
    //   58: aload_0
    //   59: aload_0
    //   60: iconst_0
    //   61: dup_x1
    //   62: putfield d : I
    //   65: putfield c : I
    //   68: iconst_0
    //   69: istore_3
    //   70: iload #4
    //   72: ifeq -> 103
    //   75: aload_0
    //   76: getfield e : Ljava/lang/String;
    //   79: iload_3
    //   80: invokevirtual charAt : (I)C
    //   83: aload_0
    //   84: getfield f : C
    //   87: if_icmpne -> 100
    //   90: aload_0
    //   91: dup
    //   92: getfield b : I
    //   95: iconst_1
    //   96: iadd
    //   97: putfield b : I
    //   100: iinc #3, 1
    //   103: iload_3
    //   104: aload_0
    //   105: getfield a : I
    //   108: if_icmplt -> 75
    //   111: iload #4
    //   113: ifne -> 100
    //   116: return
  }
  
  public boolean a() {
    return (this.c < this.b);
  }
  
  public int b() {
    return this.b;
  }
  
  public String c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: aload_0
    //   5: getfield a : I
    //   8: if_icmplt -> 14
    //   11: ldc ''
    //   13: areturn
    //   14: aload_0
    //   15: dup
    //   16: getfield c : I
    //   19: iconst_1
    //   20: iadd
    //   21: putfield c : I
    //   24: ldc ''
    //   26: astore_1
    //   27: goto -> 81
    //   30: iload_2
    //   31: bipush #10
    //   33: if_icmpeq -> 71
    //   36: iload_2
    //   37: bipush #13
    //   39: if_icmpeq -> 71
    //   42: new java/lang/StringBuffer
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: aload_1
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   53: aload_0
    //   54: getfield e : Ljava/lang/String;
    //   57: aload_0
    //   58: getfield d : I
    //   61: invokevirtual charAt : (I)C
    //   64: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   67: invokevirtual toString : ()Ljava/lang/String;
    //   70: astore_1
    //   71: aload_0
    //   72: dup
    //   73: getfield d : I
    //   76: iconst_1
    //   77: iadd
    //   78: putfield d : I
    //   81: aload_0
    //   82: getfield d : I
    //   85: aload_0
    //   86: getfield a : I
    //   89: if_icmpge -> 118
    //   92: aload_0
    //   93: getfield e : Ljava/lang/String;
    //   96: getstatic JSVenice.b : Z
    //   99: ifne -> 129
    //   102: aload_0
    //   103: getfield d : I
    //   106: invokevirtual charAt : (I)C
    //   109: dup
    //   110: istore_2
    //   111: aload_0
    //   112: getfield f : C
    //   115: if_icmpne -> 30
    //   118: aload_0
    //   119: dup
    //   120: getfield d : I
    //   123: iconst_1
    //   124: iadd
    //   125: putfield d : I
    //   128: aload_1
    //   129: areturn
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */