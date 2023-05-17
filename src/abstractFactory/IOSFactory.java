package abstractFactory;

import abstractFactory.components.Button.Button;
import abstractFactory.components.Button.IosButton;
import abstractFactory.components.Menu.IosMenu;
import abstractFactory.components.Menu.Menu;

public class IOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
