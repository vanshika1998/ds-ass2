import java.util.Scanner;
class ques1
{
static void fun(int[] arr,int m,int i,int n)
{
if(arr[i]==m)
{
System.out.print("no.is present");
return;
}
if(i==n-1)
{
System.out.print("Number uis not present");
return;
}
else
{ fun(arr,m,i+1,n);}
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int m=s.nextInt();
fun(arr,m,0,n);
}
}