package danli;
/*
 * 懒汉模式
 * 懒汉模式相对于饿汉模式，在getinstance()方法中，多了synchronized，确保了在多线程的情况下，单例对象的唯一性
 * 缺点：每次调用getinstance()都要同步，造成不必要的同步开销
 * */

public class LanHanSingleton {
	private static LanHanSingleton mLanHanSingleton ;
	//
	private LanHanSingleton(){}//构造方法
	//
	public static synchronized LanHanSingleton getInstance(){
		if(mLanHanSingleton == null){
			mLanHanSingleton = new LanHanSingleton();
			}
		return mLanHanSingleton;
	}

}
