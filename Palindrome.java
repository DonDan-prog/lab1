public class Palindrome 
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            String s = args[i];
            System.out.println(String.format("%s is %s", s, isPalindrome(s) ? "palindrome" : "not palindrome"));
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
