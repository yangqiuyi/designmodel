package dutymodel;

public class SecondHandler extends Handle{

	@Override
	public int limmit() {
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.print("SecondHandler已经处理了此请求,处理金额为"+ money);
		
	}

}
