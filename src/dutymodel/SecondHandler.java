package dutymodel;

public class SecondHandler extends Handle{

	@Override
	public int limmit() {
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.print("SecondHandler�Ѿ������˴�����,������Ϊ"+ money);
		
	}

}
