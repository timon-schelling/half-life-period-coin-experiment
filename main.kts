import kotlin.random.*

var coins = 1000000000
while(coins > 0) {
    repeat(coins) {
        if(Random.nextBoolean()) coins--
    }
    println(coins)
}
