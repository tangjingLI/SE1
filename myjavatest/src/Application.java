public class Application extends AST{
    AST left;
    AST right;

    public Application(AST l,AST r){
        this.left=l;
        this.right=r;
    }

    public String getApplication(){
        String s="";
        if(left==null&&right!=null){
            s=right.toString();
        }
        else if(left!=null&&right==null){
            s=left.toString();
        }
        else if (left!=null&&right!=null){
            s="("+left.toString()+")("+right.toString()+")";
        }
        return s;
    }
}
