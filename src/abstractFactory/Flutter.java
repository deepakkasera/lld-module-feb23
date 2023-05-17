package abstractFactory;

public class Flutter {

    public void setTheme() {
        System.out.println("Setting Theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting Refresh rate");
    }

    public UIFactory createUIFactory(SupportedPlatform platform) {
        //OCP getting violated.
//        if (platform.equals(SupportedPlatform.ANDROID)) {
//            return new AndroidFactory();
//        } else if (platform.equals(SupportedPlatform.IOS)) {
//            return new IOSFactory();
//        }

        //To solve OCP here, we can move the code to create UIFactory to some other interface.
        return UIFactoryCreator.createFactory(platform);
    }
}
