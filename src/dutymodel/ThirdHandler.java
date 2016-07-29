package dutymodel;

public class ThirdHandler extends Handle{

	@Override
	public int limmit() {
		return 10000000;
	}

	@Override
	public void handle(int money) {
		System.out.print("ThirdHandler已经处理了此请求,处理金额为"+ money);
	}

}
