
public class SquareBoard {

	public static void print(int size){
		if(size>0){
			for(int i=0;i<size;i++){
				if(i!=size-1){
					for(int j=0;j<size;j++){
						if(j!=size-1){
							System.out.print("# ");
						}
						else {
							System.out.println("#");
						}
					}
				}
				else {
					for(int j=0;j<size;j++){
						if(j!=size-1){
							System.out.print("# ");
						}
						else {
							System.out.print("#");
						}
					}
				}
			}
		}
		
	}
	public static void main(String[] args){
		print(4);
	}
}
