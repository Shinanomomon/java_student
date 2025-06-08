#include<stdio.h>
void menu(); //API ????? /*(ใช้ก็ต่อเมื่อต้องการใช้ menu จากทที่อื่น)*/


int main (){

    int x=0;
    menu();
    scanf("%d", &x);
    printf("you select %d\n", x);  

    return 0;
}
void menu(/*void*/) //menu is name  //used anything. //heading = returnType funcName(paramaters) //void= มีก็ได้ไม่มีก็ได้ 
{ //function Body

	printf("*********************\n");
	printf("* 1. Add new record *\n");
	printf("* 2. Update record  *\n");
	printf("* 3. Delete record  *\n");
	printf("* 4. Exit           *\n");
	printf("*********************\n");
    printf("Please select [1-4]\n");
    //return;
}