package main

import (
	"fmt"
	"goVersion/goVersion/DataStructure/sort/innerSort/innerSortRealize"
	"net/http"
)

func sayHello(w http.ResponseWriter, r *http.Request) {

	fmt.Println(r.URL)
	fmt.Fprintf(w, "Hello World")

}

type Say struct {
	arr1 []int
	name string
}

func modi(s Say) {
	s.arr1[0] = 5
	s.name = "SSS"
}
func modi1(s *Say) {
	s.arr1[0] = 15
	s.name = "SSS!!!"
}

func main() {
	say := Say{arr1: []int{1, 2, 3, 4, 5}, name: "Tfx"}
	modi(say)
	fmt.Println(say)
	modi1(&say)
	//say.modiNI("T", 15)
	fmt.Println(say)
	fmt.Println("ffff")
	arr := []int{1, 4, 54, 2, 90, 45, 20, 243, 34, 62, 46, 19, 29, 43, 234, 434, 854, 236, 243}
	//innerSortRealize.BubbleSort(arr)
	//fmt.Println(arr)
	h1 := []HashMapNode{{1, nil, 0}, {2, nil, 1}}
	h11 := h1[0]
	h11.size++
	h1[0].size++
	fmt.Println(h1)
	fmt.Println(innerSortRealize.BucketSort(arr, 10))

}

type HashMapNode struct {
	value int
	next  *HashMapNode
	size  int
}
