package com.nindikiranaf.mvpluasdankelilingpersegipanjang.presenter

import com.nindikiranaf.mvpluasdankelilingpersegipanjang.KelilingView

class KelilingPresenter (
        private val kelilingView: KelilingView
){
    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        val hasil = 2*(panjang+lebar)

        kelilingView.hasilKelilingPersegiPanjang(hasil)
    }
}