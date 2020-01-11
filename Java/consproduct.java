class consproduct
{
//max product of any two digits in a number
static int big=-1;

static int findbigpro(int x,int n)
{
int r,p;
while(n>0)
{
r=n%10;p=x*r;
if(p>big)big=p;
n/=10;
}
return big;
}

static int findpro(int n)
{
int r,p;
while(n>0)
{
r=n%10;
big = findbigpro(r,n/10);
n/=10;
}
return big;
}

public static void main(String args[])
{
System.out.println(findpro(58341));
System.out.println(findpro(58391));
}
}