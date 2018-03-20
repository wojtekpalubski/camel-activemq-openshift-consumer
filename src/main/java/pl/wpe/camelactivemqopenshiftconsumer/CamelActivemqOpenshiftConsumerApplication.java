package pl.wpe.camelactivemqopenshiftconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:spring/camel-context.xml"})
@SpringBootApplication
public class CamelActivemqOpenshiftConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelActivemqOpenshiftConsumerApplication.class, args);
	}
}
