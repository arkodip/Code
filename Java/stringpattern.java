import java.util.*;

class stringpattern
{
static void pattern(String s)
{
for(int r=0;r<=s.length()/2;r++)
{
	for(int g=1;g<=s.length()/2-r;g++)
		System.out.print(" ");
	for(int i=0;i<=2*r;i++)
		System.out.print(s.charAt(i));
	System.out.println();
}

for(int r=s.length()/2-1;r>=0;r--)
{
	for(int g=1;g<=s.length()/2-r;g++)
		System.out.print(" ");
	for(int i=0;i<=2*r;i++)
		System.out.print(s.charAt(i));
	System.out.println();
}

}
public static void main(String args[])
{
System.out.print("ENTER STRING: ");
Scanner sc = new Scanner(System.in);
String  s= sc.next();
pattern(s);
}
}