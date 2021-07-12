public class Game {
    
    //游戏主方法playGame
    //输入为对弈双方轮番落子的位置，以英文逗号为间隔，X先走
    public Result playGame(String s){
		char[][] ch=Getposition(s);
        char[][] play=Getchar();
        Result re= Gameocer(play,ch);
        return re;
    }
    public char[][] Getposition(String s){
        String[] str=s.split(",");
        char[][] ch=new char[str.length][2];
        for(int i=0;i<str.length;i++){
            ch[i]=str[i].toCharArray();
        }
        return ch;
    }
    public char[][] Getchar (){
        char[][] begin=new char[4][7];
        begin[0]="  A B C".toCharArray();
        begin[1]="1 _ _ _".toCharArray();
        begin[2]="2 _ _ _".toCharArray();
        begin[3]="3 _ _ _".toCharArray();
        return begin;
    }
    public boolean Win(char[][] pi){
        boolean bo=false;
        if(pi[1][2]==pi[1][4]&&pi[1][4]==pi[1][6])
            bo=true;
        if(pi[2][2]==pi[2][4]&&pi[2][4]==pi[2][6])
            bo=true;
        if(pi[3][2]==pi[3][4]&&pi[3][4]==pi[3][6])
            bo=true;
        if(pi[1][2]==pi[2][2]&&pi[2][2]==pi[3][2])
            bo=true;
        if(pi[1][4]==pi[2][4]&&pi[2][4]==pi[3][4])
            bo=true;
        if(pi[1][6]==pi[2][6]&&pi[2][6]==pi[3][6])
            bo=true;
        if(pi[1][2]==pi[2][4]&&pi[2][4]==pi[3][6])
            bo=true;
        if(pi[3][2]==pi[2][4]&&pi[2][4]==pi[1][6])
            bo=true;
        return bo;
    }
    public Result Gameocer(char[][] play,char[][] ch){
        int m=0,n=0;
        char player='X';
        Result result=Result.GAMING;
        for(int i=0;i<ch.length;i++){
            switch (ch[i][0]){
                case 'A':n=2;break;
                case 'B':n=4;break;
                case 'C':n=6;break;
            }
            switch (ch[i][1]){
                case '1':m=1;break;
                case '2':m=2;break;
                case '3':m=3;break;
            }
            play[m][n]=player;
            Print(play);
            if(Win(play)){
                if(player=='X')
                    result=Result.X_WIN;
                if(player=='O')
                    result=Result.O_WIN;
            }
            else {
                if(i==ch.length-1)
                    result=Result.DRAW;
            }
            if(player=='X')
                player='O';
            else
                player='X';
        }
        return result;
    }
    public void Print(char[][] play){
        for(char[] line:play){
            for(char e:line) {
                System.out.print(e);
            }
                System.out.println("");
        }

    }
    public static void main(String[] args){
        Game game = new Game();
        Result result = game.playGame("B2,C2,C1,A3,B3,B1,A2,B2,C3,A1,A3,B3,C2,B1,B2,A2,A1,C1,C3");
        System.out.println(result);
    }
}
