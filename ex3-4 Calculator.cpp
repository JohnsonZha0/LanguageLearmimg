#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a, b,c=0;
	char op;
	printf("�������������1\n");
	scanf_s("%d", &a);
	getchar();
	printf("�������������2\n");
	scanf_s("%d", &b);
	getchar();
    printf("�������������");
	
	scanf_s("%c", &op);
	getchar();
	if (op == '+')
	{
		c = a + b;
		printf("��1+��2=%d\n", c);
	}
	else if (op == '-')
	{
		c = a - b;
		printf("��1-��2=%d\n", c);
	}
	else if (op == '*')
	{
		c = a * b;
		printf("��1*��2=%d\n", c);
	}
	else if (op == '/')
	{
		c = a / b;
		printf("��1/��2=%d\n", c);
	}
	
	system("pause");

}