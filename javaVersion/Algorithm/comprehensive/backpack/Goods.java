package Algorithm.comprehensive.backpack;

import lombok.*;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 背包问题中的 物品
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Goods {

    @NonNull
    int prices;
    @NonNull
    int weight;

    String goodsName;
    @NonNull
    double pw;
}
