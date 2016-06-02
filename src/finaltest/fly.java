package finaltest;

public class fly
{
   private int airSpeedMPH;
   private int elevationPerMinute;
   private int flightTime;
   
   public fly()
   // initial time (flightTime) is set to 1 minute
   {
      flightTime = 1;
   }
   
   public void setAirSpeed (int airSpeedMPH)
   // airSpeedMPH is the distance traveled per hour (MPH) by the object that is flying
   {
      this.airSpeedMPH = airSpeedMPH;
   }
   
   public void setAltimeter (int elevationPerMinute)
   // elevationPerMinute is the elevation gain per minute measure by feet (FPM) by the object that is flying
   {
      this.elevationPerMinute = elevationPerMinute;
   }
}