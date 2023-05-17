package abstractFactory;

import abstractFactory.components.Button.AndroidButton;
import abstractFactory.components.Button.Button;
import abstractFactory.components.Menu.AndroidMenu;
import abstractFactory.components.Menu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
