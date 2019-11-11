%{
#include<stdio.h> 
#include<stdlib.h> 
int l =0;
char c[100];
%}

%%
[A-Za-z]* {
	if (l<yyleng)
	{
		l=yyleng;
		for(int i=0;i<l;i++)
		{
			c[i]=yytext[i];
		}
	}
}
[ ] {;}
"\n" {

	//printf("L=%d \n", l); 
	printf("Longest word: ");
	for(int i=0;i<l;i++)
	{
		printf("%c",c[i]);
	}
	
	l=0;
}
%%

int main()
{
	yylex();
}