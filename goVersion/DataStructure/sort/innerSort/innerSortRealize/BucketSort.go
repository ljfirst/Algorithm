package innerSortRealize

import (
	"fmt"
)

type HashMapNode struct {
	value int
	next  *HashMapNode
	size  int
}

func BucketSort(arr []int, bucketSize int) []int {
	const INT_MAX = int(^uint(0) >> 1)
	const INT_MIN = ^INT_MAX
	fmt.Println(INT_MAX, INT_MIN)

	var hashMapNodes = make([]HashMapNode, bucketSize)
	for i := 0; i < bucketSize; i++ {
		hashMapNodes[i] = HashMapNode{INT_MIN, nil, 0}
	}
	min, max := arr[0], arr[0]
	for _, x := range arr {
		if x > max {
			max = x
		}
		if x < min {
			min = x
		}
	}
	fmt.Printf("max: %d min: %d/n", max, min)

	bucketGap := (max-min)/bucketSize + 1

	for _, x := range arr {

		bucket := (x - min) / bucketGap
		if hashMapNodes[bucket].size == 0 {
			hashMapNodes[bucket].value = x
			hashMapNodes[bucket].size++
			continue
		}

		currentNode := hashMapNodes[bucket]
		var curPNode *HashMapNode = &currentNode
		var nextPNode *HashMapNode = curPNode.next
		if curPNode.value > x {
			newCurNode := HashMapNode{x, curPNode, curPNode.size + 1}
			hashMapNodes[bucket] = newCurNode
			continue
		}
		for nextPNode != nil {
			if nextPNode.value <= x {
				curPNode = nextPNode
				nextPNode = nextPNode.next
			} else {
				break
			}
		}
		next := HashMapNode{x, nextPNode, 1}
		curPNode.next = &next
		currentNode.size++
		hashMapNodes[bucket] = currentNode
	}

	//fmt.Println(hashMapNodes)

	// 从hashmapNodes遍历桶，输出
	var count int = 0
	result := make([]int, len(arr))
	for _, x := range hashMapNodes {
		if x.size == 0 {
			continue
		}
		result[count] = x.value
		count++
		for x.next != nil {
			x = *x.next
			result[count] = x.value
			count++
		}
	}
	return result
}
