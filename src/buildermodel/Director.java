package buildermodel;

public class Director {
	Builder mBuilder = null;
	
	public Director(Builder builder){
		mBuilder = builder;
	}
	public void construct(String board,String display){
		mBuilder.builderBoard(board);
		mBuilder.builderDisplay(display);
		mBuilder.builderOS();
	}
	
}
