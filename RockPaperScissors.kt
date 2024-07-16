package `Android 14 Course kotlin fundamentals`

fun main(){
    var computerchoice = ""
    var playerchoice = ""
    println("Rock , Paper , Scissor ?  Enter your Choice!")
    playerchoice = readln()

    val randomNumber = ( 1..3).random()
    when (randomNumber) {
        1 -> {
            computerchoice = "Rock"
        }
        2 -> {
            computerchoice = "Paper"
        }
        3 -> computerchoice = "Scissor"
    }
    println(computerchoice)

    val winner = when {
        playerchoice == computerchoice -> "Tie"
        playerchoice == "Rock" && computerchoice == "Scissor" -> "Player"
        playerchoice == "Paper" && computerchoice ==  "Rock" -> "Player"
        playerchoice == "Scissor" && computerchoice ==  "Paper" -> "Player"
        else -> "Computer"
    }
    if (winner == "Tie") {
        println("It's a tie")
    }
    else if (winner == "Player")
        println("Player won!")
    else
        println("Computer won")
}