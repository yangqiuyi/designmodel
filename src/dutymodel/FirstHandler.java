package dutymodel;

public class FirstHandler extends Handle{
     
	@Override
	public int limmit() {
		
		return 1000;
	}
	@Override
	public void handle(int money) {
		System.out.print("FirstHandler已经处理了此请求,处理金额为"+money);
		
	}
	

}
