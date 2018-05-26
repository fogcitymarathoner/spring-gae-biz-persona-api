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
public class ApiControllerTests {
    @Autowired
    private ApiController controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void clients() throws Exception {
        final String url = "http://localhost:" + port + "/api/clients";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void clientsChecks() throws Exception {
        final String url = "http://localhost:" + port + "/api/clientschecks";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void clientsMemos() throws Exception {
        final String url = "http://localhost:" + port + "/api/clientsmemos";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void contracts() throws Exception {
        final String url = "http://localhost:" + port + "/api/contracts";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }


    @Test
    public void contractsItems() throws Exception {
        final String url = "http://localhost:" + port + "/api/contractsitems";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void employees() throws Exception {
        final String url = "http://localhost:" + port + "/api/employees";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void employeesmemos() throws Exception {
        final String url = "http://localhost:" + port + "/api/employeesmemos";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void expenses() throws Exception {
        final String url = "http://localhost:" + port + "/api/expenses";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void invoices() throws Exception {
        final String url = "http://localhost:" + port + "/api/invoices";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void invoicesItems() throws Exception {
        final String url = "http://localhost:" + port + "/api/invoicesitems";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }

    @Test
    public void states() throws Exception {
        final String url = "http://localhost:" + port + "/api/states";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        HttpHeaders httpHeaders = response.getHeaders();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }
}
