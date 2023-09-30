package com.simpletask.arquiteturamvp

import com.simpletask.arquiteturamvp.model.Usuario
import com.simpletask.arquiteturamvp.presenter.IUsuario
import com.simpletask.arquiteturamvp.presenter.UsuarioPresenter

class UsuarioControllerTest {

    inner class SimularActivity: IUsuario {
        override fun exibirUsuarios(lista: List<Usuario>) {
            println(lista)
        }
    }

    fun testarRecuperarUsuarios() {
        //facilitar os testes

        val simularActivity = SimularActivity()
        val usuarioPresenter = UsuarioPresenter( simularActivity )
        usuarioPresenter.recuperarUsuarios()

    }
}