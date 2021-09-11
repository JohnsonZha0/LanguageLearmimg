
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a, b;
	FILE *zz;
	zz = fopen("time.txt", "r");
	fscanf(zz,"%d%d", &a, &b);
	printf("Time is %d:%d\n", a, b);
	fclose(zz);
	system("pause");
}