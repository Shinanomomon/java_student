#include <stdio.h>

struct  Point {  //name should reflect how it is used.
	int x;  //Element
	int y;  //Element
};

int main (){

    struct Point  a, b;

    /*
    a.x = 10;  // Assign value to element of struct 
    a.y = 5;  
    */
    b.x = 2;  
    b.y = 1;  // Assignment

    printf("Enter a.x:");
    scanf("%d", &a.x);
    printf("Enter a.y:");
    scanf("%d", &a.y);

    printf("a.x = %d  -  a.y = %d\n", a.x, a.y); //used %d or i% ไม่มีปัญหา
    printf("b.x = %d  -  b.y = %d\n", b.x, b.y);


    return 0 ;
}