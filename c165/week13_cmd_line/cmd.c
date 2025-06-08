#include<stdio.h>
#include<stdlib.h>

int main (int argc, char* argv[]) {

if (argc!=3){

    printf("Usage: %s <num1> <num2>\n", argv[0]);
    printf("\t num1 = Double Floating Point Number\n");
    printf("\t num2 = Double Floating Point Number\n");

    return 0;//Terminate the program
}

    double n1 ,n2, result;
    n1 = atof(argv[1]);
    n2 = atof(argv[2]);


    result = n1 + n2 ;
    printf("The result is %.2lf", result);

    //printf("OK\n");

    /*printf("argc = %d\n", argc);

    printf("argv[0]=%s\n", argv[0]);
    printf("argv[1]=%s\n", argv[1]);

    for (int i = 0; i < argc; i++)
    {
    printf("argv[%d]=%s\n", i, argv[i]);

    }
*/


    return 0;
}