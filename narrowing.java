public class narrowing {
  public static void main(String[] args) {
    double myDouble = 78;
    float myFloat = (float) myDouble;
    long myLong = (long) myFloat;
    int myInt = (int) myLong;
    short myShort = (short) myInt;
     byte myByte = (byte) myShort;
    char myChar = 'M';
    int CharToInt = myChar;
    byte CharToByte = (byte) myChar;
     System.out.println(myDouble);
     System.out.println(myFloat);
     System.out.println(myLong);
     System.out.println(myInt);
     System.out.println(myShort);
     System.out.println(myByte);
    System.out.println(CharToInt);
    System.out.println(CharToByte);
  }
}