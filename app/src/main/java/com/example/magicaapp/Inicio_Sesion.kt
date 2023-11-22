package com.example.magicaapp

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.os.bundleOf
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

abstract class Inicio_Sesion : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)

        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "integracion completa")
        analytics.logEvent("InitScreen", bundle)

        //setup()

    }
/* private fun setup() {
        title = "Autenticacion"

       R.id.SingupButton.setOnClickListener {
            if (R.id.EmailditText.text.isNotEmpty() && Password.text.isNotEmpty()) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    EmailditText.text.toString(),
                    Password.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {

                    } else {

                    }
                }
            }
        }
    }*/

}