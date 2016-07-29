package anotherbuildermodel;

public class BenChiBuilder extends Builder{
	public Car BenChi  = new Car(); 

	@Override
	public void BuildWheel() {
		System.out.print("±¼³Û³µÂÖ");
		
	}

	@Override
	public void BuildEngine() {
		System.out.print("±¼³ÛÒıÇæ");
		
	}
	
	public Car getCar (){
		return BenChi;
	}

}
