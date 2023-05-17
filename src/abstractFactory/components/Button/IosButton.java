package abstractFactory.components.Button;

public class IosButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("IOS Button change size");
    }
}
