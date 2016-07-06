package danli;
/*
 * 静态内部类单例模式
 * 推荐使用这种模式
 * 第一次加载InnerSingleton类时，并不会初始化mInnerSingleton，只有调用getInstance()方法的时候才会初始化
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
