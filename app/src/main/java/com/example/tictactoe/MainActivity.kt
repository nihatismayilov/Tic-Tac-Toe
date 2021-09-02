package com.example.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var player:String
    var Selected = "X"
    private lateinit var strText:String
    private var win = ""
    private var count = "game"
    var Selectable = true
    var click = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            if (button1.text == "1") {
                turn()
                button1.text = player
                winner()
            } else {}
        }
        button2.setOnClickListener {
            if (button2.text == "2") {
                turn()
                button2.text = player
                winner()
            } else {}
        }
        button3.setOnClickListener {
            if (button3.text == "3") {
                turn()
                button3.text = player
                winner()
            } else {}
        }
        button4.setOnClickListener {
            if (button4.text == "4") {
                turn()
                button4.text = player
                winner()
            } else {}
        }
        button5.setOnClickListener {
            if (button5.text == "5") {
                turn()
                button5.text = player
                winner()
            } else {}
        }
        button6.setOnClickListener {
            if (button6.text == "6") {
                turn()
                button6.text = player
                winner()
            } else {}
        }
        button7.setOnClickListener {
            if (button7.text == "7") {
                turn()
                button7.text = player
                winner()
            } else {}
        }
        button8.setOnClickListener {
            if (button8.text == "8") {
                turn()
                button8.text = player
                winner()
            } else {}
        }
        button9.setOnClickListener {
            if (button9.text == "9") {
                turn()
                button9.text = player
                winner()
            } else {}
        }
        buttonAgain.setOnClickListener {
            finish()
            startActivity(getIntent())
        }
    }
    var ActivePlayer = 1
    private fun turn() {
        if (Selectable) {
            if (ActivePlayer == 1) {
                player = "X"
                Selected = player
                ActivePlayer -= 1
            } else {
                win = "Player 2"
                player = "O"
                Selected = player
                ActivePlayer += 1
            }
        } else {
            player = Selected
        }
    }
    private fun winner() {
        if (count == "game") {
            if (button1.text == "X" && button2.text == "X" && button3.text == "X") {
                win = "1"
            } else if (button4.text == "X" && button5.text == "X" && button6.text == "X") {
                win = "1"
            } else if (button7.text == "X" && button8.text == "X" && button9.text == "X") {
                win = "1"
            } else if (button1.text == "X" && button4.text == "X" && button7.text == "X") {
                win = "1"
            } else if (button2.text == "X" && button5.text == "X" && button8.text == "X") {
                win = "1"
            } else if (button3.text == "X" && button6.text == "X" && button9.text == "X") {
                win = "1"
            } else if (button1.text == "X" && button5.text == "X" && button9.text == "X") {
                win = "1"
            } else if (button3.text == "X" && button5.text == "X" && button7.text == "X") {
                win = "1"
            }

            if (button1.text == "O" && button2.text == "O" && button3.text == "O") {
                win = "2"
            } else if (button4.text == "O" && button5.text == "O" && button6.text == "O") {
                win = "2"
            } else if (button7.text == "O" && button8.text == "O" && button9.text == "O") {
                win = "2"
            } else if (button1.text == "O" && button4.text == "O" && button7.text == "O") {
                win = "2"
            } else if (button2.text == "O" && button5.text == "O" && button8.text == "O") {
                win = "2"
            } else if (button3.text == "O" && button6.text == "O" && button9.text == "O") {
                win = "2"
            } else if (button1.text == "O" && button5.text == "O" && button9.text == "O") {
                win = "2"
            } else if (button3.text == "O" && button5.text == "O" && button7.text == "O") {
                win = "2"
            }
            if (button1.text != "1" && button2.text != "2" && button3.text != "3" && button4.text != "4" && button5.text != "5"
                    && button6.text != "6" && button7.text != "7" && button8.text != "8" && button9.text != "9" && win != "1" && win != "2") {
                win = "3"
            }
        } else {}
        if (win == "1") {
            strText = "Congratulations Player 1, you won"
            tvWinner.text = strText
            count = ""
        } else if (win == "2") {
            strText = "Congratulations Player 2, you won"
            tvWinner.text = strText
            count = ""
        } else if (win == "3") {
            strText = "It's draw. Press button to start Again"
            tvWinner.text = strText
        }
    }
}