package timing.ukulele.boot.trace;

import com.linecorp.armeria.spring.ArmeriaAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication(exclude = ArmeriaAutoConfiguration.class)
@EnableZipkinServer
public class TraceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TraceApplication.class,args);
//        new SpringApplicationBuilder(TraceApplication.class)
//                .properties("spring.config.name=zipkin-server")
//                .run(args);
    }
}

