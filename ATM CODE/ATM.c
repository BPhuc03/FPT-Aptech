#include<stdio.h>
void main()
{
	int x; 
	x = 0;
	printf("Nhap so:"); 
	scanf("%d",&x);
	switch(x){

	case 1:
	    printf("Choice 1"); 
		break;
	
	case 2:
		printf("\nChoice 2"); 
	    break;
	case 3:
	   printf("\nChoice 3"); 
	   break; 
    default:
	   printf("\nInvalid Choice"); 
       break;
}
}
