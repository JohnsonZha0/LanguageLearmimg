#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a, b,c=0;
	char op;
	printf("请输入运算的数1\n");
	scanf_s("%d", &a);
	getchar();
	printf("请输入运算的数2\n");
	scanf_s("%d", &b);
	getchar();
    printf("请输入运算符号");
	
	scanf_s("%c", &op);
	getchar();
	if (op == '+')
	{
		c = a + b;
		printf("数1+数2=%d\n", c);
	}
	else if (op == '-')
	{
		c = a - b;
		printf("数1-数2=%d\n", c);
	}
	else if (op == '*')
	{
		c = a * b;
		printf("数1*数2=%d\n", c);
	}
	else if (op == '/')
	{
		c = a / b;
		printf("数1/数2=%d\n", c);
	}
	
	system("pause");

}