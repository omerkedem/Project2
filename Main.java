import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static RealEstateManager tivuchMan = new RealEstateManager("Omer");

    public static void main(String[] args) {
        tivuchMan.setProperties(DataManager.start());
        System.out.println("enter what do you want to do and -1 when you are done");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        while (choise != -1)
        {
            switch (choise){
                case 1:
                    System.out.println("enter max price");
                    propertiesList(scanner.nextInt());
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    commercialYield();
                    break;
                case 4:
                    System.out.println("enter city");
                    propertiesByCities(scanner.next());
                    break;
                case 5:
                    numberOfCities();
                    break;
                default:
                    break;




            }
            System.out.println("what do you want to do? press -1 to end");
            choise = scanner.nextInt();



        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
    public static void propertiesList(double price)
    {
        if(price<0)
        {
            System.out.println("number must be positive");
            return;
        }
        ArrayList<Property> properties = tivuchMan.getProperties();
        for(int i =0;i<properties.size();i++)
        {
            if (properties.get(i).getPrice() <= price)
                System.out.println(properties.get(i));

        }
    }
    public static void financialReport()
    {
        ArrayList<Property> properties = tivuchMan.getProperties();
        for(int i =0;i<properties.size();i++)
        {
            properties.get(i).taxIt();
        }

    }
    public static void commercialYield()
    {
        double sum =0;
        ArrayList<Property> properties = tivuchMan.getProperties();
        for(int i =0;i<properties.size();i++)
        {
            if(properties.get(i) instanceof Commercial)
                sum += (((Commercial) properties.get(i)).getYield()/100) * properties.get(i).getPrice();
        }
        System.out.println("the yearly yield is " + sum);

    }
    public static void propertiesByCities(String city)
    {
        String s = "", s1 ="", s2 = "";
        int index =0;
        ArrayList<Property> properties = tivuchMan.getProperties();
        for(int i =0;i<properties.size();i++)
        {
            s = properties.get(i).getAddress();
            s = s.toLowerCase();
            city = city.toLowerCase();
            if (city.contains("-"))
            {
                index = city.indexOf("-");
                s1 = city.substring(0,index-1);
                s2 = city.substring(index+1);
                if(s.contains(s1) && s.contains(s2))
                    System.out.println(properties.get(i));
            }
            else
                if (s.contains(city))
                    System.out.println(properties.get(i));
        }
    }
    public static void numberOfCities()
    {
        HashMap<String,Integer> cities = new HashMap<>();
        ArrayList<Property> properties = tivuchMan.getProperties();
        String city = "";
        int index = 0;
        int cityCount =0;
        for(int i =0;i<properties.size();i++)
        {
            city = properties.get(i).getAddress();
            index = city.indexOf(',');
            city = city.substring(0,index);
            if (cities.get(city)  == null)
            {
                cityCount++;
                System.out.println(city);
                cities.put(city,1);
            }
        }
        System.out.println("the number of cities is "+ cityCount);
    }
}