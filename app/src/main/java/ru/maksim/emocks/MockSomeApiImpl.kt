package ru.maksim.emocks

class MockSomeApiImpl : SomeApi {

    override fun getSomething() = "mock response"
}