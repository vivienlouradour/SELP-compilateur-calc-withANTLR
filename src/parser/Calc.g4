grammar Calc;

// syntactic rules

program  : funcDef* body
         ;
funcDef : '(' 'defun' head body ')'
         ;
head     : '(' functionId variableId* ')'
         ;
body     : varDef* expression
         ;
varDef   : variableId '=' expression
         // | variableId '=' booleanExpression
         ;

expression : LITERAL                                                    # Literal
           | variableId                                                 # Variable
           | BOOLEAN                                                    # Boolean
           | (MINUS | NOT) expression                                   # UnaryExpression
           | expression OpMult expression                               # BinaryExpression
           | expression (MINUS | PLUS) expression                       # BinaryExpression
           | expression OpRelational expression                         # BinaryExpression
           | expression OpEquality expression                           # BinaryExpression
           | expression AND expression                                  # BinaryExpression
           | expression OR expression                                   # BinaryExpression
           | <assoc = right> expression '?' expression ':' expression   # TernaryExpression
           | '(' expression ')'                                         # ParExpression
           | functionId '(' expression* ')'                             # FunctionCall
           ;


variableId : IDENTIFIER
           ;
functionId : IDENTIFIER
           ;
//Lexical rules
OpMult : '*' | '/';
OpRelational : '<' | '>' | '<=' | '>=';
OpEquality : '==' | '!=';

AND : '&&';
OR : '||';

MINUS : '-';
PLUS : '+';
NOT : '!';

BOOLEAN : 'true' | 'false';




IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;
LITERAL  : '0' | ('1'..'9')('0'..'9')*              
         ;

WS : [ \t\n\r]+ -> channel(HIDDEN)
        ;