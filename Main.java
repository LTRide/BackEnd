import java.io.*;
import java.util.*;


public class Main
{
     public static void main(String [] args)
    {
        Lot newLot = new Lot(4, 1);
        newLot.setStatus(0);
        int lotNum = newLot.getLotNum();
        int status = newLot.getLotStatus();

        System.out.println("lot " + lotNum + " has status: " + status);
    }
}
