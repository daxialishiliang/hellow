package main

import "fmt"

func main() {
	var ch byte //声明字符类型
	ch = 97
	//fmt.Println("ch=",ch)
	//格式化输出，%c以字符方式打印，%d以整形方式打印
	fmt.Printf("%c,%d\n", ch, ch)
	//大写转小写，小写转大写，小写大
	fmt.Printf("大写:%d,小写：%d\n", 'A', 'a')
	fmt.Printf("大写转小写：%c\n", 'A'+32)
	fmt.Printf("xiao写转da写：%c\n", 'A'-32)
	//'\'以反斜杠开头的字符是转移字符，‘\n’代表换行
	fmt.Printf("hello go%c", '\n')
	fmt.Printf("hello fuck")

}