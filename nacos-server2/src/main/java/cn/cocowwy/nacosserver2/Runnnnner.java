package cn.cocowwy.nacosserver2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author Cocowwy
 * @create 2022-01-01-23:21
 */
@Component
public class Runnnnner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        HashMap map = new HashMap() {{
            put(null, "value");
        }};
    }
}

/**
 * key 可为空  多次 put  size 1
 * 建议 initial capacity 不过大  load factor  不过小
 * initial capacity    load factor  是HashMap的性能关键
 * 负载因子:是衡量哈希表在其容量自动增加之前允许达到多满的指标 (trans)
 * 当entry超过负载因子乘以bucket数量的时候，rehash （内部数据 *结构被重建）--》大约两倍
 *  0.75  一个好的时间和空间成本之间的权衡策略 high -> 减少空间开销 增加查找成本    尽量减少rehash次数
 *  不同步 新增删除算Map的改变结构  修改不算
 *  map 使用迭代器的时候 如果结构上发生了结构上的变化 那么会 ConcurrentModificationException
 * TREEIFY_THRESHOLD = 8 list-->tree  UNTREEIFY_THRESHOLD  tree-->list
 * MIN_TREEIFY_CAPACITY = default -> 64 树化的最小容量   最小 4 * TREEIFY_THRESHOLD
 * final K key
 *
 */
class Demo{

    public static void main(String[] args) {
        HashMap map = new HashMap() {{
            put(null, "value");
            put(null, "value");
            put(null, "value");
            put(null, "value");
            put(null, "value");
        }};
        System.out.println(map.size());
    }


}