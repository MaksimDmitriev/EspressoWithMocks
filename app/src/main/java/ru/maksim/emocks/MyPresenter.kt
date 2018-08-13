package ru.maksim.emocks

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MyPresenter : MvpPresenter<MainActivityView>() {

   fun onSomethingHappened() {
       viewState.someMethod()
   }

}