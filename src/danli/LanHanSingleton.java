package danli;
/*
 * ����ģʽ
 * ����ģʽ����ڶ���ģʽ����getinstance()�����У�����synchronized��ȷ�����ڶ��̵߳�����£����������Ψһ��
 * ȱ�㣺ÿ�ε���getinstance()��Ҫͬ������ɲ���Ҫ��ͬ������
 * */

public class LanHanSingleton {
	private static LanHanSingleton mLanHanSingleton ;
	//
	private LanHanSingleton(){}//���췽��
	//
	public static synchronized LanHanSingleton getInstance(){
		if(mLanHanSingleton == null){
			mLanHanSingleton = new LanHanSingleton();
			}
		return mLanHanSingleton;
	}

}
