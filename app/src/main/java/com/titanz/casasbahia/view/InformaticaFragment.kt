package com.titanz.casasbahia.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.titanz.casasbahia.R
import com.titanz.casasbahia.adapters.ProdutoAdapter
import com.titanz.casasbahia.models.Produto


class InformaticaFragment : Fragment() {

    private var recyclerViewProduto: RecyclerView? = null
    private var produtoAdapter: ProdutoAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_informatica, container, false)

        val listaProdutos = ArrayList<Produto>()

        val produtos1 = Produto()
        produtos1.nome = "Kit PC Gamer Smart SMT81462 i5 8GB"
        produtos1.imagem = "https://i.ibb.co/dQNfDYQ/produto7-mock.png"
        produtos1.valor = "R$ 2524,52"
        listaProdutos.add(produtos1)

        val produtos2 = Produto()
        produtos2.nome = "Computador EasyPC Standard Intel Core i3 4GB"
        produtos2.imagem = "https://i.ibb.co/K7Wq3xw/produto8-mock.png"
        produtos2.valor = "R$ 1169,00"
        listaProdutos.add(produtos2)

        val produtos3 = Produto()
        produtos3.nome = "Notebook Samsung Core i3-7020U 4GB"
        produtos3.imagem = "https://i.ibb.co/XJ1bTBR/produto9-mock.png"
        produtos3.valor = "R$ 1869,00"
        listaProdutos.add(produtos3)

        val produtos4 = Produto()
        produtos4.nome = "Notebook Gamer Aspire Nitro 5 AN515-52-5771"
        produtos4.imagem = "https://i.ibb.co/rsKWhB7/produto10-mock.png"
        produtos4.valor = "R$ 3299,90"
        listaProdutos.add(produtos4)

        val produtos5 = Produto()
        produtos5.nome = "Notebook Positivo Quad Core 4GB 32GB SSD"
        produtos5.imagem = "https://i.ibb.co/BtmYnv7/produto11-mock.png"
        produtos5.valor = "R$ 1099,00"
        listaProdutos.add(produtos5)

        val produtos6 = Produto()
        produtos6.nome = "Multifuncional HP Deskjet Ink Advantage 3776"
        produtos6.imagem = "https://i.ibb.co/H2wc8FF/produto12-mock.png"
        produtos6.valor = "R$ 449,47"
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

        recyclerViewProduto = view.findViewById(R.id.informatica_recyclerView_id)
        val layoutManager = GridLayoutManager(context,2, GridLayoutManager.HORIZONTAL,false)

        produtoAdapter = ProdutoAdapter(listaProdutos)

        recyclerViewProduto!!.adapter = produtoAdapter
        recyclerViewProduto!!.layoutManager = layoutManager

        return view
    }


}
