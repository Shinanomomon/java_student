#include <stdio.h>
int main()
{
    int score ;
    printf("Please enter score [0-100] : ") ;
    scanf("%d", &score) ;


    //if (score<50)  printf("Fail\n") ; 
    //else   printf("You PASS.\n") ;
    //printf((score<50) ? "FAIL" : "PASS") ;
    printf("Your result is %s\n", (score<50) ? "FAIL" : "PASS") ;
    //printf("\n") ;
    
    return 0 ;
}