package abstractFactory;

import abstractFactory.components.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.changeSize();
    }
}
