# CodeCraft.js Example

Example template for a CodeCraft application that uses Scala.js to target the browser.
This can be a useful as a workaround in cases where the OpenGL graphics don't display properly on the JVM.

# How to build

Install [sbt](http://www.scala-sbt.org/) if you don't have it.

Running `sbt fastOptJS` will compile and generate the JavaScript.
To start the program, open/refresh `file:///$PROJECT_PATH/target/scala-2.11/classes/index.html` in a browser (Chrome tends to work best).


# IDE Setup

## IntelliJ

You need to have the Scala plugin installed.  
`File` → `New` → `Project from Existing Sources..` → select root directory → `Import project from external model` → `SBT` → `Next` → keep default options unless you have a reason to change them → `Finish`


## Eclipse
Presumably this is relatively straightforward as well.
