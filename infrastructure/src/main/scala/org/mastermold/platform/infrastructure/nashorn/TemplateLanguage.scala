package org.mastermold.platform.infrastructure.nashorn

sealed abstract class TemplateLanguage(val name: TemplateLanguage.NameRepr)

object TemplateLanguage {

  type NameRepr = String

  final case object Liquid extends TemplateLanguage("liquid")

  final case object Mustache extends TemplateLanguage("mustache")

  final case object Nunjucks extends TemplateLanguage("nunjucks")

  final case object Template7 extends TemplateLanguage("template7")

}
