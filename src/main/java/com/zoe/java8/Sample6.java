package com.zoe.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author zoe
 **/
public class Sample6 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.
                asList(
                        new Transaction(brian, 2011, 300),
                        new Transaction(raoul, 2012, 1000),
                        new Transaction(raoul, 2011, 400),
                        new Transaction(mario, 2012, 710),
                        new Transaction(mario, 2012, 700),
                        new Transaction(alan, 2012, 950));
        List<Transaction> year11 = transactions
                .stream()
                .filter(e -> e.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("所有2011年的交易并按交易额排序的列表是: " + year11);

        List<String> city = transactions
                .stream()
                .map(e -> e.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("人员所待过的城市: " + city);
        //set不允许重复,可达到distinct一样的效果
        Set<String> city1 = transactions
                .stream()
                .map(e -> e.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println("人员所待过的城市: " + city1);

        List<Trader> formCambridge = transactions
                .stream()
                .map(Transaction::getTrader)
                .filter(e -> "Cambridge".equals(e.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName)
                ).collect(Collectors.toList());
        System.out.println("来自剑桥的交易员按姓名排序: " + formCambridge);

        //此解决方案效率不高,所有字符串都被反复连接，每次迭代的时候都要建立一个新的String对象  使用joining 内部会使用StringBuilder
        String nameStr = transactions
                .stream()
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println("所有交易员姓名拼接的字符串nameStr: " + nameStr);

        String nameStr1 = transactions
                .stream()
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println("所有交易员姓名拼接的字符串nameStr1: " + nameStr1);

        //anyMatch 是否有一个元素匹配  allMatch是否所有元素都匹配  noneMatch 没有元素与之匹配 返回boolean
        boolean isInMilan = transactions
                .stream()
                .anyMatch(e -> "Milan".equals(e.getTrader().getCity()));
        System.out.println("是否有交易员在米兰工作: " + isInMilan);

        //打印在剑桥的交易员的所有交易额
        transactions
                .stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //最高交易额 max改完min最低交易额
        Optional<Integer> highestValue = transactions
                .stream()
                .map(Transaction::getValue)
                //(a,b)->(a >= b) ? a : b三元表达式等于Integer :: max
                .reduce(Integer::max);
        System.out.println("最高的交易额是: " + highestValue);

        //通过反复比较
        Optional<Transaction> smallestTransaction = transactions
                .stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println("最低交易额smallestTransaction: " + smallestTransaction);
        //流支持min和max方法
        Optional<Transaction> smallestTransaction1 = transactions
                .stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println("最低交易额smallestTransaction1: " + smallestTransaction1);

        Optional<Transaction> highestValue1 = transactions
                .stream()
                .max(Comparator.comparing(Transaction::getValue));
        System.out.println("最高交易额highestValue1: " + highestValue1);
        //返回一个IntStream ,而不是一个Stream<Integer>。调用IntStream接口中定义的sum方法
        // 如果流是空的，sum默认返回0。IntStream还支持其他的方便方法，如 max、min、average等
        int sum = transactions
                .stream()
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("交易额的总额度: " + sum);

        //要找到IntStream中的大元素，调用max方法，返回一个OptionalInt
        OptionalInt max = transactions
                .stream()
                .mapToInt(Transaction::getYear)
                .max();
        //如果没有最大值,显式处理设置一个默认值
        if (!max.isPresent()){
            int i = max.orElse(1);
            System.out.println("没有最大值,输出默认: "+i);
        }
        System.out.println("最大值: "+max.getAsInt());
        //1到100区间的偶数流 //输出50
        IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0);
        System.out.println("1到100区间偶数的数量evenNumbers: "+ evenNumbers.count());
        //range不包含结束值,rangeClosed包含结束值  //count输出49  数值流转换为对象流 输出最大值偶数值98
        IntStream evenNumbers1 = IntStream.range(1, 100).filter(n -> n % 2 == 0);
        System.out.println("1到100区间偶数的数量evenNumbers1: "+ evenNumbers1.boxed().collect(Collectors.toList()));

    }
}

@Data
@AllArgsConstructor
class Trader {

    private final String name;
    private final String city;

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}

@Data
@AllArgsConstructor
class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    @Override
    public String toString() {
        return "{" + this.trader + ", " + "year: " + this.year + ", " + "value:" + this.value + "}";
    }
}
