package com.example.uikotlin.materialdesign

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uikotlin.R
import com.google.android.material.bottomsheet.BottomSheetBehavior


class MaterialActivity : AppCompatActivity() {
    lateinit var bottomSheet: ConstraintLayout
    lateinit var btnBottomSheet: Button
    lateinit var btnButtonSheetDialog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)

    }
}
