parser grammar ScriptParser;
options { tokenVocab = ScriptLexer; K = 1;}
script    : (block)* EOF;
block     : (STRING LPAREN  (command)* RPAREN );
command   : (STRING (property)* SEMICO);	
property  : ( (STRING EQUALS)? STRING );