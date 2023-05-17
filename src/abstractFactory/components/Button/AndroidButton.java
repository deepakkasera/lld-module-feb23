package abstractFactory.components.Button;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Android Button change size");
    }
}
