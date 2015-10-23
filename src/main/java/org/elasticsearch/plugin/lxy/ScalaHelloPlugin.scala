package org.elasticsearch.plugin.lxy

class ScalaHelloPlugin extends org.elasticsearch.plugins.AbstractPlugin {

  def description(): String = "scala hello word"
  def name(): String = "hello scala"
  def onModule(module: org.elasticsearch.rest.RestModule) = {
    module.addRestAction(classOf[ScalaHelloAction]);

  }
}