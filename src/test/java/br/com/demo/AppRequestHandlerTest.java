package br.com.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class AppRequestHandlerTest {

    private AppRequestHandler appRequestHandler;
    private Context mockContext;
    private APIGatewayV2HTTPEvent mockEvent;

    @BeforeEach
    void setUp() {
        appRequestHandler = new AppRequestHandler();
        mockContext = Mockito.mock(Context.class);
        mockEvent = APIGatewayV2HTTPEvent.builder().build();
    }

    @Test
    void testHandleRequest_withValidEvent_shouldReturnHelloWorldResponse() {
        APIGatewayV2HTTPResponse response = appRequestHandler.handleRequest(mockEvent, mockContext);
        assertEquals(200, response.getStatusCode());
        assertEquals("Hello World!", response.getBody());
        assertEquals("text/html", response.getHeaders().get("Content-Type"));
    }

    @Test
    void testHandleRequest_shouldLogRequestAndResponse() {
        appRequestHandler.handleRequest(mockEvent, mockContext);
        verifyNoMoreInteractions(mockContext);
    }

}
