%{
#include"y.tab.h"
#include<stdio.h>
extern int yylval; 
%}

%%
[\n]   {return 0;}
[0-9]+ {
		yylval=atoi(yytext);
		return NUMBER;
}
[\t]  {;}
. return yytext[0];
%%

int yywrap()
{
	return 1;
}