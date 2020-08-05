package structure_facade_pattern;

public class FacadeLuggageManagement {
   private AirportSystem airport;
   private Airplane airplane;
   private LocalLogisticsCompany company;
   private Hotel hotel;

   public FacadeLuggageManagement() {
      airport = new AirportSystem();
      airplane = new Airplane();
      company = new LocalLogisticsCompany();
      hotel = new Hotel();
   }

   public void transportLuggage() {
      airport.checkLuggage();
      airport.transportToAirplane();

      airplane.putLuggageToPlane();
      airplane.takeLuggageOut();

      company.putLuggageToTruck();
      company.transportToHotel();

      hotel.transportLuggageToGuest();
   }

}
