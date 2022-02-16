package com.kudbi.game

import android.app.Dialog
import android.app.SharedElementCallback
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class Level1 : AppCompatActivity() {


    lateinit var dialog: Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)



        val timer: TextView = findViewById(R.id.timer)

        val sq_2x2: View = findViewById(R.id.sq_2x2)
        val sq_3x3: View = findViewById(R.id.sq_3x3)
        val sq_4x4: View = findViewById(R.id.sq_4x4)


        val sq_2_1 = findViewById<TextView>(R.id.sq_2_1)
        val sq_2_2 = findViewById<TextView>(R.id.sq_2_2)
        val sq_2_3 = findViewById<TextView>(R.id.sq_2_3)
        val sq_2_4 = findViewById<TextView>(R.id.sq_2_4)
        val sq_3_1 = findViewById<TextView>(R.id.sq_3_1)
        val sq_3_2 = findViewById<TextView>(R.id.sq_3_2)
        val sq_3_3 = findViewById<TextView>(R.id.sq_3_3)
        val sq_3_4 = findViewById<TextView>(R.id.sq_3_4)
        val sq_3_5 = findViewById<TextView>(R.id.sq_3_5)
        val sq_3_6 = findViewById<TextView>(R.id.sq_3_6)
        val sq_3_7 = findViewById<TextView>(R.id.sq_3_7)
        val sq_3_8 = findViewById<TextView>(R.id.sq_3_8)
        val sq_3_9 = findViewById<TextView>(R.id.sq_3_9)
        val sq_4_1 = findViewById<TextView>(R.id.sq_4_1)
        val sq_4_2 = findViewById<TextView>(R.id.sq_4_2)
        val sq_4_3 = findViewById<TextView>(R.id.sq_4_3)
        val sq_4_4 = findViewById<TextView>(R.id.sq_4_4)
        val sq_4_5 = findViewById<TextView>(R.id.sq_4_5)
        val sq_4_6 = findViewById<TextView>(R.id.sq_4_6)
        val sq_4_7 = findViewById<TextView>(R.id.sq_4_7)
        val sq_4_8 = findViewById<TextView>(R.id.sq_4_8)
        val sq_4_9 = findViewById<TextView>(R.id.sq_4_9)
        val sq_4_10 = findViewById<TextView>(R.id.sq_4_10)
        val sq_4_11 = findViewById<TextView>(R.id.sq_4_11)
        val sq_4_12 = findViewById<TextView>(R.id.sq_4_12)
        val sq_4_13 = findViewById<TextView>(R.id.sq_4_13)
        val sq_4_14 = findViewById<TextView>(R.id.sq_4_14)
        val sq_4_15 = findViewById<TextView>(R.id.sq_4_15)
        val sq_4_16 = findViewById<TextView>(R.id.sq_4_16)
        val numberRound: TextView = findViewById(R.id.numberrnd)

        var sqList = mutableListOf<TextView>(sq_2_1, sq_2_2, sq_2_3, sq_2_4)


        var newRecord = 0



        dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCancelable(false)





        if(numberRound.text == "Test Round"){
            var randomSqList = sqList.shuffled()
            val difClr = randomSqList.first()
            for (item in randomSqList){
                item.setBackgroundColor(Color.parseColor("#3e86fa"))
            }
            difClr.setBackgroundColor(Color.parseColor("#3574db"))

            difClr.setOnClickListener{
                numberRound.text = "1 Round"
                randomSqList = sqList.shuffled()
                val difClr_1 = randomSqList.first()
                for (item in randomSqList){
                    item.setBackgroundColor(Color.parseColor("#f2972e"))
                }
                difClr_1.setBackgroundColor(Color.parseColor("#d98525"))

                val incorBtn = randomSqList.slice(1..3)
                for(i in incorBtn){
                    i.setOnClickListener{
                        dialog.setContentView(R.layout.end_game_dialog)



                        val curRes: TextView = dialog.findViewById(R.id.curRes)
                        curRes.text = "0"
                        val curResInt = Integer.parseInt(curRes.text.toString())


                        newRecord = curResInt

                        val record: TextView = dialog.findViewById(R.id.record)
                        val recordSep = record.text.toString().split(" ")
                        var recordInt = Integer.parseInt(recordSep.get(1))

                        if (newRecord > recordInt){
                            recordInt = newRecord
                        }

                        record.text = "Рекорд: $recordInt"

                        val unlock: TextView = dialog.findViewById(R.id.unlock)
                        unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                        unlock.isVisible = true


                        val restart: ImageButton = dialog.findViewById(R.id.restart)
                        restart.setOnClickListener{
                            val intent = Intent(this, Level1::class.java)
                            startActivity(intent)
                            finish()
                        }

                        dialog.show()
                    }

                }

                difClr_1.setOnClickListener{
                    numberRound.text = "2 Round"
                    randomSqList = sqList.shuffled()
                    val difClr_2 = randomSqList.first()
                    for (item in randomSqList){
                        item.setBackgroundColor(Color.parseColor("#ff2441"))
                    }
                    difClr_2.setBackgroundColor(Color.parseColor("#de1d36"))

                    val incorBtn = randomSqList.slice(1..3)
                    for(i in incorBtn){
                        i.setOnClickListener{
                            dialog.setContentView(R.layout.end_game_dialog)



                            val curRes: TextView = dialog.findViewById(R.id.curRes)
                            curRes.text = "1"
                            val curResInt = Integer.parseInt(curRes.text.toString())


                            newRecord = curResInt

                            val record: TextView = dialog.findViewById(R.id.record)
                            val recordSep = record.text.toString().split(" ")
                            var recordInt = Integer.parseInt(recordSep.get(1))


                            if (newRecord > recordInt){
                                recordInt = newRecord
                            }

                            record.text = "Рекорд: $recordInt"

                            val unlock: TextView = dialog.findViewById(R.id.unlock)
                            unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                            unlock.isVisible = true

                            val restart: ImageButton = dialog.findViewById(R.id.restart)
                            restart.setOnClickListener{
                                val intent = Intent(this, Level1::class.java)
                                startActivity(intent)
                                finish()
                            }

                            dialog.show()
                        }
                    }

                    difClr_2.setOnClickListener{
                        sq_2x2.isVisible = false
                        sq_2x2.isClickable = false
                        sq_3x3.isVisible = true
                        sq_3x3.isClickable = true

                        sqList = mutableListOf(sq_3_1,sq_3_2,sq_3_3,sq_3_4,sq_3_5,sq_3_6,sq_3_7,sq_3_8,sq_3_9)
                        numberRound.text = "3 Round"
                        randomSqList = sqList.shuffled()
                        val difClr_3 = randomSqList.first()
                        for (item in randomSqList){
                            item.setBackgroundColor(Color.parseColor("#841ee3"))
                        }
                        difClr_3.setBackgroundColor(Color.parseColor("#7518cc"))

                        val incorBtn = randomSqList.slice(1..8)
                        for(i in incorBtn){
                            i.setOnClickListener{
                                dialog.setContentView(R.layout.end_game_dialog)

                                val restart: ImageButton = dialog.findViewById(R.id.restart)
                                restart.setOnClickListener{
                                    val intent = Intent(this, Level1::class.java)
                                    startActivity(intent)
                                    finish()
                                }

                                val curRes: TextView = dialog.findViewById(R.id.curRes)
                                curRes.text = "2"
                                val curResInt = Integer.parseInt(curRes.text.toString())



                                newRecord = curResInt

                                val record: TextView = dialog.findViewById(R.id.record)
                                val recordSep = record.text.toString().split(" ")
                                var recordInt = Integer.parseInt(recordSep.get(1))

                                if (newRecord > recordInt){
                                    recordInt = newRecord
                                }

                                record.text = "Рекорд: $recordInt"

                                val unlock: TextView = dialog.findViewById(R.id.unlock)
                                unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                unlock.isVisible = true

                                dialog.show()
                            }
                        }

                        difClr_3.setOnClickListener{
                            numberRound.text = "4 Round"
                            randomSqList = sqList.shuffled()
                            val difClr_4 = randomSqList.first()
                            for (item in randomSqList){
                                item.setBackgroundColor(Color.parseColor("#02d63b"))
                            }
                            difClr_4.setBackgroundColor(Color.parseColor("#00c735"))

                            val incorBtn = randomSqList.slice(1..8)
                            for(i in incorBtn){
                                i.setOnClickListener{
                                    dialog.setContentView(R.layout.end_game_dialog)

                                    val restart: ImageButton = dialog.findViewById(R.id.restart)
                                    restart.setOnClickListener{
                                        val intent = Intent(this, Level1::class.java)
                                        startActivity(intent)
                                        finish()
                                    }

                                    val curRes: TextView = dialog.findViewById(R.id.curRes)
                                    curRes.text = "3"
                                    val curResInt = Integer.parseInt(curRes.text.toString())



                                    newRecord = curResInt

                                    val record: TextView = dialog.findViewById(R.id.record)
                                    val recordSep = record.text.toString().split(" ")
                                    var recordInt = Integer.parseInt(recordSep.get(1))

                                    if (newRecord > recordInt){
                                        recordInt = newRecord
                                    }

                                    record.text = "Рекорд: $recordInt"

                                    val unlock: TextView = dialog.findViewById(R.id.unlock)
                                    unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                    unlock.isVisible = true

                                    dialog.show()
                                }
                            }

                            difClr_4.setOnClickListener{
                                numberRound.text = "5 Round"
                                randomSqList = sqList.shuffled()
                                val difClr_5 = randomSqList.first()
                                for (item in randomSqList){
                                    item.setBackgroundColor(Color.parseColor("#e0e000"))
                                }
                                difClr_5.setBackgroundColor(Color.parseColor("#d4d402"))

                                val incorBtn = randomSqList.slice(1..8)
                                for(i in incorBtn){
                                    i.setOnClickListener{
                                        dialog.setContentView(R.layout.end_game_dialog)

                                        val restart: ImageButton = dialog.findViewById(R.id.restart)
                                        restart.setOnClickListener{
                                            val intent = Intent(this, Level1::class.java)
                                            startActivity(intent)
                                            finish()
                                        }

                                        val curRes: TextView = dialog.findViewById(R.id.curRes)
                                        curRes.text = "4"
                                        val curResInt = Integer.parseInt(curRes.text.toString())
                                        newRecord = curResInt

                                        val record: TextView = dialog.findViewById(R.id.record)
                                        val recordSep = record.text.toString().split(" ")
                                        var recordInt = Integer.parseInt(recordSep.get(1))

                                        if (newRecord > recordInt){
                                            recordInt = newRecord
                                        }

                                        record.text = "Рекорд: $recordInt"

                                        val unlock: TextView = dialog.findViewById(R.id.unlock)
                                        unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                        unlock.isVisible = true

                                        dialog.show()
                                    }
                                }

                                difClr_5.setOnClickListener{
                                    sq_2x2.isVisible = false
                                    sq_2x2.isClickable = false
                                    sq_3x3.isVisible = false
                                    sq_3x3.isClickable = false
                                    sq_4x4.isVisible = true
                                    sq_4x4.isClickable = true

                                    sqList = mutableListOf(sq_4_1,sq_4_2,sq_4_3,sq_4_4,sq_4_5,sq_4_6,sq_4_7,sq_4_8,sq_4_9, sq_4_10,sq_4_11,sq_4_12,sq_4_13,sq_4_14,sq_4_15,sq_4_16)
                                    numberRound.text = "6 Round"
                                    randomSqList = sqList.shuffled()
                                    val difClr_6 = randomSqList.first()
                                    for (item in randomSqList){
                                        item.setBackgroundColor(Color.parseColor("#4e00de"))
                                    }
                                    difClr_6.setBackgroundColor(Color.parseColor("#4900d1"))

                                    val incorBtn = randomSqList.slice(1..15)
                                    for(i in incorBtn){
                                        i.setOnClickListener{
                                            dialog.setContentView(R.layout.end_game_dialog)

                                            val restart: ImageButton = dialog.findViewById(R.id.restart)
                                            restart.setOnClickListener{
                                                val intent = Intent(this, Level1::class.java)
                                                startActivity(intent)
                                                finish()
                                            }

                                            val curRes: TextView = dialog.findViewById(R.id.curRes)
                                            curRes.text = "5"
                                            val curResInt = Integer.parseInt(curRes.text.toString())
                                            newRecord = curResInt

                                            val record: TextView = dialog.findViewById(R.id.record)
                                            val recordSep = record.text.toString().split(" ")
                                            var recordInt = Integer.parseInt(recordSep.get(1))

                                            if (newRecord > recordInt){
                                                recordInt = newRecord
                                            }

                                            record.text = "Рекорд: $recordInt"

                                            val unlock: TextView = dialog.findViewById(R.id.unlock)
                                            unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                            unlock.isVisible = true

                                            dialog.show()
                                        }
                                    }

                                    difClr_6.setOnClickListener{
                                        numberRound.text = "7 Round"
                                        randomSqList = sqList.shuffled()
                                        val difClr_7 = randomSqList.first()
                                        for (item in randomSqList){
                                            item.setBackgroundColor(Color.parseColor("#d90077"))
                                        }
                                        difClr_7.setBackgroundColor(Color.parseColor("#d10073"))

                                        val incorBtn = randomSqList.slice(1..15)
                                        for(i in incorBtn){
                                            i.setOnClickListener{
                                                dialog.setContentView(R.layout.end_game_dialog)

                                                val restart: ImageButton = dialog.findViewById(R.id.restart)
                                                restart.setOnClickListener{
                                                    val intent = Intent(this, Level1::class.java)
                                                    startActivity(intent)
                                                    finish()
                                                }

                                                val curRes: TextView = dialog.findViewById(R.id.curRes)
                                                curRes.text = "6"
                                                val curResInt = Integer.parseInt(curRes.text.toString())
                                                newRecord = curResInt

                                                val record: TextView = dialog.findViewById(R.id.record)
                                                val recordSep = record.text.toString().split(" ")
                                                var recordInt = Integer.parseInt(recordSep.get(1))

                                                if (newRecord > recordInt){
                                                    recordInt = newRecord
                                                }

                                                record.text = "Рекорд: $recordInt"

                                                val unlock: TextView = dialog.findViewById(R.id.unlock)
                                                unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                                unlock.isVisible = true

                                                dialog.show()
                                            }
                                        }
                                        difClr_7.setOnClickListener {
                                            numberRound.text = "8 Round"
                                            randomSqList = sqList.shuffled()
                                            val difClr_8 = randomSqList.first()
                                            for (item in randomSqList){
                                                item.setBackgroundColor(Color.parseColor("#00d9a6"))
                                            }
                                            difClr_8.setBackgroundColor(Color.parseColor("#00d4a2"))

                                            val incorBtn = randomSqList.slice(1..15)
                                            for(i in incorBtn){
                                                i.setOnClickListener{
                                                    dialog.setContentView(R.layout.end_game_dialog)

                                                    val restart: ImageButton = dialog.findViewById(R.id.restart)
                                                    restart.setOnClickListener{
                                                        val intent = Intent(this, Level1::class.java)
                                                        startActivity(intent)
                                                        finish()
                                                    }

                                                    val curRes: TextView = dialog.findViewById(R.id.curRes)
                                                    curRes.text = "7"
                                                    val curResInt = Integer.parseInt(curRes.text.toString())
                                                    newRecord = curResInt

                                                    val record: TextView = dialog.findViewById(R.id.record)
                                                    val recordSep = record.text.toString().split(" ")
                                                    var recordInt = Integer.parseInt(recordSep.get(1))

                                                    if (newRecord > recordInt){
                                                        recordInt = newRecord
                                                    }

                                                    record.text = "Рекорд: $recordInt"

                                                    val unlock: TextView = dialog.findViewById(R.id.unlock)
                                                    unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                                    unlock.isVisible = true

                                                    dialog.show()
                                                }
                                            }
                                            difClr_8.setOnClickListener{
                                                numberRound.text = "9 Round"
                                                randomSqList = sqList.shuffled()
                                                val difClr_9 = randomSqList.first()
                                                for (item in randomSqList){
                                                    item.setBackgroundColor(Color.parseColor("#b600d6"))
                                                }
                                                difClr_9.setBackgroundColor(Color.parseColor("#ab00c9"))

                                                val incorBtn = randomSqList.slice(1..15)
                                                for(i in incorBtn){
                                                    i.setOnClickListener{
                                                        dialog.setContentView(R.layout.end_game_dialog)

                                                        val restart: ImageButton = dialog.findViewById(R.id.restart)
                                                        restart.setOnClickListener{
                                                            val intent = Intent(this, Level1::class.java)
                                                            startActivity(intent)
                                                            finish()
                                                        }

                                                        val curRes: TextView = dialog.findViewById(R.id.curRes)
                                                        curRes.text = "8"
                                                        val curResInt = Integer.parseInt(curRes.text.toString())
                                                        newRecord = curResInt

                                                        val record: TextView = dialog.findViewById(R.id.record)
                                                        val recordSep = record.text.toString().split(" ")
                                                        var recordInt = Integer.parseInt(recordSep.get(1))

                                                        if (newRecord > recordInt){
                                                            recordInt = newRecord
                                                        }

                                                        record.text = "Рекорд: $recordInt"

                                                        val unlock: TextView = dialog.findViewById(R.id.unlock)
                                                        unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                                        unlock.isVisible = true

                                                        dialog.show()
                                                    }
                                                }
                                                difClr_9.setOnClickListener{
                                                    numberRound.text = "10 Round"
                                                    randomSqList = sqList.shuffled()
                                                    val difClr_10 = randomSqList.first()
                                                    for (item in randomSqList){
                                                        item.setBackgroundColor(Color.parseColor("#9ac900"))
                                                    }
                                                    difClr_10.setBackgroundColor(Color.parseColor("#94c200"))

                                                    val incorBtn = randomSqList.slice(1..15)
                                                    for(i in incorBtn){
                                                        i.setOnClickListener{
                                                            dialog.setContentView(R.layout.end_game_dialog)

                                                            val restart: ImageButton = dialog.findViewById(R.id.restart)
                                                            restart.setOnClickListener{
                                                                val intent = Intent(this, Level1::class.java)
                                                                startActivity(intent)
                                                                finish()
                                                            }

                                                            val curRes: TextView = dialog.findViewById(R.id.curRes)
                                                            curRes.text = "9"
                                                            val curResInt = Integer.parseInt(curRes.text.toString())
                                                            newRecord = curResInt

                                                            val record: TextView = dialog.findViewById(R.id.record)
                                                            val recordSep = record.text.toString().split(" ")
                                                            var recordInt = Integer.parseInt(recordSep.get(1))

                                                            if (newRecord > recordInt){
                                                                recordInt = newRecord
                                                            }

                                                            record.text = "Рекорд: $recordInt"

                                                            val unlock: TextView = dialog.findViewById(R.id.unlock)
                                                            unlock.text = "Для открытия \"Уровня 2\" необходимо ещё: ${10-recordInt}"
                                                            unlock.isVisible = true

                                                            dialog.show()
                                                        }
                                                    }
                                                    difClr_10.setOnClickListener {
                                                        dialog.setContentView(R.layout.end_game_dialog)

                                                        val restart: ImageButton = dialog.findViewById(R.id.restart)
                                                        restart.setOnClickListener{
                                                            val intent = Intent(this, Level1::class.java)
                                                            startActivity(intent)
                                                            finish()
                                                        }

                                                        val curRes: TextView = dialog.findViewById(R.id.curRes)
                                                        curRes.text = "10"
                                                        val curResInt = Integer.parseInt(curRes.text.toString())
                                                        newRecord = curResInt

                                                        val record: TextView = dialog.findViewById(R.id.record)
                                                        val recordSep = record.text.toString().split(" ")
                                                        var recordInt = Integer.parseInt(recordSep.get(1))

                                                        if (newRecord > recordInt){
                                                            recordInt = newRecord
                                                        }

                                                        record.text = "Рекорд: $recordInt"

                                                        val unlock: TextView = dialog.findViewById(R.id.unlock)
                                                        unlock.isVisible = true

                                                        val next: ImageButton = dialog.findViewById(R.id.next)
                                                        next.isEnabled = true
                                                        next.isVisible = true

                                                        next.setOnClickListener{
                                                            val intent = Intent(this, MainActivity::class.java)
                                                            startActivity(intent)
                                                        }

                                                        dialog.show()
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}