#include <stdio.h>
void doublex(int*);//Function prototype (Function Definition)
int main(int argc, char* argv[]){
	int x= 10;
	printf("x main Before = %d\n", x);
	doublex(&x);// pass by reference
	printf("x main After = %d\n", x);

	return 0 ;
}

void doublex(int *x){
	*x = *x * 2;
	printf("x in doublex = %d\n", *x);
}
