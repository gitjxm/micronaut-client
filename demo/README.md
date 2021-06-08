## Micronaut 2.5.3 Documentation

- [User Guide](https://docs.micronaut.io/2.5.3/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.3/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)

## Feature discovery-consul documentation

- [Micronaut Consul Service Discovery documentation](https://docs.micronaut.io/latest/guide/index.html#serviceDiscoveryConsul)

- [https://www.consul.io](https://www.consul.io)

## Feature management documentation

- [Micronaut Management documentation](https://docs.micronaut.io/latest/guide/index.html#management)
- 配置过程
  -  添加依赖
     ```xml
      <dependency>
        <groupId>io.micronaut</groupId>
        <artifactId>micronaut-management</artifactId>
        <scope>compile</scope>
      </dependency>
     ```
  -  配置endPoints
    ```yaml
       # application.yml文件
       endpoints:
          beans:
            enabled: true
            sensitive: false
          env:
            enabled: true
            sensitive: false
          loggers:
            enabled: true
            sensitive: false
          routes:
            enabled: true
            sensitive: false
    ```
    

## Feature config-consul documentation

- [Micronaut Consul Distributed Configuration documentation](https://docs.micronaut.io/latest/guide/index.html#distributedConfigurationConsul)

- [https://www.consul.io](https://www.consul.io)

## Feature cache-hazelcast documentation

- [Micronaut Hazelcast Cache documentation](https://micronaut-projects.github.io/micronaut-cache/latest/guide/index.html#hazelcast)

- [https://hazelcast.org/](https://hazelcast.org/)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature lombok documentation

- [Micronaut Project Lombok documentation](https://docs.micronaut.io/latest/guide/index.html#lombok)

- [https://projectlombok.org/features/all](https://projectlombok.org/features/all)

