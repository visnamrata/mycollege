%{
#include<stdio.h>
%}

%%
"int"|"char" {printf("Keyword");}
[0-9]+ {printf("Integer");}
[0-9]+\.[0-9]+ {printf("Float");}
['+'|'-'|'*'|'/'|'='] {printf("Operator");}
[a-zA-Z_]([a-zA-Z_A-Z0-9_])* {printf("Identifier");}
"/*"|"//" {printf("Comment");}
%%

int main()
{
	yylex();
	

}
