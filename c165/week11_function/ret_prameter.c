#include <stdio.h>

int recArea(int,int);// Function Prototype
double cicleArea(double);// Function Prototype
int main(){
    int width=22, height=20;
    double radius=2.5;

    int rect = recArea(width,height);
    printf("Rect Area= %d \n", rect);

    //double cir = cicleArea(radius);
    printf("Cicle Area = %.2f\n",cicleArea(radius));

    return 0;
}

int recArea(int w,int h){
    //return w * h;
    int area ;
    area = w*h;
    return area;
}

double cicleArea(double r){
    return (22.0/7.0)* r * r;
}