%{
#include<stdio.h>
%}

%%
[A-Za-z]* {
	int l = yyleng;
	for(int i=0;i<l;i++)
	{
		for(int j=0; j<l-i;j++)
		{
			printf("%c", yytext[j]);
		}
		printf("\n");
	}
}
[ ] {;}
"\n" {;}
%%

int main()
{
	yylex();
}