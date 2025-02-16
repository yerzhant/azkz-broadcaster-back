package kz.azan.radio.user.app

import jakarta.servlet.http.HttpServletResponse
import jakarta.servlet.http.HttpServletResponse.SC_OK
import jakarta.servlet.http.HttpServletResponse.SC_UNAUTHORIZED
import kz.azan.radio.AppConfig
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("auth")
class AuthController(
    private val config: AppConfig,
) {
    @PostMapping("rtmp")
    fun rtmp(dto: LoginDto, response: HttpServletResponse) {
        if (dto.username == config.username && dto.password == config.password) {
            response.status = SC_OK
            return
        }

        response.status = SC_UNAUTHORIZED
    }

    @PostMapping("login")
    fun login(@RequestBody dto: LoginDto, response: HttpServletResponse) {
        if (dto.username == config.username && dto.password == config.password) {
            response.status = SC_OK
            return
        }

        response.status = SC_UNAUTHORIZED
    }
}
