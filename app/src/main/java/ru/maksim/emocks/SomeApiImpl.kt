package ru.maksim.emocks

import javax.inject.Inject

class SomeApiImpl @Inject constructor() : SomeApi {

    override fun getSomething() = "Real response"
}