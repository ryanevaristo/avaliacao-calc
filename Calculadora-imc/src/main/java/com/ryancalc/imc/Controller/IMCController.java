package com.ryancalc.imc.Controller;




import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryancalc.imc.dto.IMCdto;


@RestController
@RequestMapping("/imc")
public class IMCController {
	
	
	@GetMapping
	public ResponseEntity<String> calcularImc(@RequestBody IMCdto imc){
		new IMCdto(imc.getPeso(), imc.getAltura());
		return ResponseEntity.ok(imc.getResultado());
	}
	

}
