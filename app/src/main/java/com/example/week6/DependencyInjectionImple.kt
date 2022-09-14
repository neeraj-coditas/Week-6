package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DependencyInjectionImple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependency_injection_imple)

/*     // No Need to Write this Code after implementing Dagger

        val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository,emailService)
*/
        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()

        userRegistrationService.registerUser("neerajraut@coditas.com","1111")

    }
}