class pascaldiamond
{
static void printnum(int n,int size)
{
int temp=size;
for(int i=1;i<=temp;i++)
{
	System.out.print(n/(int)(Math.pow(10,size-1))  + " ");
	n=n%(int)(Math.pow(10,size-1));
	size--;
}
}


static void printpascal(int n)
{
int x=1,g;
for(int i=1;i<=n;i++)
{
	for(g=1;g<=n-i;g++)
		System.out.print(" ");	
	printnum(x,i);
	System.out.println();
	x*=11;	
}
x/=121;
for(int i=n-1;i>=1;i--)
{
	for(g=1;g<=n-i;g++)
		System.out.print(" ");	
	printnum(x,i);
	System.out.println();
	x/=11;	
}
}

public static void main(String args[])
{
printpascal(5);
}
}
