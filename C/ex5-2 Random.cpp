#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main()
{
	int a, b;
	char c;
	printf("���q�˳���������󵥻��س�������\n");
	scanf_s("%c", &c);
	getchar();
	while (c != 'q')
	{
		srand(time(NULL));
		a = 10121446 + (rand() % 59);
		b = 10131714 + (rand() % 88);
		if (a % 2 == b % 2)

			printf("������������ֱ�Ϊ%d\n", a);
		else

			printf("�����������Ϊ%d\n", b);
		printf("���q�˳���������󵥻��س�������\n");
		scanf_s("%c", &c);
		getchar();
	}
			
			

	printf("ллʹ�ã�\n");
	system("pause");


}