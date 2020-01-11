#include<stdio.h>
int main()
{
int n;
scanf("%d",&n);
for(int i=0;i<=n;i++)
{
if(i%2==0)
{
printf("%d",i+1);
for(int j=1;j<=n;j++)
printf("%d",i+1);
printf("\n");
}
else{
for(int j=1;j<n;j++)
printf("%d",i);
printf("%d",i+1);
}
}
}


