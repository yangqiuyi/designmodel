package buildermodel;

public class Test {
	
	public static void main(String[] args){
		Builder builder = new MacbookBuilder();
		Director pcdirector = new Director(builder);
		pcdirector .construct("����", "��ʾ��");
		System.out.print("Computer Info:"+builder.creat().toString());
	}

}
