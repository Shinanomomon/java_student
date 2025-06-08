#include<stdio.h>

double pi(); // Function Prototype  //API

int main(){
    double r =2.0; // radius
    double area ;

    printf("pi() = %.8f\n", pi());

    area = pi() * r * r; // pi() evaluate to a double value

    printf("area = %.2f", area);
    return 0;
}

double pi(){

    return 22.0/7.0;
    /*double p;   //OR  double p = 22.0/7.0;
    p = 22.0/7.0;
     return p;*/
}