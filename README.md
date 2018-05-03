Spring Boot Web application with custom Span logger

```
2018-05-02 21:28:10.972  INFO [myapp,9081c3557f76346b,fcc636916bafb424,true] 6016 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=9081c3557f76346b span-id=-232438332558167004 parent-id=-2220937699669652681 span-name=http:/v1/subjects
2018-05-02 21:28:10.973  INFO [myapp,9081c3557f76346b,e12da4eddeeacb37,true] 6016 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=9081c3557f76346b span-id=-2220937699669652681 parent-id=-2220937699669652681 span-name=say-hello
2018-05-02 21:28:10.974  INFO [myapp,9081c3557f76346b,e12da4eddeeacb37,true] 6016 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=9081c3557f76346b span-id=-2220937699669652681 parent-id=-8033925488274164629 span-name=say-hello
2018-05-02 21:28:10.974  INFO [myapp,9081c3557f76346b,9081c3557f76346b,true] 6016 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=9081c3557f76346b span-id=-8033925488274164629 parent-id=-8033925488274164629 span-name=http:/hello
```