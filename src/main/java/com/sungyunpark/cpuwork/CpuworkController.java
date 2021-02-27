package com.sungyunpark.cpuwork;

@org.springframework.web.bind.annotation.RestController
public class CpuworkController
{
    @org.springframework.web.bind.annotation.GetMapping("/ping")
    public reactor.core.publisher.Mono<String> ping()
    {
        return reactor.core.publisher.Mono.just("pong");
    }

    @org.springframework.web.bind.annotation.GetMapping("/work")
    public reactor.core.publisher.Mono<Integer> work(@org.springframework.web.bind.annotation.RequestParam("abc") String abc) {
        int tl = 0;
        byte[] dg;
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < 10000000; i++) {
                tl += abc.length() / 2;
            }
        }
        return reactor.core.publisher.Mono.just(tl);

    }
}
