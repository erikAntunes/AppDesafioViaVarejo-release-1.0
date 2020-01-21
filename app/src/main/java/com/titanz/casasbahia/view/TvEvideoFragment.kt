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


class TvEvideoFragment : Fragment(), ProdutoListener {

    private var recyclerViewProduto: RecyclerView? = null
    private var produtoAdapter: ProdutoAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_tvevideo, container, false)

        val listaProdutos = ArrayList<Produto>()

        val produtos1 = Produto()
        produtos1.nome = "Smart TV LED 43 Full HD LG"
        produtos1.descricao = "TVs são todas iguais? Na era das Smart TVs, se diferenciar é o ponto-chave para oferecer um produto que agregue maior valor. Mais do que o simples conceito de ligar o aparelho para assistir o seu programa favorito, é preciso viver o momento, compartilhá-lo e expandir a gama de interações que o usuário pode realizar com ele.\n" +
                "\n" +
                "Pensando nesse sentido, a LG desenvolveu sua própria tecnologia de Inteligência Artificial: A ThinQ. Usando conceitos básicos de internet das coisas, aliado ao extremamente necessário aprendizado da máquina (machine learning), a tecnologia AI ThinQ pretende integrar sua Smart TV LG não só aos outros produtos da marca, mas também aos demais produtos Smart que você tenha em casa. Assim, os aparelhos entendem os processos, executam, aprendem e repetem, tornando a utilização deles mais intuitiva.\n" +
                "\n" +
                "Na Smart TV LG 43LM6300PSB isso se traduz em comandos de voz precisos que ouvem, pensam e respondem em português. Com eles, você pesquisa por programas, aplicativos, catálogo de filmes, informações sobre atores, ou executa funções como aumento de volume, mudança de modo de imagem e muito mais! Tudo isso otimizado pela plataforma webOS 4.5, que entrega uma experiência mais imersiva e facilitada. E como a LG é parte da Open Connectivity Foundation, você não terá problemas em utilizar sua Smart - e as funcionalidades dela - com produtos Smart de outras marcas, pois a fundação visa integrar os mais diferentes produtos, numa comunidade aberta de comunicação.\n" +
                "\n" +
                "Alguns outros features do modelo, no que diz respeito a imagem e áudio, incluem:\n" +
                "\n" +
                "• um processador Quad-Core, que trabalha para melhorar a reprodução de cores, nitidez e contraste do que é assistido;\n" +
                "• um sistema de HDR Ativo, que entrega qualidade de brilho e contraste superiores, com riqueza de detalhes;\n" +
                "\n" +
                "• a tecnologia Virtual Surround Plus, que confere mais imersão sonora;\n" +
                "\n" +
                "• e um avançado sistema de Clear Voice III, destacando o ruído de fundo e dando mais claridade sonora.\n" +
                "\n" +
                "E se você curte conectar outros devices ao mesmo tempo na sua TV, vai gostar de saber que a Smart TV LG tem Bluetooth In & Out. Com o Bluetooth In você conecta seu Smartphone, teclado, mouse ou o controle Smart Magic (vendido separadamente). Com o Bluetooth Out você pode parear um Speaker, um fone de ouvido Bluetooth ou mesmo um Soundbar, para ter uma experiência incrível!\n" +
                "\n" +
                "Clique e confira o manual disponível do produto e tire todas as dúvidas"
        produtos1.imagem = "https://i.ibb.co/phDMS6P/produto1-mock.png"
        produtos1.valor = "R$ 1549,00"
        listaProdutos.add(produtos1)

        val produtos2 = Produto()
        produtos2.nome = "Smart TV LED 50 UHD 4K Samsung"
        produtos2.descricao = "A Smart TV Samsung 50RU7100 possui a mais alta tecnologia de brilho e contraste. Com o HDR Premium você vê os detalhes que antes estavam escondidos na escuridão ou no excesso de luminosidade da cena. Sua resolução 4K proporciona imagens perfeitas mesmo em ambientes pequenos onde você tem pouca distância entre seu ângulo de visão e a TV.\n" +
                "\n" +
                "O conteúdo da plataforma Smart possui diversos aplicativos onde você encontra vídeos, música e agora também iTunes (Através do Apple Airplay 2). Conta com Controle Remoto Único para você acessar diversos aparelhos conectados à TV, esse recurso ainda renomeia os dispositivos facilitando a navegação.\n" +
                "\n" +
                "Além disso, seu design elegante vai levar beleza e elegância a sua sala, destacando-se não só pela qualidade de imagem, mas também pelo Visual Livre de Cabos e Bluetooth deixando sua instalação muito mais fácil e organizada.\n" +
                "Clique e confira o manual disponível do produto e tire todas as dúvidas"
        produtos2.imagem = "https://i.ibb.co/0BqdCpK/produto2-mock.png"
        produtos2.valor = "R$ 2299,00"
        listaProdutos.add(produtos2)

        val produtos3 = Produto()
        produtos3.nome = "Smart TV LED 32 HD LG"
        produtos3.descricao = "TVs são todas iguais? Na era das Smart TVs, se diferenciar é o ponto-chave para oferecer um produto que agregue maior valor. Mais do que o simples conceito de ligar o aparelho para assistir o seu programa favorito, é preciso viver o momento, compartilhá-lo e expandir a gama de interações que o usuário pode realizar com ele.\n" +
                "\n" +
                "Pensando nesse sentido, a LG desenvolveu sua própria tecnologia de Inteligência Artificial: A ThinQ. Usando conceitos básicos de internet das coisas, aliado ao extremamente necessário aprendizado da máquina (machine learning), a tecnologia AI ThinQ pretende integrar sua Smart TV LG não só aos outros produtos da marca, mas também aos demais produtos Smart que você tenha em casa. Assim, os aparelhos entendem os processos, executam, aprendem e repetem, tornando a utilização deles mais intuitiva.\n" +
                "\n" +
                "Na Smart TV LG 32LM625BPSB isso se traduz em comandos de voz precisos que ouvem, pensam e respondem em português. Com eles, você pesquisa por programas, aplicativos, catálogo de filmes, informações sobre atores, ou executa funções como aumento de volume, mudança de modo de imagem e muito mais! Tudo isso otimizado pela plataforma webOS 4.5, que entrega uma experiência mais imersiva e facilitada. E como a LG é parte da Open Connectivity Foundation, você não terá problemas em utilizar sua Smart - e as funcionalidades dela - com produtos Smart de outras marcas, pois a fundação visa integrar os mais diferentes produtos, numa comunidade aberta de comunicação.\n" +
                "\n" +
                "Alguns outros features do modelo, no que diz respeito a imagem e áudio, incluem:\n" +
                "\n" +
                "• um processador Quad-Core, que trabalha para melhorar a reprodução de cores, nitidez e contraste do que é assistido;\n" +
                "• um sistema de HDR Ativo, que entrega qualidade de brilho e contraste superiores, com riqueza de detalhes;\n" +
                "\n" +
                "• a tecnologia Virtual Surround Plus, que confere mais imersão sonora;\n" +
                "\n" +
                "• e um avançado sistema de Clear Voice III, destacando o ruído de fundo e dando mais claridade sonora.\n" +
                "\n" +
                "E se você curte conectar outros devices ao mesmo tempo na sua TV, vai gostar de saber que a Smart TV LG tem Bluetooth In & Out. Com o Bluetooth In você conecta seu Smartphone, teclado, mouse ou o controle Smart Magic* (vendido separadamente). Com o Bluetooth Out você pode parear um Speaker, um fone de ouvido Bluetooth ou mesmo um Soundbar, para ter uma experiência incrível!\n" +
                "\n" +
                "Clique e confira o manual disponível do produto e tire todas as dúvidas\n"
        produtos3.imagem = "https://i.ibb.co/QfR0WLc/produto3-mock.png"
        produtos3.valor = "R$ 999,00"
        listaProdutos.add(produtos3)

        val produtos4 = Produto()
        produtos4.nome = "Smart TV LED 32 HD LG"
        produtos4.descricao = "Tenha a Smart TV mais rápida e intuitiva na sua sala!\n" +
                "\n" +
                "A LG 32LK615BPSB conta com processador Quadcore e plataforma Smart WebOS 4.0 que proporciona melhor desempenho ao acessar os conteúdos do menu. Abra diversos aplicativos e desfrute da rapidez e melhor experiência de navegação em diversas funções novas. Você pode associar seus aplicativos favoritos com o Quick Access e acessar com apenas um toque de botão no controle remoto.\n" +
                "\n" +
                "Se preferir com o Magic Mobile Connection pode conectar seus Smartphone e aproveitar seus conteúdos favoritos direto na tela da TV. Você também pode ouvir suas músicas com o Music Player e curtir seus artistas preferidos. E para melhor o Virtual Surround Plus entrega mais imersão sonora e envolvimento melhorando a experiência de áudio."
        produtos4.imagem = "https://i.ibb.co/mRw2d0R/produto4-mock.png"
        produtos4.valor = "R$ 879,00"
        listaProdutos.add(produtos4)

        val produtos5 = Produto()
        produtos5.nome = "Smart Android LED 32 HD Philco"
        produtos5.descricao = "Tenha a Smart TV mais rápida e intuitiva na sua sala!\n" +
                "\n" +
                "A LG 32LK615BPSB conta com processador Quadcore e plataforma Smart WebOS 4.0 que proporciona melhor desempenho ao acessar os conteúdos do menu. Abra diversos aplicativos e desfrute da rapidez e melhor experiência de navegação em diversas funções novas. Você pode associar seus aplicativos favoritos com o Quick Access e acessar com apenas um toque de botão no controle remoto.\n" +
                "\n" +
                "Se preferir com o Magic Mobile Connection pode conectar seus Smartphone e aproveitar seus conteúdos favoritos direto na tela da TV. Você também pode ouvir suas músicas com o Music Player e curtir seus artistas preferidos. E para melhor o Virtual Surround Plus entrega mais imersão sonora e envolvimento melhorando a experiência de áudio."
        produtos5.imagem = "https://i.ibb.co/2FtbQFx/produto5-mock.png"
        produtos5.valor = "R$ 979,00"
        listaProdutos.add(produtos5)

        val produtos6 = Produto()
        produtos6.nome = "TV Conversor SMART TV HD 4K"
        produtos6.descricao = "Transforme sua TV comum numa smart TV e assista Netflix."
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

        recyclerViewProduto = view.findViewById(R.id.tvevideo_recyclerView_id)
        val layoutManager = GridLayoutManager(context,2,GridLayoutManager.HORIZONTAL,false)

        produtoAdapter = ProdutoAdapter(listaProdutos,this)

        recyclerViewProduto!!.adapter = produtoAdapter
        recyclerViewProduto!!.layoutManager = layoutManager

        return view
    }

    override fun onProdutoClicado(produto: Produto) {

        val intent = Intent(context, DetalheProdutoActivity::class.java)

        val bundle = Bundle()
        bundle.putSerializable("TVEVIDEO", produto)

        intent.putExtras(bundle)

        startActivity(intent)
    }
}
