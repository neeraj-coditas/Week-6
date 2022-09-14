package com.example.week6

import android.util.Log
import javax.inject.Inject


//Second Way of using Inject by using it on constructor
class UserRepository @Inject constructor() {
   fun saveUser(email: String, password: String) {
        Log.d("MyMsg", "User saved in DB")
    }
}