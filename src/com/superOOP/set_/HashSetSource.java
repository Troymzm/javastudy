package com.superOOP.set_;

import java.util.HashSet;

/**
 * @author mzm
 * @version 1.0
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);

        // 源码
        /*
        1. 执行 HashSet()
        public HashSet() {
            map = new HashMap<>();
        }
        2. 执行 add()
        public boolean add(E e) { // e = "java""java"
            return map.put(e, PRESENT)==null;
        }
        3. 执行 put() 该方法会执行 hash(key) 得到 key 对应的 hash 值 不是 hashCode
        public V put(K key, V value) { // key = "java" ; value = PRESENT
            return putVal(hash(key), key, value, false, true);
        }
        4. 执行
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                       boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i; // 定义辅助变量
            // table 就是 HashMap 的一个数组 类型是Node[]
            // if 语句表示如果当前table 为null 或者大小为0 就是第一次扩容到 16 个空间
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
            // 根据 key 得到的 hash 去计算 key 应该放在 table 表的哪个索引位置并把这个位置的对象 赋给p
            // 判断 p 是否为空
            // 如果 p为空 表示还没有创建元素 就创建一个Node(key = "java", value = PRESENT)
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                Node<K,V> e; K k;
                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else {
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            ++modCount;
            if (++size > threshold)
                resize();
            afterNodeInsertion(evict);
            return null;
        }
         */
    }
}
