#include<stdio.h>
#include<stdlib.h>
int main()
{
	char C1,C2;
	printf("请输入小写字母：");
	C1=getchar();
	if (C1<=119)
	{
		C2=C1+3;
	}
	else
	{
		C2=C1-23;
	}
	printf("你输入的源码的译码是：");
	printf("%c\n",C2);
	system("pause");
}