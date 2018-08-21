package ljs;

import ljs.exception.KnowException;
import ljs.lib.ListUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaServer
public class ClientApplication {
    public static void main(String[] args) throws KnowException {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(args));
        list.add("--spring.profiles.active=client");
        SpringApplication.run(ClientApplication.class, ListUtils.toArray(list, String.class));
    }
}
