# (λ)Template generator project platform mono-repo 

Mono repo for an code generator tool (Work in progress)

NPM like platform for storing code-templates (files, packages, constructs, components, etc.)

Define generators of your choosing and automate the heck out of your coding tasks. 

# Project structure
* codegeneratorapp/
    * common/
        * src/
        * test/
    * bigData/
        * src/
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
