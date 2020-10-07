package DataStructure.stringANDline.stringCompare;

import DataStructure.stringANDline.StringCompare;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:44
 * @author��Email  liujunfirst@outlook.com
 * @description  RabinKarp : 算法
 * @blogURL
 */
public class RabinKarp implements StringCompare {

    @Override//�����ƺ�������ѡ���й�ϵ
    public boolean compare(String source, String target) {
        return check(source, target) ? compare(source, target, 17, 26) : false;
    }

    public boolean compare(String source, String target, int prime, int HEX) {
        return check(source, target) ? RabinKarpcmp(source, target, prime, HEX) : false;
    }

    //�������� prime ������ HEX
    public boolean RabinKarpcmp(String source, String target, int prime, int HEX) {

        int[] sourcechar = new int[source.length()];
        int[] targetchar = new int[target.length()];
        for (int i = 0; i < source.length(); i++) {
            sourcechar[i]=(int)source.indexOf(i);
        }
        for (int i = 0; i < target.length(); i++) {
            targetchar[i] = (int)target.indexOf(i);
        }

        //Ϊ���ں�����ݵĴ�source[0] ����� source[1],����� �˳�����/����߶�
        //�μ�42-44�еļ������
        int h = 1;
        for (int i = 0; i < target.length() - 1; i++) {
            h = h * HEX % prime;
        }
        //Ԥ����source, target�ַ��������� target �� source[0]
        int targetValue = 0;
        int sourceValue = 0;
        for (int i = 0; i < target.length(); i++) {
            sourceValue = (HEX * sourceValue + sourcechar[i]) % prime;
            targetValue = (HEX * targetValue + targetchar[i]) % prime;
        }
        //�ַ����Ա�
        for (int i = 0; i < source.length() - target.length(); i++) {
            //�ַ�����ȣ���һ��ȷ��
            if (sourceValue == targetValue && source.substring(i, i + target.length()).equals(target)) {
                return true;
            } else {//�ַ������ȣ���ͨ��
                sourceValue = ((sourceValue - sourcechar[i] * h) * HEX + sourcechar[i + target.length()]) % prime;
            }
        }

        return false;
    }
}
