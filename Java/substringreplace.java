class substringreplace
{
static String replacedany(String s,String f,String w)
{}
static String replaced(String s)
{
String temp="";
for(int i=0;i<s.length()-2;i++)
{
if(s.charAt(i)=='D' && s.charAt(i+1)=='O' && s.charAt(i+2)=='G')
	{temp+="CAT";i+=2;}
else
	temp+=s.charAt(i);
}
return temp;
}

public static void main(String args[])
{
String s="THE DOG MEET A DOG WITH A DOG";
System.out.println(replaced(s));
}
}
