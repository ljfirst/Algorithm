
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
|             | Total  | Algorithm | DataStructure | DesignPattern |  Logic  |
| --------  |:-----:   |  :----:   |   :-----:     |    :-----:    | :-----: |
| Code   |  239   |    50     |      126       |     36        |   27    |
| UT       |  149   |    40     |      95       |    8        |   6     |

## 特色合集
+ [常见动态规划的解题思路及Java实现](https://blog.csdn.net/ljfirst/article/details/103082359)
+ [11种常见设计模式的简单Demo实现](https://blog.csdn.net/ljfirst/article/details/105470727)
+ [最长递增子序列的六种解法](https://blog.csdn.net/ljfirst/article/details/106596812)
+ [最热笔试题：利用滑动窗口来解决字符串匹配](https://blog.csdn.net/ljfirst/article/details/106972100)
+ [13道字符串笔试题及答案，总有一道你面试会遇上](https://blog.csdn.net/ljfirst/article/details/106975010)

# 具体的项目目录结构

#### $\color{7f1A8A}Algorithm 算法专题$
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
    + [动态规划、动态规划优化](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/dynamicPrimary/lcs)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/LCSTest.java)
  + **最大子段和**
    + [动态规划、分治法](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/dynamicPrimary/lss)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/LSSTest.java)
  + **回文串**
    + [添加构造回文串、删除构造回文串、回文串判定、回文串判定优化](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/dynamicPrimary/palindrome)  和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest/PalindromeTest)
  + **其他**
    + [交换零钱、斐不拉楔数列、编辑距离、矩形的最小路径和、三角形的最小路径和、数字的最大乘积、字符组成判断、打家劫舍](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/dynamicTest)
+ <font color=#Af2233 size=4 >**回溯专题**</font>
  + [最佳调度问题](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/backtrack/OptimalSchedule) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/backtrackTest/OptimalScheduleTest)
  + [字符串全排列](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/backtrack/StringCombination) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/backtrackTest/StringCombinationTest)
+ <font color=#Af2233 size=4 >**贪心专题**</font>
  + [无重叠区间](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/greedy/EraseOverlapIntervals) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/AlgorithmTest/greedyTest/EraseOverlapIntervalsTest.java)
  + 迪杰斯特拉算法

#### $\color{7f1A8A}DataStructure 数据结构专题$
 ****
+ <font color=#Af2233 size=4 >**图专题**</font>
  + BellmanFord.java
  + Floyd.java
  + graphApply
  + graphConnection
  + mst
  + shortestPath
+ <font color=#Af2233 size=4 >**字符串和数组专题**</font>
    + array
      + [双指针问题](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/doublePoint) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/doublePointTest) 、 [异或问题](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/exclusiveor) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/exclusiveorTest) 、 [查找数值](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/findValue) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/findValueTest)
      + [大整数乘法](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/BigIntegersMulti.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/BigIntegersMultiTest.java) 、 [根据身高重建队列](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/BuildTeambyTall.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/BuildTeambyTallTest.java) 、 [顺时针打印螺旋矩阵](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/ClockwiseSpiralMatrix.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/ClockwiseSpiralMatrixTest.java)
      + [前缀和/差分数组](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/DiffArray.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/DiffArrayTest.java) 、 [盛水问题](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/HoldWater1.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/HoldWater1Test.java) 、 [矩阵相乘](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/Matrix_Multiply.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/Matrix_MultiplyTest.java)
      + [找出重复数组中不重复的个数](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest) 、 [杨辉三角](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/array/YHtriangle.java) 和 [测试案例](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/UnitTest/DatastructureTest/stringANDlineTest/arrayTest/YHtriangleTest.java)
    + hashTable
    + list
    + [序列和字符串题目集锦](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/sequenceANDstring)
    + [五大经典字符串匹配算法的Java代码实现](https://blog.csdn.net/ljfirst/article/details/104448266)
      + BF、BM、RK、KMP、Sunday
+ <font color=#Af2233 size=4 >**排序专题**</font>
    + 外部排序
    + 内部排序
      + [十大经典内部排序算法的设计思路及应用](https://blog.csdn.net/ljfirst/article/details/102762758)
        + 冒泡、堆排、插入、选择、桶排、
        + 计数、归并、基数、希尔、快排及其改进

+ <font color=#Af2233 size=4 >**堆栈队列**</font>
    + [返回最小的第K个值、返回最小的K个值、优先队列](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/heap)  和 [测试案例]()
    + [链队、数组队、用栈实现队](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/queue)  和 [测试案例]()
    + [链栈、数组栈、最小栈、最小栈优化、计算器的实现、括号匹配问题、队列实现栈](https://gitee.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/heap)  和 [测试案例]()
+ <font color=#Af2233 size=4 >**树**</font>
    + [二叉树]()
      + [二叉树相等、二叉树各种遍历方式构造数组、数组通过各种遍历方式构造二叉树]()  和 [测试案例]()
      + [二叉树镜像、平衡二叉树判断、二叉树子树判读、最近公共祖先、二叉树中和为某值的节点路径]()  和 [测试案例]()
    + [b树]()
    + [赫夫曼树]()  和 [测试案例]()
    + [红黑树]()  和 [测试案例]()

#### $\color{7f1A8A}Design Pattern 设计模式专题$
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