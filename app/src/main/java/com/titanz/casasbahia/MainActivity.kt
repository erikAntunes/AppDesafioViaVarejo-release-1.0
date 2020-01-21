package com.titanz.casasbahia
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.viewpager.widget.ViewPager
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.android.material.tabs.TabLayout
import com.titanz.casasbahia.adapters.ViewPagerAdapter
import com.titanz.casasbahia.view.ProdutoFragment
import com.titanz.casasbahia.view.PromocaoFragment

class MainActivity : AppCompatActivity() {

    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        tabLayout = findViewById(R.id.tablayout_main_id)
        viewPager = findViewById(R.id.viewpager_main_id)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.AddFragment(ProdutoFragment(), "Produtos")
        adapter.AddFragment(PromocaoFragment(), "Promoções")

        viewPager!!.adapter = adapter
        tabLayout!!.setupWithViewPager(viewPager)

        val pDialog = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
        pDialog.progressHelper.barColor = R.color.colorPrimary
        pDialog.titleText = "Carregando ..."

        pDialog.setCancelable(true)

        pDialog.show()
        val handler = Handler()
        handler.postDelayed({ pDialog.dismiss() }, 3000)

    }
}
