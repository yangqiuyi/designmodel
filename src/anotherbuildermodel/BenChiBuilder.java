package anotherbuildermodel;

public class BenChiBuilder extends Builder{
	public Car BenChi  = new Car(); 

	@Override
	public void BuildWheel() {
		System.out.print("���۳���");
		
	}

	@Override
	public void BuildEngine() {
		System.out.print("��������");
		
	}
	
	public Car getCar (){
		return BenChi;
	}

}
