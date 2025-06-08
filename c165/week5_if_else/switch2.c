#include <stdio.h>
int main()
{
    char x ; //character

    printf("Enter [a-c|A-C]: ") ;
    scanf("%c", &x) ;

    switch (x)
    { 
    case 'a'://check for a
    case 'A':
        printf("Apple\n") ;
        break ;
    case 'b':
    case 'B':
        printf("Berry\n") ;
        break ;
    case 'c':
    case 'C':
        printf("Cherry\n") ;
        break ;
    default :
        printf("I don't know.\n") ;
        break;
    } 

    return 0 ;
}