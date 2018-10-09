package ${package}.infrastructure.rest.exception;

import ${package}.infrastructure.error.GatewayErrorDTO;

import javax.ws.rs.core.Response;

/**
 * Exception to be thrown when a {@link Response.Status#INTERNAL_SERVER_ERROR} error is received from the Gateway.
 */
public class Gateway500Exception extends AbstractGatewayException {

  public Gateway500Exception(final GatewayErrorDTO error) {
    super(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), error);
  }
}
