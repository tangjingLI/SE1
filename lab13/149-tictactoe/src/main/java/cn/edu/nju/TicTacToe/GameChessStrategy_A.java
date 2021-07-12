package cn.edu.nju.TicTacToe;

public class GameChessStrategy_A extends GameChessStrategy {
    public void putChess(char[][] cells, Player currentPlayer, String chessPos,Result res,int[] co,int[] count,String[] moves)
    {
        int i = chessPos.charAt(1) - '1';
        int j = chessPos.charAt(0) - 'A';
        if(cells[i][j]!='_')
            res=Result.ERROR;
        else{
            if (currentPlayer==Player.X){
                cells[i][j] ='X';
                if(co[0]<5){
                    co[0]+=1;
                }
                else {
                    int m=moves[2*count[0]].charAt(1)-'1';
                    int n=moves[2*count[0]].charAt(0)-'A';
                    cells[m][n]='_';
                    count[0]+=1;
                }
            }
            else {
                cells[i][j] ='O';
                if(co[1]<5){
                    co[1]+=1;
                }
                else {
                    int m=moves[2*count[1]+1].charAt(1)-'1';
                    int n=moves[2*count[1]+1].charAt(0)-'A';
                    cells[m][n]='_';
                    count[1]+=1;
                }
            }
        }
    }
}
