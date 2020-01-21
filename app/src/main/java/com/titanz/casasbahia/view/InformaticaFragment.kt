package com.titanz.casasbahia.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.titanz.casasbahia.R
import com.titanz.casasbahia.adapters.ProdutoAdapter
import com.titanz.casasbahia.interfaces.ProdutoListener
import com.titanz.casasbahia.models.Produto


class InformaticaFragment : Fragment(), ProdutoListener {

    private var recyclerViewProduto: RecyclerView? = null
    private var produtoAdapter: ProdutoAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_informatica, container, false)

        val listaProdutos = ArrayList<Produto>()

        val produtos1 = Produto()
        produtos1.nome = "Kit PC Gamer Smart SMT81462 i5 8GB"
        produtos1.descricao = "A linha de Smart PCs da Neologic alia produtos de alta qualidade e preços incríveis, e foi feita para usuários que querem o melhor custo-benefício e as melhores partidas. Contando com a qualidade inigualável das placas de vídeo GeForce GTX 1650 e dos processadores Intel, ela vai proporcionar uma experiência fantástica dentro e fora dos games. Uma pedida ideal para quem quer o melhor!"
        produtos1.imagem = "https://i.ibb.co/dQNfDYQ/produto7-mock.png"
        produtos1.valor = "R$ 2524,52"
        listaProdutos.add(produtos1)

        val produtos2 = Produto()
        produtos2.nome = "EasyPC Standard Intel Core i3 4GB"
        produtos2.descricao = "Com os Computadores EasyPC da linha Standard, o alto desempenho na execução de programas para o seu entretenimento e para o seu trabalho ou estudo estão garantidos."
        produtos2.imagem = "https://i.ibb.co/K7Wq3xw/produto8-mock.png"
        produtos2.valor = "R$ 1169,00"
        listaProdutos.add(produtos2)

        val produtos3 = Produto()
        produtos3.nome = "Notebook Samsung Core i3-7020U 4GB"
        produtos3.descricao = "O Samsung Essentials foi desenvolvido para quem busca um notebook de alta qualidade, com design elegante e detalhes que surpreendem. Seja para uso individual ou para compartilhar com a família, para navegar em redes sociais e sites de compra online ou para se aprofundar nos estudos, o Samsung Essentials é o companheiro ideal para pessoas criativas, motivando-as a gerar novas ideias."
        produtos3.imagem = "https://i.ibb.co/XJ1bTBR/produto9-mock.png"
        produtos3.valor = "R$ 1869,00"
        listaProdutos.add(produtos3)

        val produtos4 = Produto()
        produtos4.nome = "Notebook Gamer Aspire Nitro 5 AN515-52-5771"
        produtos4.descricao = "Um trem expresso direto para o centro da ação está chegando. O notebook gamer Acer Aspire Nitro 5 é a nova geração, com uma configuração que não treme para os jogos mais pesados. Embarque agora e preparese para a potência máxima."
        produtos4.imagem = "https://i.ibb.co/rsKWhB7/produto10-mock.png"
        produtos4.valor = "R$ 3299,90"
        listaProdutos.add(produtos4)

        val produtos5 = Produto()
        produtos5.nome = "Notebook Positivo Quad Core 4GB 32GB SSD"
        produtos5.descricao = "Com o notebook Positivo Motion Q432A você conta com um aparelho pensado para otimizar seu tempo, elencar suas prioridades e entregá-las de forma rápida e precisa. Quer ver como?\n" +
                "\n" +
                "Com toda a interface intuitiva e familiar do Windows 10, que o mundo inteiro conhece, você terá uma experiência de uso facilitada e muito mais agradável para divertir-se o dia todo, fazendo uso dos recursos presentes nesse modelo, como, por exemplo, um processador Intel Quad Core Atom Cherry Trail de até 1.84 GHz. Somado à placa de vídeo Intel Graphics e à memória RAM LPDDR3 de 4 GB com baixo consumo de energia, você aumenta a performance, gasta pouca bateria e aproveita seu note como uma central de entretenimento!\n" +
                "\n" +
                "A bateria – já que falamos dela – é integrada e tem 10 mil milampères, aguentando mais de 6 horas de uso contínuo*! E se você vai ter bom desempenho, que tal ter, também, bastante espaço sobrando? É por isso que o Motion Gray Q432A conta com slot para cartão micro SD, que pode ser usado para dar aquele incremento no armazenamento interno do aparelho. E por falar nisso, ele é super rápido, já que seus 32 GB de espaço aparecem na forma de memória Flash SSD, que deixa o desempenho e a velocidade de processamento de dados muito mais eficazes, além de ocuparem bem menos espaço de hardware que um HD comum.\n" +
                "\n" +
                "Com bateria durável, espaço e desempenho que aguentam o tranco e uma tela HD Widescreen LCD, o que poderia faltar? Ah, sim! Deixar o melhor do entretenimento ao seu dispor. Então, a Positivo caprichou e equipou-o com a TECLA NETFLIX. Isso mesmo, um botão inteiramente dedicado ao maior serviço de streaming do mundo! Basta um click, e seus filmes, séries e documentários favoritos estarão disponíveis na sua frente, com conforto e comodidade****.\n" +
                "\n" +
                "Mas vamos combinar uma coisa: ele só vai funcionar se você já for um assinante Netflix, ok?\n" +
                "\n" +
                "Quer mais tecnologia embarcada? Então, aproveite o seu dia com a segurança na ponta dos dedos que o Touchpad de precisão, do tipo Clickpad, proporciona. De 5 polegadas, ele é grande, confortável e tem segurança de acesso fingerprint, que permite o acesso ultra seguro e rápido através do reconhecimento digital. Toda a segurança e agilidade em um só produto!\n" +
                "\n" +
                "Além disso, as maiores tecnologias de conexão estão nesse modelo, como Wi-Fi, HDMI, Bluetooth, USB 3.0.\n" +
                "\n" +
                "Para fechar com chave de ouro, o novo Motion White Edição Limitada é tão leve e fino que pode ser transportado na bolsa ou na mochila, facilmente, já que tem design slim, tela NARROW FRAME, 18 mm de altura e só 1,43 quilos. Tudo isso sem perder desempenho e conforto."
        produtos5.imagem = "https://i.ibb.co/BtmYnv7/produto11-mock.png"
        produtos5.valor = "R$ 1099,00"
        listaProdutos.add(produtos5)

        val produtos6 = Produto()
        produtos6.nome = "HP Deskjet Ink Advantage 3776"
        produtos6.descricao = "Com a Multifuncional HP Deskjet Ink Advantage 3776 você economiza espaço e obtém potência e independência de impressão de que você necessita. Ela conta com o HP Scroll Scan, que facilita o trabalho de digitalização e o aplicativo HP All-in-One Printer Remote, que possibilita digitalizar em trânsito.\n" +
                "A Advantage 3776 garante a impressão a partir de smartphones e tablets, e possui configuração rápida e fácil para dispositivos móveis. Além disso, é uma multifuncional elegante que dá um toque de cor ao ambiente."
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

        produtoAdapter = ProdutoAdapter(listaProdutos,this)

        recyclerViewProduto!!.adapter = produtoAdapter
        recyclerViewProduto!!.layoutManager = layoutManager

        return view
    }

    override fun onProdutoClicado(produto: Produto) {

        val intent = Intent(context, DetalheProdutoActivity::class.java)

        val bundle = Bundle()
        bundle.putSerializable("INFORMATICA", produto)

        intent.putExtras(bundle)

        startActivity(intent)
    }
}
