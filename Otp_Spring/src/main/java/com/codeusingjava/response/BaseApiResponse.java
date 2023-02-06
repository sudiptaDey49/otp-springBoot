package com.codeusingjava.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@ToString
public class BaseApiResponse {
	//private ResponseStatus responseStatus;
	private  int statusCode;
	private Object responseData;
	private String message;

	public BaseApiResponse(Object responseData) {

		this.responseData = responseData;
	}

	public BaseApiResponse() {
		this.responseData = null;
	}

	public BaseApiResponse(boolean error, int statusCode, Object responseData, String message) {
		super();

		this.statusCode = statusCode;
		this.responseData = responseData;
		this.message = message;
	}
	
    public String convertToJson() throws JsonProcessingException {
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        return mapper.writeValueAsString(this);
    }

}
