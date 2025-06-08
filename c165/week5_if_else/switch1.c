#include <stdio.h>
int main()
{
    int n ;
    //Main 1. add 2. edit 3.delete 4.exit
    printf("Enter 1-4: ") ;
    scanf("%d", &n) ; //&n is Address of n

    switch (n)
    { // int or char
    case 1:
        printf("Add\n") ;
        break ;
    case 2:
        printf("Edit\n") ;
        break ;
    case 3:
        printf("Deiete\n") ;
        break ;
    case 4:
        printf("Exit\n") ;
        break ;
    default : // else / other cases / anything else
        printf("Unknown choice\n") ;
        break;//อันสุดท้ายมีหรือไม่มีก็ได้ not 
    } 
    
    printf("BYE BYE !!!\n") ;

    return 0 ;
}