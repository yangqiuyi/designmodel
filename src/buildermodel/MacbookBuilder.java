package buildermodel;

public class MacbookBuilder extends Builder{
	private Computer mcomputer = new Macbook();

	@Override
	public void builderBoard(String board) {
		mcomputer.setBoard(board);
	}

	@Override
	public void builderDisplay(String display) {
		mcomputer.setDisplay(display);
		
	}

	@Override
	public void builderOS() {
		mcomputer.setOS();
		
	}

	@Override
	public Computer creat() {
		return mcomputer;
	}
	

}
