#include <stdio.h>

typedef  struct {
		int x;  //Element
		int y;  //Element
}point;

int main (){
	 point  a, b;

   b.y = 1;
   b.x = 2;

    printf("Enter a.x:");
    scanf("%d", &a.x);
    printf("Enter a.y:");
    scanf("%d", &a.y);

    printf("a.x = %d  -  a.y = %d\n", a.x, a.y); //used %d or i% ไม่มีปัญหา
    printf("b.x = %d  -  b.y = %d\n", b.x, b.y);


return 0;
}