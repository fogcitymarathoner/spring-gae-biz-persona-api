package com.fogtest.api;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ClientControllerTests {

    @Autowired
    private ClientController controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
    @Test
    public void htmlRender() throws Exception {
        final String url = "http://localhost:" + port + "/clients";
        String response = this.restTemplate.getForObject(url,
                String.class);
        HttpHeaders httpHeaders = this.restTemplate
                .headForHeaders(url);
        System.out.println(httpHeaders.getContentType());
        assertTrue(httpHeaders.getContentType()
                .includes(MediaType.TEXT_HTML));
        System.out.println(response);
        System.out.println(httpHeaders.get("title"));
        assertThat(response.contains("Hello World!"));
    }
}
