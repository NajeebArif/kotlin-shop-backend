package narif.thriftshop.thriftapi.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@Configuration
class UserDetailsConfig {

    @Bean
    fun userDetailsService(): UserDetailsService {
        val inMemoryUserDetailsManager = InMemoryUserDetailsManager()
        val user = User.withUsername("narif").password("password").authorities("read").build()
        inMemoryUserDetailsManager.createUser(user)
        return inMemoryUserDetailsManager
    }

    @Bean
    fun noOpPassword(): PasswordEncoder {
        return NoOpPasswordEncoder.getInstance();
    }
}