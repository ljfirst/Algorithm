
<center><h1> 算法和数据结构的Java实践  </h1></center>

## 项目介绍
+ 本项目通过收集、分解各大厂的常见笔面试题，追本溯源至数据结构和算法的底层实现原理，知其然知其所以然，欢迎更多志同道合的朋友加入算法开源项目:[AlgorithmPractice](https://gitee.com/ljfirst/AlgorithmPractice)（欢迎提issue和pull request）。
+ 本项目主要包括四个部分，分别是：算法、数据结构、设计模式、以及上述三个部分的单元测试，项目简图如图1-1所示：

![AlgorithmPractice项目结构简图](https://img-blog.csdnimg.cn/20201010114057589.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2xqZmlyc3Q=,size_16,color_FFFFFF,t_70#pic_center)
<center>图 1-1 AlgorithmPractice项目结构简图</center>

### 阅读建议
+ 首先，你可以通过我的 [思维导图](https://www.processon.com/mindmap/5cbb5fcae4b09b16ffc06360),对项目整体架构有个了解,
+ 然后，可以跳转到我的 [博客](https://blog.csdn.net/ljfirst) 查看设计思路和实现细节,
+ 最后，通过跳转至我的 [gitee](https://gitee.com/ljfirst/Algorithm) 查看具体的实现代码.

### 目前的代码量
|             | Total  | Algorithm | DataStructure | DesignPattern | 
| --------  |:-----:   |  :----:         |    :-----:           |    :-----:             |
| Code(代码)   |  239   |    52          |      151          |     36                 | 
| UT(测试用例)       |  170   |    43          |      117          |    10                  | 
| CodeNum(代码行数)|  15338|   3019 |      11324      |    995                |
| TestNum(测试代码行数)|  10126  |   2214 |      7559      |    353                |

代码总数量：409
代码总行数  :   25617

## 特色合集
+ [常见动态规划的解题思路及Java实现](https://blog.csdn.net/ljfirst/article/details/103082359)
+ [11种常见设计模式的简单Demo实现](https://blog.csdn.net/ljfirst/article/details/105470727)
+ [最长递增子序列的六种解法](https://blog.csdn.net/ljfirst/article/details/106596812)
+ [最热笔试题：利用滑动窗口来解决字符串匹配](https://blog.csdn.net/ljfirst/article/details/106972100)
+ [13道字符串笔试题及答案，总有一道你面试会遇上](https://blog.csdn.net/ljfirst/article/details/106975010)
+ 数据结构基础：[堆栈队列](https://blog.csdn.net/ljfirst/article/details/111464502)、[二叉树](https://blog.csdn.net/ljfirst/article/details/109466318)、[链表](https://blog.csdn.net/ljfirst/article/details/109508557)、[内部排序](https://blog.csdn.net/ljfirst/article/details/102762758)

# 具体的项目目录结构

#### $\color{7f1A8A}Algorithm/算法专题$
 ****
+ <font color=#Af2233 size=4 >**综合解法题**</font>
  + **背包问题**
    + [动态规划、分支限界法(回溯法、剪枝法)、贪心算法](https://blog.csdn.net/ljfirst/article/details/109376733) 
    + [背包问题解决公司零食采购（贪心+冒泡+动态）](https://blog.csdn.net/ljfirst/article/details/107498635)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/combineTest/backpackTest/implyTest)
  + **合唱团问题**
    + [动态规划、回溯法](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/comprehensive/choir) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/combineTest/choirTest)
  + **最短路径**
    + [回溯法、贪心算法](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/comprehensive/shortestDeliveryPath) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/combineTest/shortestDeliveryPathTest)
  + **最长递增子序列**
    + [暴力法、动态规划法、分治法、字符串对比法、分支限界法、扑克法](https://blog.csdn.net/ljfirst/article/details/106596812) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/combineTest/lisTest)

+ <font color=#Af2233 size=4 >**动态规划专题**</font>
  + **最大正方形**
    + [暴力法、动态规划、动态规划优化](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/largestSquare) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/largestSquareTest)
  + **最长公共子序列**
    + [动态规划、动态规划优化](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/Algorithm/dynamic/lcs/)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/LCSTest.java)
  + **最大子段和**
    + [动态规划、分治法](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/lss)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/LSSTest.java)
  + **回文串**
    + [添加构造回文串、删除构造回文串、回文串判定、回文串判定优化](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/palindrome)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/PalindromeTest)
  + **其他**
    + [交换零钱、斐不拉楔数列、矩形的最小路径和、三角形的最小路径和、打家劫舍](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest)
    + [编辑距离、数字的最大乘积、字符组成判断](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest)
+ <font color=#Af2233 size=4 >**回溯专题**</font>
  + [最佳调度问题](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/comprehensive/optimalSchedule) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/combineTest/optimalScheduleTest)
  + [字符串全排列](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/backtrack/StringCombination.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/backtrackTest/StringCombinationTest.java)
+ <font color=#Af2233 size=4 >**贪心专题**</font>
  + [无重叠区间](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/greedy/EraseOverlapIntervals.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/greedyTest/EraseOverlapIntervalsTest.java)
  + 迪杰斯特拉算法

#### $\color{7f1A8A}DataStructure /数据结构专题$
 ****
+ <font color=#Af2233 size=4 >**图专题**</font>
  + BellmanFord.java
  + Floyd.java
  + graphApply
  + graphConnection
  + mst
  + shortestPath
+ <font color=#Af2233 size=4 >**字符串和数组专题**</font>
    + **数组专题**
      + [计算bit位、奇数左边偶数右边、大小写互换、左小右大的数](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/arrayApply) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/arrayApplyTest)
      + [双指针问题](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/doublePoint) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/doublePointTest) 
      + [异或问题](https://blog.csdn.net/ljfirst/article/details/108328921) 
      + [查找数值](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/findValue) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/findValueTest)
      + [大整数乘法、根据身高重建队列、顺时针打印螺旋矩阵、前缀和/差分数组、盛水问题、矩阵相乘、找出重复数组中不重复的个数、杨辉三角](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest)
    + **哈希专题**
      + [LFU和LRU](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/hashTable) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/hashTableTest)
    + **链表专题**
      + [单链表的插入、删除、查找、相等](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/DataStructure/stringANDline/list/listRealize/SinglyLinkedList.java)	和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/listTest/SinglyLinkedListTest.java)
      + [链表的反转有多少种方式](https://blog.csdn.net/ljfirst/article/details/109508557)
      + [有环链表和相交链表、环入口判读](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/DataStructure/stringANDline/list/listRealize/RingList.java)	和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/listTest/RingListTest.java)
      + [双向链表的插入、删除、查找、相等](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/DataStructure/stringANDline/list/listRealize/DoubleLinkedList.java)	 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/listTest/DoubleLinkedListTest.java)
      + [Redis底层数据结构：跳表的实现](https://blog.csdn.net/ljfirst/article/details/104504763)	
    + **滑动窗口**
      + [找所有字母异位词、最长无重复子串、最小覆盖子串、最小覆盖字串1、子串检测、字符串预处理法、序列匹配](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/slidingWindow) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/slidingWindowTest)
    + **序列和字符串**
      + [人民币大小写转换、最小循环的字符串、IP地址转化、反转字符串](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/sequenceANDstring/array/arrayApply) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/sequenceANDstringTest)
    + **字符串匹配专题**
      + [五大经典字符串匹配算法的Java代码实现](https://blog.csdn.net/ljfirst/article/details/104448266)
        + BF、BM、RK、KMP、Sunday
+ <font color=#Af2233 size=4 >**排序专题**</font>
    + 外部排序
    + 内部排序
      + [十大经典内部排序算法的设计思路及应用](https://blog.csdn.net/ljfirst/article/details/102762758)
        + 冒泡、堆排、插入、选择、桶排
        + 计数、归并、基数、希尔、快排及其改进
      + [链表的插入排序、指定区间的插入排序](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/DataStructure/sort/innerSort/innerSortRealize/InsertSort.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/blob/master/javaVersion/UnitTest/DatastructureTest/sortTest/innerSortTest/innerSortRealizeTest/InsertSortTest.java)

+ <font color=#Af2233 size=4 >**堆栈队列**</font>
    + [返回最小的第K个值、返回最小的K个值、找出第k大的素数、优先队列](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/heap)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stackHeapQueueTest/heapTest)
    + [链队、数组队、用栈实现队](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/queue)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stackHeapQueueTest/queueTest)
    + [链栈、数组栈、最小栈、最小栈优化、计算器的实现、括号匹配问题、队列实现栈](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/stack)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stackHeapQueueTest/stackTest)

