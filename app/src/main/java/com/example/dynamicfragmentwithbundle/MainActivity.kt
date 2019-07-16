package com.example.dynamicfragmentwithbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var bundle: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bundle = Bundle()

        btnFruits.setOnClickListener {
            setFragmentValues("FRUITS")
        }

        btnVegetables.setOnClickListener {
            setFragmentValues("VEGETABLES")
        }

        btnClear.setOnClickListener {
            supportFragmentManager.findFragmentById(R.id.flFragmentContainer)?.let { it1 ->
                supportFragmentManager
                    .beginTransaction()
                    .remove(it1)
                    .commit()
            };
        }

    }

    fun setFragmentValues(type: String) {
        bundle.putString("TYPE", type)
        val OF = OnlyFragment()
        OF.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flFragmentContainer, OF)
            .commit()
    }

}
