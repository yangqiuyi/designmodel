package danli;
/*
 * ����ģʽ
 * ͨ�����еľ�̬�������Ψһ��ʵ��
 * */
public class EHanSingleton {
	private static EHanSingleton mEHanSingleton ;
	//
	private EHanSingleton(){}//���췽��
	//
	public static EHanSingleton getInstance(){
		if(mEHanSingleton == null){
			mEHanSingleton = new EHanSingleton(); 
		}
		return mEHanSingleton;
	}

}
