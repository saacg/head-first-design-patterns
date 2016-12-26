#!/bin/bash
javac -d ../../../bin -sourcepath ../../../src -cp ../../../src/patterns/strategy/*.java
java -cp ../../../bin patterns.strategy.MiniDuckSimulator
