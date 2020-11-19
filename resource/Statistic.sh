
echo "Algorithm代码量统计"
dirpath=../javaVersion


Algorithm=$(find $dirpath/Algorithm/     -iname "*.java" |grep -v Test |wc -l)
DS=$(find $dirpath/DataStructure/        -iname "*.java" |grep -v Test |wc -l)
Design=$(  find  $dirpath/DesignPattern/ -iname "*.java" |grep -v Test |wc -l)
Logic=$(   find  $dirpath/Logic/         -iname "*.java" |grep -v Test |wc -l)


AlgorithmUT=$(find $dirpath/UnitTest/algorithmTest  -iname "*.java" |grep  Test |wc -l)
DSUT=$(find $dirpath/UnitTest/datastructureTest     -iname "*.java" |grep  Test |wc -l)
DesignUT=$(find $dirpath/UnitTest/DesignPatternTest -iname "*.java" |grep  Test |wc -l)
LogicUT=$(   find  $dirpath/UnitTest/LogicTest      -iname "*.java" |grep  Test |wc -l)


Total=$((Algorithm+DS+Design+Logic))
TotalUT=$((AlgorithmUT+DSUT+DesignUT+LogicUT))
echo "      Total - Algorithm  - DataStructure  - DesignPattern"
echo "Code: $Total   - $Algorithm   -  $DS      -  $Design "
echo "UT  : $TotalUT   - $AlgorithmUT   -  $DSUT      -  $DesignUT"
