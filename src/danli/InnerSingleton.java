package danli;
/*
 * ��̬�ڲ��൥��ģʽ
 * �Ƽ�ʹ������ģʽ
 * ��һ�μ���InnerSingleton��ʱ���������ʼ��mInnerSingleton��ֻ�е���getInstance()������ʱ��Ż��ʼ��
 * */
public class InnerSingleton {
	private InnerSingleton(){}
	public static InnerSingleton getInstance() {
		return InnerSingletonHolder.mInnerSingleton;
		
	}

	private static class InnerSingletonHolder{
		private static final InnerSingleton mInnerSingleton = new InnerSingleton();
	}
}
