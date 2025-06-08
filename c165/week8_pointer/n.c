#include <stdio.h>
int main ()
{
    /*int*p [10]= {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};


    printf("%d %d %d\n",*(p-4), *p,*(p+5) );
    printf("%d %d %d\n",p[-2], p[0],p[3] );
*/

    int x = 20;
    int*p = &x;
    *p +=1;

    printf("%p\n",&x );
    printf("%p\n",&p );
    printf("%p\n",p );
    printf("%p\n",*p );
    printf("%p\n",x );
    
    
   /* int x = 10;



    float f = 10.5;
    double d =4.0;
    char c ='A';
    printf("%p\n",&x );
    printf("%p\n",&f );
    printf("%p\n",&d );
    printf("%p\n",&c );*/
    return 0 ;
}