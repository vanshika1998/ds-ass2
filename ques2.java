import java.util.Scanner;
class ques2
{
static void fun(int[] arr,int i,int j)
{
if(i>=j)
{
return;
}
else
{
int temp;
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
fun(arr,i+1,j-1);
}
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
fun(arr,0,n-1);
for(int i=0;i<n;i++)
{
System.out.print(arr[i] +  " ");
}
}
}