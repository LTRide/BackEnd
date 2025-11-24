import java.util.*;

public class Lot 
{
    private final String lotName;
    private Map<Integer, Boolean> spaces = new HashMap<>();
    private Map<String, Integer> storeSpaceId = new HashMap<>();
    private Double timeStamp;
    private Integer capacity; 

    public Lot(String lotName) //Maybe change?
    {
       this.lotName = lotName;
    }
    // Access the Lot name
    public String getLotName()
    {
        return this.lotName;
    }
    // Access time stamp of parking lot accesability update
    public Double getTimeStamp()
    {
        return timeStamp;
    }
    // Access the current lot capacity
    public Integer getLotCapacity()
    {
        return capacity;
    }
    // Update time stamp
    public void setTimeStamp(Double time)
    {
        this.timeStamp = time;
    }
    // Update capacity of lot
    public void setLotCapacity(Integer capacity)
    {
        this.capacity = capacity;
    }

    // Map the sensor to the space
    public void setSpaceName(String sensorId, Integer spaceName)
    {
        this.storeSpaceId.put(sensorId, spaceName);
    }
    //Access the mapped space id
    public Integer getSpaceName(String sensorId)
    {
        return this.storeSpaceId.get(sensorId);
    }
    // Update space status
    public void setSpaceStatus(Boolean status, String sensorId)
    {
        Integer spaceName = getSpaceName(sensorId);
        this.spaces.put(spaceName, status);
    }
    //Access the space status
    public Boolean getSpaceStatus(Integer spaceName)
    {
        return this.spaces.get(spaceName);
    }

    public static void main(String [] args)
    {
        System.out.println("Hello World");
         
        Lot adminLot = new Lot("admin lot");
        
        String lotName = adminLot.getLotName();
        System.out.println("Lot name: " + lotName);

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
        
        adminLot.setLotCapacity(14);
        Integer lotCapacity = adminLot.getLotCapacity();
        System.out.println("Lot capacity: " + lotCapacity);

        adminLot.setTimeStamp(12.45);
        Double lotTimeStamp = adminLot.getTimeStamp();
        System.out.println("The lot was updated " + lotTimeStamp + " minutes ago");



    }
}
