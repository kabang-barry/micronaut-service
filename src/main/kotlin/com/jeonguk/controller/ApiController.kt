package com.jeonguk.controller

import com.jeonguk.domain.Message
import com.jeonguk.service.ApiService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Inject

@Controller("/api")
class ApiController(
        @Inject private val apiService: ApiService
) {

    private val LOGGER: Logger = LoggerFactory.getLogger(ApiController::class.java)

    @Get("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getHello(id: Long): Message {
        LOGGER.info("Api call")
        return apiService.getMessage()
    }

}