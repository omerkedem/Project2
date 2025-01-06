public abstract class  Property {
    private String address = "Na, na";
    private double area = 0;
    private double price = 0;

    public Property()
    {
        setAddress("");
        setArea(-1);
        setPrice(-1);
    }
    public Property(String address, double area, double price)
    {
        setAddress(address);
        setPrice(price);
        setArea(area);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address != null && address.isEmpty())
        {
            this.address = address;
        }



    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = Math.max(0,this.area);


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(this.price,0);


    }
    public abstract void taxIt();
    public String toString()
    {
        return "the address is " + this.address + ", the price is " + this.price + " and the size of it is " +this.area;

    }
}
