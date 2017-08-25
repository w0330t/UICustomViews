package net.blueness.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import org.jetbrains.anko.find

/**
 * Created by Blueness on 2017/8/25.
 */

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        val titleBack: Button = find(R.id.title_back)
        val titleEdit: Button = find(R.id.title_edit)
        titleBack.setOnClickListener{
            (getContext() as Activity).finish()
        }
        titleEdit.setOnClickListener{
            Toast.makeText(getContext(), "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }
}
