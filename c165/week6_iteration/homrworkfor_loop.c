#include <stdio.h>
 int main()
{
    int num,sen ;

    printf("Enter number : ");
    scanf("%i", &num) ;

    for ( sen = 1; sen < 13; sen=sen+1)
    {
        printf("%i * %i =%i \n", num, sen, num * sen );
    }
    
    return 0;
}
