public class Lexer {
    public String source;
    public int index=0;
    public Token token=new Token();
    public String tokenvalue;


    public Lexer(String s){
        source = s;
        nextToken();

    }

    public char getChar(){
        if(this.index>=source.length())
            return '\0';
        return source.charAt(index++);
    }

    public void nextToken(){
        String pattern1="\\s";
        String pattern2="[a-z]";
        String pattern3="[a-zA-Z]";

        char c;
        do{
            c=getChar();
        }while ((c+"").matches(pattern1));

        switch (c){
            case '(': token.setType(Token.Type.LPAREN);token.setValue("(");break;
            case ')': token.setType(Token.Type.RPAREN);token.setValue(")");break;
            case '\\':token.setType(Token.Type.LAMBDA);token.setValue("\\");break;
            case  '.': token.setType(Token.Type.DOT);token.setValue(".");break;
            case  '\0':token.setType(Token.Type.EOF);token.setValue("\0");break;
            default:
                if((c+"").matches(pattern2)){
                    String str="";
                    do{
                        str+=c;
                        c=getChar();
                    }while ((c+"").matches(pattern3));
                    index--;
                    token.setType(Token.Type.LCID);
                    token.setValue(str);
                    break;
                }
                else {
                    System.out.println("wrong!");
                    System.exit(0);
                }
        }
        System.out.println(token.getType());
    }

    public boolean next(Token.Type to){
        if(token.getType()==to){
            return true;
        }
        return false;
    }

    public  boolean skip(Token.Type to){
        if(token.getType()==to){
            nextToken();
            return true;
        }
        return false;
    }

    public void match(Token.Type to){
       if(next(to)){
           nextToken();
       }
    }

    public Token.Type token(Token.Type to){
        if(next(to))
        return to;
        return null;
    }
/*
    public static void main(String[] args){
        String s1="(\\x.\\y.xy)";
        String s="(xy)(y)";
        Lexer lexer=new Lexer(s);
        Parser parser=new Parser(lexer);
        AST b=parser.atom();
        AST c=parser.atom();
        System.out.println(c==b);
    }
    */

}
