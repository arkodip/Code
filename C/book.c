#include<stdio.h>
#include<math.h>
#define max 1000000007
int main()
{
int n,i,temp,out;
scanf("%d",&n);
temp=n-1;
if(n>=1&&n<=1000000)
{
     out=pow(2,temp);
     out=out+1;
     out=out%max;
     printf("%d\n,out);
}
