#include <stdio.h>
int add();
int subtract();
int multiply();
int divide();
 
int main(){
    int fn,sn ;

    printf("In put First of Integer number = ");
    scanf("%i",&fn);
    printf("In put second of Integer number = ");
    scanf("%i",&sn);
    
    printf ("------------------------\n");
    printf ("The add is %i.\n",add(fn,sn)); 
    printf ("The subtract is %i.\n",subtract(fn,sn));
    printf ("The multiply is %i.\n",multiply(fn,sn));
    printf ("The divide is %i.\n",divide(fn,sn));
    printf ("------------------------\n");
    return 0;
}

int add(int Fadd, int Sadd){return Fadd + Sadd;} 

int subtract(int Fsub, int Ssub){return Fsub - Ssub;} 

int multiply(int Fmult, int Smult){return Fmult * Smult;} 

int divide(int Fdivide, int Sdivide){return Fdivide / Sdivide;} 