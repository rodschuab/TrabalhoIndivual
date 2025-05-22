package org.serratec.backend.funcionarios_api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(ErroResposta.class) 
	protected ResponseEntity<Object> handlerErroResposta(ErroResposta ex){
		return ResponseEntity.unprocessableEntity().body(ex.getMessage());
	}

}
