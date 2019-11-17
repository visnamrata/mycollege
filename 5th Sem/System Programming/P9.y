%{ 
   /* Definition section */
  #include<stdio.h> 
  int flag=0; 
  extern int yylex();
  void yyerror();
%} 
  
%token NUMBER VARIABLE
  
%left '+' '-'
  
%left '*' '/' '%'
  
%left '(' ')'
  
/* Rule Section */
%% 
  
ArithmeticExpression: E{ 
  
        ; 
  
        }; 
 E:E'+'E {;} 
  
 |E'-'E {;} 
  
 |E'*'E {;} 
  
 |E'/'E {;} 
  
 |E'%'E {;} 
  
 |'('E')' {;} 
  
 | NUMBER {;} 

 | VARIABLE {;}
  
 ; 
  
%% 
  
//driver code 
void main() 
{ 
   printf("\nEnter Any Arithmetic Expression which can have operations Addition, Subtraction, Multiplication, Divison, Modulus and Round brackets:\n"); 
  
   yyparse(); 
   if(flag==0) 
   printf("\nEntered arithmetic expression is Valid\n\n"); 
} 
  
void yyerror() 
{ 
   printf("\nEntered arithmetic expression is Invalid\n\n"); 
   flag=1; 
} 