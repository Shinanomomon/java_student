#include <stdio.h>
int main (){
    int x,y;
    int c = 0;
    printf("Enter number of iterations:");
    scanf("%d",&x);
    printf("Enter number of iterations:");
    scanf("%d",&y);

   
    for(int m = 0; m < y ; m++){
        c=c+x;

        printf("%d ",c);
        printf("Hello\n");


    }
    
    
    return 0;
}