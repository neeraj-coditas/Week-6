package com.example.week6

import dagger.Component

@Component
interface UserRegistrationComponent {

    //In Below Line we were creating a function and getting the desired object object from it
    //fun getUserRegistrationService() : UserRegistrationService


    //A function to which we have passed our consumer which in this case is DependencyInjectionImple
    fun inject(dependencyInjectionImple: DependencyInjectionImple)

}