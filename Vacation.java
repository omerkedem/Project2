public class Vacation extends Residential {
     private int guests;


     public Vacation(String address, double area, double price, int parkingSpots , int guests)
     {
         super(address, area, price, parkingSpots);
         setGuests(guests);
     }
     public Vacation()
     {
         setGuests(0);
     }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = Math.max(1,guests);
    }
    @Override
    public void taxIt() {
        System.out.println(this.getPrice() * 0.25 + " in tax");
    }
    public String toString() {
        return "the address is " + this.getAddress() + ", the area of it is " + this.getArea() + ", the price of it is " + this.getPrice() + ", it has " +this.getParkingSpots() + " parking spots and could host up to " + this.guests + " guests";
    }
}
