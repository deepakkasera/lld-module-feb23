package abstractFactory;

import abstractFactory.components.Button.Button;
import abstractFactory.components.Menu.Menu;

public interface UIFactory {
    //It should only contain the factory methods

    Button createButton();
    Menu createMenu();
}
