%{
#include<stdio.h>
int c=0;
%}

%%
^[a-zA-Z_]([a-zA-Z_A-Z0-9_])* {c++;}
"\n" {printf("Number of identifier: %d \n", c); c=0;}
. {}
%%

int main()
{
	yylex();
	

}
