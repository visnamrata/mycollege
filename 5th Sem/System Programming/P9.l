%{ 
   /* Definition section */
  #include<stdio.h> 
  #include "y.tab.h" 
  extern int yylval; 
%} 
  
/* Rule Section */
%% 
[0-9]+ { 
          yylval=atoi(yytext); 
          return NUMBER; 
  
       } 
[\t] ; 
  
[\n] return 0; 

[a-z]+[a-z0-9]*  { return VARIABLE;}
  
. return yytext[0]; 
  
%% 
  
int yywrap() 
{ 
 return 1; 
}