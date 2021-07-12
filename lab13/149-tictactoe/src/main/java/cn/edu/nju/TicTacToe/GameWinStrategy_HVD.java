package cn.edu.nju.TicTacToe;
/**
 * 横竖斜方式获胜对应的类，应该考虑到可扩展性，当有新的获胜模式出现时更易于添加
 * hint：采用接口的方式，接口与实现相分离
 * @author Xin Feng & Qiu Liu
 *
 */
public class GameWinStrategy_HVD extends GameWinStrategy_HV {
	/**
	 * 根据需要修改获胜的方法
	 * @param cells  棋盘对应的char二维数组
	 * @return  检测结果
	 */
	public Result check(char[][] cells,int size,Player player)
	{
		for(int i=0;i<size;i++){
			for(int j=0;j<size-2;j++){
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

		for(int i=0;i<size-2;i++){
			for(int j=0;j<size-2;j++){
				if(cells[i][j]==cells[i+1][j+1]&&cells[i][j]==cells[i+2][j+2]&&cells[i][j]!='_'){
					if(player==Player.X)
						return Result.X_WIN;
					else
						return Result.O_WIN;
				}
			}
		}
		for(int i=size-1;i>1;i--) {
			for(int j=0;j<size-2;j++){
				if(cells[i][j]==cells[i-1][j+1]&&cells[i][j]==cells[i-2][j+2]&&cells[i][j]!='_'){
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