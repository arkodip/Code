class breakwordtosentence
{
static void wbreak(String s,String a[])
{
int i=0,j,k;
while(true)
{
	for(j=0;j<a.length;j++)
	{
		if(s.indexOf(a[j])==i)
		{
			System.out.print(a[j] + " ");
			break;
		}
	}
		i=i+a[j].length();
	if(i>=s.length())
		break;	

}
}

public static void main(String args[])
{
String s="GUNSANDROSES";
String a[]={"GUNS","SAND","GUN","AND","ROSES"};
wbreak(s,a);
}
}