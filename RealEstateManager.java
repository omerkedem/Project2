import java.util.ArrayList;

public class RealEstateManager {
    private String name;
    private ArrayList<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
    public void addProperty(Property property)
    {
        this.properties.add(property);
    }
    public ArrayList<Property> underValue(double value)
    {
        ArrayList<Property> p = new ArrayList<>();
        for (int i =0;i<this.properties.size();i++)
        {
            if(this.properties.get(i).getPrice() <= value)
                p.add(this.properties.get(i));
        }
        return p;
    }
    public double sumOfProperties()
    {
        double sum =0;
        for(int i =0;i<this.properties.size();i++)
        {
            sum+= this.properties.get(i).getPrice();
        }
        return sum;
    }
}
