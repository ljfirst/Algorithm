package innerSortRealize

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-14 22:13
 * @author—Email liujunfirst@outlook.com
 * @description 冒泡排序
 * @blogURL
 */
func BubbleSort(srcSortArray []int)    {

    //冒泡排序    参数：int类型数组，对数组进行排序
    
        if srcSortArray == nil || len(srcSortArray) <= 1 {
            return
        }
        //交换变量：temp
        var temp int
        //当某次内部排序无数据交换发送时，flag不变，则此时数组有序，无序再循环对比
        flag := false
        //外部循环：循环元素个数减一次，因为最后一次默认有序
        for i := 0; i < len(srcSortArray) - 1; i++ {
            //内部循环：外部循环i次，可以确定i个元素已经有序，因此剩余n-i个无序元素，
            //内部循环次数为元素个数n减去外部循环次数i,又因为i和i+1对比，因此防止的对比越界，需再减一
            for j := 0 ; j < len(srcSortArray) - i - 1; j++ {
                if srcSortArray[j] > srcSortArray[j + 1] {
                    temp = srcSortArray[j]
                    srcSortArray[j] = srcSortArray[j + 1]
                    srcSortArray[j + 1] = temp
                    flag = true
                }
            }
            if !flag {
                break
            }
            flag = false
        }
}


