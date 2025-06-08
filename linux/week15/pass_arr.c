#include<stdio.h>
void arr2(int x[], int num){
	//sizeof(x);
	for (int i=0; i<num; i++) x[i] = x[i] * 2;
}
int main(int argc,char* argv[]){

	int a[10];
	for (int i=0;i<10;i++)a[i] = 111;
	//call function arr2
	arr2(a, 10); // (a)= &a[0]
	for(int i=0; i<10; i++)printf("a[%d]=%d\n",i,a[i]);


	return 0;
}
