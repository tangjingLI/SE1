public class Token{

    private String value;
    private Type type;

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(Type type) { this.type = type; }

    public String getValue() {
        return value;
    }

    public Type getType(){return type;}

    public enum Type {
        LPAREN,RPAREN,LAMBDA,DOT,LCID,EOF;
    }

}
