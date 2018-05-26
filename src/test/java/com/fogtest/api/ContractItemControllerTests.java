package com.fogtest.api;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ContractItemControllerTests {

    @Autowired
    private ContractItemController controller;

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
        final String url = "http://localhost:" + port + "/contractsitems";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        String responseBody = response.getBody();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.TEXT_HTML));
        assertTrue(responseBody.contains("<title>Contracts Items</title>"));
    }
}
