package com.example.week6

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService

}