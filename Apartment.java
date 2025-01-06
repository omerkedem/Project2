public class Apartment extends  Residential{
    private int rooms = 1;


    public Apartment(String address, double area, double price,int parkingSpots, int rooms)
    {
        super(address,area,price,parkingSpots);
        setRooms(rooms);
    }
    public Apartment()
    {
        super();
        setRooms(0);
    }

    @Override
    public void taxIt() {
        System.out.println(this.getPrice() * 0.08 + " in tax");
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = Math.max(2,rooms);
    }
    public String toString()
    {
        return "the address is " + this.getAddress() + ", the area of it is " + this.getArea() + ", the price of it is " + this.getPrice() + ", it has " + this.getParkingSpots() + " parking spots and the numbers of rooms in it is "+ this.rooms;
    }
}
