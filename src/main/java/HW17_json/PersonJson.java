package HW17_json;

public class PersonJson {
    int id;
    String name;
    String userName;
    String email;
    Adress adress;
    int phone;
    String website;
    Company company;


    public class Adress{
        String street;
        String suite;
        String city;
        int zipcode;
        public class Geo {
            int lat;
            int lng;

        }
    }
    public class Company{
        String name;
        String catchPhrase;
        String bs;
    }
}
