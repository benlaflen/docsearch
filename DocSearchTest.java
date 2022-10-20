import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class DocSearchTest {
    @Test
    public void testRequest() {
        try {
            Handler myhandler = new Handler("technical/");
            assertEquals("", myhandler.handleRequest(new URI("test")));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        
    }
}
