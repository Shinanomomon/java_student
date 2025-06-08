#include <stdio.h>
int main()
{
    int score ;
    printf("Please enter score [0-100] : ") ;
    scanf("%d", &score) ;

// HUMAN LANGUAGE = if this person fails then print ("you fail")
//indentation เขียนแบบสั้น 

    if (score<=49) 
       { // check for Fail only
        printf("You Fail\n") ; 
        printf("Please try harder next time.\n") ;
       }
    else {  //Otherwies 
        printf("You PASS.\n") ;
        printf("You are a good student.\n") ;
    }
    
    printf("BYE BYE !!!\n") ;
    return 0 ;
}