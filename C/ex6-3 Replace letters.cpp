#include <stdio.h>
#include <stdlib.h>
#include <cstdio>
#include<iostream>
#define N 100
int main()
{
	int i;
    char a[N];

	printf("������һ��Ӣ���ı���\n");
	gets_s(a);
	//------------------------------------------------
	printf("�滻����ı���\n");

	for (i = 0;i<N-1;i++)
	{
		if (a[i] == 'i' && a[i+1] == 's')
		{
			a[i] = 'I';
			a[i + 1] = 'S';
		}
		printf("%c", a[i]);
		//printf(" ");
	}
	system("pause");
}