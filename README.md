# Spark Gradle Test Example [![Build Status](https://travis-ci.org/punya/spark-gradle-test-example.svg?branch=develop)](https://travis-ci.org/punya/spark-gradle-test-example)

To run tests,

```
  ./gradlew check
```

To produce a shadowed jar suitable for `spark-submit`,

```
  ./gradlew shadowJar
```

To start a REPL (note that this isn't `spark-shell`, so you won't be able to
submit jobs to a remote Spark master),

```
  ./gradlew -q scalaTestConsole
```
