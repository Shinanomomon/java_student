#include<stdio.h>
#include<string.h>
#define SIZE 3
typedef struct {
    char name[50];
    double c;
    double java;
    double web;     
}score;
int main(){  
    score  st[SIZE];
    for(int i =0 ; i<SIZE; i++){ 

        printf("\nEnter Name: ");
        scanf("%s", st[i].name);  
        printf("Enter score C: ");
        scanf("%lf", &st[i].c);
        printf("Enter score java: ");
        scanf("%lf", &st[i].java);
        printf("Enter score Web: ");
        scanf("%lf", &st[i].web);
    }
    for(int i =0 ; i<SIZE; i++){

        double avg=0 ;
        printf("===================\n");
        printf("Name: %s\n", st[i].name);
        printf("c = %.1lf\n", st[i].c);
        printf("Java = %.1lf\n", st[i].java);
        printf("Web = %.1lf\n", st[i].web);
        avg=(st[i].c+st[i].java+st[i].web)/3;
        printf("Avg. :%.1lf \n", avg);
        printf("===================\n");
    }
    double cn=0;
    double javan=0;
    double webn=0;
    for (int i = 0; i < SIZE; i++)
    {

    cn = cn + st[i].c ;
    javan = javan + st[i].java ;
    webn = webn + st[i].web ;
    }
    printf("Average of C = %.1lf\n", (double)cn/SIZE );
    printf("Average of java = %.1lf\n", (double)javan/SIZE);
    printf("Average of web = %.1lf\n", (double)webn/SIZE );
    
    
    return 0;
}