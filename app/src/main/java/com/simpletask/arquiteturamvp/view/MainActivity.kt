package com.simpletask.arquiteturamvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simpletask.arquiteturamvp.R
import com.simpletask.arquiteturamvp.controller.UsuarioController
import com.simpletask.arquiteturamvp.databinding.ActivityMainBinding
import com.simpletask.arquiteturamvp.model.Usuario

class MainActivity : AppCompatActivity() {
    private  val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var usuarioController: UsuarioController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        usuarioController = UsuarioController(
            this
        )
        binding.btnRecuperar.setOnClickListener {
            usuarioController.recuperarUsuarios()
        }
        // usuarioController.recuperarUsuarios() //Ativa
    }
    //Passiva
    fun listarUsuarios( lista: List<Usuario> ){

        //Exibir os dados

        var txtUsuarios = ""
        lista.forEach{ usuario ->
            txtUsuarios += "${usuario.nome} - ${usuario.idade} \n"
        }

        binding.textResultado.text = txtUsuarios

    }
}