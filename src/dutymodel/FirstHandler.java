package dutymodel;

public class FirstHandler extends Handle{
     
	@Override
	public int limmit() {
		
		return 1000;
	}
	@Override
	public void handle(int money) {
		System.out.print("FirstHandler�Ѿ������˴�����,������Ϊ"+money);
		
	}
	

}
