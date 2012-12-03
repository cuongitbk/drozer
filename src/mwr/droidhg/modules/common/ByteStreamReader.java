import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;

import android.util.Base64;

public class ByteStreamReader {

  public static String read(InputStream stream) throws IOException {
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    int c = 0;

    while(c > -1) {
      byte[] buf = new byte[1024];
      c = stream.read(buf);
      
      if(c > 0)
        output.write(buf, 0, c);
    }

    return output.toString();
  }

}