+ <font color=#Af2233 size=4 >**树**</font>
    + **二叉树**
      + [二叉树的序列化和反序列化](https://blog.csdn.net/ljfirst/article/details/109466318)
        + 二叉树按层(S形、先序、中序、后序)遍历 ==输出==
        + 数组按层(先序、中序、后序)遍历==构造==成一个二叉树
        + 数组按前序和中序(后序和中序) ==构造==成一个二叉树
        + 二叉树转链表
      + [最近公共祖先、二叉树中和为某值的节点路径](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/tree/binaryTree/binaryTreeApply)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/treeTest/binaryTreeTest/binaryTreeApplyTest)
      + [镜像二叉树(递归和非递归)、平衡二叉树判断、二叉树子树判读](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/tree/binaryTree/binaryTreeApply)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/treeTest/binaryTreeTest/binaryTreeApplyTest)
    + [b树]()
    + [赫夫曼树](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/tree/huffman)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/treeTest/huffmanTest)
    + [红黑树](https://blog.csdn.net/ljfirst/article/details/108357052)  和 [测试案例]()

#### $\color{7f1A8A}Design Pattern /设计模式专题$
 ****
  + [Singleton 单例模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/single) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest/singleTest)
  + [Proxy 代理模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/proxy) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest/proxyTest)
  + [Strategy 策略模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/strategy) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest/strategyTest)
  + [Observer 观察者模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/observer) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest/observerTest)
  + [Visitor 访问者模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/visitor) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest)
  + [Factory 工厂模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/factory) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest)
  + [Delegate 委派模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest)
  + [Prototype 原型模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest)
  + [Template 模板模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest)
  + [Adapter 适配器模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DesignPatternTest)
  + [Builder 构造器设计模式](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern/builder) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/builderTest)
  
$\color{ff1f1f}至简尚善，有知仍无畏$
---