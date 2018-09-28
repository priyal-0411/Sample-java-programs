import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String str,rev;
StringBuffer str1=new StringBuffer();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
str=sc.nextLine();
str1.append(str);
str1.reverse();
rev=str1.toString();
if(str.equalsIgnoreCase(rev))
System.out.println("palindrome");
else
System.out.println("NOT A PALINDROME");
}
}
