package com.orcamentopessoal.service

class AddEntrada {
    fun adicionaEntrada(Descricao: String, Valor: Double, MesRef: Int ){
        if(Descricao.isNullOrEmpty()){
            throw error("Descrição não pode ser vazia")
        }

        if(Valor == 0.0){
            throw error("Valor deve ser preenchido")
        }

        if(MesRef == 0){
            throw error("Mês deve ser preenchido")
        }

    }
}