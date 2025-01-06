public abstract class Residential extends Property {
    private int parkingSpots = 0;

    public Residential(String address, double area, double price, int parkingSpots)
    {
        super(address, area, price);
        setParkingSpots(parkingSpots);
    }

    public Residential()
    {
        super();
        setParkingSpots(0);
    }

    public int getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(int parkingSpots) {
        this.parkingSpots = Math.max(parkingSpots,0);
    }
    @Override
    public String toString() {
        return "the address is " + this.getAddress() + ", the area of it is " + this.getArea() + ", the price of it is " + this.getPrice() + " and it has " +this.parkingSpots + " parking spots";
    }

}
