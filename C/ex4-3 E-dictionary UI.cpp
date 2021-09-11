#include<stdio.h>
#include<stdlib.h>

int main()
{
	
	
	printf("Welcome!\n");
	//dingyi
	int choice;
	char find;
	find = NULL;
	char ed;
	ed = NULL;
	//funtion
	printf("\t<Menu>\n");
	printf("\tPlease choose !\n");
	printf("1--Search words.\n");
	printf("2--Add entry.\n");
	printf("3--Edit entry.\n");
	printf("4--Delete entry.\n");
	printf("Your option:\n");
	scanf_s("%d", &choice);
	switch (choice)
	{
	case 1:
	{printf("Please input the word you want to search:\n");
	scanf_s("%s",&find);
	FILE*dic;
	dic = fopen("dic.txt", "r");
	printf("Sorry.Not found.\n");
	break;
	}
	case 2:
	{printf("Please input the entry:\n");
	 fprintf(dic,"%s",ed);
	 FILE*dic;
	 dic = fopen("dic.txt", "a+");
	 ;
	 break;
	}
	case 3:
	{printf("Sorry.Not available.\n");
	break;
	}
	case 4:
	{printf("Sorry.Not available.\n");
	break; 
	}
	default:printf("Unvalid input!Please try again!\n");
	}
	system("pause");
}