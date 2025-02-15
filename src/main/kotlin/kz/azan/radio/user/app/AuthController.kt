package kz.azan.radio.user.app

import jakarta.servlet.http.HttpServletResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("auth")
class AuthController {
    @PostMapping
    fun login(dto: LoginDto, response: HttpServletResponse) {
        if (dto.username == "x" && dto.password == "y") {
            response.status = HttpServletResponse.SC_OK
            return
        }

        response.status = HttpServletResponse.SC_UNAUTHORIZED
    }
}
