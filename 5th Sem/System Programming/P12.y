%{
#include<stdio.h>
extern int yylex();
void yyerror();
%}

%token A B NL

%%
E: T NL{ printf("Valid Expression"); return 0;};
T: A A A A A A A A A V B {;};
V: V A {;}
| A    {;}
;
%%

void main()
{
	printf("Enter String: ");
	yyparse();
}
void yyerror()
{
	printf("Invalid Expression!!");
}