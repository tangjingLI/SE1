package cn.edu.nju.TicTacToe;
/**
 * 横竖方式获胜对应的类
 * @author Xin Feng & Qiu Liu
 *
 */
public class GameWinStrategy_HV {
	/**
	 * 自行实现检测获胜的方法
	 * @param cells  棋盘对应的char二维数组
	 * @return  检测结果
	 */
	public Result check(char[][] cells,Player player,int size)
	{
		for(int i=0;i<size;i++){
			for(int j=0;j<size-	2;j++){
				if(cells[i][j]==cells[i][j+1]&&cells[i][j+1]==cells[i][j+2]&&cells[i][j]!='_'){
					if(player==Player.X)
						return Result.X_WIN;
					else
						return Result.O_WIN;
				}
			}
		}
		for(int m=0;m<size;m++){
			for(int n=0;n<size-2;n++){
				if(cells[n][m]==cells[n+1][m]&&cells[n+1][m]==cells[n+2][m]&&cells[n][m]!='_'){
					if(player==Player.X)
						return Result.X_WIN;
					else
						return Result.O_WIN;
				}
			}
		}
		for(int y=0;y<size;y++){
			for(int z=0;z<size;z++){
				if(cells[y][z]=='_')
					return Result.GAMING;
			}
		}
		return Result.DRAW;
	}
}