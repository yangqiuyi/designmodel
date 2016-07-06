package danli;
/*Double CheckLog
 *�ŵ㣺������Ҫʱ�ų�ʼ������ͬʱ�ֱ�֤���̰߳�ȫ���ҵ��������ʼ���󣬵���getInstance()������ͬ��
 * 
 * */

public class DCLSingleton {
	private static DCLSingleton mDCLSingleton ;
	//
	private DCLSingleton(){}//���췽��
	
	public static DCLSingleton getInstance(){
		if(mDCLSingleton == null){//��һ���ж��Ƿ�Ϊ�գ���Ϊ�˱��ⲻ��Ҫ��ͬ��
			synchronized (DCLSingleton.class) {
				{
				if (mDCLSingleton == null)//�ڶ����ж��Ƿ�Ϊ�գ���Ϊ�˴���ʵ��
					mDCLSingleton = new DCLSingleton();
					}
			}
		}
		return mDCLSingleton;
	}
}
