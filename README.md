Spring Boot Web application with custom Span logger

```
2018-05-03 20:47:05.570  INFO [myapp,4416a5ac3e0bf887,6a9e334ec87cf35d,true] 6684 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=4416a5ac3e0bf887 span-id=7682634427804742493 parent-id=7404543519122601043 span-name=http:/v1/subjects spanlogevents=[Log{timestamp=1525394825473, event='cs'}, Log{timestamp=1525394825570, event='cr'}]
2018-05-03 20:47:05.572  INFO [myapp,4416a5ac3e0bf887,66c2391985393453,true] 6684 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=4416a5ac3e0bf887 span-id=7404543519122601043 parent-id=7404543519122601043 span-name=say-hello spanlogevents=[]
2018-05-03 20:47:05.572  INFO [myapp,4416a5ac3e0bf887,66c2391985393453,true] 6684 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=4416a5ac3e0bf887 span-id=7404543519122601043 parent-id=4906291003260663943 span-name=say-hello spanlogevents=[]
2018-05-03 20:47:05.572  INFO [myapp,4416a5ac3e0bf887,4416a5ac3e0bf887,true] 6684 --- [nio-8080-exec-1] o.s.cloud.sleuth.log.Slf4jSpanLogger     : Stopped Span = trace-id=4416a5ac3e0bf887 span-id=4906291003260663943 parent-id=4906291003260663943 span-name=http:/hello spanlogevents=[Log{timestamp=1525394825422, event='sr'}]
```