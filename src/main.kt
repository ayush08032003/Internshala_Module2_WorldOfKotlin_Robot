import kotlin.random.Random

fun main(){
    val jarvis = Robot(name="Jarvis", owner = "Ayush")

    jarvis.ringAlarm("06:00 AM") // ringing alarm
    println()

    jarvis.makeCoffee(Coffee(BlackCoffee = false, noOfSpoons = 3)) // ,making white coffee.. with 3 spoons of sugar
    println()

    jarvis.heatWater("60C") // water heater..
    println()

    jarvis.packBags(Random.nextInt(1,8))
    println()

    jarvis.cookFood()
    println()

    jarvis.ironClothes(shirt = "Black", pant="Blue")
    println()

}