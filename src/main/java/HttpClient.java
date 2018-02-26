import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import util.Query;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class HttpClient {

    public static String GetResponse(String query) {
        org.apache.http.client.HttpClient httpClient = new DefaultHttpClient();

        String response ="";
        HttpResponse httpResponse = null;
        try {
            HttpGet httpGetRequest = new HttpGet(query);
            httpResponse = httpClient.execute(httpGetRequest);
            System.out.println("----------------------------------------");
            System.out.println(httpResponse.getStatusLine());
            System.out.println("----------------------------------------");
            HttpEntity entity = httpResponse.getEntity();

            byte[] buffer = new byte[1024];
            if (entity != null) {
                InputStream inputStream = entity.getContent();
                try {
                    int bytesRead = 0;
                    BufferedInputStream bis = new BufferedInputStream(inputStream);
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        String partial = new String(buffer, 0, bytesRead);
                        response+=partial;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try { inputStream.close(); } catch (Exception ignore) {}
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        return response;
    }
}
