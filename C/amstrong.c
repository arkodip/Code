#include<stdio.h>
int main()
{
int n,sum=0,rem,temp;
scanf("%d",&n);
temp=n;
while(temp!=0)
{
rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(sum==n)
	printf("Yes");
else
	printf("No");
return 0;
}

