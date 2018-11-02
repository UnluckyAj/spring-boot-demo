package com.aashish.app.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientResponse {

    @JsonProperty(value = "success")
    private boolean success;

    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "error")
    private String error;

    @JsonProperty(value = "errorList")
    private List errorList;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setErrorList(List errorList) {
        this.errorList = errorList;
    }

    public ClientResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    private ClientResponse(boolean success, String message, String error) {
        this.success = success;
        this.message = message;
        this.error = error;
    }

    private ClientResponse(boolean success, List errorList) {
        this.success = success;
        this.errorList = errorList;
    }

    public ClientResponse() {
    }

    public static ClientResponse createSuccess(boolean success, String message) {
        return new ClientResponse(success, message);
    }

    public static ClientResponse createFailure(boolean success, String message) {
        return new ClientResponse(success, message);
    }

    public static ClientResponse createFailure(boolean success, List errorList) {
        return new ClientResponse(success, errorList);
    }
}