package com.senanur.getiruygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecyclerView = findViewById(R.id.categoryRecyclerView)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this)

        val dummyData = generateDummyCategories()
        categoryAdapter = CategoryAdapter(dummyData)
        categoryRecyclerView.adapter = categoryAdapter
    }

    private fun generateDummyCategories(): List<Category> {
        val sampleProducts = listOf(
            Product("Süt", "₺17.50", "https://dummyimage.com/150x100/eeeeee/000000&text=Süt"),
            Product("Ekmek", "₺6.00", "https://dummyimage.com/150x100/eeeeee/000000&text=Ekmek"),
            Product("Yumurta", "₺32.00", "https://dummyimage.com/150x100/eeeeee/000000&text=Yumurta")
        )
        return listOf(
            Category("Su & İçecek", sampleProducts),
            Category("Meyve & Sebze", sampleProducts),
            Category("Atıştırmalık", sampleProducts),
            Category("Temizlik Ürünleri", sampleProducts)
        )
    }
}

