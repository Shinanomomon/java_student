#include <stdio.h>
int main ()
{
    int arry [10]= {10, 5, 3, 7, 8, 9, 2, 9, 8, 3};
    int mon = 0;
    int i ;
    for (i = 0; i < 10; i++)
    {
      mon = mon + arry[i] ;
    }

    printf("summation = %i\naverage = %.2f",mon, (float)mon/10 );
    return 0 ;
}