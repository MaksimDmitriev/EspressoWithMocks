package ru.maksim.emocks

import android.os.Bundle
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpAppCompatActivity(), MainActivityView {

    override fun someMethod() {
        Toast.makeText(this, "Some method called", Toast.LENGTH_SHORT).show()
    }

    @InjectPresenter
    lateinit var presenter: MyPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        someButton.setOnClickListener {
            presenter.onSomethingHappened()
        }
    }
}
