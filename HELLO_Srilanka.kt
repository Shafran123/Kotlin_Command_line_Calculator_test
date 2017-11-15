import java.io.BufferedReader
import java.util.*

fun main(args: Array<String>) {
	

  println("Enter Num 01")
		
		var sc = Scanner(System.`in`)
	
	
		var num1 = sc.nextInt()
	
  println("Enter Num 02")
		
  		var sc1 = Scanner(System.`in`)
	
  		var num2 = sc1	.nextInt()

  println("<<<<Select Operation >>>>")
  println("1. + ")
  println("2. - ")
  println("3. * ")
  println("4. / ")
  println("<<<<<<<<>>>><>>>>>>>>>>>>")
  
  		var sc2 = Scanner(System.`in`)
  		var op = sc2.nextInt()
	
  		if(op==1){
  			print("Answer is ")
			print(num1+num2)	
		}
	
		else if(op==2){
			print("Answer is ")
			print(num1-num2)
		}
	
		else if(op==3){
			print("Answer is ")
			print(num1*num2)
		}
	
		else if(op==4){
			print("Answer is ")
			print(num1/num2)
		}
	
		else{
			println("Wrong Operation")
		}

}
