#include<stdio.h>
int main(){
int a=256,i;
for(i=0;i<=3;i++)
a=a>>2;
printf("\n%d",a);
for(i=0;i<=3;i++)
a=a<<2;
printf("\n%d",a);
}


