import java.io.*;
import josx.rcxcomm.*;

/**
 * This program uses the josx.rcxcomm package to
 * communicate over the Lego IR link with a
 * corresponding program, SensorReader. 
 * It sends the Sensor ID, and reads back the sensor value 
 * as a short.
 * @author Lawrie Griffiths
 */
public class LNPReadSensor {

  public static void main(String[] args) {

    try {

      RCXLNPPort port = new RCXLNPPort();

      InputStream is = port.getInputStream();
      OutputStream os = port.getOutputStream();
      DataInputStream dis = new DataInputStream(is);
      DataOutputStream dos = new DataOutputStream(os);

      System.out.println("Reading Light Sensor");
      int sendTime = (int)System.currentTimeMillis();
      for(int i=0;i<20;i++) {
        dos.writeByte(1);
        dos.flush();

        int n = dis.readShort();

        System.out.println("Received " + n);
      }
      System.out.println("Time = " + ((int)System.currentTimeMillis() -  sendTime));
    }
    catch (Exception e) {
      System.out.println("Exception " + e.getMessage());
    }
  }
}
