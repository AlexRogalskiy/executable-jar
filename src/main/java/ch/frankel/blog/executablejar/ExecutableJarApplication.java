package ch.frankel.blog.executablejar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExecutableJarApplication {

    @Bean(initMethod = "init")
    public SayHello helloWorld(ApplicationArguments args) {
        return new SayHello(args.getSourceArgs());
    }

    public static void main(String[] args) {
        SpringApplication.run(ExecutableJarApplication.class, args);
    }
}