import java.util.Scanner;
class ques6
{
public static String fun(String s)
 {    
if ( s.length() <= 1 ) 
return s;
    if( s.substring(1,2).equals(s.substring(0,1)) ) 
return fun(s.substring(1));
    else 
return s.substring(0,1) + fun(s.substring(1));
     
    }
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
String m=fun(str);
System.out.print(m);
    }
}