#include<stdio.h>
#include<stdlib.h>
int main()
{
	float P=3.1415926;
    int r;
	double S;
	printf("请输入圆的半径:");
	scanf("%d",&r);
	S=P*r*r;
	printf("圆的面积为：%lf\n",S);
	system("pause");
}