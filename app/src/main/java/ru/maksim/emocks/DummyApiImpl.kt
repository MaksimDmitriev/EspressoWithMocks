package ru.maksim.emocks

import javax.inject.Inject

class DummyApiImpl @Inject constructor() : DummyApi {

    override fun getSomething() = "Real response"
}