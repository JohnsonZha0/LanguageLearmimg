#include <stdio.h>
#include <stdlib.h>
int main()
{float s,x,y,n,k;
 int i;
 s=1/2;
 i=2;
 x=2;
 y=3;
 n=x/y;
  while (i<=20)
  {s=s+n;
   k = x;
   x = y;
   y=k+y;
   n=x/y;
   i++;
  }
 printf("The sum is%10.14f\n",s);
 system ("pause");
}