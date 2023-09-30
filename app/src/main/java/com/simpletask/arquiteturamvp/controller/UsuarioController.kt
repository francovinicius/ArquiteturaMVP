package com.simpletask.arquiteturamvp.controller

import com.simpletask.arquiteturamvp.model.api.UsuarioAPI
import com.simpletask.arquiteturamvp.view.MainActivity

class UsuarioController (
    private val mainActivity: MainActivity
) {
    private val usuarioAPI = UsuarioAPI()

    init {
        //recuperarUsuarios()
    }

    //regra de negocio
    fun recuperarUsuarios() {
        val lista = usuarioAPI.recuperarUsuarios()

        //exibir os dados na interface
        mainActivity.exibirUsuarios(lista)
    }
}