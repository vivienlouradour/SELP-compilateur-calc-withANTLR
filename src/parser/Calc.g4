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
         ;

expression : LITERAL                                                     # Literal
           | variableId                                                 # Variable
           | (MINUS | NOT) expression                                   # UnaryExpression
           | expression OpMult expression                               # BinaryMultExpression
           | expression OpAdd expression                                # BinaryAddExpression
           | expression OpRelational expression                         # BinaryRelationalExpression
           | expression OpEquality expression                           # BinaryEqualityExpression
           | expression OpLogicalAnd expression                         # BinaryLogicalAndExpression
           | expression OpLogicalOr expression                          # BinaryLogicalOrExpression
           | <assoc = right> expression '?' expression ':' expression   # TernaryExpression
           | functionId '(' expression* ')'                             # FunctionCall
           | '(' expression ')'                                         # ParExpression
           ;

OpAdd : MINUS | '+';
OpMult : '*' | '/';
OpRelational : '<' | '>' | '<=' | '>=';
OpEquality : '==' | '!=';
OpLogicalAnd : '&&';
OpLogicalOr : '||';



MINUS : '-'
      ;

NOT : '!'
    ;

BOOLEAN : 'true'
        | 'false'
        ;

variableId : IDENTIFIER
           ;
functionId : IDENTIFIER
           ;


IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;
LITERAL  : '0' | ('1'..'9')('0'..'9')*              
         ;

WS : [ \t\n\r]+ -> channel(HIDDEN)
        ;