import java.util.Scanner;
class ques4
{
static int fun(int a,int b,int ans)
{
if(b==0)
return ans;
ans=ans*a;
return fun(a,b-1,ans);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=fun(a,b,1);
System.out.println(c);
}
}