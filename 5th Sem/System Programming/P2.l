%{
#include<stdio.h>
%}

%%
[A-Za-z] {
	char c= (char)yytext[0];
	c+=3;
	if(c>'Z' && c<'a') 
		c-=27;
	else if(c>'z')
		c-=26;
	printf("%c",c);
}
[ ] {;}
"\n" { printf("\n");}
%%

int main()
{
	yylex();
}