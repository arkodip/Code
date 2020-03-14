
class Shift {
    public static void main(String[] args)  {
        String str="Sky is Blue!", x="";
        int n=3, i;
        
        System.out.println(str);

        for(i=0 ; i < str.length() ; i++)   {
            char c = str.charAt(i);
            if(Character.isLetter(c))   {
                if(Character.isUpperCase(c))    {
                    if(c+n > 90)
                        c = (n % 90) + 65;
                    else
                        c += n;
                }
                else if(Character.isLowerCase(c))    {
                    if(c+n > 122)
                        c = n % 122 + 97;
                    else
                        c += n;
                }
                x +=c ;
            }
            else
                x += c;

        }

        System.out.println(x);
    }
}