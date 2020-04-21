# Oracle Cloud Infrastructure Java SDK Apache Connector Add-On

## About

The oci-java-sdk-addons-apache is an optional add-on to the Oracle Cloud Infrastructure Java SDK.  It leverages the Jersey `ApacheConnectorProvider` instead of the Java SDK's default `HttpUrlConnectorProvider` when making service calls.

The add-on provides two features:

* **Connection pooling**. A detailed explanation can be found [here](https://hc.apache.org/httpcomponents-client-ga/tutorial/html/connmgmt.html)
* **HTTP(S) proxy support**.

Note: The `ApacheConnectorProvider` buffers requests into memory and can impact memory utilization of your application.  This increased use of memory is especially relevant when using`ObjectStorageClient` to upload large objects to the Object Storage service.

## Installation
1. The Java SDK must be installed and configured before installing the add-on.  See [Apache Connector Add-On](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdkconfig.htm#apache) for details.
2. Copy the supplied oci-java-sdk-addons-apache and third-party jar files to your application's classpath.

## Configuration

Create a client with the ```ApacheConfigurator```:

	IdentityClient identityClient = IdentityClient.builder()
			.region(Region.US_PHOENIX_1)
			.clientConfigurator(new ApacheConfigurator())
			.build(authenticationDetailsProvider);

### Configure the Connection Pool

Configure the connection pool as follows:

	ApacheConnectionPoolConfig poolConfig = ApacheConnectionPoolConfig.builder()
			.defaultMaxConnectionsPerRoute(5) 
			.totalOpenConnections(20)
			.ttl(2, TimeUnit.SECONDS)
			.build();
	ApacheConnectionPoolingClientConfigDecorator poolDecorator =
			new ApacheConnectionPoolingClientConfigDecorator(poolConfig);
	ApacheConfigurator configurator = 
			new ApacheConfigurator(Collections.singletonList(poolDecorator));

	IdentityClient identityClient = IdentityClient.builder()
			.region(Region.US_PHOENIX_1)
			.clientConfigurator(configurator)
			.build(authenticationDetailsProvider);

Documentation explaining the configuration concepts can be found [here](https://hc.apache.org/httpcomponents-client-ga/tutorial/html/connmgmt.html).

### Configure the HTTP Proxy

This add-on supports configuring a client to use a HTTP or HTTPS proxy.  It is configured configured on a per-client basis, meaning that a proxy must be configured for each new client instance.

Configure an HTTP or HTTPS proxy as follows:

#### Authenticated Proxy

	ApacheProxyConfig proxyConfig = ApacheProxyConfig.builder()
			.uri("http://proxy.domain.com:8000")
			.username("username")
			.password("password")
			.build();
	ClientConfigDecorator proxyConfigDecorator =
			new ApacheProxyConfigDecorator(proxyConfig);
	ClientConfigurator configurator =
			new ApacheConfigurator(Collections.singletonList(proxyConfigDecorator));

	IdentityClient identityClient = IdentityClient.builder()
			.region(Region.US_PHOENIX_1)
			.clientConfigurator(configurator)
			.build(authenticationDetailsProvider);

#### Unauthenticated Proxy

	ApacheProxyConfig proxyConfig = ApacheProxyConfig.builder()
			.uri("https://proxy.domain.com:443")
			.build();
	ClientConfigDecorator proxyConfigDecorator =
			new ApacheProxyConfigDecorator(proxyConfig);
	ClientConfigurator configurator =
			new ApacheConfigurator(Collections.singletonList(proxyConfigDecorator));

	IdentityClient identityClient = IdentityClient.builder()
			.region(Region.US_PHOENIX_1)
			.clientConfigurator(configurator)
			.build(authenticationDetailsProvider);

#### Example
An example of configuring a proxy can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/HttpProxyExample.java).


## License
Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](../../LICENSE.txt) for more details.
