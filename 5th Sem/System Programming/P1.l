%{
#include<stdio.h>
int line=0;
int ch=0;
%}

%%
["\n"]  {line++;}
[ ] 	{;}
. 		{ch++;}
%%

int main()
{
	yyin = fopen("input.txt", "r"); 
	yylex();
	printf("\nNumber of line: %d", line);
	printf("\nNumber of character: %d", ch);

}
