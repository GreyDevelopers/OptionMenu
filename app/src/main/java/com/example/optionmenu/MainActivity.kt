package com.example.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.profile -> Toast.makeText(this,"Profile",Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
            R.id.logout -> Toast.makeText(this,"Get out!!",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}