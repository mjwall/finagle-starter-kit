resolvers += "twitter.com" at "http://maven.twttr.com/"

libraryDependencies += "com.twitter" % "finagle-core" % "5.1.0" exclude("thrift", "libthrift")

libraryDependencies += "com.twitter" % "finagle-ostrich4" % "5.1.0" exclude("thrift", "libthrift")

libraryDependencies += "com.twitter" % "util-core" % "5.2.0" exclude("thrift", "libthrift") intransitive()

libraryDependencies += "org.scala-tools.testing" % "specs_2.8.1" % "1.6.7" % "test" withSources()

libraryDependencies += "org.scala-tools.testing" % "scalacheck_2.8.1" % "1.8" % "test"

libraryDependencies += "org.jmock" % "jmock" % "2.5.1" % "test"

libraryDependencies += "org.jmock" % "jmock-legacy" % "2.5.1" % "test"

libraryDependencies += "org.hamcrest" % "hamcrest-all" % "1.1" % "test"

libraryDependencies += "cglib" % "cglib" % "2.1_3" % "test"

libraryDependencies += "asm" % "asm" % "1.5.3" % "test"

libraryDependencies += "org.objenesis" % "objenesis" % "1.1" % "test"

// libraryDependencies += "thrift" % "libthrift" % "0.5.0" from "http://maven.twttr.com/thrift/libthrift/0.5.0/libthrift-0.5.0.jar"

