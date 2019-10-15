package timing.ukulele.boot.trace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class TraceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TraceApplication.class)
                .properties("spring.config.name=zipkin-server")
                .run(args);
    }
}

