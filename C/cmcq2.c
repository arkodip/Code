#include<stdio.h>
int main(){
int s=0,j=1;
while(j<=10)
{
j++;
if(j<=9) break;
if(j%2) continue;
s=s+j;
}
printf("\n%d",s);
}

