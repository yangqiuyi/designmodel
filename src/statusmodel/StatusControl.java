package statusmodel;

public class StatusControl {
	
	 public  Status mstatus;
	 
	    public void setStatus(Status status){
	    this.mstatus = status;
		}
		public void eat(){
			mstatus.eat();
		}
	public void play(){
			mstatus.play();
		}
	public void sleep(){
		mstatus.sleep();
	}
	public void study(){
		mstatus.study();
	}

}
