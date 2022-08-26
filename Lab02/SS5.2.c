#include <stdio.h>
int main()
{
 int a,b,c,d;
 a = 50;
 b = 24;
 c = 68;
 d = a*b+c/2;
 printf("The value after a*b+c/2 is : %d\n",d);
 d = a%b;
 printf("The value after a mod b is : %d\n",d);
 d = a*b-c;
 printf("The value after a*b-c is : %d\n",d);
 d = a/b+c;
 printf("The value after a/b+c is : %d\n",d);
 d = a+b*c;
 printf("The value after a+b*c is :%d\n",d);
 d = (a+b)*c;
 printf("The value after (a+b)*c is : %d\n",d);
 d = a*(b+c+(a-c)*b);
 printf("The value after a*(b+c+(a-c)*b) is :%d\n",d);
 return 0;
}
