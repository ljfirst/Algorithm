package DataStructure.tree.redBlackTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *@author liujun
 *@date 2018-5-2 Time������10:20:41
 *@author��Email liujunfirst@outlook.com
 *@description ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����
 *������N��1��1000֮������������N��1000�������������ظ������֣�ֻ����һ����
 *��������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
 *�����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 *@change: �������Ҫ֪��������ظ����ݣ������ú����
 *         �����Ҫ֪��������ظ����ݣ�������Ͱ����
 *@version: 1.0
 *@notice:ע��map�����������ʽ��
 */
public class NoRepeatRandomNo {

	//ʹ�ú����
	private void useMap(int[] array) {
		//�����
		/*TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0 ; i < array.length ; i++){
            int curr = array[i];
            set.add(curr);
        }
        //ѭ�����
        for(Integer i : set){
            System.out.print(i);
        }*/
		
		//�Դ������
		RedBlackTree rbt = new RedBlackTree();
		rbt = rbt.add(array);
		rbt.print(rbt);
		System.out.println(rbt.containsKey(81));
		System.out.println(rbt.containsKey(8));
	}
	
	//ʹ��Ͱ����Ϊ��ֹ���ݳ���ʹ��map������Ͱ��
	public void useBucket(int[] array) {

		Map<Integer, Integer> Bucket = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if(Bucket.containsKey(array[i])){
				Bucket.put(array[i], Bucket.get(array[i])+1);
			}else {
				Bucket.put(array[i],1);
			}
		}
		//map�����������ʽ
		//��ʽ1��
		System.out.println("��ʽһ��");
		System.out.println(Bucket);//Ĭ�ϵ���toString
		//��ʽ2��
		System.out.println("��ʽ����");
		Set<Integer> keys = Bucket.keySet();
		for (Object key : keys) {
			System.out.print(key+"="+Bucket.get(key));
		}
		//��ʽ3��
		System.out.println("��ʽ����");
		Set<Map.Entry<Integer,Integer>> ms =Bucket.entrySet();
		for (Map.Entry<Integer,Integer> entry : ms) {
			System.out.print(entry.getKey()+"="+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		int[] num = {8,2,4,6,9,5,7,3,1};
		NoRepeatRandomNo np = new NoRepeatRandomNo();
		np.useMap(num);
		
		int[] num1 = {81,22,43,64,95,56,77,38,19};
		np.useMap(num1);
		//np.useBucket(num);
	}
}
