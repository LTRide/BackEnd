
public class Main
{
     public static void main(String [] args)
    {
        System.out.print("Hello World");
         
        Lot adminLot = new Lot("admin lot");
        
        String lotName = adminLot.getLotName();
        System.out.println("Lot name: " + lotName);
        
        adminLot.setLotCapacity(14);
        Integer lotCapacity = adminLot.getLotCapacity();
        System.out.println("Lot capacity: " + lotCapacity);

        adminLot.setTimeStamp(12.45);
        Double lotTimeStamp = adminLot.getTimeStamp();
        System.out.println("The lot was updated " + lotTimeStamp + " minutes ago");

        String sensorId = "N123";
        adminLot.setSpaceName(sensorId, 1);
        Integer spaceName = adminLot.getSpaceName(lotName);
        adminLot.setSpaceStatus(false, sensorId);
        Boolean spaceStatus = adminLot.getSpaceStatus(spaceName); // Might change ref system

        String status;
        if(spaceStatus)
        {
            status = "full";
        }
        else
        {
            status = "available";
        }
        System.out.println("Lot " + spaceName + " is " + status);


    }
}
