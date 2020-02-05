import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Streams;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import sun.jvm.hotspot.utilities.StreamMonitor;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by choonghyun on 04/08/2019.
 */


@Slf4j
@RunWith(SpringRunner.class)
public class Test {

    @org.junit.Test
    public void map() {

        List<String> nameList = Arrays.asList("viewing, tving, pooq");
        Stream<String> stringStream = nameList.stream().map(String::toUpperCase);
        stringStream.forEach(s ->  log.info("uppercase {}", s));

        Stream<String> test = Stream.of("choonghyun").map(String::toUpperCase);
        test.forEach(log::info);
    }

    @org.junit.Test
    public void flatMap() {


        Stream<String[]> stream = Stream.of(
                new String[]{"viewing, tving, pooq"}
                , new String[]{"stick, youtube, oksusu"}
        );


        Stream<Stream<String>> mapStream = stream.map(Arrays::stream);
        Stream<String> flatMap = stream.flatMap(Arrays::stream);

    }

    @org.junit.Test
    public void filter() {
        IntStream intStream = IntStream.range(1,10); //[1,2,3,4,5,6,7,8,9]
        intStream.filter(i->i%2 == 0).forEach(even -> log.info("even {}" , even));
    }

    @org.junit.Test
    public void peek(){
        IntStream intStream = IntStream.range(1,10); //[1,2,3,4,5,6,7,8,9]
        intStream.peek(System.out::println); //동작하지 않는다
        IntStream intStream1 = IntStream.range(1,10); //[1,2,3,4,5,6,7,8,9]
        intStream1.peek(System.out::println).sum(); //동작함
    }

    @org.junit.Test
    public void collect(){

        //toList
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> integerList = integerStream.collect(Collectors.toList());


        //toJoining
        Stream<String> stringStream = Stream.of("1","2", "3", "4");
        String joining = stringStream.collect(Collectors.joining());
        log.info(joining);


    }

    @org.junit.Test
    public void foreach(){
        Stream<String> stringStream = Stream.of("1","2", "3", "4");
        stringStream.forEach(System.out::println);

    }

    @org.junit.Test
    public void reduce() {
        OptionalInt reduced = IntStream.range(1, 4).reduce(Integer::sum);
        log.info("reduce1 {}" , reduced);

        int reducedTwoParams = IntStream.range(1, 4).reduce(10, Integer::sum);
        log.info("reduce2 {}" , reducedTwoParams);

        Integer reducedParallel = Arrays.asList(1, 2, 3)
                //Combiner은 병렬처리에서만 동작한다, parallelStream()선언하지않으면 동작하지 않는다
                .parallelStream()
                .reduce(10, Integer::sum, (a, b) -> a + b);
        log.info("reduce3 {}" , reducedParallel);
    }

    @org.junit.Test
    public void matching() {
        List<String> names = Arrays.asList("viewing", "tving", "pooq");

        boolean anyMatch = names.stream().anyMatch(name -> name.contains("p"));
        boolean allMatch = names.stream().allMatch(name -> name.length() > 3);
        boolean noneMatch = names.stream().noneMatch(name -> name.endsWith("s"));

        log.info("anyMatch {}", anyMatch);
        log.info("allMatch {}", allMatch);
        log.info("noneMatch {}", noneMatch);
    }

    @org.junit.Test
    public void sequence1(){
        List<String> names = Arrays.asList("viewing", "tving", "pooq");
        names.stream()
             .map(s2 -> {
                 log.info("map {}", s2);
                 return s2.toUpperCase();
             })
             .filter(s -> {
                 log.info("filter {}", s);
                 return true;
             }).forEach(s1 ->  log.info("foreach {}" , s1));
    }

    @org.junit.Test
    public void sequence2(){
        List<String> names = Arrays.asList("viewing", "tving", "pooq");
        names.stream().filter(s -> {
            log.info("filter {}", s);
            return s.startsWith("p");
        }).map(s2 -> {
            log.info("map {}", s2);
            return s2.toUpperCase();
        })
            .forEach(s1 ->  log.info("foreach {}" , s1));
    }
}
