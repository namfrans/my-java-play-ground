/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    println("Welcome to Mobile Application Development (MAP711S)!");

    //Program II
    fun converter(Celsius: Int, Fahrenheit: Double = 2.8) {
        println("Fahrenheit: "+ Celsius * Fahrenheit);
    };
    //Calling the coverter func
    converter(32);

    //Program III
    var i = 0;
    while( i <= 20){
        println("*".repeat(i));
        i++;
    };

    //Program IV
    val disciples = listOf("Peter", "Andrew", "James", "John", "Philip", "Bartholomew", "Thomas", "Mathew", "Judas");
    for (disciple in disciples) {
        var count = 0;
        if(disciple == "Judas"){
            count++;
            println(count);
        };
    };
    //Program V
    class wheel(){
        var spins: Int = 0;
        fun recharge(airtime: Int){
            when(airtime){
                5 -> spins = 1;
                10 -> spins = 2;
                20 -> spins = 3;
                50 -> spins = 5;
            }
        };
        fun spin(): Int{
            return (1..5).random()
            spins -= 1;
            if (spin() == 1){
                println("Congradurations you're eligible to participate in the live draw!!")
            }else{
                println("Oops try spin again :-()");
            };
        }
    }
    val wheel1 = wheel();
    wheel1.recharge(20);
    println("===PRESS SHIFT TO SPIN===");
    open val shiftKey: Boolean;
    while(wheel1.spin() !== 0){
        if(shiftKey){
            wheel1.spin()
        }
    }
}


