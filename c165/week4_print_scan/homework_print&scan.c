#include <stdio.h>
int main()

{
  int x,y ; 
  float z ;
        printf("Input x Number = ") ;
        scanf("%d",&x) ;
        printf("Input y Number = ") ;
        scanf("%d",&y) ;

    z=x+y ;
      printf("%d + %d = %i" "\n", x, y, z);
    z=x-y ;
      printf("%d - %d = %i" "\n", x, y, z); 
    z=x*y ;
      printf("%d * %d = %i" "\n", x , y, z);
    z= x/y ;
      printf("%d / %d = %.2f" "\n", x, y, z);

    return 0 ;
}