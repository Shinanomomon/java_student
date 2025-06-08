
/*
//include <stdlib.h> //standard Library 
int main ()
{
    int n; // I forgot to assign an inttial value
    while (n<10)
    {
        printf("%d\n", n);
        n = n + 1;
    }
    printf("BYE BYE !!! \n");
    return 0 ;
    //return EXIT_SUCCESS;
}

#include <stdio.h>  //standard input output 
int main ()
{
    int n=0;  //start from zero
    while (n<10) //to N-1 //check before iteration
    {
        if (n==5) break;
        printf("%d\n", n);
    
        n = n + 1;
    }


    printf("BYE BYE !!! \n");

    return 0 ;
}*/
#include <stdio.h>  
int main ()
{
    int n=0;  
    while (n<10) 
    {

        printf("%d\n", n);
        if (n==5) break;
        n = n + 1;
 
    }


    printf("BYE BYE !!! \n");

    return 0 ;
}