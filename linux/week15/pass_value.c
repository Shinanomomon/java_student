#include <stdio.h>
void value(int);

int main(int argc, char* argv[]){

	int x = 10;
	printf("x in main() Before = %d\n", x);
	value(x);
	printf("x After = %d\n", x);


	return 0;
}

void value(int x){
	printf("x after = %d\n", x);
	x = x *2;
	printf("x in value() = %d\n", x);
}
