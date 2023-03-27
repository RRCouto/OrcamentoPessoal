package com.orcamentopessoal.repository

import java.sql.Timestamp

data class entrada(
    val ID: String,
    val Descricao: String,
    val Valor: Double,
    val MesRef: Int,
    val TIMESTAMP: Timestamp
)