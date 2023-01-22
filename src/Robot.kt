class Robot (val name: String, val owner: String){
    init{
        println("Hello ${owner}, I'm $name, your friendly Robot, I can do all your in-house duties like \n1.Setting Alarm " +
                "\n2.Make coffee \n3.Heat The Water \n4.Pack your bags \n5.Cook breakfast and Lunch \n6.Iron your clothes\n")
    }

    fun ringAlarm(time:String){
        println("Wake up $owner, its Already $time, it's time to Wake UP..!!")
    }

    fun makeCoffee(c:Coffee){
        if(c.BlackCoffee){
            println("Making your Black Coffee with ${c.noOfSpoons} sugar spoons..")
        }else{
            println("Making your White Milk Coffee with ${c.noOfSpoons} sugar spoons..")
        }
        println("Here's your Coffee, Enjoy your Day Sir..")
    }

    fun heatWater(temp:String) {
        println("Turning on the Heater, Sir..!!")
        println("Your water gets heated sir to $temp")
    }

    fun packBags(day:Int){
        val subjects = arrayListOf("Artificial Intelligence","Data Mining", "Competitive Programming",
        "Android Development","Computer Architecture", "Software Engineering")
        val routine = mutableListOf<String>()
        when(day){
            1->{routine.add(subjects[0])
                routine.add(subjects[2])
            }
            2->{routine.add(subjects[2])
                routine.add(subjects[5])
            }
            3->{routine.add(subjects[3])
                routine.add(subjects[1])
            }
            4->{routine.add(subjects[4])
                routine.add(subjects[5])
            }
            5->{routine.add(subjects[5])
                routine.add(subjects[1])
            }
            6->{routine.add(subjects[4])
                routine.add(subjects[1])
            }
            else->{println("Leave Day..!!")
                return
            }

        }
        println("Your Routine for Today is : $routine")
    }

    fun cookFood(){
        val breakFast = listOf("Fruits","CornFlakes", "Oats","Cereals","Eggs & Banana")
        val lunch = listOf("Rice And Potato", "Rice and Spinach", "Chappati and Corn", "Butter Chicken", "Biryani")
        println("Your BreakFast is ${breakFast.random()} and Lunch is ${lunch.random()}")
    }

    fun ironClothes(shirt:String, pant:String){
        val shirtAvailable = listOf("Red", "Black", "White", "Grey", "Check")
        val pantAvailable = listOf("Jeans", "Black", "Grey", "Blue", "Cyan")

        if(shirtAvailable.contains(shirt) && pantAvailable.contains(pant)){
            println("Your $shirt shirt and $pant pant gets Ironed, Sir..!")
        }else if(shirtAvailable.contains(shirt)){
            println("You don't have the $pant Pant you want, Let's go for shopping..!!")
        }else{
            println("You don't have the $shirt Shirt you want, Let's go for shopping..!!")
        }
    }

}