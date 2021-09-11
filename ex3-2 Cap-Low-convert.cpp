#include<stdio.h>
#include<stdlib.h>
int main()
{
	char C1,C2;
	printf("请输入大写字母：");
	C1=getchar();
	C2=C1+32;
	printf("它的小写字母为：");
	printf("%c\n",C2);
	system("pause");
}