package br.com.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;

import java.util.Map;

public class AppRequestHandler implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {

    @Override
    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent event, Context context) {
        context.getLogger().log("Request: " + event.toString());
        APIGatewayV2HTTPResponse response = APIGatewayV2HTTPResponse.builder()
                .withHeaders(Map.of("Content-Type", "text/html"))
                .withBody("Hello World!")
                .withStatusCode(200)
                .build();
        context.getLogger().log("Response: " + response.toString());
        return response;
    }

}
