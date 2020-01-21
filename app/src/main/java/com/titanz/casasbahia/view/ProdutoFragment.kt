package com.titanz.casasbahia.view
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.titanz.casasbahia.R
import com.titanz.casasbahia.adapters.ProdutoAdapter
import com.titanz.casasbahia.models.Produto

class ProdutoFragment : Fragment() {

    private var recyclerViewProduto: RecyclerView? = null
    private var produtoAdapter: ProdutoAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_produto, container, false)

        val listaProdutos = ArrayList<Produto>()

        val produtos1 = Produto()
        produtos1.nome = "Smart TV LED 43 Full HD LG"
        produtos1.imagem = "https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png"
        produtos1.valor = "R$ 1549,00"

        listaProdutos.add(produtos1)
        listaProdutos.add(produtos1)
        listaProdutos.add(produtos1)
        listaProdutos.add(produtos1)
        listaProdutos.add(produtos1)
        listaProdutos.add(produtos1)

        recyclerViewProduto = view.findViewById(R.id.produto_recyclerView_id)
        val layoutManager = LinearLayoutManager(context)

        produtoAdapter = ProdutoAdapter(listaProdutos)

        recyclerViewProduto!!.adapter = produtoAdapter
        recyclerViewProduto!!.layoutManager = layoutManager

        return view
    }
}
