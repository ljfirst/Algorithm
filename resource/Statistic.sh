
echo "Algorithm项目 代码量统计"
dirpath=../javaVersion

Algorithm=$(find $dirpath/Algorithm/     -iname "*.java" |grep -v Test |wc -l)
DS=$(find $dirpath/DataStructure/        -iname "*.java" |grep -v Test |wc -l)
Design=$(find  $dirpath/DesignPattern/   -iname "*.java" |grep -v Test |wc -l)
Logic=$(   find  $dirpath/Logic/         -iname "*.java" |grep -v Test |wc -l)

AlgorithmUT=$(find $dirpath/UnitTest/algorithmTest  -iname "*.java" |grep  Test |wc -l)
DSUT=$(find $dirpath/UnitTest/datastructureTest     -iname "*.java" |grep  Test |wc -l)
DesignUT=$(find $dirpath/UnitTest/DesignPatternTest -iname "*.java" |grep  Test |wc -l)
LogicUT=$(   find  $dirpath/UnitTest/LogicTest      -iname "*.java" |grep  Test |wc -l)

AlgorithmNum=$(find $dirpath/Algorithm/  -name "*.java"|xargs cat |wc -l)
DSNum=$(find $dirpath/DataStructure      -name "*.java"|xargs cat |wc -l)
DesignNum=$(find $dirpath/DesignPattern   -name "*.java"|xargs cat |wc -l)
UTNum=$(find $dirpath/UnitTest   -name "*.java"|xargs cat |wc -l)

AlgorithmUTNum=$(find $dirpath/UnitTest/algorithmTest   -name "*.java"|xargs cat |wc -l)
DSUTNum=$(find $dirpath/UnitTest/datastructureTest   -name "*.java"|xargs cat |wc -l)
DesignUTNum=$(find $dirpath/UnitTest/DesignPatternTest   -name "*.java"|xargs cat |wc -l)

TotalCode=$((Algorithm         + DS      + Design))
TotalUT=$((AlgorithmUT         + DSUT    + DesignUT))
TotalCodeNum=$((AlgorithmNum   + DSNum   + DesignNum))
TotalTestNum=$((AlgorithmUTNum + DSUTNum + DesignUTNum))
Total=$((TotalCode + TotalUT))
TotalNum=$((TotalCodeNum + TotalTestNum))

echo "                       Total - Algorithm  - DataStructure  - DesignPattern"
echo "Code(代码)           : $TotalCode   - $Algorithm   -  $DS      -  $Design "
echo "UT(测试用例)         : $TotalUT   - $AlgorithmUT   -  $DSUT      -  $DesignUT"
echo "CodeNum(代码行数)    :$TotalCodeNum  - $AlgorithmNum   - $DSNum       - $DesignNum"
echo "TestNum(测试代码行数):$TotalTestNum  - $AlgorithmUTNum   - $DSUTNum       - $DesignUTNum"

echo "代码总数量           :   "$Total
echo "代码总行数           :   "$TotalNum
