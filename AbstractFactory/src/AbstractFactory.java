
/**
 * @author krishna
 *
 */
public abstract class AbstractFactory {
	
	public static final int OS_IOS = 1;
	public static final int OS_ANDROID = 2;
	
	private static final IOSFactory IOS_FACTORY = new IOSFactory();
	private static final AndroidFactory ANDROID_FACTORY = new AndroidFactory();
	
	public AbstractFactory getFactory(int os){
		switch(os){
		case OS_IOS:
			return IOS_FACTORY;
		case OS_ANDROID:
			return ANDROID_FACTORY;
		default:
			return null;
		}
	}
	
	public abstract View createView();
	
	
}
