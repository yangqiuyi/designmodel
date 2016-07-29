package statusmodel;

public class Client {
	public static void main(String args[]){
		
		StatusControl statusControl = new StatusControl();
		//大学状态的吃，睡
        statusControl.setStatus(new DaXueStatus());
        statusControl.eat();
        statusControl.sleep();
        //高中状态的吃，睡
        statusControl.setStatus(new GaoZhongStatus());
        statusControl.eat();
        statusControl.sleep();
	}
	
	
}
