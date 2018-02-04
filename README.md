Introduction

Gatling

Gatling  is a highly capable load testing tool. It is designed for ease of use, maintainability and high performance.
Gatling utilises asynchronous concurrency and IO, and by using a major language (Scala) for its scripting

Usage 

To Run performance tests (eg:Smoke/Load/Stress/Soak), execute the following command:
mvn gatling:execute -Dgatling.simulationClass=packagename.SmokeSimulation -DbaseUrl="testsiteUrl"