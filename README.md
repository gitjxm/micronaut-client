# micronaut-client
timeout problem
```text
There will be one timeout for about ten calls on average
```

If set
```text
micronaut:
  netty:
      event-loops:
        default:
          num-threads: 5
```
It will time out about once every five times

