%{
#include<stdio.h>
extern int yylex();
void yyerror();
%}

%token NUMBER

%left '+' '-'
  
%left '*' '/' 
  
%left '(' ')'

%%
T: E {printf("Result: %d", $$);};
E: E'+'E  { $$= $1 + $3;}
| E'-'E   { $$= $1 - $3;}
| E'*'E   { $$= $1 * $3;}
| E'/'E   { $$= $1 / $3;}
| '('E')'  { $$= $2;}
| NUMBER   { $$= $1;}
;
%%

void main()
{
	printf("Enter a expression: ");
	yyparse();
}

void yyerror()
{
	printf("Expression in Invalid.");
}