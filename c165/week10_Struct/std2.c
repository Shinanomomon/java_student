#include<stdio.h>
#include<string.h>
#define SIZE 3
typedef struct {
    char id[15];    // std_id
    char name[50];  // std_name
    float score;
}score;

int main(){
    score  ced[SIZE];
    //scanf -> id, name, score
    for(int i =0 ; i<SIZE; i++){  //scope within for loop
        printf("Enter ID: ");
        scanf("%s", ced[i].id);    //scanf("%s", &ced[0].id[0]);
        printf("Enter Name: ");
        scanf("%s", ced[i].name);  //scanf("%s", &ced[0].name[0]);
        printf("Enter score: ");
        scanf("%f", &ced[i].score);
    }
    for(int i =0 ; i<SIZE; i++){
        printf("-------------------\n");
        printf("ID: %s\n", ced[i].id);
        printf("Name: %s\n", ced[i].name);
        printf("Score: %.2f\n", ced[i].score);
        printf("-------------------\n");
    }

    /*
    strcpy(ced[0].id, "65-234-324-432");
    strcpy(ced[0].name, "Ratchapak");
    ced[0].score = 8.5;
    */

    return 0;
}