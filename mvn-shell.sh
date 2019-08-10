#!/usr/bin/env bash

mvn compile

mvn dependency:build-classpath -DincludeTypes=jar -Dmdep.outputFile=.cp.txt

jshell --class-path `cat .cp.txt`:target/classes
