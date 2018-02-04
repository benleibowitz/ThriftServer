## Apache Thrift Example Server & Client With Maven

Building the project will generate Java files from Thrift files. In the root directory's `pom.xml` file, point the `maven-thrift-plugin` to your local Apache Thrift installation.

To build the project, run:
```bash
git clone https://github.com/benleibowitz/ThriftServer.git
cd ThriftServer
mvn clean install
```

To run the server, go into the `server` module and run:
```bash
cd server
mvn exec:java
```

From within the `client` module, you can run the example `OrderPlacingServiceClientImpl`