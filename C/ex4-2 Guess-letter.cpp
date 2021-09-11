#include <stdio.h>
#include<stdlib.h>
int main()
{
	char a;
	char b;
	char c;
	printf("Please input the correct answer(a capital character):");
	scanf_s("%c",&a);
	FILE*fp;
	fp = fopen("ans.txt", "r");

	fscanf(fp,"%c",&b);
	c = b;
	if (a == c)
		printf("Awesome!");
	else
		printf("Please try again.");

	system("pause");
}