class bubble
{

static void Bubblesort(int arr[],int num)
{
int i,j,temp,p;
for ( i = 0 ; i < (num-1) ; i++ )
	{
		for ( j = 0 ; j < (num-1 - i) ; j++ )
		{
		if ( arr[j] > arr[j + 1] )
			{temp = arr[j] ;arr[j] = arr[j + 1] ;	arr[j + 1] = temp ;}
		}
  	}
}

static void Bubblesortdesc(int arr[],int num)
{
int i,j,temp,p;
for ( i = num/2 ; i < (num-1) ; i++ )
	{
		for ( j = num/2 ; j <= (num - i + 1 ) ; j++ )
		{
		if ( arr[j] < arr[j + 1] )
			{temp = arr[j] ;arr[j] = arr[j + 1] ;	arr[j + 1] = temp ;}
		}
  	}
}

public static void main(String args[])
{
int x[]={4,7,2,9,3,8,1},i;
int len=x.length;

for(i=0;i<len;i++)
	System.out.print(x[i] + " ");

Bubblesort(x,len/2);
Bubblesortdesc(x,len);
System.out.println();
for(i=0;i<len;i++)
	System.out.print(x[i] + " ");


}
}

