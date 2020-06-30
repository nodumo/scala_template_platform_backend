# Code Kitt Code-Generator

# ![Cde Generator App](header.png)

Mono repo for an code generator tool (Work in progress)

NPM like platform for storing code-templates (files, packages, constructs, components, etc.)

Define generators of your choosing and automate the heck out of your coding tasks. 

# Core libraries 

 - [Cats](https://typelevel.org/cats/) Base typeclasses?
 - [Circe](https://circe.github.io/circe/) Functional JSON parser
 - [Doobie](https://tpolecat.github.io/doobie/) Effectful Doobie   
 - [HTTPS](https://http4s.org/) Pure HTTP DLS
 - [Monacle](https://www.optics.dev/Monocle/) Pretty lenses 
 - [ZIO](https://zio.dev/) Effect Monad 

# Project structure
* codegeneratorapp/
    * common/
        * src/ (Generic application kernel)
        * test/
    * bigData/
        * src/ (TBD - Once enought templates are uploaded a lot features built on a large data set can be worked on)
        * test/
    * domain/ 
        * src/ (Business domain implementation)
        * test/
    * infrastructure/
        * src/
        * test/
    * project/
        * build.properties
        * plugins.sbt
   * serverapi/ (HTTP4S api-server)
        * src/
        * test/
   * servercore/
        * src/ (serialization, server utilities, etc.)
        * test/      
   * serverstaticwebsites/
       * src/ (HTTP4S static server for application web-pages)
       * test/
   * build.sbt
   
## Maintainers
- [Nick Odumo](https://github.com/nodumo) 

## License
MIT © [Code Generator application](https://github.com/nodumo/scala_template_platform_backend)
