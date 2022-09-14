package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class DependencyInjectionImple : AppCompatActivity() {

    //One way to use Inject by using it on Fields
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependency_injection_imple)

/*     // No Need to Write this Code after implementing Dagger

        val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository,emailService)
*/
        // Safe to Remove the below line when using Inject Function
        //val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistrationService.registerUser("neerajraut@coditas.com","1111")

    }
}