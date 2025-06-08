#include <stdio.h>

int main() 
{

    printf ("abc");
    printf ("def");
    printf ("ghi\n\n\n\n");

    int x = 100 ;
    float gpa = 3.845 ;
    char grade = 'A' ;
    char name [] = "Naphaphon" ;
    
    printf("GPA =%.2f\n", gpa);
    printf("x = ----%-6i----\n", x);
    printf("%-15s got %c\n", name, grade);

    return 0;
}