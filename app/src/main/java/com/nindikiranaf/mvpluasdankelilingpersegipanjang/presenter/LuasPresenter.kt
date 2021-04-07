package com.nindikiranaf.mvpluasdankelilingpersegipanjang.presenter

import com.nindikiranaf.mvpluasdankelilingpersegipanjang.LuasView

class LuasPresenter (
    private val luasView: LuasView
){
    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){
        val hasil = panjang * lebar

        luasView.hasilLuasPersegiPanjang(hasil)
    }
}