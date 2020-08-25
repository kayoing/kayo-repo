package ddd.leave.interfaces.facade;

import ddd.leave.application.service.LoginApplicationService;
import ddd.leave.infrastructure.common.api.Response;
import ddd.leave.interfaces.assembler.PersonAssembler;
import ddd.leave.interfaces.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
public class AuthApi {

    @Autowired
    LoginApplicationService loginApplicationService;

    @PostMapping("/login")
    public Response login(PersonDTO personDTO) throws ParseException {
        return loginApplicationService.login(PersonAssembler.toDO(personDTO));
    }
}
