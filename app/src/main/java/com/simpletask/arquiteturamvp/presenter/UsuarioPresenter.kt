package com.simpletask.arquiteturamvp.presenter

import com.simpletask.arquiteturamvp.model.api.UsuarioAPI
import com.simpletask.arquiteturamvp.view.MainActivity

class UsuarioPresenter (
//    private val mainActivity: MainActivity
        private val activity: IUsuario
) {

    //Injeção de dependencias
    private val usuarioAPI = UsuarioAPI()

    fun recuperarUsuarios() {
        val lista = usuarioAPI.recuperarUsuarios()

        //exibir os dados na interface
        activity.exibirUsuarios(lista)
    }


}