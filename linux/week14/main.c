#include <stdio.h>
#include "arith.h"
int main(){
	int x=0, y=0, result=0;

	printf("Enter x: ");
	scanf("%d", &x);
	printf("Enter y: ");
	scanf("%d", &y);

	result = add(x,y);
	printf("Result Add = %d\n",result);

	result = sub(x,y);
	printf("Result Sub = %d\n", result);

	result = multi(x,y);
	printf("Result Mul = %i\n",result);

	double d =div(x,y);
	printf("Result Div = %.2lf",d);
	return 0;
}
