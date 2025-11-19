import java.io.*;
import java.util.*;

public class Lot 
{
    public int lotStatus;
    public final int lotNumber;

    public Lot(int lotNum, int status) 
    {
        lotNumber = lotNum;
        lotStatus = status;
        //System.out.println("new lot: " + lotNum + " status: " + status);
    }
    public void setStatus(int newStatus)
    {
        this.lotStatus = newStatus; 
    }
    public int getLotStatus()
    {
        return lotStatus;
    }
    public int getLotNum()
    {
        return lotNumber;
    }
}
