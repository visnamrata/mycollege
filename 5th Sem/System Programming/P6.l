%{
#include<stdio.h>
int lines=1,words=1,chars=0,spaces=0;
%}

%%
"\n" {lines++;}
[ \t] {spaces++; words++;}
[a-zA-Z] {chars++;}
. {;}
%%

int main()
{
	yyin = fopen("input.txt", "r"); 
	yylex();	
	printf("Number of Lines: %d \n", lines);
	printf("Number of words: %d \n", words);
	printf("Number of chars: %d \n", chars);
	printf("Number of spaces: %d \n", spaces);
}
