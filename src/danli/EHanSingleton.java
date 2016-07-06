package danli;
/*
 * 饿汉模式
 * 通过公有的静态方法获得唯一的实例
 * */
public class EHanSingleton {
	private static EHanSingleton mEHanSingleton ;
	//
	private EHanSingleton(){}//构造方法
	//
	public static EHanSingleton getInstance(){
		if(mEHanSingleton == null){
			mEHanSingleton = new EHanSingleton(); 
		}
		return mEHanSingleton;
	}

}
