public class widening {
  public static void main(String[] args) {
    byte myByte = 10;
    int myInt = myByte;
    long myLong = myInt;
    float myFloat = myLong;
    double myDouble = myFloat;
    short myShort = 20;
    int widenedShortToInt = myShort;
    char myChar = 'M';
    int widenedCharToInt = myChar;
    long widenedCharToLong = myChar;
    float widenedCharToFloat = myChar;
    double widenedCharToDouble = myChar;
    System.out.println(myByte);
    System.out.println(myInt);
    System.out.println(myLong);
    System.out.println(myFloat);
    System.out.println(myDouble);
    System.out.println(myShort);
    System.out.println(widenedShortToInt);
    System.out.println(myChar);
    System.out.println(widenedCharToInt);
    System.out.println(widenedCharToLong);
    System.out.println(widenedCharToFloat);
    System.out.println(widenedCharToDouble);
  }
}