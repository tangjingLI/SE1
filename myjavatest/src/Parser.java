import java.util.ArrayList;

public class Parser {
    Lexer lexer;
    AST ast=new AST();

    public Parser(Lexer l){
        this.lexer=l;
    }

    public AST parse(){


        return ast;
    }

    //Term ::= Application| LAMBDA LCID DOT Term
    public AST term(){
        if(lexer.skip(Token.Type.LAMBDA)){
            String param;
            if(lexer.next(Token.Type.LCID)){
                param=lexer.token.getValue();
                lexer.nextToken();
                if(lexer.skip(Token.Type.DOT)){
                    AST body=term();
                    return new Abstraction(param,body);
                }
            }
        }
        else {
            return  this.application();
        }

        return null;
    }

    //Application ::= Application Atom| Atom
    public AST application(){
        AST a=this.atom();
        if(a==null){

        }
        else {
           return this.atom();
        }
        return null;
    }

    //Atom ::= LPAREN Term RPAREN| LCID
    public AST atom(){
        if(lexer.skip(Token.Type.LAMBDA)){
            AST term=this.term();
            lexer.match(Token.Type.RPAREN);
            return term;
        }
        else if(lexer.next(Token.Type.LCID)){
            String s=lexer.token.getValue();
            return new Identifier(s);
        }

        return null;
    }

}