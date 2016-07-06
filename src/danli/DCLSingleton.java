package danli;
/*Double CheckLog
 *优点：既在需要时才初始化对象，同时又保证了线程安全，且单例对象初始化后，调用getInstance()不会再同步
 * 
 * */

public class DCLSingleton {
	private static DCLSingleton mDCLSingleton ;
	//
	private DCLSingleton(){}//构造方法
	
	public static DCLSingleton getInstance(){
		if(mDCLSingleton == null){//第一次判断是否为空，是为了避免不必要的同步
			synchronized (DCLSingleton.class) {
				{
				if (mDCLSingleton == null)//第二次判断是否为空，是为了创建实例
					mDCLSingleton = new DCLSingleton();
					}
			}
		}
		return mDCLSingleton;
	}
}
