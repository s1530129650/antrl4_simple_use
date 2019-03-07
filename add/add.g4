grammar add;

lines : line
      | lines line
| ;
line : exp '\r\n';
exp : N
    | exp '+' exp ;
N : [0-9]+ ;
WS : [ \t]+ -> skip;