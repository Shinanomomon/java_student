#include <stdio.h>
int main()
{
    int score ;
    printf("Please enter number : ") ;
    scanf("%d", &score) ;

         printf("Your number = %i\n", score);

    if (score<=-1) 
        printf("The number is negative\n") ; 
       
    else if (score>0) 
        printf("The number is positive\n") ; 

    else   
        printf("The number is zero\n") ; 

   printf("BYE BYE !!!\n") ;

    return 0;
}
