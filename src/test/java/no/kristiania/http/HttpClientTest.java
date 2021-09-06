package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {
    @Test
    void shouldReceiveStatus() {
        HttpClient client = new HttpClient("httpbin.org", 80, "/status(200");
        assertEquals(200, client.getStatuscode());
    }
}
