package ubilapaz.edu.bo.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ubilapaz.edu.bo.demo.dto.Response;
import ubilapaz.edu.bo.demo.dto.UserDto;
import ubilapaz.edu.bo.template.dto.UsuarioDto;
import ubilapaz.edu.bo.template.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<String>("Hola mundo!!", HttpStatus.OK);
    }

    @GetMapping("/testDto")
    public ResponseEntity<Response> testDto(){
        Response response = new Response();
        response.setEstado(true);
        response.setMensaje("exito<");

        UsuarioDto u = new UsuarioDto();
        u.setNombre("pablo");
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<UserDto> dtoGet(@PathVariable Integer id){

        UserDto u = new UserDto();
        u.setNombre("javier");
        u.setUsername("username.javier");

        return new ResponseEntity<UserDto>(u, HttpStatus.OK);
    }


}