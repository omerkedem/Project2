import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> start()
    {
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(new Apartment("ramat gan, pen 24", 5,550_000,3,5));
        properties.add(new Apartment("Givataim, Ben 23", 3,400_000,2,4));
        properties.add(new Commercial("Dimona, reto 33", 7,409_000,15));
        properties.add(new Commercial("Tel Aviv, David 39", 3,560_000,25));
        properties.add(new Office("Natania, por 56", 10,1_000_000));
        properties.add(new Office("Holon, resad 3", 12,1_250_000));
        properties.add(new Plot("rehovot, gor 10", 30,2_500_000,TYPE.INDUSTRIAL));
        properties.add(new Plot("Kfar Saba, desop 14", 35,3_500_000,TYPE.AGRICULTURAL));
        properties.add(new Vacation("Eilat, hamea 60", 8,1_000_000,4,7));
        properties.add(new Vacation("Eilat, krol 65", 10,2_000_000,6,10));
        properties.add(new Villa("Savion", 6,4_000_000,6,3));
        properties.add(new Villa("Ramat Gan, yair 24", 8,6_000_000,2,4));
        return properties;





    }
}
