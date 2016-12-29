#!/bin/bash
javac -d ../../../bin -sourcepath ../../../src -cp ../../../src/patterns/observer/*.java
java -cp ../../../bin patterns.observer.WeatherStation
