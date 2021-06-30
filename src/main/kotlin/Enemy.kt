enum class EnemyState {
    DEAD, ALIVE
}

open class Enemy(val name: String, var health: Int, var state: EnemyState) {

    open fun damage(damage: Int){

        if (state == EnemyState.DEAD) {
            println("$name is al dood")
        }  else if(damage > health) {
            if (health == 0) {
                state = EnemyState.DEAD
            } else {
                health -= 1
                health -= damage % health
                println("$name heeft $damage damage gekregen zijn health is nu $health.")
            }

        } else {
            health -= damage
            println("$name took $damage damage, and has $health health left.")
        }
    }

    override fun toString(): String {
        return "Name: $name, Health: $health"
    }

}