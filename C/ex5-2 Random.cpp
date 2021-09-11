#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main()
{
	int a, b;
	char c;
	printf("点击q退出，任意键后单击回车键点名\n");
	scanf_s("%c", &c);
	getchar();
	while (c != 'q')
	{
		srand(time(NULL));
		a = 10121446 + (rand() % 59);
		b = 10131714 + (rand() % 88);
		if (a % 2 == b % 2)

			printf("随机点名的数分别为%d\n", a);
		else

			printf("随机点名的数为%d\n", b);
		printf("点击q退出，任意键后单击回车键点名\n");
		scanf_s("%c", &c);
		getchar();
	}
			
			

	printf("谢谢使用！\n");
	system("pause");


}