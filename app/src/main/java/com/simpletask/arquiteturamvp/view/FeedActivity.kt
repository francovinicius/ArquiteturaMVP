package com.simpletask.arquiteturamvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.simpletask.arquiteturamvp.databinding.ActivityFeedBinding
import com.simpletask.arquiteturamvp.model.Usuario
import com.simpletask.arquiteturamvp.presenter.IUsuario
import com.simpletask.arquiteturamvp.presenter.UsuarioPresenter

class FeedActivity : AppCompatActivity(), IUsuario {

    private  val binding by lazy {
        ActivityFeedBinding.inflate(layoutInflater)
    }
    private lateinit var usuarioPresenter: UsuarioPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        usuarioPresenter = UsuarioPresenter(this)

    }

    override fun onStart() {
        super.onStart()
        usuarioPresenter.recuperarUsuarios()
    }

    override fun exibirUsuarios( lista: List<Usuario> ){

        //Exibir os dados

        var txtUsuarios = ""
        lista.forEach{ usuario ->
            txtUsuarios += "${usuario.nome} - ${usuario.idade} \n"
        }

        Log.i("exibir presenter", "$txtUsuarios")

    }

}