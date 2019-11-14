package com.jeonguk.service

import com.jeonguk.domain.Message
import javax.inject.Singleton

@Singleton
class ApiService {

    fun getMessage(): Message {
        return Message("id", "Hello World!")
    }

}