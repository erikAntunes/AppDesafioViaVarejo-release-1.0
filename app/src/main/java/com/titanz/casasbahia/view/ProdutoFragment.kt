package com.titanz.casasbahia.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.titanz.casasbahia.R
import com.titanz.casasbahia.models.Produto

/**
 * A simple [Fragment] subclass.
 */
class ProdutoFragment : Fragment() {

    private var recyclerViewProduto: RecyclerView? = null
    private var produtoAdapter: ProdutoAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_produto, container, false)

        val produtoArrayList = ArrayList<Produto>()

        val produtos1 = Produto()
        produtos1.nome = "Jack Daniel's"
        produtos1.imagem = "https://i.ibb.co/G07Nmx8/jackdaniels-logo.png"
        produtos1.descricao = "Os whiskeys da família Jack Daniel`s diferenciam-se pelo cuidadoso processo de elaboração. O envelhecimento em Barris de Carvalho novos, aliado ao clima muito especial do Tennessee, lhe confere um sabor suave e marcante. Permanecendo fiel a esta receita, as pessoas podem desfrutar do mesmo whiskey que ganhou sete medalhas de ouro internacionais, quando em 1904 foi homenageado como sendo \"o melhor whiskey do mundo"
        produtos1.id = "1 L"
        produtos1.valor = "R$ 105,00"
        produtoArrayList.add(produtos1)

        val produtos2 = Produto()
        produtos2.nome = "Red Label"
        produtos2.imagem = "https://i.ibb.co/bHP2B0t/redlabel-logo.png"
        produtos2.descricao = "É um “Blend Scotch Whisky” rico e incorporado. Tem uma seleção inigualável de mais de 35 maltes na sua composição que garantem a sua superioridade. Com aroma doce amadeirado, cravo-da-índia, doce de manteiga e sabor rico com mel. A marca Johnnie Walker existe desde 1920 e hoje é o whisky escocês mais vendido no mundo."
        produtos2.id = "1 L"
        produtos2.valor = "R$ 70,00"
        produtoArrayList.add(produtos2)

        val produtos3 = Produto()
        produtos3.nome = "Ballantine's"
        produtos3.imagem = "https://i.ibb.co/z49BV23/ballantines-logo.png"
        produtos3.descricao = "Com sabor único e marcante, é elaborado a partir de uma especial seleção de mais de 50 diferentes tipos de maltes. A presença marcante dos maltes Miltonduff e Glenburgie, das regiões escocesas de Speyside e Highlands, respectivamente, proporcionam ao uísque notas de chocolate, maçã e baunilha ao sabor."
        produtos3.id = "1 L"
        produtos3.valor = "R$ 65,00"
        produtoArrayList.add(produtos3)

        return view
    }
}
