package com.titanz.casasbahia.interfaces

import com.titanz.casasbahia.models.Promocao

interface PromocaoListener {

    fun onPromocaoClicada(promocao: Promocao)

}