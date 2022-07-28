package com.rupinder.intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewPage : AppCompatActivity() {
    lateinit var getstg: TextView
    lateinit var getnum:TextView
    lateinit var getchr:TextView
    lateinit var getlng:TextView
    lateinit var getdb:TextView
    lateinit var getfloats:TextView
    lateinit var getbool:TextView
    var string:String = ""
    var number:Int=0
    var char:Char= 'a'
    var long:Long= 0
    var double:Double= 0.0
    var floats:Float= 0.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)
        getstg=findViewById(R.id.getstring)
        getnum=findViewById(R.id.getnumber)
        getchr=findViewById(R.id.getchar)
        getlng=findViewById(R.id.getlong)
        getdb=findViewById(R.id.getdouble)
        getfloats=findViewById(R.id.getfloats)

        intent?.let {
            string = it.getStringExtra("string").toString()
            number = it.getIntExtra("number",0)
            char = it.getCharExtra("char",'a')
            long = it.getLongExtra("lng",0)
            double= it.getDoubleExtra("db",0.0)
            floats = it.getFloatExtra("floats",0.0F)

        }
        getstg.setText(string)
        getnum.setText(number.toString())
        getchr.setText(""+char)
        getlng.setText(""+long.toString())
        getdb.setText(""+double.toString())
        getfloats.setText(""+floats.toString())


    }
}

class Newpage {

}
