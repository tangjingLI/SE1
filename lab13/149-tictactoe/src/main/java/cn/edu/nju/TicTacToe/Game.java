package cn.edu.nju.TicTacToe;
public class Game {
    /**
     * Game的接口方法，我们会通过该方法进行测试
     * @param gameMode 游戏模式,有四种可能，00,01,10,11
     * @param moveStr 落子序列
     * @param size 棋盘大小，size最小为3， 最大为9
     * @return 游戏结果
     * 
     * 根据需要改写方法，参数，返回结果类型不可修改
     */
    public Result playGame(String gameMode, String moveStr, int size){
    	int[] co={0,0};
    	int[] count={0,0};
		Result res = Result.GAMING;
		String[] moves = moveStr.split(",");
		//00：正常规则落子，横竖斜均能胜利
		//01：正常规则落子，横竖能胜利
		//10：5子模式，横竖斜均能胜利
		//11: 5子模式，横竖能胜利
		GameChessStrategy chessStrategy=new GameChessStrategy();
		GameWinStrategy_HV winStrategy=new GameWinStrategy_HV();
		Board board=new Board(size,chessStrategy,  winStrategy,res,co,count, moves, gameMode);
		switch (gameMode){
			case "00":
				GameWinStrategy_HVD winStrategy1=new GameWinStrategy_HVD();
				board=new Board(size,chessStrategy,  winStrategy1,res,co,count, moves,gameMode);
				break;
			case "10":
				GameChessStrategy_A chessStrategy2=new GameChessStrategy_A();
				GameWinStrategy_HVD winStrategy2=new GameWinStrategy_HVD();
				board=new Board(size,chessStrategy2,  winStrategy2,res,co,count, moves,gameMode);
				break;
				case "11":
				GameChessStrategy_A chessStrategy3=new GameChessStrategy_A();
					board=new Board(size,chessStrategy3,  winStrategy,res,co,count, moves,  gameMode);
				break;

		}
    	for(String move: moves){
    		res = board.nextMove(move);

    		board.print();
    		// 游戏结束
    		if( !res.equals(Result.GAMING) )
    			break;
    	}
    	return res;
    }
    public static void main(String[] args){
    	Game game=new Game();
    	System.out.println(game.playGame("10","A1,C2,B2,B4,C3,C1,E4,B5,A4,C4,A1,B3",5));
	}
}