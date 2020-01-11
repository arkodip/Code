class bigbrownfox
{
static boolean checkallchar(String s)
{
int c[]=new int[26];
int d[]=new int[26];

for(int i=0;i<s.length();i++)
{
int x=(int)(s.charAt(i));

if(x>=56 && x<=90)
	c[x-65]++;
if(x>=97 && x<=122)
	d[x-97]++;
}

for(int i=0;i<c.length;i++)
	if(c[i]==0)return false;

for(int i=0;i<d.length;i++)
	if(d[i]==0)return false;

return true;
}


public static void main(String args[])
{
String s="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
String t="the quick brown fox jumps over the lazy dog";
s+=t;
if(checkallchar(s)==false)
	System.out.println("MISSING SOME");
else
	System.out.println("OK");
}
}