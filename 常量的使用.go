package main //必须有一个main 包
import "fmt"

func main(){
	//变量：程序运行期间，可以改变的量，变量声明需要var
	/常量：程序运行期间，不可以改变额量，常量声明需要cons
	
	const a int =10
	//a=20//err,常量不允许修改
	fmt.Println("a=",a)
	
	const b=11.2  //没有使用：=
	fmt.Printf("b type is %T\n",b)
	fmt.Println("b=",b)  
	
}