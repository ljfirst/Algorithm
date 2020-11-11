
echo "Algorithm代码量统计"
dirpath=../javaVersion

Algorithm=$(find  $dirpath/Algorithm/     -iname "*.java" |grep -v Test |wc -l)
DataStructure=$(find $dirpath/DataStructure/ -iname "*.java" |grep -v Test |wc -l)
Design=$(find $dirpath/DesignPattern/  -iname "*.java" |grep -v Test |wc -l)
Logic=$(find $dirpath/Logic/  -iname "*.java" |grep -v Test |wc -l)

AlgorithmUT=$(find $dirpath/UnitTest/algorithmTest     -iname "*.java" |grep  Test |wc -l)
DataStructureUT=$(find $dirpath/UnitTest/datastructureTest -iname "*.java" |grep  Test |wc -l)
DesignUT=$(find $dirpath/UnitTest/DesignPatternTest    -iname "*.java" |grep  Test |wc -l)
LogicUT=$(find $dirpath/UnitTest/LogicTest        -iname "*.java" |grep  Test |wc -l)


Total=$((Algorithm+DataStructure+Design+Logic))
TotalUT=$((AlgorithmUT+DataStructureUT+DesignUT+LogicUT))
echo "      Total - Algorithm  - DataStructure  - DesignPattern  -  Logic"
echo "Code: $Total   -    $Algorithm      -    $DataStructure          -     $Design         -    $Logic"
echo "UT  : $TotalUT    -    $AlgorithmUT      -    $DataStructureUT          -     $DesignUT          -    $LogicUT"
