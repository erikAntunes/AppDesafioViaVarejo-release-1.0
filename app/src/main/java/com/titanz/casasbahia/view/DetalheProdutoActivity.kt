package com.titanz.casasbahia.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import cn.pedant.SweetAlert.SweetAlertDialog
import com.squareup.picasso.Picasso
import com.titanz.casasbahia.R
import com.titanz.casasbahia.models.Produto
import de.hdodenhof.circleimageview.CircleImageView

class DetalheProdutoActivity : AppCompatActivity() {

    private var produtoImageView: CircleImageView? = null
    private var nomeProdutoTextView: TextView? = null
    private var detalheProdutoTextView: TextView? = null
    private var valorProdutoTextView: TextView? = null
    private var homeButtonImageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_produto)
        supportActionBar!!.hide()

        val pDialog = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
        pDialog.progressHelper.barColor = R.color.colorPrimary
        pDialog.titleText = "Carregando ..."

        pDialog.setCancelable(true)

        pDialog.show()
        val handler = Handler()
        handler.postDelayed({ pDialog.dismiss() }, 1000)

        produtoImageView = findViewById(R.id.detalhe_produto_circleImageView_id)
        nomeProdutoTextView = findViewById(R.id.nome_detalhe_produto_textView_id)
        detalheProdutoTextView = findViewById(R.id.detalhe_produto_textView_id)
        valorProdutoTextView = findViewById(R.id.valor_produto_detalhe_textView)
        homeButtonImageView = findViewById(R.id.home_button_produto_detalhe_imageView)
        homeButtonImageView!!.setOnClickListener{ irParaHome()}

        val intent = intent

        val bundle = intent.extras

        val produto = bundle!!.getSerializable("TVEVIDEO") as Produto?

        if (produto == null){

            val produto = bundle!!.getSerializable("INFORMATICA") as Produto?

            Picasso.get().load(produto?.imagem).into(produtoImageView)
            nomeProdutoTextView!!.text = produto?.nome
            detalheProdutoTextView!!.text = produto?.descricao
            valorProdutoTextView!!.text = produto?.valor

        } else {

            Picasso.get().load(produto.imagem).into(produtoImageView)
            nomeProdutoTextView!!.text = produto.nome
            detalheProdutoTextView!!.text = produto.descricao
            valorProdutoTextView!!.text = produto.valor
        }

    }

    private fun irParaHome() {

        onBackPressed()
    }
}
