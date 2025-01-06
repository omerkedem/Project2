public class Commercial extends Property{
    private boolean storeroom = false;
    private double yield = 0;


    public Commercial(String address, double area, double price, boolean storeroom,double yield)
    {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }
    public Commercial(String address, double area, double price,double yield)
    {
        super(address, area, price);

        setYield(yield);
    }
    public Commercial()
    {
        setYield(0);
        setStoreroom(false);
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = Math.max(yield,0);
    }

    public void monthly_Yield()
    {
        System.out.println("the monthly yield is" + (this.getPrice()*(this.yield /100) / 12) );
    }
    @Override
    public void taxIt() {
        System.out.println(this.getPrice() * 0.05 + " in tax");
    }
    public String toString()
    {
        String store = "doesn't have a store room";
        if(storeroom)
            store = "has a store room";
        return "the address is " + this.getAddress() + ", the area of it is " + this.getArea() + ", the price of it is " + this.getPrice() + store + "and yields " + this.yield;
    }
}
