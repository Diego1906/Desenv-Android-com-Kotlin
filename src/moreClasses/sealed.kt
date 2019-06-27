package moreClasses

sealed class Result {
    class Sucess(val message: String) : Result()
    class Error(val message: String, val erroCode: Int) : Result()
}

class Repo {
    fun execute(): Result {
        return Result.Sucess("Deu certo")
    }
}

fun main(args: Array<String>) {
    val repo = Repo()
    val result: Result = repo.execute()

    when (result) {
        is Result.Sucess -> {
            println("Deu certo!")
        }
        is Result.Error -> {
            println("Deu errado")
        }
    }
}