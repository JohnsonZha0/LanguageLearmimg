#include<stdio.h>
#include<stdlib.h>
int main()
{
	char C1,C2;
	printf("������Сд��ĸ��");
	C1=getchar();
	if (C1<=119)
	{
		C2=C1+3;
	}
	else
	{
		C2=C1-23;
	}
	printf("�������Դ��������ǣ�");
	printf("%c\n",C2);
	system("pause");
}