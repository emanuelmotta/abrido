import java.Util.Scanner
fun idade (ano:Int):Int {
    return 2022-ano
}
fun main(){
    val leitura=Scanner(System.`in`)
    print("Digite o ano de nascimento\t")
    var ano=leitura.nextInt()
    println(idade(ano))
}