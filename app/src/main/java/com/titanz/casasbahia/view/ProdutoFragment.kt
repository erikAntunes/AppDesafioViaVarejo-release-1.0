package com.titanz.casasbahia.view
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
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
        produtos1.imagem = "https://i.ibb.co/phDMS6P/produto1-mock.png"
        produtos1.valor = "R$ 1549,00"
        listaProdutos.add(produtos1)

        val produtos2 = Produto()
        produtos2.nome = "Smart TV LED 50 UHD 4K Samsung"
        produtos2.imagem = "https://i.ibb.co/0BqdCpK/produto2-mock.png"
        produtos2.valor = "R$ 2299,00"
        listaProdutos.add(produtos2)

        val produtos3 = Produto()
        produtos3.nome = "Smart TV LED 32 HD LG"
        produtos3.imagem = "https://i.ibb.co/QfR0WLc/produto3-mock.png"
        produtos3.valor = "R$ 999,00"
        listaProdutos.add(produtos3)

        val produtos4 = Produto()
        produtos4.nome = "Smart TV LED 32 HD LG"
        produtos4.imagem = "https://i.ibb.co/mRw2d0R/produto4-mock.png"
        produtos4.valor = "R$ 879,00"
        listaProdutos.add(produtos4)

        val produtos5 = Produto()
        produtos5.nome = "Smart Android LED 32 HD Philco"
        produtos5.imagem = "https://i.ibb.co/2FtbQFx/produto5-mock.png"
        produtos5.valor = "R$ 979,00"
        listaProdutos.add(produtos5)

        val produtos6 = Produto()
        produtos6.nome = "TV Conversor Transforma em SMART TV HD 4K"
        produtos6.imagem = "https://i.ibb.co/Ntnv7DV/produto6-mock.png"
        produtos6.valor = "R$ 109,90"
        listaProdutos.add(produtos6)

        listaProdutos.add(produtos1)
        listaProdutos.add(produtos2)
        listaProdutos.add(produtos3)
        listaProdutos.add(produtos4)
        listaProdutos.add(produtos5)
        listaProdutos.add(produtos6)
        listaProdutos.add(produtos1)
        listaProdutos.add(produtos2)
        listaProdutos.add(produtos3)
        listaProdutos.add(produtos4)
        listaProdutos.add(produtos5)
        listaProdutos.add(produtos6)

        recyclerViewProduto = view.findViewById(R.id.produto_recyclerView_id)
        val layoutManager = GridLayoutManager(context,2,GridLayoutManager.HORIZONTAL,false)

        produtoAdapter = ProdutoAdapter(listaProdutos)

        recyclerViewProduto!!.adapter = produtoAdapter
        recyclerViewProduto!!.layoutManager = layoutManager

        return view
    }
}
