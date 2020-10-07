 <h1> 算法和数据结构的Java实践  </h1>

## 项目介绍
+ 本项目通过分解各大厂的常见笔面试题，追本溯源至数据结构和算法的底层实现原理，知其然知其所以然；
+ 建立知识结构体系，方便查找，欢迎更多志同道合的朋友加入项目[AlgorithmPractice，](https://github.com/ljfirst/AlgorithmPractice)（欢迎提issue和pull request）。

## 项目结构简图
![Image text](https://github.com/ljfirst/AlgorithmPractice/blob/master/resource/ProjectArchitecture.png)

### 阅读建议：
+ 首先，你可以通过我的 [思维导图](https://www.processon.com/mindmap/5cbb5fcae4b09b16ffc06360),对项目整体架构有个了解,
+ 然后，可以跳转到我的 [博客](https://blog.csdn.net/ljfirst) 查看实现细节,
+ 最后，通过跳转至我的 [GitHub](https://github.com/ljfirst/Algorithm) 查看具体的实现代码.
+ 学习入口
  + java语言的代码入口在[javaVersion](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion)
  + go语言的代码入口在[goVersion](https://github.com/ljfirst/AlgorithmPractice/tree/master/goVersion)

### 目前的代码量
|          | Total | Algorithm | DataStructure | DesignPattern |  Logic  |
| -------- |:-----:|  :----:   |   :-----:     |    :-----:    | :-----: |
| Code     |  227  |    47     |      119       |     35        |   26    |
| UT       |  136   |    36     |      87       |     7         |   6     |

## 特色合集
+ [九大排序算法，一次性给你讲清楚](https://blog.csdn.net/ljfirst/article/details/102762758)
+ [常见动态规划集锦，一次性给你整明白](https://blog.csdn.net/ljfirst/article/details/103082359)
+ [五大字符串匹配算法，一次性给你忽悠瘸了](https://blog.csdn.net/ljfirst/article/details/104448266)
+ [十大常见设计模式，一次性让你面试通过](https://blog.csdn.net/ljfirst/article/details/105470727)
+ [BAT最热笔试题：最长递增子序列的六种解法](https://blog.csdn.net/ljfirst/article/details/106596812)
+ [头条最热笔试题：利用滑动窗口来解决字符串匹配](https://blog.csdn.net/ljfirst/article/details/106972100)
+ [头条笔试中字符串相关的题答案总结，总有一道你面试会遇上](https://blog.csdn.net/ljfirst/article/details/106975010)

## 项目结构图
![Image text](https://github.com/ljfirst/AlgorithmPractice/blob/master/resource/AlgorithmPractice.png)

## 具体的项目目录结构:
### [Algorithm 算法专题](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm)
  + 综合题
    + [背包问题](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/comprehensive/backpack) [测试案例]()
    + [合唱团问题](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/comprehensive/choir) [测试案例]()
    + [最短路径](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/comprehensive/shortestDeliveryPath) [测试案例]()
    + [背包问题解决公司零食采购（贪心+冒泡+动态）](https://blog.csdn.net/ljfirst/article/details/107498635) [测试案例]()
  + 动态规划专题
    + [最长公共子串](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/dynamicPrimary/lcs) [测试案例]()
    + [BAT最热笔试题：最长递增子序列的六种解法](https://blog.csdn.net/ljfirst/article/details/106596812) [测试案例]()
    + [最大子段和](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/dynamicPrimary/lss) [测试案例]()
    + [回文串判断及创造](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/Algorithm/dynamic/dynamicPrimary/palindrome) [测试案例]()
  + 回溯专题
    + recall
    + recall_apply
### [DataStructure 数据结构专题](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure)
  + 图专题
    + BellmanFord.java
    + Floyd.java
    + graphApply
    + graphConnection
    + mst
    + shortestPath
  + 字符串和数组专题
    + array
    + hashTable
    + list
    + [序列和字符串题目集锦](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/sequenceANDstring)
    + [字符串对比专题](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stringANDline/stringCompare)
  + 排序专题
    + 外部排序
    + 内部排序
      + [冒泡排序、堆排序、插入排序、选择排序、桶排序、计数排序、归并排序、基数排序、希尔排序、快排及其改进](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/sort/innerSort/innerSortRealize) [测试案例]()
      + [内部排序的应用](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/sort/innerSort/innerSortApply)
  + 堆栈队列
    + [返回最小的第K个值、返回最小的K个值、优先队列](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/heap) [测试案例]()
    + [链队、数组队、用栈实现队](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/queue) [测试案例]()
    + [链栈、数组栈、最小栈、最小栈优化、计算器的实现、括号匹配问题、队列实现栈](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DataStructure/stackHeapQueue/heap) [测试案例]()
  + 树
    + [二叉树]()
      +[二叉树相等、二叉树各种遍历方式构造数组、数组通过各种遍历方式构造二叉树]() [测试案例]()
      +[二叉树镜像、平衡二叉树判断、二叉树子树判读、最近公共祖先、二叉树中和为某值的节点路径]() [测试案例]()
    + [b树]()
    + [赫夫曼树]() [测试案例]()
    + [红黑树]() [测试案例]()
### [Design Pattern 设计模式专题](https://github.com/ljfirst/AlgorithmPractice/tree/master/javaVersion/DesignPattern)
  + [Singleton 单例模式]() [测试案例]()
  + [Proxy 代理模式]() [测试案例]()
  + [Strategy 策略模式]() [测试案例]()
  + [Observer 观察者模式]() [测试案例]()
  + [Visitor 访问者模式]() [测试案例]()
  + [Factory 工厂模式]() [测试案例]()
  + [Delegate 委派模式]() [测试案例]()
  + [Prototype 原型模式]() [测试案例]()
  + [Template 模板模式]() [测试案例]()
  + [Adapter 适配器模式]() [测试案例]()
  

#### 至简尚善，有知仍无畏。
