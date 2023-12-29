package earth.tiangong.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("earth.tiangong.backend.mapper")
public class TianGongApplication {

	public static void main(String[] args) {
		SpringApplication.run(TianGongApplication.class, args);
	}

}
