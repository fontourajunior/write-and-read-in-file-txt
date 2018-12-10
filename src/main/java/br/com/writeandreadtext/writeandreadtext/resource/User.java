package br.com.writeandreadtext.writeandreadtext.resource;

import br.com.writeandreadtext.writeandreadtext.dto.UserDTO;
import br.com.writeandreadtext.writeandreadtext.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/users")
public class User {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(OK)
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void save(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
    }

}
