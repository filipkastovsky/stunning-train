package com.example.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.parsetools.JsonParser;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    String json = "{ \"big_number\": 18446744073709551615 }";
    JsonParser parser = JsonParser.newParser();
    parser.handle(Buffer.buffer(json));

    startPromise.complete();
  }

}
