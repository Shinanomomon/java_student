#include<stdio.h>
#include<stdlib.h>

int main (int argc, char* argv[]){

if (argc!=3){
	printf("Usage: %s <num1> <num2>\n",argv[0]);
	printf("\t num1 = Double Floating Point Number\n");
	printf("\t num2 = Double Floating Point Number\n");
	return 0;
}

	double n1 ,n2 ,result;
	n1 = atof(argv[1]);
	n2 = atof(argv[2]);
	result = n1 + n2 ;
	printf("The result is %.2lf\n",result);
return 0;
}
