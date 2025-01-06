public class Office extends Property{

    @Override
    public void taxIt() {
        System.out.println(this.getPrice() * 0.05 + " in tax");
    }
    public Office(String address, double area, double price)
    {
        super(address, area, price);
    }
}
