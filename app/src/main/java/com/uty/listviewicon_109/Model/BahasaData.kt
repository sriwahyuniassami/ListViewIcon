package com.uty.listviewicon_109.Model

import com.uty.listviewicon_109.R

object BahasaData {
    private val bahasa = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "JavaScript",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oerlented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting and object-oriented programming.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language.i.e there is no need for compilation."
    )

    private val logo = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php
    )

    val listBahasa: ArrayList<Bahasa>
        get() {
            val list = arrayListOf<Bahasa>()
            for(position in bahasa.indices){
                val bhs = Bahasa()
                bhs.bahasa = bahasa[position]
                bhs.detail = detail[position]
                bhs.logo = logo[position]
                list.add(bhs)
            }
            return list
        }
}