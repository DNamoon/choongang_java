package org.zerock.ex2.repository;

import jdk.nashorn.internal.runtime.options.Option;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.zerock.ex2.entity.Memo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testInsertDummies(){

        IntStream.rangeClosed(1,100).forEach(i -> {
            Memo memo = Memo.builder().memoText("샘플...."+i).build();
            memoRepository.save(memo);
        });
    }

    @Test
    public void testSelect(){
        Long mno = 100L;

        Optional<Memo> result = memoRepository.findById((mno));
        System.out.println("==========================================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }

    @Transactional
    @Test
    public void testSelect2(){
        Long mno = 100L;
        Memo memo = memoRepository.getOne(mno);
        System.out.println("====================");
        System.out.println(memo);
    }

    @Test
    public void testUpdate() {
        Memo memo = Memo.builder().mno(100L).memoText("업데이트래").build();

        System.out.println(memoRepository.save(memo));
    }

    public void testDelete(){

        Long mno = 100L;
        memoRepository.deleteById(mno);
    }

    @Test
    public void testQueryMethods(){

        List<Memo> list = memoRepository.findByMnoBetweenOrderByMnoDesc(70L, 80L);

        for (Memo memo : list) {
            System.out.println(memo);

        }

    }

    @Test
    public void testQueryMethods3(){
        //List<Memo> list = memoRepository.findByMemoText()
    }

    @Test
    public void testPageDefault(){
        Pageable pageable = PageRequest.of(0,10);
        Page<Memo> result = memoRepository.findAll(pageable);
        System.out.println(result);
        System.out.println("=============================");
        System.out.println("총" + result.getTotalPages()+"페이지");
        System.out.println(result.getTotalElements()+"개");
        System.out.println(result.getNumber()+"페이지");
        System.out.println(result.getSize()+"페이지 당 개수");
        System.out.println(result.hasNext());
        System.out.println(result.isFirst());

        result.stream().forEach(i->{
            System.out.println(i.getMemoText());
        });
    }





}
