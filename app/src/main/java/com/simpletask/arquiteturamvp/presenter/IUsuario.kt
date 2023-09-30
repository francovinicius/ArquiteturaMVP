package com.simpletask.arquiteturamvp.presenter

import com.simpletask.arquiteturamvp.model.Usuario

interface IUsuario {

    fun exibirUsuarios(lista: List<Usuario>)
}