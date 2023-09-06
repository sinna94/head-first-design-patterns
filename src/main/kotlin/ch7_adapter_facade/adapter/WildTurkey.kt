package ch7_adapter_facade.adapter

class WildTurkey : Turkey {
    override fun gobble() {
        println("골골")
    }

    override fun fly() {
        println("짧은 거리를 날고 있어요")
    }
}
