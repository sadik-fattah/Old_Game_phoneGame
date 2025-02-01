import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class d {
  private static RecordStore a = null;
  
  private static final int b = 1;
  
  private static final int c = 2;
  
  private static final int d = 3;
  
  private static final int e = 4;
  
  private static final int f = 5;
  
  private static final int g = 14;
  
  private static final int h = 15;
  
  private static final int i = 3;
  
  private static void a() throws RecordStoreException {
    // Byte code:
    //   0: getstatic JSVenice.b : Z
    //   3: istore #9
    //   5: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   8: ifnonnull -> 20
    //   11: ldc 'Database'
    //   13: iconst_1
    //   14: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   17: putstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   20: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   23: invokevirtual getNumRecords : ()I
    //   26: ifne -> 223
    //   29: iconst_1
    //   30: newarray byte
    //   32: dup
    //   33: iconst_0
    //   34: bipush #86
    //   36: bastore
    //   37: astore_0
    //   38: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   41: aload_0
    //   42: iconst_0
    //   43: iconst_1
    //   44: invokevirtual addRecord : ([BII)I
    //   47: pop
    //   48: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   51: aload_0
    //   52: iconst_0
    //   53: iconst_1
    //   54: invokevirtual addRecord : ([BII)I
    //   57: pop
    //   58: iconst_1
    //   59: newarray byte
    //   61: dup
    //   62: iconst_0
    //   63: bipush #70
    //   65: bastore
    //   66: astore_1
    //   67: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   70: aload_1
    //   71: iconst_0
    //   72: iconst_1
    //   73: invokevirtual addRecord : ([BII)I
    //   76: pop
    //   77: iconst_1
    //   78: newarray byte
    //   80: dup
    //   81: iconst_0
    //   82: bipush #48
    //   84: bastore
    //   85: astore_2
    //   86: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   89: aload_2
    //   90: iconst_0
    //   91: iconst_1
    //   92: invokevirtual addRecord : ([BII)I
    //   95: pop
    //   96: iconst_1
    //   97: newarray byte
    //   99: dup
    //   100: iconst_0
    //   101: bipush #48
    //   103: bastore
    //   104: astore_3
    //   105: iconst_1
    //   106: newarray byte
    //   108: dup
    //   109: iconst_0
    //   110: bipush #48
    //   112: bastore
    //   113: astore #4
    //   115: ldc '0'
    //   117: astore #5
    //   119: ldc ' '
    //   121: astore #6
    //   123: iconst_0
    //   124: istore #7
    //   126: iload #9
    //   128: ifeq -> 173
    //   131: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   134: aload_3
    //   135: iconst_0
    //   136: iconst_1
    //   137: invokevirtual addRecord : ([BII)I
    //   140: pop
    //   141: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   144: aload #4
    //   146: iconst_0
    //   147: iconst_1
    //   148: invokevirtual addRecord : ([BII)I
    //   151: pop
    //   152: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   155: aload #5
    //   157: invokevirtual getBytes : ()[B
    //   160: iconst_0
    //   161: aload #5
    //   163: invokevirtual length : ()I
    //   166: invokevirtual addRecord : ([BII)I
    //   169: pop
    //   170: iinc #7, 1
    //   173: iload #7
    //   175: iconst_3
    //   176: if_icmplt -> 131
    //   179: iconst_1
    //   180: newarray byte
    //   182: dup
    //   183: iconst_0
    //   184: bipush #70
    //   186: bastore
    //   187: astore #8
    //   189: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   192: aload #8
    //   194: iconst_0
    //   195: iconst_1
    //   196: invokevirtual addRecord : ([BII)I
    //   199: pop
    //   200: getstatic d.a : Ljavax/microedition/rms/RecordStore;
    //   203: aload #6
    //   205: invokevirtual getBytes : ()[B
    //   208: iconst_0
    //   209: aload #6
    //   211: invokevirtual length : ()I
    //   214: invokevirtual addRecord : ([BII)I
    //   217: iload #9
    //   219: ifne -> 169
    //   222: pop
    //   223: return
  }
  
  private static void b() throws RecordStoreException {
    if (a != null) {
      a.closeRecordStore();
      a = null;
    } 
  }
  
  private static byte a(int paramInt) throws RecordStoreException {
    a();
    byte[] arrayOfByte = a.getRecord(paramInt);
    b();
    return arrayOfByte[0];
  }
  
  private static void a(int paramInt, byte paramByte) throws RecordStoreException {
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = paramByte;
    a();
    a.setRecord(paramInt, arrayOfByte, 0, 1);
    b();
  }
  
  static String b(int paramInt) throws RecordStoreException {
    null = null;
    a();
    byte[] arrayOfByte = a.getRecord(5 + paramInt);
    b();
    return new String(arrayOfByte);
  }
  
  static int c(int paramInt) throws RecordStoreException {
    null = -1;
    a();
    byte[] arrayOfByte = a.getRecord(5 + paramInt);
    b();
    return arrayOfByte[0] - 48;
  }
  
  static void a(String paramString, int paramInt) throws RecordStoreException {
    a();
    byte[] arrayOfByte = paramString.getBytes();
    a.setRecord(5 + paramInt, arrayOfByte, 0, arrayOfByte.length);
    b();
  }
  
  static void d(int paramInt) throws RecordStoreException {
    a();
    byte b = (byte)(paramInt + 48);
    a(4, b);
    b();
  }
  
  static int c() throws RecordStoreException {
    int i = -1;
    a();
    byte b = a(4);
    i = b - 48;
    b();
    return i;
  }
  
  static boolean e(int paramInt) throws RecordStoreException {
    boolean bool = false;
    a();
    byte b = a(paramInt);
    if (b == 86)
      bool = true; 
    b();
    return bool;
  }
  
  static void a(int paramInt, boolean paramBoolean) throws RecordStoreException {
    byte b = 70;
    a();
    if (paramBoolean)
      b = 86; 
    a(paramInt, b);
    b();
  }
}


/* Location:              /home/jknz0/Downloads/MFI_JetSkiVenice_MotorolaT720_Eng_1_0_0.jar!/d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */