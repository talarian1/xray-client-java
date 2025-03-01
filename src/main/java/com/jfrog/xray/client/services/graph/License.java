package com.jfrog.xray.client.services.graph;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public interface License {
    @JsonProperty("license_key")
    String getKey();

    @JsonProperty("license_name")
    String getName();

    @JsonProperty("components")
    Map<String, ? extends Component> getComponents();

}
