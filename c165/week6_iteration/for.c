    #include <stdio.h>  
    int main ()
{
    int num;  
    printf("Enter number of iteration: ");
    scanf("%d", &num) ;

    int i ; //counter
    for (i=10; i<num; i--)//I = 0 TO NUM-1; //I=I+1 //i+=1 //++i //i++
    {
        printf("%d: Hello CED\n", i);
    }
    


    return 0 ;
}