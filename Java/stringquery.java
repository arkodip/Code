class stringquery
{
static String s[]={"aba","bab","cd","xy","aba","cd"};
static String q[]={"aba","cd","xy"};

static void findcount(String s[],String q[])
{
int c=0;
for( int i=0;i<=q.length-1;i++)
{
c=0;
	for(int j=0;j<=s.length-1;j++)
	{
		if(s[j].equals(q[i]))
			c++;
	}

System.out.println(c);
}
}

public static void main(String args[])
{
findcount(s,q);
}
}		

