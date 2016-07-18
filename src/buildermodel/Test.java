package buildermodel;

public class Test {
	
	public static void main(String[] args){
		Builder builder = new MacbookBuilder();
		Director pcdirector = new Director(builder);
		pcdirector .construct("Ö÷°å", "ÏÔÊ¾Æ÷");
		System.out.print("Computer Info:"+builder.creat().toString());
	}

}
