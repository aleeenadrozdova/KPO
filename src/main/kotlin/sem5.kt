open class Pet(val name: String) {
    override fun toString(): String {
        return ""
    }
}

class Cat(name: String): Pet(name) {
    override fun toString(): String {
        return "MEOW"
    }
}


class Dog(name: String): Pet(name) {
    override fun toString(): String {
        return "BARK"
    }
}

class PetContainer<T: Pet> {
    companion object {
        private val petList = mutableListOf<Pet>()
    }

    fun putIntoContainer(pet: T) {
        petList.add(pet)
    }

    fun hearVoice(): T {
        val randomPet = petList.random()
        println("A pet's voice came through the container: $randomPet. Can you guess who this is?")
        return randomPet as T
    }
}
fun main() {
    val container = PetContainer<Pet>()
    container.putIntoContainer(Cat("Krosha"))
    container.putIntoContainer(Dog("Lexus"))
    container.putIntoContainer(Cat("Wice"))
    container.putIntoContainer(Dog("Berta"))
    container.putIntoContainer(Cat("Yasha"))

    val randomPet = container.hearVoice();
    println("Enter 0 if a dog and 1 if a cat: ")
    val guess = readlnOrNull()?.toIntOrNull()

    if (((guess == 0) and (randomPet is Dog)) or ((guess == 1) and (randomPet is Cat))) {
        println("You won! Congratulations!")
    } else {
        println("You've lost :(")
    }
}