package ch9

class MenuItem(
    private val name: String,
    private val description: String,
    private val vegetarian: Boolean,
    private val price: Double
):MenuComponent {

    override fun print() {
        println("  $name")
        if (vegetarian) {
            println("(v)")
        }
        println(", $price")
        println("     -- $description")
    }
}