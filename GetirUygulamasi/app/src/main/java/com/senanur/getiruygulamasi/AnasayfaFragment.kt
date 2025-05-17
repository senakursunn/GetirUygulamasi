package com.senanur.getiruygulamasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.senanur.getiruygulamasi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private val categoryList = listOf("Su & İçecek", "Meyve & Sebze", "Atıştırmalık", "Temizlik")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val categoryList = arrayListOf(
            Category("Su & İçecek", R.drawable.ic_water),
            Category("Meyve & Sebze", R.drawable.ic_fruit),
            Category("Atıştırmalık", R.drawable.ic_snacks),
            Category("Temizlik", R.drawable.ic_cleaning),
            Category("Fırından", R.drawable.ic_bakery),
            Category("Süt & Kahvaltı", R.drawable.ic_breakfast)
        )

        categoryAdapter = CategoryAdapter(requireContext(), categoryList)
        binding.categoryRecyclerView.adapter = categoryAdapter
        binding.categoryRecyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }
}