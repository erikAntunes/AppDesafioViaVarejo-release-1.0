package com.titanz.casasbahia.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.titanz.casasbahia.R
import com.titanz.casasbahia.interfaces.ProdutoListener
import com.titanz.casasbahia.models.Produto
import de.hdodenhof.circleimageview.CircleImageView



class ProdutoAdapter(private val listaProdutos: List<Produto>, private val produtoListener: ProdutoListener) : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ProdutoAdapter.ProdutoViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.celula_produto, viewGroup, false)

        return ProdutoViewHolder(view)
    }


    override fun onBindViewHolder(ProdutoViewHolder: ProdutoViewHolder, i: Int) {
        val produtos = listaProdutos[i]

        ProdutoViewHolder.setupServicos(produtos)

        ProdutoViewHolder.itemView.setOnClickListener{produtoListener.onProdutoClicado(listaProdutos[i]) }

    }

    override fun getItemCount(): Int {
        return listaProdutos.size
    }

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imagemCircleView: CircleImageView

        private val nomeTextView: TextView

        private val valorTextView: TextView


        init {

            imagemCircleView = itemView.findViewById(R.id.produto_circleImageView_id)
            nomeTextView = itemView.findViewById(R.id.produto_nome_TextView_id)
            valorTextView = itemView.findViewById(R.id.produto_valor_TextView_id)
        }

        fun setupServicos(produtos: Produto) {

            Picasso.get().load(produtos.imagem).into(imagemCircleView)
            nomeTextView.text = produtos.nome
            valorTextView.text = produtos.valor
        }

    }

}