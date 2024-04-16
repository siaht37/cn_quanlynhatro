package quanlynhatro.doanchuyennganh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DoanchuyennganhApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoanchuyennganhApplication.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("user123"));
    }

}
