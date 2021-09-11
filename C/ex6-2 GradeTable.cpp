#include <stdio.h>
#include <stdlib.h>
#define N 4
int main()
{
	int a[4][N];
	int i, j;
	float ave;
	printf("请输入各学生成绩:\n");
	for (i = 0;i < 4;i++)
		for (j = 0;j < N;j++)
			scanf_s("%d", &a[i][j]);

	printf("grade1 grade2 grade3 grade4\n");
	for (i = 0;i < 4;i++)
	{
		for (j = 0;j < N;j++)
		{
			printf("%-7d", a[i][j]);
			if ((j + 1) % 4 == 0)
				printf("\n");
		}
	}
//--------------------------------------------------------
	printf("grade1 grade2 grade3 grade4 average\n");
	for (i = 0;i < 4;i++)
	{
		for (j = 0;j < N;j++)
		{
			printf("%-7d", a[i][j]);
			if ((j + 1) % 4 == 0)
			{   if(a[i][j]<60)
			{
				ave = (a[i][0] + a[i][1] + a[i][2] + a[i][3]) / 4;
				printf("%-4.6f",ave);}
				printf("\n");
			}
		}
	}





	system("pause");
}