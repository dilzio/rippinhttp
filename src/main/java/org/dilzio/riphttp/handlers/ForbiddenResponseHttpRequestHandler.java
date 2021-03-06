package org.dilzio.riphttp.handlers;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

import java.io.IOException;

public class ForbiddenResponseHttpRequestHandler implements HttpRequestHandler {
	private final String _message;

	public ForbiddenResponseHttpRequestHandler(final String message) {
		_message = message;
	}

	@Override
	public void handle(final HttpRequest request, final HttpResponse response, final HttpContext context) throws HttpException, IOException {
		response.setStatusCode(HttpStatus.SC_FORBIDDEN);
		response.setEntity(new StringEntity(_message));
	}

}
