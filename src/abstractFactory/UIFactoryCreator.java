package abstractFactory;

public class UIFactoryCreator {
    //This interface will be responsible to create UIFactory

    public static UIFactory createFactory(SupportedPlatform platform) {
        if (platform.equals(SupportedPlatform.ANDROID)) {
            return new AndroidFactory();
        } else if (platform.equals(SupportedPlatform.IOS)) {
            return new IOSFactory();
        }
        return null;
    }
}
