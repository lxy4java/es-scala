package org.elasticsearch.plugin.lxy

import org.elasticsearch.common.settings.Settings
import org.elasticsearch.rest.RestController
import org.elasticsearch.client.Client
import org.elasticsearch.common.inject.Inject
import org.elasticsearch.rest.RestChannel
import org.elasticsearch.rest.BaseRestHandler
import org.elasticsearch.rest.RestRequest
import org.elasticsearch.rest.RestRequest.Method.POST
import org.elasticsearch.rest.RestRequest.Method.GET
import org.elasticsearch.rest.BytesRestResponse
import org.elasticsearch.rest.RestStatus.OK;
class ScalaHelloAction @Inject() (settings: Settings,
                                  controller: RestController,
                                  client: Client)
  extends BaseRestHandler(
    settings: Settings,
    controller: RestController,
    client: Client) {

  controller.registerHandler(POST, "/scala/hello", this);
  controller.registerHandler(GET, "/scala/hello", this);

  @Override
  def handleRequest(request: RestRequest, channel: RestChannel, client: Client) {

    channel.sendResponse(new BytesRestResponse(OK, "hello  scala"))
  }
}