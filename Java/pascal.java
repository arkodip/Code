class pascal
{
static void printpascal(int n)
{
int x=1;
for(int i=1;i<=n;i++)
{
	System.out.println(x);
	x*=11;	
}
}

public static void main(String args[])
{
printpascal(5);
}
}
