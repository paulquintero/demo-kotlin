package com.demo.kotlin.demokotlin.utilities

class Constants {

    companion object {
        private const val URL_API_BASE = "/api"
        private const val URL_VERSION = "/v1"
        private const val URL_BASE = URL_API_BASE + URL_VERSION
        const val URL_BASE_PERSON =  "$URL_BASE/personas"
    }
}