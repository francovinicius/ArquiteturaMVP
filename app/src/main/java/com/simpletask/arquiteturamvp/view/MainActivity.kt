package com.simpletask.arquiteturamvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simpletask.arquiteturamvp.controller.UsuarioController
import com.simpletask.arquiteturamvp.databinding.ActivityMainBinding
import com.simpletask.arquiteturamvp.model.Usuario
import com.simpletask.arquiteturamvp.presenter.IUsuario
import com.simpletask.arquiteturamvp.presenter.UsuarioPresenter

//import IUsuario
class MainActivity : AppCompatActivity(), IUsuario {
    private  val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var usuarioController: UsuarioController
    private lateinit var usuarioPresenter: UsuarioPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        usuarioController = UsuarioController(
//            this
//        )
//        binding.btnRecuperar.setOnClickListener {
//            usuarioController.recuperarUsuarios()
//        }
//        // usuarioController.recuperarUsuarios() //Ativa

        usuarioPresenter = UsuarioPresenter(this)
        binding.btnRecuperar.setOnClickListener {
           usuarioPresenter.recuperarUsuarios()
       }
    }
    //Passiva
        override fun exibirUsuarios( lista: List<Usuario> ){

        //Exibir os dados

        var txtUsuarios = ""
        lista.forEach{ usuario ->
            txtUsuarios += "${usuario.nome} - ${usuario.idade} \n"
        }

        binding.textResultado.text = txtUsuarios

    }
}
