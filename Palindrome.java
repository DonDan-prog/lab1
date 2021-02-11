import jdk.internal.joptsimple.internal.Strings;

public class Palindrome 
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            String s = args[i];

        }
    }
    public static String reverseString(String s)
    {
        String ret = "";
        for(int i = s.length() - 1; i >= 0; --i)
            ret += s.charAt(i);
        return ret;
    }
    public static boolean isPalindrome(String s)
    {
        return s.equals(reverseString(s));
    }
}
