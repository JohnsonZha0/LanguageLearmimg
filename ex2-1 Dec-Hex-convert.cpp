#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a;
	printf("请输入一个数字：\n");
	scanf_s("%d",&a);
	printf("The decimal system:%d\n", a);
	printf("The octal system:%o\n", a);
	printf("The hexdecimal system:%x\n", a);
	system("pause");
}
