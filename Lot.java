import java.io.*;
import java.util.*;

public class Lot 
{
    private final String lotName;
    private Map<Integer, Boolean> spaces = new HashMap<>();
    private Map<String, Integer> storeSpaceId = new HashMap<>();
    private final Double timeStamp = null;
    private final Integer capacity = null; 

    public Lot(String lotName) 
    {
       this.lotName = lotName;
    }
    public String getLotName()
    {
        return this.lotName;
    }
    // Map the sensor to the space
    public void setSpaceId(String sensorId, Integer spaceId)
    {
        this.storeSpaceId.put(sensorId, spaceId);
    }
    //Access the mapped space id
    public Integer getSpaceId(String sensorId)
    {
        return this.storeSpaceId.get(sensorId);
    }
    // Update space status
    public void setSpaceStatus(Boolean status, String sensorId)
    {
        Integer spaceId = getSpaceId(sensorId);
        this.spaces.put(spaceId, status);
    }
    //Access the space status
    public Boolean getSpaceStatus(Integer spaceId)
    {
        return this.spaces.get(spaceId);
    }
}
