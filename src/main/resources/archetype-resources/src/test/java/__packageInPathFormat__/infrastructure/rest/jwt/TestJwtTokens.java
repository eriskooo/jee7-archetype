package ${package}.infrastructure.rest.jwt;

/**
 * Test data for the jwt.
 */
public class TestJwtTokens {

  // expires at 31.12.2099
  public static final String DEFAULT_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwibmJmIjoxNTM0MTUxMjc5LCJyb2xlcyI6IltjYXNoaWVyXSIsImlzcyI6Imh0dHBzOi8vbG9jYWxob3N0Ojg0NDMvYXV0aC1zZXJ2aWNlLyIsImV4cCI6NDEwMjM1NDgwMCwiZ2l2ZW5fbmFtZSI6IlNhc2tpYSIsImlhdCI6MTUzNDE1MTI3OSwiZmFtaWx5X25hbWUiOiJCb2RlaW4ifQ.9g56_eprmxvfht6IRt_c-PzrAK2plo4U65i4hL-KMu0";

  // expires at 31.12.2099
  public static final String SYSTEM_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIwIiwibmJmIjoxNDgzMjI1MjAwLCJnaXZlbl9uYW1lIjoiU3lzdGVtIiwiZmFtaWx5X25hbWUiOiJTeXN0ZW0iLCJyb2xlcyI6IltdIiwiaXNzIjoiaHR0cHM6Ly9sb2NhbGhvc3Q6ODQ0My9hdXRoLXNlcnZpY2UvIiwiZXhwIjo0MTAyMzU0ODAwLCJpYXQiOjE0ODMyMjUyMDB9.liEIeQ0Xm1S8sKGUxBr9tajrasLQoSHswJJHIpzPmjI";

  // expires at 31.12.2099
  public static final String USER_WITH_NO_PERMISSION = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTExIiwibmJmIjoxNTM0MTUxMjc5LCJyb2xlcyI6IltjYXNoaWVyXSIsImlzcyI6Imh0dHBzOi8vbG9jYWxob3N0Ojg0NDMvYXV0aC1zZXJ2aWNlLyIsImV4cCI6NDEwMjM1NDgwMCwiZ2l2ZW5fbmFtZSI6IkFzdGFyIiwiaWF0IjoxNTM0MTUxMjc5LCJmYW1pbHlfbmFtZSI6IlNlcmFuIn0.XYup7WY8zk98saFb5AovlMvveDjc4-lOlkyx25NnkK8";
}
