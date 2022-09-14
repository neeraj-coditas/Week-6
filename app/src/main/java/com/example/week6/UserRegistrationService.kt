package com.example.week6

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository : UserRepository,
    private val emailService: EmailService
)
{

    fun registerUser(email:String, password:String){
        userRepository.saveUser(email, password)
        emailService.send(email,"no-reply@neeraj.raut","User Registered")
    }
}