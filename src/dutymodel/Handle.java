package dutymodel;
/*
 * 抽象处理者*/
public abstract class Handle {
	protected Handle nextHandle;
	
	public final void handleRequest(int money){
		if(money < limmit()){
			handle(money);
		}else{
			nextHandle.handleRequest(money);
		}
	}
	public abstract int limmit();
	public abstract void handle(int money);

}
