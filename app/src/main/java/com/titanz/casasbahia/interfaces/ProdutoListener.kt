package com.titanz.casasbahia.interfaces

import com.titanz.casasbahia.models.Produto

interface ProdutoListener {

    fun onProdutoCliclado(produto: Produto)
}