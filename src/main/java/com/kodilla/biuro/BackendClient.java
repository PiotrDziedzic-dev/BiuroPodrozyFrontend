package com.kodilla.biuro;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.*;

@Component
@RequiredArgsConstructor
public class BackendClient {
    private final RestTemplate restTemplate;

    @Value("${backend.api.endpoint.prod}")
    private String backendApiEndpoint;

    public List<Car> getAllCars() {
        URI url = UriComponentsBuilder.fromHttpUrl(backendApiEndpoint + "/v1/Car/getCars")
                .build()
                .encode()
                .toUri();

        Car[] boardsResponse = restTemplate.getForObject(url,Car[].class);

        return Optional.ofNullable(boardsResponse)
                .map(Arrays::asList)
                .orElse(Collections.emptyList());

    }

}
