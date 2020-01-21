package com.titanz.casasbahia.interfaces

import com.titanz.casasbahia.models.Produto

interface ProdutoListener {

    fun onProdutoClicado(produto: Produto)
}