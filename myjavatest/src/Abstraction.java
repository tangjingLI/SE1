public class Abstraction extends AST {
    String param;
    AST body;

    public Abstraction(String s,AST a){
        this.param=s;
        this.body=a;
    }

    public String getAbstraction(){
        String s="\\"+param+"."+body.toString();
        return s;
    }
}
