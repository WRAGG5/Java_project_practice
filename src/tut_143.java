public class tut_143
{
    public static void main (String args[])
{
    String str1 = "Strings are immuitable";
    String str2 = new String("Strings are immuitable");
    String str3 = new String("Integers are not immutable");

    int result = str1.compareTo( str2);
    System.out.println( result);

    result = str2.compareTo( str3);
    System.out.println( result);
}
}
