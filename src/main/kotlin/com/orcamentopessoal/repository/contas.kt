package com.orcamentopessoal.repository

import java.sql.Timestamp

data class contas(
    val ID: String,
    val Descricao: String,
    val valor: Double,
    val FormPag: Int,
    val Numparc: Int,
    val MesRef: Int,
    val TipoConta: Int,
    val TIMESTAMP: Timestamp,
    val NomeCartao: String
)
