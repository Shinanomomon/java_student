    #include <stdio.h>  
    int main ()
{
    int n=0;  
do  {
	    printf("1. add\n");
        printf(" 2. edit\n");
        printf(" 3.delete\n");
        printf(" 4.exit\n");
        printf("Please Enter [1-4]: ");
	    scanf("%d", &n);
	    printf("You enter: %d\n", n);
    } while (n>4 || n<1);


    printf("BYE BYE !!! \n");

    return 0 ;
}