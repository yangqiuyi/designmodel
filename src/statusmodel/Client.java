package statusmodel;

public class Client {
	public static void main(String args[]){
		
		StatusControl statusControl = new StatusControl();
		//��ѧ״̬�ĳԣ�˯
        statusControl.setStatus(new DaXueStatus());
        statusControl.eat();
        statusControl.sleep();
        //����״̬�ĳԣ�˯
        statusControl.setStatus(new GaoZhongStatus());
        statusControl.eat();
        statusControl.sleep();
	}
	
	
}
