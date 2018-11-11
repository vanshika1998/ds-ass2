import java.util.Scanner;
class ques3
{
static int fun(int n)
{
if(n==0||n==1)
{
return 0;
}
else if(n==2)
{return 1;}
else if(n>2)
{return fun(n-1)+fun(n-2);}
else
{return -1;}
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=fun(n);
System.out.print(a);
}
}