package seanx63.TypeFastBackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import seanx63.TypeFastBackend.domain.User;
import seanx63.TypeFastBackend.repository.UserRepository;

@SpringBootApplication
public class TypeFastBackendApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public TypeFastBackendApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TypeFastBackendApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		this.userRepository.save(new User("user", "pass"));
	}
}
