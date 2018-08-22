package ru.maksim.emocks

import toothpick.Scope

class MockApp : App() {

    override fun initToothpick(appScope: Scope) {
        appScope.installModules(MockApplicationModule(this))
    }

}
