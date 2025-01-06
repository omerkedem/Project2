
enum TYPE {URBAN,AGRICULTURAL, INDUSTRIAL}
public class Plot extends  Property{
    private TYPE type;

    public Plot(String address, double area, double price, TYPE type)
    {
        super(address,area,price);
        this.type = type;

    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
    @Override
    public void taxIt() {
        switch (type) {
            case URBAN:
                System.out.println(this.getPrice() * 0.1 + " in tax");
                break;
            case AGRICULTURAL:
                System.out.println(this.getPrice() * 0.02 + " in tax");
                break;
            case INDUSTRIAL:
                System.out.println(this.getPrice() * 0.05 + " in tax");
                break;
        }


    }
}
