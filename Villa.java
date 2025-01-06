public class Villa extends Residential{
    private int levels = 1;

    public Villa(String address, double area, double price, int parkingSpots, int levels)
    {
        super(address, area, price, parkingSpots);
        setLevels(levels);
    }
    public Villa()
    {
        setLevels(0);
    }

    @Override
    public void taxIt() {
        System.out.println(this.getPrice() * 0.08 + " in tax");
    }

    public int getLevels() {
        return levels;
    }


    public void setLevels(int levels) {
        this.levels = Math.max(1,levels);
    }
    public String toString() {
        return "the address is " + this.getAddress() + ", the area of it is " + this.getArea() + ", the price of it is " + this.getPrice() + ", it has " +this.getParkingSpots() + " parking spots and it has " + this.levels + " levels";
    }
}
