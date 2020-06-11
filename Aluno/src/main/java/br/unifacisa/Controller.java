package br.unifacisa;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${config.value}")
	private String value;
	
	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Achei aluno " + value);
	}
}