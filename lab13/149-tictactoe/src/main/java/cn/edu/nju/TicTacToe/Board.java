package cn.edu.nju.TicTacToe;
public class Board {
	/**
	 * 成员变量的初始化代码请修改，请灵活选择初始化方式
	 * 必要时可添加成员变量
	 */
	protected char[][] cells;
	protected int size;
	protected Result res;
	protected int[] co,count;
	protected String[] moves;
	protected String s;
	protected GameChessStrategy chessStrategy;
	protected GameWinStrategy_HV winStrategy;
	protected GameChessStrategy_A chessStrategy1;
	protected GameWinStrategy_HVD winStrategy1;
	protected Player player = Player.O;

	/**
	 * 请修改构造方法，并添加合适的构造方法
	 */
	
	public Board(int boardSize, GameChessStrategy chessStrategy, GameWinStrategy_HV winStrategy,Result res,int[] co,int[] count,String[] moves,String gameMode){
		this.co=co;
		this.count=count;
		this.size=boardSize;
		this.res=res;
		this.moves=moves;
		this.s=gameMode;
		cells = new char[boardSize][boardSize];
		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				cells[i][j] = '_';
			}
		}
		
		this.chessStrategy = chessStrategy;
		this.winStrategy = winStrategy;
	}
	public Board(int boardSize, GameChessStrategy chessStrategy, GameWinStrategy_HVD winStrategy,Result res,int[] co,int[] count,String[] moves,String gameMode){
		this.co=co;
		this.count=count;
		this.size=boardSize;
		this.res=res;
		this.moves=moves;
		this.s=gameMode;
		cells = new char[boardSize][boardSize];
		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				cells[i][j] = '_';
			}
		}

		this.chessStrategy = chessStrategy;
		this.winStrategy1 = winStrategy;
	}
	public Board(int boardSize, GameChessStrategy_A chessStrategy, GameWinStrategy_HVD winStrategy,Result res,int[] co,int[] count,String[] moves,String gameMode){
		this.co=co;
		this.count=count;
		this.size=boardSize;
		this.res=res;
		this.moves=moves;
		this.s=gameMode;
		cells = new char[boardSize][boardSize];
		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				cells[i][j] = '_';
			}
		}

		this.chessStrategy1 = chessStrategy;
		this.winStrategy1 = winStrategy;
	}
	public Board(int boardSize, GameChessStrategy_A chessStrategy, GameWinStrategy_HV winStrategy,Result res,int[] co,int[] count,String[] moves,String gameMode){
		this.co=co;
		this.count=count;
		this.size=boardSize;
		this.res=res;
		this.moves=moves;
		this.s=gameMode;
		cells = new char[boardSize][boardSize];
		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				cells[i][j] = '_';
			}
		}

		this.chessStrategy1 = chessStrategy;
		this.winStrategy = winStrategy;
	}
	/**
	 * @param move 下棋的位置
	 * @return 落棋之后的结果
	 */
	//00：正常规则落子，横竖斜均能胜利
	//01：正常规则落子，横竖能胜利
	//10：5子模式，横竖斜均能胜利
	//11: 5子模式，横竖能胜利
	public Result nextMove(String move) {
		Player current=nextPlay();
		if(s=="00"||s=="01")
			chessStrategy.putChess(cells,current , move,res,co,count, moves);
		else
			chessStrategy1.putChess(cells,current , move,res,co,count, moves);
		if(res==Result.ERROR)
			return Result.ERROR;
		if(s=="00"||s=="10")
			return winStrategy1.check(cells,size,current);
		return winStrategy.check(cells,current,size);
	}
	
	/**
	 * @return 下一个落棋的玩家
	 */
	protected Player nextPlay(){

		this.player = player == Player.X ? Player.O : Player.X;
		return this.player;
	}
	
	/**
	 * 棋盘的输出方法，根据需要进行修改
	 */
	public void print(){
		char[] fi="ABCDEFGHI".toCharArray();
		System.out.print(" ");
		for(int i=0;i<size;i++){
			System.out.print(" "+fi[i]);
		}
		System.out.println();
		for(int i=0 ;i<size; i++){
			System.out.print(i+1);
			for(int j=0; j<size; j++){
				System.out.print(" "+cells[i][j]);
			}
			System.out.println();
		}
	}
}