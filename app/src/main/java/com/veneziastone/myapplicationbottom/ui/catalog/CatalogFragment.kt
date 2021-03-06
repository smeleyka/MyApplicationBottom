package com.veneziastone.myapplicationbottom.ui.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.veneziastone.myapplicationbottom.R
import kotlinx.android.synthetic.main.fragment_catalog.*

class CatalogFragment : Fragment() {

    private lateinit var catalogViewModel: CatalogViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        catalogViewModel =
                ViewModelProviders.of(this).get(CatalogViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
//        val textView: TextView = root.findViewById(R.id.text_catalog)
        catalogViewModel.text.observe(viewLifecycleOwner, Observer {
            text_catalog.text = it
        })
        return root
    }
}
