#include <stdio.h>
#include "arith2.h"
int main () {
	int num3=0, num4=0;
	int result=0;

	printf("Enter num: ");
	scanf("%d", &num3);
	printf("Enter num: ");
	scanf("%d",&num4);

	result = multiply(num3,num4);
	printf("Result Multiply = %d\n", result);

	double result2 = divide(num3,num4);
	printf("Result Divide = %.2lf\n",result2);
	return 0;
}
