package main

import "fmt"

func main() {
	//1.iota常量自动生成器，每个一行，自动累加1
	//2.iota给常量赋值使用
	const (
		a = iota
		b = iota
		c = iota
	)
	fmt.Print("a=%d,b=%d,c=%d\n", a, b, c)
	//3.iota遇到const,创智位0
	const d = iota
	fmt.Printf("d=%d\n", d)
	//4,可以值写一个iota
	const (
		a1 = iota //0
		b1
		c1
	)
	fmt.Printf("a1=%d,b1=%d,c1=%d\n", a1, b1, c1)
	//5,如果同一行，值都一样
	const (
		i          = iota
		j1, j2, j3 = iota, iota, iota
		k          = iota
	)
	fmt.Printf("i=%d,j1=%d,j2=%d,j3=%d,k%d\n", i, j1, j2, j3, k)

}