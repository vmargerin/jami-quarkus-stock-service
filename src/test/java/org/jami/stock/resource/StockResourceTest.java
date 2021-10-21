package org.jami.stock.resource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.security.TestSecurity;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestSecurity(user = "order-service", roles = { "order-flow" })
@TestHTTPEndpoint(StockResource.class)
public class StockResourceTest {

  @Test
  public void getStockBySku() {
    given()
      .when()
      .get("/1234")
      .then()
      .statusCode(200)
      .body("quantity", equalTo(10))
      .body("sku", equalTo("1234"));
  }
}
