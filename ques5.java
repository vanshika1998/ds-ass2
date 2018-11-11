import java.util.*;
class sum
{
 int fun(int n)
{
if(n == 0)

 return 0;
return(n%10+fun(n/10));
 }

}
class ques5
{
  public static void main(String[] args)
  {
    String a1;
  int a,b;
    Scanner in = new Scanner(System.in);
      a1 = in.next();
       a = Integer.parseInt(a1);
    sum s = new sum();
  b=s.fun(a);
System.out.println("Sum of digits are" + b);
}
}