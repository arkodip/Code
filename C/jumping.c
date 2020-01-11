#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool jumping(int n){
    int last = n % 10;
    n = n/10;
    while(n>0){
        if(abs(last-n%10)==1){
            last = n%10;
            n/=10;
        }
        else
            return false;
    }
    return  true;
}

int main() {
	int t,n,i;
	scanf("%d",&t);
	while(t-- > 0){
        scanf("%d",&n);
        for(i=0;i<=n;i++){
            if(jumping(i))
                printf("%d ",i);
        }
        printf("\n");
	}
	return 0;
}