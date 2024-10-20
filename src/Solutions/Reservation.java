package Solutions;

public class Reservation 
{
    Airplane airplane = new Airplane();
    UserInfo userInfo = new UserInfo();

    public boolean reserve(int flightIndex) 
    {
        if (airplane.isAvailable(flightIndex)) 
        {
            System.out.println("It's available. Please enter your information to book the ticket.");
            return true;
        } 
        else 
        {
            System.out.println("Unfortunately, it is fully booked, choose another itinerary.");
            return false;
        }
    }

    public void setFirstName(String firstName) 
    {
        userInfo.setFirstName(firstName);
    }

    public void setLastName(String lastName) 
    {
        userInfo.setLastName(lastName);
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        userInfo.setPhoneNumber(phoneNumber);
    }

    public void confirmReservation(int flightIndex) 
    {
        airplane.reserveFlight(flightIndex);
        System.out.println("Reservation Details:");
        System.out.println(userInfo.nameString());
        System.out.println("Flight: " + airplane.getAirplace(String.valueOf(flightIndex)));
    }

    public void printAirplaneList() 
    {
        String[] airplaneList = airplane.getAirpleList();
        for (String flight : airplaneList) 
        {
            System.out.println(flight);
        }
    }
}
