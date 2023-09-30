package com.simpletask.arquiteturamvp.model.api

import com.simpletask.arquiteturamvp.model.Usuario

class UsuarioAPI {

    fun recuperarUsuarios(): List<Usuario>{

        val listaUsuario = listOf(
            Usuario("Jamilton", 20),
            Usuario("Vinicius", 30),
            Usuario("Pablo", 19),
            Usuario("Wagner", 50)
        )

        return listaUsuario
    }
}