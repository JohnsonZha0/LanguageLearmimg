#include<stdio.h>
#include<stdlib.h>
int main()
{
	printf("\t\t\t\t×ÖÄ¸±í\n");
	char a, b, c, d, e, f;
	FILE* fp;
	fp = fopen("data.txt", "r");
	fscanf(fp, "%c%c%c%c%c%c", &a, &b, &c, &d, &e, &f);
	printf("\t\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\n", a, a, b, b, c, c, d, d, e, e, f, f);
	fscanf(fp, "%c%c%c%c%c%c", &a, &b, &c, &d, &e, &f);
	printf("\t\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\n", a, a, b, b, c, c, d, d, e, e, f, f);
	fscanf(fp, "%c%c%c%c%c%c", &a, &b, &c, &d, &e, &f);
	printf("\t\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\n", a, a, b, b, c, c, d, d, e, e, f, f);
	fscanf(fp, "%c%c%c%c%c%c", &a, &b, &c, &d, &e, &f);
	printf("\t\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\t%c-%d\n", a, a, b, b, c, c, d, d, e, e, f, f);
	fscanf(fp, "%c%c%c%c%c%c", &a, &b);
	printf("\t\t%c-%d\t%c-%d\n", a, a, b, b);
	fclose(fp);
	system("pause");
}