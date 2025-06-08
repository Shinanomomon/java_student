#include<stdio.h>
int main() {
	int arr[5] = {1, 4, 5 ,6 , 7};
	int sum=0;
	for(int i=0;i<5;i++) sum += arr[i];
	double avg;
	avg = sum/5.0;

	printf("Summation = %d\n", sum);
	printf("Avg = %.2lf\n", avg);

	return 0;
}
