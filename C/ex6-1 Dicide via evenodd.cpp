#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define N 20
int main()
{
	int x[N] = {0,1};
	int n, i;
	for (i = 2;i < N;i++)
	{
		if (i % 2 == 0)
			x[i] = abs(x[i - 1] - x[i - 2]);
		else
			x[i] = x[i - 1] + x[i - 2];
	}
	for (i = 0;i < 20;i++)
	{
		printf("%-7d", x[i]);
		if ((i + 1) % 4 == 0)
			printf("\n");
	}
	system("pause");
}