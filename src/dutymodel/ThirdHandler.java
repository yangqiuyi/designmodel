package dutymodel;

public class ThirdHandler extends Handle{

	@Override
	public int limmit() {
		return 10000000;
	}

	@Override
	public void handle(int money) {
		System.out.print("ThirdHandler�Ѿ������˴�����,������Ϊ"+ money);
	}

}
