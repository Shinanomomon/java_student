#include <stdio.h>
void rectArea(int w, int h);// Function Prototype  // w,h =ไม่จำเป็นต้องใส่ก็ได้ 

int main(){
    int w, h;
    w = 10;
    h = 20;

    rectArea(w, h);
    rectArea(111, 200);
    rectArea(23, 28);
    return 0;
}

void rectArea(int w, int h){
    printf("width: %d\n", w);
    printf("hight: %d\n", h);
    printf("Area : %d\n", w*h);
} 