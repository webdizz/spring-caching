# spring-caching

PoC for Spring Caching options.

## Usage

Application supports profiles, depending specified profile different caching options will be utulized.

1. ###JCache + Ehcache
Starts by default, demonstrates local in-memory caching.

2. ###JCache + Hazelcast
To start Spring Profile *hazelcast* needs to be specified.
Demonstrates caching with Hazelcast, which by default supports discovery.

3. ### Redis
To start Spring Profile *redis* needs to be specified.
Demonstrates caching with Redis Cache for Azure as a cache for Hibernate, while application leve caching is implemented with Ehcache.

## HTTP caching
Also there is a sample code to establish configuration of Cache-Control header values in REST controllers.